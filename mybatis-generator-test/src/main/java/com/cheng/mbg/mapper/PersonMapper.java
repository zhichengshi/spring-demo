package com.cheng.mbg.mapper;

import com.cheng.mbg.model.Person;
import com.cheng.mbg.model.PersonExample;
import com.meituan.baobab.fsc.common.mybatis.mapper.MybatisAuditableBaseMapper;

public interface PersonMapper extends MybatisAuditableBaseMapper<Person, Integer, PersonExample> {
}