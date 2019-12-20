package com.test.springboot.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
public class MyUUID implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return UUIDUtil.compressedUUID();
    }
}
