package com.kindnit.dao;

import com.kindnit.dto.*;
import com.kindnit.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogMapper {
    //查询所有博客
    List<BlogQuery> getAllBlogQuery();
    //根据查询条件搜索博客
    List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog);
    //根据id搜索博客
    ShowBlog getBlogById(Long id);
    //保存博客
    int saveBlog(Blog blog);
    //更新博客
    int updateBlog(ShowBlog showBlog);
    //删除博客
    int deleteBlog(Long id);
    //删除博客对应的标签
    int deleteBlogAndTag(Long blogId);
    //保存博客对应的标签
    int saveBlogAndTag(BlogAndTag blogAndTag);
    //第一页的博客
    List<FirstPageBlog> getAllFirstPageBlog();
    //首页最新推荐博客
    List<RecommendBlog> getAllRecommendBlog();
    //首页搜索博客
    List<FirstPageBlog> getSearchBlog(String query);
    //首页展示博客信息
    DetailedBlog getDetailedBlog(Long id);
    //更新观看数量views
    int updateViews(Long id);
    //根据TypeId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTypeId(Long typeId);
    //根据TagId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTagId(Long tagId);
}
