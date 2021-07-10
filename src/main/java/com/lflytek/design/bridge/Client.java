package com.lflytek.design.bridge;

import com.lflytek.design.bridge.abs.Phone;
import com.lflytek.design.bridge.abs.ext.FoldPhone;
import com.lflytek.design.bridge.abs.ext.UpRightPhone;
import com.lflytek.design.bridge.i.impl.Vivo;
import com.lflytek.design.bridge.i.impl.XiaoMi;

/**
 * @createDate:2021/6/19
 */
public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式 + 品牌）
        Phone phone1 = new FoldPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("=========================");

        Phone phone2 = new FoldPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("=========================");

        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}
