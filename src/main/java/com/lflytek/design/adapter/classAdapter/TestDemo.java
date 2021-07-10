package com.lflytek.design.adapter.classAdapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.lang.ref.Reference;

/**
 * @createDate:2021/6/15
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println("类适配器模式：");
        Phone p = new Phone();
        p.charging(new VoltageAdapter());


        System.out.println("*******************");

        int[][] intArr = {{1,2,3},{2},{4,5,6,7}};
        JSONArray parse = (JSONArray)JSONArray.parse(JSONObject.toJSONString(intArr));

        JSONArray objects = JSONArray.parseArray(JSONObject.toJSONString(intArr));

        int[][] ints = JSON.parseObject(JSONObject.toJSONString(intArr), new TypeReference<int[][]>() {});

        System.out.println(ints);
        System.out.println(parse);

    }
}
