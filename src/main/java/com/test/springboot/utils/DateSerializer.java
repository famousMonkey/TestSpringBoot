package com.test.springboot.utils;


import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;


/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/

public class DateSerializer implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        if (null != object) {
            serializer.write(DateUtil.getDateTime((Date) object));
        } else {
            serializer.write("");
        }
    }
}
