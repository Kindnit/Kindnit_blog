package com.kindnit.pojo;

import com.kindnit.dto.DetailedBlog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private Long id; //主键ID
    private String nickname; //评论人名称
    private String email; //email
    private String content; //内容
    private String avatar;  //头像
    private Date createTime; //创建时间
    private Long blogId; //博客id
    private Long parentCommentId; //父级评论id
    private String parentNickname; //父级评论昵称
    private List<Comment> replyComments = new ArrayList<>(); //回复评论
    private Comment parentComment; //父级评论内容
    private boolean adminComment; //博主是否评论
    private DetailedBlog blog; //博客信息(用于传回前端)

    public Comment() {
    }

    public Comment(Long id, String nickname, String email, String content, String avatar, Date createTime, Long blogId, Long parentCommentId, String parentNickname, List<Comment> replyComments, Comment parentComment, boolean adminComment, DetailedBlog blog) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.content = content;
        this.avatar = avatar;
        this.createTime = createTime;
        this.blogId = blogId;
        this.parentCommentId = parentCommentId;
        this.parentNickname = parentNickname;
        this.replyComments = replyComments;
        this.parentComment = parentComment;
        this.adminComment = adminComment;
        this.blog = blog;
    }

    public boolean isAdminComment() {
        return adminComment;
    }

    public void setAdminComment(boolean adminComment) {
        this.adminComment = adminComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getParentNickname() {
        return parentNickname;
    }

    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

    public List<Comment> getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(List<Comment> replyComments) {
        this.replyComments = replyComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public DetailedBlog getBlog() {
        return blog;
    }

    public void setBlog(DetailedBlog blog) {
        this.blog = blog;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                ", blogId=" + blogId +
                ", parentCommentId=" + parentCommentId +
                ", parentNickname='" + parentNickname + '\'' +
                ", replyComments=" + replyComments +
                ", parentComment=" + parentComment +
                ", adminComment=" + adminComment +
                ", blog=" + blog +
                '}';
    }
}
