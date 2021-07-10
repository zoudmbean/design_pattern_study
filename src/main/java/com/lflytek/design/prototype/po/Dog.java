package com.lflytek.design.prototype.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @createDate:2021/6/6
 */
@AllArgsConstructor
@NoArgsConstructor
public class Dog implements Serializable {
    private String dogName;
    private Integer age;
}
