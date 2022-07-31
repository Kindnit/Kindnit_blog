package com.kindnit.dto;

public class BlogAndTag {
    private Long tagId;

    private Long blogId;

    public BlogAndTag() {
    }

    public BlogAndTag(Long tagId, Long blogId) {
        this.tagId = tagId;
        this.blogId = blogId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Override
    public String toString() {
        return "BlogAndTag{" +
                "tagId=" + tagId +
                ", blogId=" + blogId +
                '}';
    }
}
