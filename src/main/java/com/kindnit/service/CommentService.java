package com.kindnit.service;

import com.kindnit.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    //展示评论
    List<Comment> listCommentByBlogId(Long blogId);
    //保存评论
    int saveComment(Comment comment);
    //删除评论
    void deleteComment(Comment comment,Long id);
    //根据博客id删除评论
    void deleteCommentByblogId(Long id);
}
