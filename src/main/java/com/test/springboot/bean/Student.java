package com.test.springboot.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
@Table
@Entity
@Data
public class Student extends BaseEntity {

    @Column
    private String name;


    @Column
    private String number;


}
