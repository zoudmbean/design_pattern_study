package com.lflytek.design.dutychain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @createDate:2021/7/10
 * 请求
 */
@Data
@AllArgsConstructor
public class Request {
    private Integer type=0;//类型
    private Float price = 0.0f;
    private Integer id=0;
}
