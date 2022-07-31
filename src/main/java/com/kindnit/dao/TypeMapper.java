package com.kindnit.dao;

import com.kindnit.pojo.Type;
import com.kindnit.service.TypeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeMapper {

    //查询推荐分类
    List<Type> getAdminType();
    //查询所有标签
    List<Type> getAllType();
    //保存分类
    int saveType(Type type);
    //根据名称查询分类
    Type getTypeByName(String name);
    //根据Id查询分类
    Type getTypeById(Long id);
    //删除分类
    int deleteType(Long id);
    //更新分类
    int updateType(Type type);
    //首页展示分类
    List<Type> findTypeListBefore(Integer size);

}
