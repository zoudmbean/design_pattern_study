package com.lflytek.design.flyweight;

/**
 * @createDate:2021/6/23
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        // 1. 以新闻方式发布的网站
        WebSite w1 = factory.getWebSiteCategory("新闻");
        w1.use(new User("张三"));

        // 2. 以博客方式发布的网站
        WebSite w2 = factory.getWebSiteCategory("博客");
        w2.use(new User("李四"));
    }
}
