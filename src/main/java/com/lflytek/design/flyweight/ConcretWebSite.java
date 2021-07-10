package com.lflytek.design.flyweight;

import lombok.AllArgsConstructor;

/**
 * @createDate:2021/6/23
 */
@AllArgsConstructor
public class ConcretWebSite extends WebSite {

    // 共享的部分
    private String type="";// 网站发布形式

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为：" + type + "   使用者：" + user.getName());
    }
}
