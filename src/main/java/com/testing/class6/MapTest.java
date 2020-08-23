package com.testing.class6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> scoreMap=new HashMap<String, Integer>();
        //增
        scoreMap.put("语文",90);
        scoreMap.put("数学",88);
        scoreMap.put("英语",66);
        scoreMap.put("政治",55);
        System.out.println("修改前的值："+scoreMap);
        //不允许出现相同的键
        scoreMap.put("政治",77);
        //允许出现相同的值
        scoreMap.put("物理",77);

        //删除
        scoreMap.remove("英语");
        //remove（key，value）更保险，如果值错误，不会删除这条记录
        scoreMap.remove("政治",88);
        scoreMap.remove("政治",77);

        //改
        scoreMap.put("数学",100);
        scoreMap.replace("语文",80);

        //查
        //直接输出
        System.out.println("修改后的值："+scoreMap);
        //遍历
        //1、基于键遍历 map中的键值对， 通过键取值的方法是 map.get（key）
        System.out.println("foreach遍历map");
        for (String key:scoreMap.keySet()){
            System.out.println("科目是 "+key+" 分数是 "+scoreMap.get(key));
        }

        //2、基于键值对来进行遍历
        System.out.println("基于键值对来进行遍历");
        //键值对使用的是Entry，对应的是map的entryset
        for (Entry<String,Integer> e:scoreMap.entrySet()){
            System.out.println(e);
        }

        //3、遍历值，只能把所有的值拿出来，
        // 由于值可以重复，并不知道每个值对应的是哪个键。
        System.out.println("遍历值");
        for (Integer i:scoreMap.values()){
            System.out.println(i);
        }

        //基于迭代器遍历：
        Iterator<String> mapI =scoreMap.keySet().iterator();
        //以上语句可分解成下面两句
//        Set<String> mapI=scoreMap.keySet();
//        mapI.iterator();
//        while (mapI.hasNext()){
//            //调用这一行代码取了两次值
//            System.out.println("科目是 "+mapI.next()+" 分数是 "+scoreMap.get(mapI));
//        }
        System.out.println("Iterator遍历");
        //处理逻辑就是：循环体中只取一次值。一个hasnext判断，只做一次next取值
        while (mapI.hasNext()){
            //只取一次值，把值存起来
            String key=mapI.next();
            System.out.println("科目是 "+key+" 分数是 "+scoreMap.get(key));
        }
    }
}

