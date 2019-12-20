package com.test.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultSet<T> {

    private String code;

    private String message;

    private T data;


}
