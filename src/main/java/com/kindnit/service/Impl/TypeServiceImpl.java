package com.kindnit.service.Impl;

import com.kindnit.dao.TypeMapper;
import com.kindnit.pojo.Type;
import com.kindnit.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeMapper typeMapper;
    @Override
    public List<Type> getAdminType() {
        return typeMapper.getAdminType();
    }

    @Override
    public List<Type> getAllType() {
        return typeMapper.getAllType();
    }

    @Override
    public int saveType(Type type) {
        return typeMapper.saveType(type);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeMapper.getTypeByName(name);
    }

    @Override
    public Type getTypeById(Long id) {
        return typeMapper.getTypeById(id);
    }

    @Override
    public int deleteType(Long id) {
        return typeMapper.deleteType(id);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateType(type);
    }

    public List<Type> findTypeListBefore(Integer size){
        return typeMapper.findTypeListBefore(size);
    }


}
