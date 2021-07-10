package com.lflytek.design.bridge.abs.ext;

import com.lflytek.design.bridge.abs.Phone;
import com.lflytek.design.bridge.i.IBrand;

/**
 * @createDate:2021/6/19
 * 折叠式手机类。继承抽象类Phone
 */
public class FoldPhone extends Phone {

    // 构造器 将品牌传给父类
    public FoldPhone(IBrand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠手机开机");
    }
    public void close(){
        super.close();
        System.out.println("折叠手机关机");
    }
    public void call(){
        super.call();
        System.out.println("折叠手机打电话");
    }
}
