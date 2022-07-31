package com.kindnit.dao;

import com.kindnit.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagMapper {

    //查询推荐标签
    List<Tag> getAdminTag();

    //新增标签
    int saveTag(Tag tag);

    //根据名称查询标签
    Tag getTagByName(String name);

    //根据名Id查询标签
    Tag getTagById(Long id);

    //删除标签
    int deleteTag(Long id);

    //更新标签
    int updateTag(Tag tag);

    //首页的标签
    List<Tag> getAllTag();

}
