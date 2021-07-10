package com.lflytek.design.bridge.abs.ext;

import com.lflytek.design.bridge.abs.Phone;
import com.lflytek.design.bridge.i.IBrand;

/**
 * @createDate:2021/6/19
 * 直立式手机
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(IBrand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立式手机开机");
    }
    public void close(){
        super.close();
        System.out.println("直立式手机关机");
    }
    public void call(){
        super.call();
        System.out.println("直立式手机打电话");
    }
}
