package com.kindnit.service.Impl;

import com.kindnit.dao.TagMapper;
import com.kindnit.dto.BlogAndTag;
import com.kindnit.dto.ShowBlog;
import com.kindnit.pojo.Tag;
import com.kindnit.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public List<Tag> getAdminTag() {
        return tagMapper.getAdminTag();
    }

    @Override
    public int saveTag(Tag tag) {
        return tagMapper.saveTag(tag);
    }


    @Override
    public Tag getTagByName(String name) {
        return tagMapper.getTagByName(name);
    }

    @Override
    public Tag getTagById(Long id) {
        return tagMapper.getTagById(id);
    }

    @Override
    public int deleteTag(Long id) {
        return tagMapper.deleteTag(id);
    }

    @Override
    public int updateTag(Tag tag) {
        return tagMapper.updateTag(tag);
    }

    @Override
    public List<Tag> getTagByString(String text) {
        //这里的text是从前端得到的标签id字符串
        List<Tag> tags = new ArrayList<>();
        //这里调用convertToList方法
        List<Long> longs = convertToList(text);
        System.out.println("getTagByString-------"+longs);
        //这里通过标签的id读到tag信息并存入数组中
        for (Long aLong : longs) {
            tags.add(tagMapper.getTagById(aLong));
        }
        return tags;
    }

    @Override
    public List<Tag> getAllTag() {
        return tagMapper.getAllTag();
    }

    private List<Long> convertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            //将字符串以，符号分隔并加入到list数组中
            String[] idarray = ids.split(",");
            for (int i=0; i < idarray.length;i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

}
