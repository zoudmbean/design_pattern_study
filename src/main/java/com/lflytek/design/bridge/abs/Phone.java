package com.lflytek.design.bridge.abs;

import com.lflytek.design.bridge.i.IBrand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @createDate:2021/6/19
 */
@Data
public abstract class Phone {

    // 组合手机品牌
    private IBrand brand;

    //构造器
    public Phone(IBrand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }
    public void close(){
        brand.close();
    }
    public void call(){
        brand.call();
    }
}
