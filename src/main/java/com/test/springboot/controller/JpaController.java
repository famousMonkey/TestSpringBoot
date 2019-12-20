package com.test.springboot.controller;

import com.test.springboot.bean.Student;
import com.test.springboot.common.ResultSet;
import com.test.springboot.service.JpaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author songzhengjian
 * @Date 2019/12/17
 * @Version V1.0
 **/
@RestController
@Api(tags = "jpa增删改查")
@RequestMapping(value = "/test")
public class JpaController {

    @Autowired
    private JpaService jpaService;



    @ApiOperation(value = "新增")
    @ApiResponses({@ApiResponse(code = 10000, message = "成功", response = Student.class)})
    @PostMapping(value = "/save")
    public ResultSet saveEntity(@RequestBody Student student){

        Student entity = jpaService.save(student);

        if(entity!=null){
            ResultSet resultSet = new ResultSet("10000","success",entity);
            return resultSet;
        }else {
            ResultSet resultSet = new ResultSet();
            resultSet.setCode("10022");
            resultSet.setMessage("fail");
            return resultSet;
        }


    }


}
