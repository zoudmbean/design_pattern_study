package com.lflytek.design.prototype.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @createDate:2021/6/6
 */
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String userName;
    private String addr;
    private Integer age;
    private Dog dog;

    public String getUserName() {
        return userName;
    }

    public String getAddr() {
        return addr;
    }

    public Integer getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }
}
