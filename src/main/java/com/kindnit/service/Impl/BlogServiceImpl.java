package com.kindnit.service.Impl;

import com.kindnit.dao.BlogMapper;
import com.kindnit.dao.TagMapper;
import com.kindnit.dto.*;
import com.kindnit.exception.NotFountException;
import com.kindnit.pojo.Blog;
import com.kindnit.pojo.Tag;
import com.kindnit.service.BlogService;
import com.kindnit.service.CommentService;
import com.kindnit.service.TagService;
import com.kindnit.util.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;
    @Autowired
    TagMapper tagMapper;
    @Autowired
    TagService tagService;
    @Autowired
    CommentService commentService;

    //查询所有博客
    @Override
    public List<BlogQuery> getAllBlogQuery() {
        return blogMapper.getAllBlogQuery();
    }

    @Override
    public List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog) {
        return blogMapper.searchByTitleOrTypeOrRecommend(searchBlog);
    }

    @Override
    public ShowBlog getBlogById(Long id) {
        return blogMapper.getBlogById(id);
    }

    @Override
    public int saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        //将标签的数据存到t_blogs_tag表中
        List<Tag> tags = blog.getTags();
        System.out.println("saveBlog--------"+tags);
        //标签可能存在多个，遍历存储
        BlogAndTag blogAndTag = null;
        for (Tag tag : tags) {
            blogAndTag = new BlogAndTag(tag.getId(),blog.getId());
            //将标签存到t_blogs_tag表中
            blogMapper.saveBlogAndTag(blogAndTag);
        }
        return blogMapper.saveBlog(blog);
    }

    @Override
    public int updateBlog(ShowBlog showBlog) {
        showBlog.setUpdateTime(new Date());
        //先删除
        blogMapper.deleteBlogAndTag(showBlog.getId());
        //将标签的数据存到t_blogs_tag表中，这里得到的是标签id数组
        List<Tag> tagByString = tagService.getTagByString(showBlog.getTagIds());
        System.out.println("updateBlog--------"+tagByString);
        BlogAndTag blogAndTag = null;
        for (Tag tag : tagByString) {
            blogAndTag = new BlogAndTag(tag.getId(),showBlog.getId());
            blogMapper.saveBlogAndTag(blogAndTag);
        }
        System.out.println("updateBlog设置的date：" + new Date());
        System.out.println("updateBlog设置的date后get的：" + showBlog.getUpdateTime());
        return blogMapper.updateBlog(showBlog);
    }

    @Override
    public int deleteBlog(Long id) {
        blogMapper.deleteBlog(id);
        blogMapper.deleteBlogAndTag(id);
        commentService.deleteCommentByblogId(id);
        return 1;
    }

    @Override
    public List<FirstPageBlog> getAllFirstPageBlog() {
        return blogMapper.getAllFirstPageBlog();
    }

    @Override
    public List<RecommendBlog> getRecommendedBlog() {
        List<RecommendBlog> allRecommendBlog = blogMapper.getAllRecommendBlog();
        List<RecommendBlog> allRecommendedBlog = new ArrayList<>();
        for (RecommendBlog recommendBlog : allRecommendBlog) {
            if (recommendBlog.isRecommend() == true) {
                allRecommendedBlog.add(recommendBlog);
            }
        }
        return allRecommendedBlog;
    }

    @Override
    public List<FirstPageBlog> getSearchBlog(String query) {
        return blogMapper.getSearchBlog(query);
    }

    @Override
    public DetailedBlog getDetailedBlog(Long id) {
        DetailedBlog detailedBlog = blogMapper.getDetailedBlog(id);
        if (detailedBlog == null) {
            throw new NotFountException("该博客不存在");
        }
        String content = detailedBlog.getContent();
        detailedBlog.setContent(MarkdownUtils.markdownToHtmlExtensions(content));
        blogMapper.updateViews(id);
        return detailedBlog;
    }

    @Override
    public List<FirstPageBlog> getByTypeId(Long typeId) {
        return blogMapper.getByTypeId(typeId);
    }

    @Override
    public List<FirstPageBlog> getByTagId(Long tagId) {
        return blogMapper.getByTagId(tagId);
    }
}
