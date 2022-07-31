package com.kindnit.service;

import com.kindnit.dto.ShowBlog;
import com.kindnit.pojo.Blog;
import com.kindnit.pojo.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagService {

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

    //根据名字找到标签
    List<Tag> getTagByString(String text);

    //首页的标签
    List<Tag> getAllTag();

}
