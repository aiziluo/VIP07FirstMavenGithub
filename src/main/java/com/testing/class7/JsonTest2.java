package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonTest2 {
    public static void main(String[] args) {
        //从抓包工具得到的字符串
        String ipText = "/**/jQuery110205334450459806954_1596263095138({\"status\":\"0\",\"t\":\"1596263113247\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国 亚马逊云\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
        //截取json字符串，存入map中
        String ip = ipText.substring(ipText.indexOf("{"), ipText.length() - 2);
        Map<String, Object> ipMap = jsonFormMap(ip);
        System.out.println("ipMap:"+ipMap);

        //将json类型的data转存map
        String dataText = ipMap.get("data").toString();
        String dataValue=dataText.substring(1,dataText.length()-1);
//        System.out.println("dataValue："+dataValue);
        Map<String,Object> dataMap=jsonFormMap(dataValue);
        System.out.println("dataMap:"+dataMap);

        Object datajson = ipMap.get("data");
        System.out.println("datajson："+datajson);
        //1、解析出来直接就是JSOnArray json的数组类型的形式
        JSONArray dataArray = (JSONArray) datajson;
        //通过下标获取dataArray中的元素。
        JSONObject datatjsonOb =(JSONObject) dataArray.get(0);
        System.out.println("datajsonOb:"+datatjsonOb);
        for (String s:datatjsonOb.keySet()){
            System.out.println("datajsonOb键："+s+"    值："+datatjsonOb.get(s));
        }


        //查看键值的类型
//        System.out.println(ipMap.get("data").getClass().getSimpleName());


        //将data  map拼接成字符串
        String dataStr = connect(dataMap);
        System.out.println("map类型的data拼接成字符串："+dataStr);

        //将ip  map拼接成字符串
        String ipStr = connect(ipMap);
        System.out.println("map类型的ip拼接成字符串："+ipStr);
    }


    //将json转化成map
    public static Map<String ,Object> jsonFormMap(String str){
        JSONObject strJson = JSON.parseObject(str);
        //创建一个map用在存放转换后的json
        Map<String ,Object> strMap=new HashMap<>();
        for (String s:strJson.keySet()){
//            System.out.println("strJson的键为："+s+"   strJson的键值为："+strJson.get(s));
            strMap.put(s,strJson.get(s));
        }
        return strMap;
    }

    //将map格式的拼接为字符串
//    public static String connect(Map<String,Object> ipMap){
//        String Str="{";
//        String star = "";
//        String connector = "";
//        String end = "";
//        for (String s:ipMap.keySet()){
//            star = "\"" +s+"\"";
//            connector = ":";
//            if(ipMap.get(s) instanceof String){
//                if (ipMap.get(s) instanceof String){
//                    end="\""+ipMap.get(s)+"\"";
//                }else {
//                    end=ipMap.get(s).toString();
//                }
//                Str+=star+connector+end+",";
//            }else{
//                String tmpStr=ipMap.get(s).toString();
//                String tmp=tmpStr.substring(1,tmpStr.length()-1);
//                Map<String ,Object> tmpMap=jsonFormMap(tmp);
////                Map<String ,Object> tmpMap=(Map<String, Object>) JSON.parse(tmp);
//                Str= Str + star + connector +  "\"" + tmpMap + "\"" + ",";
//            }
//        }
//        Str+="}";
//        //去掉多的，
//        Str=Str.replace(",}","}");
//        return Str;
//    }

    public static String connect(Map<String,Object> ipMap){
        String Str="{";
        String star = "";
        String connector = "";
        String end = "";
        for (String s:ipMap.keySet()){
            star = "\"" +s+"\"";
            connector = ":";
            if(ipMap.get(s) instanceof String){
                end="\""+ipMap.get(s)+"\"";
                Str+= star+connector+end+",";
            }else
                //若键值为JSONArray，则还需要递归调connect方法将map拼接成字符串
                if(ipMap.get(s) instanceof JSONArray) {
                String tmpStr=ipMap.get(s).toString();
                String tmp=tmpStr.substring(1,tmpStr.length()-1);
                Map<String ,Object> tmpMap=jsonFormMap(tmp);
//                Map<String ,Object> tmpMap=(Map<String, Object>) JSON.parse(tmp);
                String tmpValue = connect(tmpMap);
                Str+= star + connector +  "\"" + tmpValue + "\"" + ",";
            }else {
                Str+=star+connector+end+",";
            }
        }
        Str+="}";
        //去掉多的，
        Str=Str.replace(",}","}");
        return Str;
    }
}