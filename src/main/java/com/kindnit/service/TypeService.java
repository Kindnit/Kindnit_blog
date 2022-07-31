package com.kindnit.service;

import com.kindnit.pojo.Type;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeService {

    //查询所有类型
    List<Type> getAdminType();

    //查询首页标签
    List<Type> getAllType();

    //新增类型
    int saveType(Type type);

    //根据名称查询类型
    Type getTypeByName(String name);

    //根据名Id查询类型
    Type getTypeById(Long id);

    //删除类型
    int deleteType(Long id);

    //更新类型
    int updateType(Type type);

    //首页的显示标签
    List<Type> findTypeListBefore(Integer size);



}
