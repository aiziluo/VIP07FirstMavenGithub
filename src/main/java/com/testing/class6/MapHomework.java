package com.testing.class6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapHomework {
    public static void main(String[] args) {
        //定义map类型m
        Map<String,String> m=new HashMap<String, String>();
        m.put("张三","语文");
        m.put("李四","数学");
        m.put("王五","外语");
        m.put("周六","政治");
        System.out.println("直接输出："+m);
        System.out.println("foreach遍历Map a");
        System.out.println("------------------第一种基于键值遍历：");
        for (String key:m.keySet()){
            System.out.println("姓名是："+key+" 所教科目是："+m.get(key));
        }
        System.out.println("------------------第二种基于键值对遍历：");
        for (Entry<String,String> e:m.entrySet()){
            System.out.println(e);
        }

        System.out.println("iterator遍历");
        Iterator<String> mapI = m.keySet().iterator();
        while (mapI.hasNext()){
            String s=mapI.next();
            System.out.println("姓名是："+s+" 所教科目是："+m.get(s));
        }
    }
}
