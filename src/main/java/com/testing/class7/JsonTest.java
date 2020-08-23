package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) {
        //从抓包工具得到的字符串
        String ipText="/**/jQuery110205334450459806954_1596263095138({\"status\":\"0\",\"t\":\"1596263113247\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国 亚马逊云\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
        //截取json字符串
        String ip=ipText.substring(ipText.indexOf("{"),ipText.length()-2);
        //将json字符串转成Map
        JSONObject ipJson = JSON.parseObject(ip);
        //创建一个map用在存放转换后的json
        Map<String ,Object> ipMap=new HashMap<>();
        for (String s:ipJson.keySet()){
//            System.out.println("ipJson的键为："+s+"   ipJson的键值为："+ipJson.get(s));
            ipMap.put(s,ipJson.get(s));
        }

        System.out.println("ipMap的值："+ipMap);

        //将键为data的键值转存为map
        String  dataText=ipMap.get("data").toString();
//        System.out.println("键为data的键值："+dataText);
        String dataValue=dataText.substring(1,dataText.length()-1);
//        System.out.println("dataValue为："+dataValue);

        //按上面方法将data转存于map
        JSONObject dataJson = JSON.parseObject(dataValue);
        Map<String ,String > dataMap = new HashMap<>();
        for (String s:dataJson.keySet()){
//            System.out.println("dataJson中的键为："+s+"   dataJson中的键值为："+dataJson.get(s));
            dataMap.put(s,dataJson.get(s).toString());
        }
        System.out.println("dataMap为："+dataMap);

        //通过强制转换，将data内容转换为Map
        Map<String ,String > dataMap2 = (Map<String, String>)JSON.parse(dataValue);
        System.out.println("dataMap2为："+dataMap2);



        //将map格式的data连接为字符串
        String dataStr="{";
        for (String s:dataMap.keySet()) {
            String star = "\"" +s+"\"";
            String connector = ":";
            String end = "";
            if (dataMap.get(s) instanceof String){
                end="\""+dataMap.get(s)+"\"";
            }else {
                end=dataMap.get(s);
            }
            dataStr+=star+connector+end+",";
        }
        dataStr+="}";
        //去掉多的，
        dataStr=dataStr.replace(",}","}");
        System.out.println("dataStr为：" +dataStr);

        System.out.println("===========================================================");
        //拼接ipMap为字符串
        String ipNew ="{";
        for (String s : ipMap.keySet()) {
            String star = "\"" + s + "\"";
            String connector = ":";
            String end = "";
            if (ipMap.get(s) instanceof String) {
                if (ipMap.get(s) instanceof String) {
                    end = "\"" + ipMap.get(s) + "\"";
                } else {
                    end = ipMap.get(s).toString();
                }
                ipNew += star + connector + end + ",";
            } else {
                String subStr=ipMap.get(s).toString();
                String subStrNew=subStr.substring(1,subStr.length()-1);
                JSONObject dataJson2 = JSON.parseObject(dataValue);
                Map<String ,Object > dataMap3 = new HashMap<>();
                for (String s2:dataJson2.keySet()){
//            System.out.println("dataJson2中的键为："+s2+"   dataJson2中的键值为："+dataJson2.get(s2));
                    dataMap3.put(s2,dataJson2.get(s2));
                }
                String subValue=connect(dataMap3);
                ipNew += star + connector + "\"" + subValue  + "\"" + ",";
            }

        }
        ipNew += "}";
        //去掉多的，
        ipNew = ipNew.replace(",}", "}");
        System.out.println("ipNew为：" + ipNew);



    }

    public static String connect(Map<String,Object> dataMap){
        //将map格式的data连接为字符串
        String Str="{";
        for (String s:dataMap.keySet()) {
            String star = "\"" +s+"\"";
            String connector = ":";
            String end = "";
            if (dataMap.get(s) instanceof String){
                end="\""+dataMap.get(s)+"\"";
            }else {
                end=dataMap.get(s).toString();
            }
            Str+=star+connector+end+",";
        }
        Str+="}";
        //去掉多的，
        Str=Str.replace(",}","}");
        System.out.println("dataStr为：" +Str);
        return Str;
    }
}
