package com.wgc.springboot20190328.service.impl;

import com.wgc.springboot20190328.dao.EmpMapper;
import com.wgc.springboot20190328.entity.Emp;
import com.wgc.springboot20190328.service.Emps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService implements Emps {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> all() {
        return empMapper.selectAll();
    }
}
