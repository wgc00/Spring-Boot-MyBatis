package com.wgc.springboot20190328.dao;

import com.wgc.springboot20190328.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp record);
}