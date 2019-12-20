package com.test.springboot.service.impl;

import com.test.springboot.bean.Student;
import com.test.springboot.common.BaseService;
import com.test.springboot.repository.MyJpaRepository;
import com.test.springboot.service.JpaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
@Slf4j
@Service
public class JpaServiceImpl extends BaseService implements JpaService {


    @Autowired
    private MyJpaRepository myJpaRepository;


    @Override
    public Student save(Student baseEntity) {
        super.packageInsertProperty(baseEntity);
//        log.info("----手动回滚本地事务：{}",baseEntity);
//        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        return myJpaRepository.save(baseEntity);
    }
}
