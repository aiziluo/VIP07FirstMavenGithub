package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonText {
    public static void main(String[] args) {
        String ipStr="/**/jQuery110205334450459806954_1596263095138({\"status\":\"0\",\"t\":\"1596263113247\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国 亚马逊云\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
//       获取字符串中第一个指定字体的下标
//        System.out.println(ipStr.indexOf("{"));
        //截取{}之前的json的内容
        String ip=ipStr.substring(ipStr.indexOf("{"),ipStr.length()-2);
//        System.out.println(ip);
        //解析字符串ip为一个json对象ipJson
        JSONObject ipJson = JSON.parseObject(ip);
        //创建一个ipMap<String,Object> 用于存储解析过来的json内容
        Map<String,Object> ipMap=new HashMap<>();

        for (String key:ipJson.keySet()){
            System.out.println("ip中的键为："+key+"ip中的键值为："+ipJson.get(key));
            ipMap.put(key,ipJson.get(key));
        }
        //创建一个ipMapNew<String,String> 用于存储解析过来的json内容
        Map<String,String> ipMapNew=new HashMap<>();
        for (String s:ipJson.keySet()){
            System.out.println("ipMapNew的键为："+s+"ipMapNew的键值为："+ipJson.get(s));
            ipMapNew.put(s,ipJson.get(s).toString());
        }

        System.out.println("ipMap的结果为："+ipMap);
        System.out.println("ipMapNew的结果为："+ipMapNew);


        //将data的值解析存为Map
        System.out.println("data的键值："+ipMap.get("data"));
        String dataText=ipMap.get("data").toString();
        String dataValue=dataText.substring(1,dataText.length()-1);
//        System.out.println(dataText);
        //创建一个dataMap用在存入data的内容
        Map<String,Object> dataMap=new HashMap<>();

        JSONObject dataNew = JSON.parseObject(dataValue);
        for (String s:dataNew.keySet()){
//            System.out.println("data中的键为："+s+"data中的键值为："+dataNew.get(s));
            dataMap.put(s,dataNew.get(s));
        }

        System.out.println("dataMap值为："+dataMap);

        //通过parse方法，解析出来的是一个object对象，直接强转为Map<String,Object>
        Map<String ,Object> ipFormMap = (Map<String, Object>) JSON.parse(ip);
        System.out.println("ip强制转换为Map的结果为："+ipFormMap);

        //强制转换data
        Map<String ,Object> dataForm = (Map<String, Object>) JSON.parse(dataValue);
        System.out.println("data强制转换为Map的结果为："+dataForm);

        //接的Map内容为一个字符串
        String ipNew="{";
        for (String s:ipMap.keySet()){
            String firstPart="\""+s+"\"";
            String maohao=":";
            String valuePart="";
            if (ipMap.get(s) instanceof String){
            //如果键值是字符串，则需要加上”“
                valuePart="\""+ipMap.get(s)+"\"";
            }else {
                //如果键值是不是字符串，则不需要
                valuePart = ipMap.get(s).toString();
            }
            ipNew+=firstPart+maohao+valuePart+",";
        }

        ipNew+="}";
        //最后多一个“，”，替换掉
        ipNew= ipNew.replace(",}","}");
        System.out.println("ipNew的值："+ ipNew);

    }
}
