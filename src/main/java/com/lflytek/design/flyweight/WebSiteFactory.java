package com.lflytek.design.flyweight;

import java.util.HashMap;

/**
 * @createDate:2021/6/23
 * 网站工厂；类，根据需求返回一个网站
 */
public class WebSiteFactory {
    private HashMap<String,ConcretWebSite> pool = new HashMap<>();

    // 根据网站类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){  // 池中没有
            pool.put(type,new ConcretWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类总数
    public int getWebsiteCount(){
        return pool.size();
    }
}
