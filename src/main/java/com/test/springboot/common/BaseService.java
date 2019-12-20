package com.test.springboot.common;

import com.test.springboot.bean.BaseEntity;

import java.util.Date;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
public class BaseService<T> {

    //保存前插入公共属性
    public void packageInsertProperty(BaseEntity entity){
        entity.setCreateTime(new Date());
        entity.setLastModifiedTime(new Date());
    }

    //更新前修改公共属性
    public void packageUpdateProperty(BaseEntity entity){
        entity.setLastModifiedTime(new Date());
    }

}
