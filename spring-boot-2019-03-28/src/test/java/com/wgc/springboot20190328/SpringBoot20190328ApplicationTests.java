package com.wgc.springboot20190328;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wgc.springboot20190328.entity.Emp;
import com.wgc.springboot20190328.service.impl.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot20190328ApplicationTests {

    @Autowired
    private EmpService service;

    @Test
    public void contextLoads() {

        PageHelper.startPage(1, 5);
        PageInfo<Emp> pageInfo = new PageInfo<>(service.all());
        System.out.println(pageInfo);

    }

}
