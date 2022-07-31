<h3 align="center">Kindnit_blog 开发笔记</h3>

### 1 项目概述

#### 1.1 项目开发目的

**这儿是我的开源地址 [Github](https://github.com/Kindnit/Kindnit_blog.git)**

本项目是一个简单的个人博客系统，系统集成了文章、标签、分类、日志、友链五大模块的增删改查功能

刚刚学习完springboot找到了这个项目学习，其中得到了许多弹幕、评论大佬的帮助，更重要的是很多大佬的开源给了我更大的帮助

所以我也将我的项目开源，方便大家学习

此项目是用来熟悉springboot框架开发的不二之选哦

#### 1.2 需求分析

角色：管理员、访客

- 访客：可以分页查看所有的博客
- 访客：可以快速查看博客数最多的7个分类 
- 访客：可以查看所有的分类
- 访客：可以查看某个分类下的博客列表
- 访客：可以快速查看所有被推荐博客的标签
- 访客：可以查看所有的标签
- 访客：可以查看某个标签下的博客列表
- 访客：可以根据年度时间线查看博客列表
- 访客：可以快速查看最新的推荐博客
- 访客：可以用关键字全局搜索博客
- 访客：可以查看单个博客内容
- 访客：可以对博客内容进行评论
- 访客：可以赞赏博客内容
- 访客：可以微信扫码阅读博客内容
- 访客：可以在首页扫描公众号二维码关注我
- 管理员：可以用户名和密码登录后台管理
- 管理员：可以管理博客
  - 可以发布新博客
  - 可以对博客进行分类
  - 可以对博客打标签
  - 可以修改博客
  - 可以删除博客
  - 可以根据标题、标签、是否推荐查询博客

- 管理员：可以管理博客分类
  - 可以新增一个分类
  - 可以修改一个分类
  - 可以删除一个分类
- 管理员：可以管理博客标签
  - 可以新增一个标签
  - 可以修改一个标签
  - 可以删除一个标签

#### 1.3 项目技术栈

此项目的所有技术栈如下：

|       分类       |     技术栈      |     版本      |
| :--------------: | :-------------: | :-----------: |
|     开发语言     |      Java       |       8       |
|     开发工具     |      IDEA       |    2020.1     |
|   项目管理工具   |      Maven      |     3.8.4     |
|   **后端框架**   |   SpringBoot    | 2.3.4.RELEASE |
|   **模板引擎**   |    Thymeleaf    | 2.3.4.RELEASE |
|    **持久层**    |     MyBatis     |     2.1.3     |
|      数据库      |      MySql      |    8.0.22     |
|   数据库连接池   |      Druid      |    1.1.21     |
|   **前端组件**   |   SemanticUI    |     2.2.4     |
| **登录验证框架** |      Shiro      |     1.4.1     |
|      js框架      |     jQuery      |      3.2      |
|   Markdown插件   |    Editor.md    |     1.5.0     |
| 博客代码高亮插件 |      prism      |    1.28.0     |
|   文章排版插件   |    typo.css     |     2.1.2     |
|     动画插件     |   animate.js    |     4.1.1     |
|    时间轴插件    |   timeline.js   |     1.0.0     |
|   滚动侦测插件   | jquery.scrollTo |     2.1.2     |
|      看板娘      |  live2d-widget  |     0.8.3     |
|    音乐播放器    |     Aplayer     |    1.10.0     |
|     音乐插件     |     Meting      |     2.0.x     |

该项目所有的技术栈官网如下：

+ 开发语言：[Java](https://www.java.com/en/)
+ 开发工具：[IDEA](https://www.jetbrains.com/idea/)
+ 项目管理工具：[Maven](https://maven.apache.org/index.html)
+ 后端框架：[SpringBoot](https://spring.io/projects/spring-boot)
+ 模板引擎：[Thymeleaf](https://www.thymeleaf.org/)
+ 持久层：[MyBatis](https://mybatis.net.cn/)
+ 数据库：[MySql](https://www.mysql.com/cn/)
+ 数据库连接池：[Druid](https://github.com/alibaba/druid)
+ 前端组件：[SemanticUI](https://semantic-ui.com/)
+ 登录验证框架：[Shiro](https://shiro.apache.org/)
+ js框架：[jQuery](https://jquery.com/)
+ MarkDown插件：[Editor.md](http://editor.md.ipandao.com/)
+ 代码高亮插件：[prism](https://github.com/PrismJS/prism)
+ 文章排版插件：[typo.css](https://github.com/sofish/typo.css)
+ 动画插件：[animate.js](https://animate.style/)
+ 时间轴插件：[timeline.js](https://github.com/vorg/timeline.js)
+ 滚动侦测插件：[jquery.scrollTo](https://github.com/flesler/jquery.scrollTo)
+ 看板娘：[live2d-widget](https://github.com/stevenjoezhang/live2d-widget)
+ 音乐播放器：[Aplayer](https://aplayer.js.org/#/)
+ 音乐插件：[Meting](https://github.com/metowolf/MetingJS)

#### 1.4 环境依赖

pom文件

```xml
 <dependencies>
        <!--shiro整合spring的包-->
        <dependency>
            <groupId>org.apache.shiro</groupId>
            <artifactId>shiro-spring</artifactId>
            <version>1.4.1</version>
        </dependency>
        <!--druid数据源注入-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.1.21</version>
        </dependency>
        <!--分页插件 -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.3</version>
        </dependency>
        <!--thymeleaf -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <!--springboot启动器-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- Mybatis整合SpringBoot -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.1.3</version>
        </dependency>
        <!-- markdown编辑器生成的html转换成文本 -->
        <dependency>
            <groupId>com.atlassian.commonmark</groupId>
            <artifactId>commonmark</artifactId>
            <version>0.10.0</version>
        </dependency>
        <dependency>
            <groupId>com.atlassian.commonmark</groupId>
            <artifactId>commonmark-ext-heading-anchor</artifactId>
            <version>0.10.0</version>
        </dependency>
        <dependency>
            <groupId>com.atlassian.commonmark</groupId>
            <artifactId>commonmark-ext-gfm-tables</artifactId>
            <version>0.10.0</version>
        </dependency>
        <!--项目热部署-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <!--数据库驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.22</version>
            <scope>runtime</scope>
        </dependency>
        <!--测试依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!--参数校验-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
    </dependencies>
    <!--打包插件-->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```

==注意==：版本需要参照自己的环境和插件来搭配

### 2 前端设计

#### 2.1 博客前端设计

**此文档不详细介绍前端设计，只列出部分重要代码**

##### 2.1.1 博客首页

![index01](https://s1.ax1x.com/2022/07/30/vitv4O.png)

![index02](https://s1.ax1x.com/2022/07/30/viNS8e.png)

![index03](https://s1.ax1x.com/2022/07/30/vitzCD.png)

##### 2.1.2 分类页

![type](https://s1.ax1x.com/2022/07/30/viN9vd.png)

##### 2.1.3 标签页

![tags](https://s1.ax1x.com/2022/07/30/viNpgH.png)

##### 2.1.4 归档页

![archives](https://s1.ax1x.com/2022/07/30/vitbuR.png)

##### 2.1.5 友链页

![friends](https://s1.ax1x.com/2022/07/30/vitjUK.png)

##### 2.1.6 关于我页

![about](https://s1.ax1x.com/2022/07/30/vito34.png)

#### 2.2 博客正文页

![blog01](https://s1.ax1x.com/2022/07/30/vitXE6.png)

![blog02](https://s1.ax1x.com/2022/07/30/vitqD1.png)

![blog03](https://s1.ax1x.com/2022/07/30/vitLHx.png)

#### 2.3 管理后台前端设计

##### 2.3.1 管理员登录页 

![login](https://s1.ax1x.com/2022/07/30/viNPKA.png)

##### 2.3.2 博客管理页

![adminBlog01](https://s1.ax1x.com/2022/07/30/vit44U.png)

##### 2.3.3 发布博客页

![adminBlog02](https://s1.ax1x.com/2022/07/30/vithNT.png)

##### 2.3.4 分类管理页

![adminType](https://s1.ax1x.com/2022/07/30/vitTgJ.png)

##### 2.3.5 标签管理页

![adminTags](https://s1.ax1x.com/2022/07/30/vitICF.png)

##### 2.3.6 友链管理页

![adminLinks](https://s1.ax1x.com/2022/07/30/vitfEV.png)

### 3 数据库创建

此项目采用 MySql 数据库进行数据管理，项目的数据库表创建语句如下

```sql

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `first_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `views` int NULL DEFAULT NULL,
  `appreciation` int NOT NULL DEFAULT 0,
  `share_statement` int NOT NULL DEFAULT 0,
  `commentabled` int NOT NULL DEFAULT 0,
  `published` int NOT NULL DEFAULT 0,
  `recommend` int NOT NULL DEFAULT 0,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `type_id` bigint NULL DEFAULT NULL,
  `user_id` bigint NULL DEFAULT NULL,
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `tag_ids` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1659014617402 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_blog
-- ----------------------------
INSERT INTO `t_blog` VALUES (1658387945385, '今天又可以奖励自己了', '*奖励！*\r\n## 每日奖励自己一次是必须的\r\n### 不奖励自己怎么行呢？\r\n奖励！', 'https://s1.ax1x.com/2022/08/01/vkUVwn.png', '翻译', 0, 1, 0, 1, 1, 1, '2022-07-21 07:19:05', '2022-07-27 04:47:15', 1, 1, '人是不可以不被奖励的吧', '1');
INSERT INTO `t_blog` VALUES (1658392166422, '我推荐这个博客', '推荐它！\r\n```java\r\nprivate int long = 1;\r\n```\r\n[![ss](http://rf479zmaa.hn-bkt.clouddn.com/bg.jpg \"ss\")](http://rf479zmaa.hn-bkt.clouddn.com/bg.jpg \"ss\")\r\nkindnit 改了它', 'https://s1.ax1x.com/2022/08/01/vkUVwn.png', '原创', 0, 1, 0, 0, 1, 1, '2022-07-21 08:29:26', '2022-07-22 05:42:40', 2, 2, '推荐捏', '2,3');

-- ----------------------------
-- Table structure for t_blog_tags
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_tags`;
CREATE TABLE `t_blog_tags`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `tag_id` bigint NULL DEFAULT NULL,
  `blog_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_blog_tags
-- ----------------------------
INSERT INTO `t_blog_tags` VALUES (1, 2, '1658392166422');
INSERT INTO `t_blog_tags` VALUES (2, 3, '1658392166422');
INSERT INTO `t_blog_tags` VALUES (3, 1, '1658387945385');

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `blog_id` bigint NULL DEFAULT NULL,
  `parent_comment_id` bigint NULL DEFAULT NULL,
  `admin_comment` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (1, 'Kindnit', 'kindnit@163.com', '评论了 ', 'https://s1.ax1x.com/2022/08/01/vkUFyQ.jpg', '2022-07-27 04:36:30', 1658387945385, -1, 1);
INSERT INTO `t_comment` VALUES (2, 'sdsada', 'sadas@aas', '回复评论了', 'https://s1.ax1x.com/2022/08/01/vkUEes.png', '2022-07-27 04:38:34', 1658387945385, 1, 0);
INSERT INTO `t_comment` VALUES (3, '小宝', 'v@123.com', '新评论捏', 'https://s1.ax1x.com/2022/08/01/vkUEes.png', '2022-07-29 14:44:14', 1658387945385, -1, 0);
INSERT INTO `t_comment` VALUES (4, 'Kindnit', 'kindnit@163.com', '回复新评论捏', 'https://s1.ax1x.com/2022/08/01/vkUFyQ.jpg', '2022-07-29 14:45:07', 1658387945385, 3, 1);

-- ----------------------------
-- Table structure for t_friend
-- ----------------------------
DROP TABLE IF EXISTS `t_friend`;
CREATE TABLE `t_friend`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `blogaddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `blogname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `pictureaddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_friend
-- ----------------------------
INSERT INTO `t_friend` VALUES (1, 'https://onestar.newstar.net.cn/', 'ONESTARの客栈', '2022-07-29 08:32:16', 'https://onestar.newstar.net.cn/images/me.jpg');
INSERT INTO `t_friend` VALUES (2, 'https://coor.top', '知雨', '2022-07-29 08:33:38', 'https://coor.top/avatar');
INSERT INTO `t_friend` VALUES (3, 'https://ltoythex.xyz/', 'L-toYthe-X', '2022-07-29 14:12:38', 'https://s1.ax1x.com/2022/05/29/XMTLoF.jpg');
INSERT INTO `t_friend` VALUES (4, 'https://zhangshuqiao.org', '米米的博客', '2022-07-29 14:13:28', 'https://gravatar.loli.net/avatar/f56980e9dc026727282a04eea02b4f4d?s=512');
INSERT INTO `t_friend` VALUES (5, 'https://www.zhangweicheng.xyz/', 'VAE+', '2022-07-29 14:19:19', 'https://www.zhangweicheng.xyz/logo.jpg');

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_tag
-- ----------------------------
INSERT INTO `t_tag` VALUES (1, '生活捏');
INSERT INTO `t_tag` VALUES (2, '学习');
INSERT INTO `t_tag` VALUES (3, '知识');
INSERT INTO `t_tag` VALUES (4, '	MYSQL');
INSERT INTO `t_tag` VALUES (5, '	数据库');
INSERT INTO `t_tag` VALUES (6, '	Linux');
INSERT INTO `t_tag` VALUES (7, '	LeetCode');
INSERT INTO `t_tag` VALUES (8, '	SpringMVC');
INSERT INTO `t_tag` VALUES (9, '	SpringBoot');

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES (1, 'JAVA');
INSERT INTO `t_type` VALUES (2, '其他');
INSERT INTO `t_type` VALUES (3, '数据库');
INSERT INTO `t_type` VALUES (4, '算法');
INSERT INTO `t_type` VALUES (5, '面试题');
INSERT INTO `t_type` VALUES (6, 'BUG');
INSERT INTO `t_type` VALUES (7, '前端');
INSERT INTO `t_type` VALUES (8, 'Linux');
INSERT INTO `t_type` VALUES (9, '测试');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` int NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'Master', 'Kindnit', '1111', 'someone@163.com', 'https://s1.ax1x.com/2022/08/01/vkUFyQ.jpg', 1, '2022-07-20 16:03:24', '2022-07-22 16:04:07');
INSERT INTO `t_user` VALUES (2, '苏幕遮', 'someone', '1111', 'sss@163.com', 'https://s1.ax1x.com/2022/08/01/vkUkLj.jpg', 1, '2022-07-20 16:03:24', '2022-07-22 16:04:07');

SET FOREIGN_KEY_CHECKS = 1;

```

如果大家看不到图片那就代表我这边的图片外链过期啦！大家换成自己的外链，自己改改路径换成本地的也可以~

各个字段代表什么意思大家在实体类对照一下叭

### 4 构建实体类

数据库创建完成之后，首先要搭建好项目的环境，并且测试成功后，就可以进行正式开发了

首要进行的就是实体类的构建，这没有什么好说的，按照数据库的的字段名直接创建即可（这里为了简略，省略了有参、无参构造、Getter、Setter、toString）

#### 4.1 博客实体类

```java
public class Blog {
    private Long id; //主键ID
    private String title; //标题
    private String content; //博客内容
    private String firstPicture; //主图
    private String flag; //标记是否原创
    private Integer views; //浏览次数
    private boolean appreciation; //赞赏是否开启
    private boolean shareStatement; //转载声明是否开启
    private boolean commentabled; //评论
    private boolean published; //发布
    private boolean recommend; //是否推荐
    private Date createTime; //创建时间
    private Date updateTime; //更新时间
    //这个属性用来在mybatis中进行连接查询的
    private Long typeId;
    private Long userId; //用户的id
    private String tagIds; //获取多个标签的id
    private String description; //博客简介
    //以下是做关联查询的字段
    private Type type; //对应的类型
    private User user; //对应的用户
    private List<Tag> tags = new ArrayList<>(); //对应的标签
    private List<Comment> comments = new ArrayList<>(); //对应的评论
}
```

#### 4.2 用户实体类

```java
public class User {
    private Long id; //主键ID
    private String nickname; //用户昵称
    private String username; //用户名
    private String password; //密码
    private String email; //邮箱
    private String avatar; //头像
    private Integer type; //用户类型(没有做权限，虚设属性)
    private Date createTime; //创建时间
    private Date updateTime; //更新时间
    //用于联合查询，该用户所创造的博客
    private List<Blog> blogs = new ArrayList<>();
}
```

#### 4.3 标签实体类

```java
public class Tag {
    private Long id; //主键ID
    private String name; //标签名字
    private List<Blog> blogs = new ArrayList<>(); //这个标签里有的blog
}
```

#### 4.4 分类实体类

```java
public class Type {
    private Long id; //主键ID
    private String name; //分类名字
    private List<Blog> blogs = new ArrayList<>(); //这个类型里有的blog
}
```

#### 4.5 评论实体类

```java
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
}
```

#### 4.6 友链实体类

```java
public class FriendLink {
    private Long id; //主键ID
    private String blogname; //博客名字
    private String blogaddress; //博客地址
    private String pictureaddress; //博客图片地址
    private Date createTime; //创建时间
}
```

### 5 后台-登录功能

#### 5.1 登录

登录功能集成了**shiro**框架

- 首先编写配置类：`UserRealm.java`


```java
package com.kindnit.config;

import com.kindnit.pojo.User;
import com.kindnit.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的UserRealm
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权doGetAuthorizationInfo");//这里我们不使用授权,所以return null就好
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了=>认证doGetAuthenticationInfo");
        //用户名、密码从数据库中获取
        UsernamePasswordToken usertoken = (UsernamePasswordToken) authenticationToken;
        //连接数据库
        User user = userService.checkUser(usertoken.getUsername());
        if(user==null){//没有这个人
            return null; //会到LoginController层报出UnknownAccountException用户名不存在异常
        }
        //可以加密、MD5加密，MD5盐值加密
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("user", user);
        //密码认证， Shiro 自己做，为了避免和密码的接触
        //最后返回一个 AuthenticationInfo 接口的实现类，这里选择 SimpleAuthenticationInfo
        // 三个参数：获取当前用户的 认证 ； 密码 ； 认证名
        return new SimpleAuthenticationInfo("",user.getPassword(),"");
    }
}
```

`ShiroConfig.java`

```java
package com.kindnit.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    //ShiroFillterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        //添加shiro的内置过滤器
         /*
            anon：无需认证就可以访问
            authc：必须认证了才能访问
            user：必须拥有记住我才能用
            perms：拥有对某个资源的权限才能访问
            role：拥有某个角色权限才能访问
         */
        Map<String,String> filterMap = new LinkedHashMap<>();
        //设置 /admin下的所有请求,只有认证过才能访问
        filterMap.put("/admin/*","authc");
        //注销请求，走过这个请求后shiro就会注销
        filterMap.put("/logout","logout");
        bean.setFilterChainDefinitionMap(filterMap);
        //设置登录请求
        bean.setLoginUrl("/admin/tologin");
        return bean;
    }

    //DefaultWebSecurityManager
    //使用@Qualifier这个注解和下面的userRealm方法绑定，Spring用的就是方法名
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联UserRealm
        securityManager.setRealm(userRealm); //通过Spirng给他
        return securityManager;
    }
    //创建 realm 对象，需要自定义
    @Bean
    public UserRealm userRealm(){
        return new UserRealm(); //现在我们自定义的这个类就被Spring给托管了
    }

}
```

- 我们设置一个登录请求让**shiro**识别，当请求被拦截时便会跳转到**/admin/tologin**请求

```java
@GetMapping("/admin")
public String loginPage(){
    return "admin/login01";
}
@RequestMapping("/admin/tologin")
public String toLogin(){
    return "admin/login01";
}
```

- 登录验证和返回方法

```java
@PostMapping("/login")
public String login(@RequestParam String username,
                    @RequestParam String password,
                    RedirectAttributes attributes){
    System.out.println("用户名：" + username + "   密码：" + password);
    //获取当前用户
    Subject subject = SecurityUtils.getSubject();
    //封装用户的登录数据
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
    System.out.println(token);
    try {
        subject.login(token);   //执行登录的方法，没有异常就OK
        return "admin/index";
    } catch (UnknownAccountException e) {   //用户名不存在
        attributes.addFlashAttribute("message","用户名错误");
        return "redirect:/admin";
    } catch (IncorrectCredentialsException e){  //密码不存在
        attributes.addFlashAttribute("message","密码错误");
        return "redirect:/admin";
    }
}
```

#### 5.2 注销

- 当我们走到**/logout**请求时，**shiro**已经帮我们实现了注销，并清除了session


```java
@GetMapping("/logout")
public String logOut(){
    // session.removeAttribute("user"); Shiro自动清除了session
    return "redirect:/admin";
}
```

#### 5.3 加密

这里我没有用到加密，因为密码认证是**shiro**在做，不过大家可以自行做个MD5加密，下面是一种做法

- 导入依赖

```xml
<!--加密依赖-->
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
</dependency>
```

- 接下来写一个加密的工具类


```java
public class MD5Tools {

    /**
     * 获取字符串的32位md5加密密码
     * @param str
     * @return
     */
    public static String getMD5(String str){
        return DigestUtils.md5Hex(str);
    }
}
```

- Service 层调用 Mapper 层查询数据库的时候，对密码直接进行 md5 加密


```java
@Override
public User getUserByUsernameAndPassword(String username, String password) {
    return userMapper.getUserByUsernameAndPassword(username, MD5Tools.getMD5(password));
}
```

#### 5.4 登录拦截

目前为止，登录功能初步实现了，登录拦截功能同样是**shiro**帮我们做了，只有通过认证才可以来到**/admin/**下的所有请求，否则将会被拦截

### 6 后台-分类管理

#### 6.1 数据分页

- 这个项目使用了**PageHelper**来帮我们实现分页 ，下面是PageInfo的参数说明：

```java
	//当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;

    //由于startRow和endRow不常用，这里说个具体的用法
    //可以在页面中"显示startRow到endRow 共size条数据"
 
    //当前页面第一个元素在数据库中的行号
    private int startRow;
    //当前页面最后一个元素在数据库中的行号
    private int endRow;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> list;
    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;
    //导航页码数
    private int navigatePages;
    //所有导航页号
    private int[] navigatepageNums;
    //导航条上的第一页
    private int navigateFirstPage;
    //导航条上的最后一页
    private int navigateLastPage;
```

- 这里以分类管理页面为例，根据在 Contoller 中传过去的信息进行分页


```java
@GetMapping("/types")
public String types(@RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum, Model model){
    PageHelper.startPage(pageNum,8); //pageNum从第几页开始，后面的参数则是一页有多少数据
    List<Type> allType = typeService.getAdminType(); //从数据库里查到所有的分类
    PageInfo<Type> pageInfo = new PageInfo<>(allType); //存入PageHelper的PageInfo中
    model.addAttribute("pageInfo",pageInfo); //传给前端
    return "/admin/types";
}
```

- 在 Mapper 层中使用如下语句实现

```xml
<!--查询所有类型-->
<select id="getAdminType" resultType="Type">
    select *
    from t_type
</select>
```

- 前端使用 Thymeleaf 自带的 `th:if` 等组件来进行分页，`pageInfo`已经通过`model`传过来了

```html
<tfoot>
        <tr>
          <th colspan="6">
            <!--th:if="${pageInfo.pages}>1":页数大于一才会显示-->
            <div class="ui mini pagination menu" th:if="${pageInfo.pages}>1">
              <!--th:unless="${page.first}"是否是第一页，不是第一页就显示-->
              <a class="item" th:href="@{/admin/types}">首页</a>
              <a class="item" th:href="@{/admin/types(pageNum=${pageInfo.hasPreviousPage}?${pageInfo.prePage}:1)}" th:unless="${pageInfo.isFirstPage}" style="color: skyblue;">上一页</a>
              <a class="item" th:href="@{/admin/types(pageNum=${pageInfo.hasNextPage}?${pageInfo.nextPage}:${pageInfo.pages})}" th:unless="${pageInfo.isLastPage}" style="color: skyblue;">下一页</a>
              <a class="item" th:href="@{/admin/types(pageNum=${pageInfo.pages})}" th:unless="${pageInfo.isLastPage}">尾页</a>
            </div>
            <div class="ui mini segment m-inline-block">
              <p >当前第<span th:text="${pageInfo.pageNum}"></span>页，总<span th:text="${pageInfo.pages}"></span>页，共<span th:text="${pageInfo.total}"></span>条记录</p>
            </div>
            <a href="#" th:href="@{/admin/types/input}"  class="ui mini right floated teal basic button">新增</a>
          </th>
        </tr>
        </tfoot>
```

#### 6.2 数据展示

- 将数据传过来之后，前端使用 Thymeleaf 自带的 `th:each` 循环遍历展示


```html
 <tbody>
        <tr th:each="types,iterStat:${pageInfo.list}">
          <td th:text="${iterStat.count}">1</td>
          <td th:text="${types.getName()}">刻意练习清单</td>
          <td>
            <a href="#" th:href="@{/admin/types/{id}/update(id=${types.id})}" class="ui mini teal basic button">编辑</a>
            <a href="#"  onclick="return confirm('您确定要删除吗？')" th:href="@{/admin/types/{id}/delete(id=${types.id})}" class="ui mini red basic button">删除</a>
          </td>
        </tr>
  </tbody>
```

![adminType](https://s1.ax1x.com/2022/07/30/vitTgJ.png)

- 点击下一页，成功实现分页展示


![admin_typeNextPage](https://s1.ax1x.com/2022/07/30/vi4zv9.png)

#### 6.3 增加分类

- 在Controller中做简单校验

```java
//Add
@PostMapping("/types/add")
public String Add(@Valid Type type, RedirectAttributes attributes) {
    System.out.println("前端输入过来的表单" + type); //这里拿到输入的type
    Type type1 = typeService.getTypeByName(type.getName()); //在这里我们进行校验
    if (type1 != null) { //如果有重复的分类我们将拒绝
        attributes.addFlashAttribute("message", "不允许添加重复的分类");
        return "redirect:/admin/types/input";
    }
    //添加操作
    typeService.saveType(type);
    attributes.addFlashAttribute("message", "添加成功");
    return "redirect:/admin/types";
}
```

+ 我们的分类只有简单的两个属性，在Mapper 中就是简单的增加语句 

```xml
<!--增加分类-->
 <insert id="saveType" parameterType="Type">
     insert into t_type
     values (#{id}, #{name})
 </insert>
```

- 当我们添加已有的分类时，就会提示不允许添加


![admin_typeNotAdd](https://s1.ax1x.com/2022/07/30/vioA6H.png)

- 这里添加一名为 “睡觉” 的分类，我们只用添加一个名称即可


![admin_typeAdd](https://s1.ax1x.com/2022/07/30/vioZnA.png)

- 成功则会有提示信息

![admin_typeAddMessage](https://s1.ax1x.com/2022/07/30/viok1e.png)

![admin_typeAddSuccess](https://s1.ax1x.com/2022/07/30/vioEXd.png)

#### 6.4 删除分类

- 删除操作与上步骤的修改操作类似，仍然要从前端传回 id，然后后端根据 id 删除记录


```html
<a href="#"  onclick="return confirm('您确定要删除吗？')" th:href="@{/admin/types/{id}/delete(id=${types.id})}" class="ui mini red basic button">删除</a>
```

- 在 Mapper 层根据 id 进行删除


```xml
<!--删除类型-->
<delete id="deleteType" >
    delete from t_type where id = #{id}
</delete>
```

- 这里我们删除刚刚添加的分类

```java
//删除
@GetMapping("/types/{id}/delete")
public String delete(@PathVariable Long id, RedirectAttributes attributes) {
    typeService.deleteType(id);
    attributes.addFlashAttribute("message", "删除成功");
    return "redirect:/admin/types";
}
```



![admin_type_Delete](https://s1.ax1x.com/2022/07/30/viqaSf.png)

![admin_typeDeleteMessage](https://s1.ax1x.com/2022/07/30/viqtYt.png)

![admin_typeDeleteSuccess](https://s1.ax1x.com/2022/07/30/viqNfP.png)

> 这里还有一个小细节
>
> 我们都知道，一般情况下，当我们删除了数据库中一条中间的记录之后，主键 id 就会出现不连贯的情况
>
> 比如删除了 id 为 2 的记录，那么数据表中，id = 1 接下来就会是 id = 3，而不是 id = 2

那么怎么让主键自动自增呢？

- 这里采用 **先将主键的属性删除，然后再添加主键进去，并设置主键自增**，在 Mapper 层中使用如下语句实现


```xml
<!--重新设置主键自增-->
<update id="increaseFromThis">
    alter table t_type drop id;
    alter table t_type add id bigint not null primary key auto_increment first
</update>
```

但是当我们执行程序之后，却报错了，意思是 SQL 语句不正确，但是这两句 Sql 语句在 Mysql 控制台可以成功执行，为什么在 Mybatis 却不行？

那是因为 Mybatis 默认只执行一句 SQL，这里我们如果要一次性执行多条，就需要修改一下 yaml 配置

- 在数据源配置的 url 后边加上 `&&allowMultiQueries=true` ，来开启一次多句执行


```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306?blog&useCharacterEncoding=true&useSSL=true&useUnicode=true&serverTimezone=GMT%2B8&allowMultiQueries=true
    username: root
    password: yourPassword
    type: com.alibaba.druid.pool.DruidDataSource
```

==注意：==**我并没有使用这个功能，因为它重置id后其他表里的id并没有跟着改变，但是我又懒得去做实现所以这里只提供方案，感兴趣的可以自己完成，同样的该系统还有很多未完善的东西，大家都可以去完善**

#### 6.5 修改分类

- 在controller中我们把要修改的分类，从前端返回的id中查到分类的数据并且展示出来并返回给修改页面，不让用户重新填写

```java
//携带ID到编辑页面
@GetMapping("/types/{id}/update")    //给前端返回我们要修改的ID的Type
public String editInput(@PathVariable Long id,Model model){
    System.out.println(id);
    Type type = typeService.getTypeById(id);
    System.out.println(type);
    model.addAttribute("type",type);
    return "admin/types-input";
}
```

- 这里我们与新增分类共用一个页面，通过请求来识别，这里如果type为null则是走增加，否则则是修改

```html
<form action="#" method="post" th:object="${type}" th:action="*{id}==null ? @{/admin/types/add} : @{/admin/types/update}" class="ui form">
<!--如果type不为空，则赋值-->
<input type="text" name="name" th:value="${type}!=null ? ${type.getName()}" placeholder="分类名称" >
```

- 在修改分类的页面中，可以让用户修改的只有 “分类名称” 这一个项目，id我们使用隐藏域传回去


```html
<input type="hidden" name="id" th:value="*{id}">
```

- 这里以修改一个分类名为例

```java
//修改
@PostMapping("/types/update")
public String editPost(@Valid Type type,RedirectAttributes attributes){
    System.out.println("前端传过来的表单" + type);
    Type type1 = typeService.getTypeByName(type.getName());
    if (type1 != null) {
        attributes.addFlashAttribute("message", "已存在重复的分类");
        return "redirect:/admin/types";
    }
    //添加操作
    typeService.updateType(type);
    attributes.addFlashAttribute("message", "修改成功");
    return "redirect:/admin/types";
}
```

- 在mapper层，使用如下语句实现

```xml
<!--更新类型-->
<update id="updateType" parameterType="Type">
    update t_type set name = #{name} where id = #{id};
</update>
```

- 用户点击修改之后，跳转到修改页面，仍然要将分类名称进行展示（这里是把生活捏改成了生活）


![admin_typeUpdate](https://s1.ax1x.com/2022/07/30/vij481.png)

![admin_typeUpdateMessage](https://s1.ax1x.com/2022/07/30/vijW59.png)

![admin_typeUpdateSuccess](https://s1.ax1x.com/2022/07/30/vivCqS.png)

**至此为止，关于分类的增删改查均已经初步实现，至于标签、友链的增删改查，这里不再赘述，三者均是大同小异！**

### 7 后台-日志功能

这里的日志我们使用了springboot默认的logback日志，这个是比较老的用法了建议大家自行更换log4j或者其他日志

#### 7.1 配置yaml

```yaml
# 日志
logging:
  level:
    root: info
    com.kindnit: debug
  file:
    name: log/blog-dev.log  
```

#### 7.2 自定义日志

- 我们只需在resource下放入logback-spring.xml即可自定义日志

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<configuration>
    <!--包含Spring boot对logback日志的默认配置-->
    <include resource="org/springframework/boot/logging/logback/defaults.xml" />
    <property name="LOG_FILE" value="${LOG_FILE:-${LOG_PATH:-${LOG_TEMP:-${java.io.tmpdir:-/tmp}}}/spring.log}"/>
    <include resource="org/springframework/boot/logging/logback/console-appender.xml" />

    <!--重写了Spring Boot框架 org/springframework/boot/logging/logback/file-appender.xml 配置-->
    <appender name="TIME_FILE"
              class="ch.qos.logback.core.rolling.RollingFileAppender">
        <encoder>
            <pattern>${FILE_LOG_PATTERN}</pattern>
        </encoder>
        <file>${LOG_FILE}</file>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>${LOG_FILE}.%d{yyyy-MM-dd}.%i</fileNamePattern>
            <!--保留历史日志一个月的时间-->
            <maxHistory>30</maxHistory>
            <!--
            Spring Boot默认情况下，日志文件10M时，会切分日志文件,这样设置日志文件会在100M时切分日志
            -->
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>

        </rollingPolicy>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE" />
        <appender-ref ref="TIME_FILE" />
    </root>

</configuration>
        <!--
            1、继承Spring boot logback设置（可以在appliaction.yml或者application.properties设置logging.*属性）
            2、重写了默认配置，设置日志文件大小在100MB时，按日期切分日志，切分后目录：

                blog.2020-08-01.0   80MB
                blog.2020-08-01.1   10MB
                blog.2020-08-02.0   56MB
                blog.2020-08-03.0   53MB
                ......
        -->
```

### 8 后台-博客管理和发布

#### 8.1 博客展示

博客管理页面我们要开始引入**dto**的思想，具体的细节我不在这里细说，大家可以去查阅资料。用大白话说就是我只给前端传递它所需要的数据，而不把所有的数据都传递过去，使用**dto**有以下好处：

1. 依据现有的类代码，即可方便的构造出**DTO**对象，而无需重新进行分析
2. **减少请求次数，大大提高效率。**
3. 按需组织DTO对象，页面需要的字段我才组织，不需要的我不组织，可以避免传输整个表的字段，一定程度上提高了安全性。

通过以上三点，可以看出**DTO**的设计应该具备这几个特点：

1. **按需放入字段。**
2. 保证贫血模型，不要放任何逻辑在里面。

之后我们的**dto**类不再注释，有不明白的字段去看看实体类对应一下即可

------

- 首先看到博客展示页面

![adminBlog01](https://s1.ax1x.com/2022/07/30/vit44U.png)

- 可以发现我们只需要得到博客的**ID**、**标题**、**类型**、**是否推荐**、**发布状态**、**更新时间**，所以我们新建一个`BlogQuery`

```java
public class BlogQuery {
    private Long id; 
    private String title;
    private Date updateTime;
    private Integer recommend;
    private Integer published;
    //博客对应的类型id
    private Long typeId;
    //博客对应的类型
    private Type type;
}
```

- 这是一个根据需求创建出来的dto，多出来的两个属性是为了在别的方法里面使用

```java
public void setTypeAndTag(Model model){
    //这里是负责给博客新增页面传递分类和标签的方法
    model.addAttribute("types",typeService.getAdminType());
    model.addAttribute("tags", tagService.getAdminTag());
}
//去博客页面，显示博客
@GetMapping("/blogs")
public String toBlog(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
    PageHelper.startPage(pageNum,5); //pageNum从第几页开始，后面的参数则是一页有多少数据
    List<BlogQuery> allBlogQuery = blogService.getAllBlogQuery(); //这里查到所有的BlogQuery属性信息
    PageInfo<BlogQuery> blogsPageInfo = new PageInfo<>(allBlogQuery); //封装到Pagehelper
    System.out.println(allBlogQuery);
    model.addAttribute("blogsPageInfo",blogsPageInfo); //传到前端
    setTypeAndTag(model); //调用方法，将所有的分类和标签传到前端
    model.addAttribute("href", "/admin/blogs"); //返回首页和尾页的请求
    return "admin/blogs";
}
```

- 在 Mapper 层中使用以下语句实现

```xml
<resultMap id="blogMap" type="com.kindnit.dto.BlogQuery">
    <id property="id" column="id"/>
    <result property="title" column="title"/>
    <result property="updateTime" column="update_time"/>
    <result property="recommend" column="recommend"/>
    <result property="typeId" column="type_id"/>
    <result property="published" column="published"/>
    <association property="type" javaType="Type">
        <id property="id" column="id"/>
        <result property="name" column="name"/>
    </association>
</resultMap>

<select id="getAllBlogQuery" resultMap="blogMap">
    select b.id, b.title, b.update_time, b.recommend, b.published, b.type_id, t.id, t.name
    from t_blog b left outer join t_type t
    on b.type_id = t.id
    order by b.update_time desc
</select>
```

#### 8.2 博客搜索

- 我们可以使用未定条件查询文章，根据标题、分类、类型来进行搜索


![admin_blogSearch](https://s1.ax1x.com/2022/07/30/vFpRpj.png)

- 该模块中我们需要查询的信息通过前端来查到，这里我们创建一个搜索的dto类：`SearchBlog`

```java
public class SearchBlog {
    private String title;
    private Long typeId;
    private boolean recommend;
}
```

- 得到搜索条件

```html
<div class="field">
    <button  type="submit" id="search-btn" class="ui mini purple basic button"><i class="search icon"></i>搜索</button>
</div>

<div id="table-container">
    <!--celled:网格线、table:ui的表格、compact:让表格紧缩-->
    <table th:fragment="blogList" class="ui compact teal table">
        <thead>
        <tr>
            <th>序号</th>
            <th>标题</th>
            <th>类型</th>
            <th>推荐</th>
            <th>状态</th>
            <th>更新时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="blogs,iterStat:${blogsPageInfo.list}">
            <td th:text="${iterStat.count}" >1</td>
            <td th:text="${blogs.getTitle()}">刻意练习清单</td>
            <td th:text="${blogs.getType().getName()}">认知升级</td>
            <td th:text="${blogs.getRecommend()==1?'是':'否'}">是</td>
            <td th:text="${blogs.getPublished()==1?'发布':'草稿'}">草稿</td>
            <td th:text="${#dates.format(blogs.getUpdateTime(),'yyyy-MM-dd HH:mm')}">2020-10-02 09:45</td>
            
// 点击事件；page清零，搜索不会查询某一页
$("#search-btn").click(function () {
    // $("[name='page']").val(0);
    loaddata();
});
//用来请求发送数据
function loaddata() {
    $("#table-container").load(/*[[@{/admin/blogs/search}]]*/"/admin/blogs/search",{
        title : $("[name='title']").val(),
        typeId : $("[name='typeId']").val(),
        recommend : $("[name='recommend']").prop('checked'),
        pageNum : $("[name='pageNum']").val()
    });
}
```

```java
//博客搜索
@PostMapping("/blogs/search")
public String blogSearch(SearchBlog searchBlog, Model model,
                         @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
    PageHelper.startPage(pageNum,5);
    System.out.println(searchBlog); //从前端得到的信息
    //通过前端得到的信息来查询对应BlogQuery类型的信息
    List<BlogQuery> allBlogQuery = blogService.searchByTitleOrTypeOrRecommend(searchBlog);
    PageInfo<BlogQuery> blogsPageInfo = new PageInfo<>(allBlogQuery); //封装到Pagehelper
    model.addAttribute("blogsPageInfo",blogsPageInfo);
    setTypeAndTag(model);
    model.addAttribute("message", "查询成功");
    return "admin/blogs :: blogList";//返回bloglist片段，不然会在网页嵌套一个网页
}
```

- 在Mapper层中的代码实现

```xml
<select id="searchByTitleOrTypeOrRecommend" parameterType="com.kindnit.dto.SearchBlog" resultMap="blogMap">
    <bind name="pattern" value="'%' + title + '%'" />
    select b.id, b.title, b.update_time, b.recommend, b.published, b.type_id, t.id, t.name
    from t_blog b ,t_type t
    <where>
        <if test="1 == 1">
            b.type_id = t.id
        </if>
        <if test="typeId != null and typeId != ''">
            and b.type_id = #{typeId}
        </if>
        <if test="recommend != null and recommend != ''">
            and b.recommend = #{recommend}
        </if>
        <if test="title != null and title != ''">
            and b.title like #{pattern}
        </if>
    </where>
</select>
```

- 按照标题、分类、关键字模糊查询等未定条件搜索正常实现


![admin_blogSearchSuccess](https://s1.ax1x.com/2022/07/30/vF96Dx.png)

#### 8.3 博客发布

- 前端表单(部分)


```html
<!--post:提交-->
<form id="blog-form" action="#" method="post" th:action="${blog}==null ? @{/admin/blogs/add} : @{/admin/blogs/update}" th:object="${blog}" class="ui fo
  <input type="hidden" name="published" th:value="${blog}!=null ? ${blog.isPublished()}">
  <input type="hidden" name="id"  th:id="${blog} ==null ? randomId" th:value="${blog}!=null ? ${blog.getId()}">
  <!--required:要求必须输入，不输入显示红色-->
  <div class="required field">
    <!--左边是labeled和input结合-->
    <div class="ui left labeled input">
      <!--select在前，input在后、dropdown:选择，compact:宽度和文本一样，适应文本-->
      <div class="ui selection compact teal basic dropdown label">
        <!--默认值原创：下拉的时候选择原创-->
        <input type="hidden" value="原创" name="flag" th:value="${blog}!=null ? ${blog.getFlag()}" >
        <i class="dropdown icon"></i>
        <div class="text">原创</div>
        <div class="menu">
          <!--item：选项、data-value：选项的值-->
          <div class="item" data-value="原创">原创</div>
          <div class="item" data-value="转载">转载</div>
          <div class="item" data-value="翻译">翻译</div>
        </div>
      </div>
      <input type="text" name="title" placeholder="标题" th:value="${blog}!=null ? ${blog.getTitle()}" >
    </div>
  </div>
```

- 后端 Controller 调用业务层存储即可，我们的时间以及标签信息在service层中存储

```java
//去新增页面
@GetMapping("/blogs/input")
public String toBlogAdd(Model model){
    setTypeAndTag(model);  //传递type和标签
    return "admin/blogs-input";
}
//增加blog
@PostMapping("/blogs/add")
public String blogAdd(Blog blog, RedirectAttributes attributes, HttpSession session){
    System.out.println("前端传过来的blog：" + blog);
    //这里是提前将user在session中拿到并存入blog中
    blog.setUser((User) session.getAttribute("user"));
    //设置blog的type
    blog.setType(typeService.getTypeById(blog.getTypeId()));
    //设置blog中的typeID属性
    blog.setTypeId(blog.getType().getId());
    //设置blog中tags属性
    blog.setTags(tagService.getTagByString(blog.getTagIds()));
    //设置博客id这里得到的是前端中传递过来的
    blog.setUserId(blog.getUser().getId());
    blogService.saveBlog(blog);
    attributes.addFlashAttribute("message", "新增成功");
    return "redirect:/admin/blogs";
}
```

- 我们的标签存在多个，与博客是多对一的关系，所以我们建立的中间表`t_blog_tags`就是用来存储这方面的信息，我们这里需要新建一个`BlogAndTag`dto用于得到前端的数据且方便存入数据库

```java
public class BlogAndTag {
    private Long tagId;
    private Long blogId;
}
```

- Service层设置时间和标签信息

```java
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
```

- 在Mapper层的实现代码

```xml
<insert id="saveBlog" parameterType="Blog">
    insert into t_blog (id,title, content, first_picture, flag,views, appreciation, share_statement, commentabled,published,recommend, create_time, update_time, type_id,tag_ids, user_id, description)
    values (#{id},#{title},#{content},#{firstPicture},#{flag},#{views},#{appreciation},
            #{shareStatement},#{commentabled},#{published},#{recommend},#{createTime},
            #{updateTime},#{typeId},#{tagIds},#{userId},#{description});
</insert>

<insert id="saveBlogAndTag" parameterType="com.kindnit.dto.BlogAndTag">
    insert into t_blog_tags (tag_id, blog_id) values (#{tagId},#{blogId});
</insert>
```

- 这里以及之后的博客修改可能存在数据过长的问题，这里给出的解决方案：content是text类型，将其改成longtext类型可以解决

![t_blog_content](https://s1.ax1x.com/2022/07/30/vFCldK.png)

#### 8.4 博客删除

- 删除的话调用前端传来的id删除对应博客即可

```java
//删除
@GetMapping("/blogs/{id}/delete")
public String deleteBlog(@PathVariable Long id, RedirectAttributes attributes){
    blogService.deleteBlog(id);
    attributes.addFlashAttribute("message","删除成功");
    return "redirect:/admin/blogs";
}
```

这里值得注意的是，我们删除了博客后还需删除`t_blog_tags`中间表中所对应的标签以及对应博客有的评论也需一起删除

- 在Service层中的体现便是这样

```java
@Override
public int deleteBlog(Long id) {
    blogMapper.deleteBlog(id);
    blogMapper.deleteBlogAndTag(id);
    commentService.deleteCommentByblogId(id);
    return 1;
}
```

- 在Mapper层中的代码实现

```xml
<!--根据博客Id删除博客-->
<delete id="deleteBlog">
    delete from t_blog b where b.id = #{id};
</delete>
<!--根据博客Id删除博客与标签中间表里对应的标签-->
<delete id="deleteBlogAndTag">
    delete from t_blog_tags where blog_id = #{blogId}
</delete>
<!--根据博客Id删除评论-->
<delete id="deleteCommentByblogId">
    delete from t_comment where blog_id = #{id}
</delete>
```

- 这里我们发布一篇博客

![admin_blogAdd](https://s1.ax1x.com/2022/07/31/vFRb8J.png)

- 我们发布博客后评论

![admin_blogComment](https://s1.ax1x.com/2022/07/31/vFRoUU.png)

- 数据库中的评论信息

![t_commentAdd](https://s1.ax1x.com/2022/07/31/vFR4bV.png)

- 当我们删除该博客后

![admin_blogDelete](https://s1.ax1x.com/2022/07/31/vFRHC4.png)

- 可以看到数据库内的评论也已经跟着删除了，同样标签中间表的信息也已经删除

![t_commentDeleteSuccess](https://s1.ax1x.com/2022/07/31/vFRT5F.png)

#### 8.5 博客修改

修改功能中有一点需要注意：当我们修改某个文章的时候，文章的相关信息应该根据 ID 查询出来后，直接显示到修改页面

因为这里的文章主题内容是用 `TextArea` 来承载的，而该元素却没有 `value` 属性，如果使用 `value` 在后台取值，会发现为空

- 这里需要使用 `th:text` 标签来获得 `TextArea` 的内容


```html
 <div id="md-content" style="z-index: 1 !important;">
   <!--name="content" style="display: none引入的插件样例用法，直接复制用，在editor.md--examples--simple.html文件-->
   <textarea placeholder="博客内容" name="content" th:text="${blog}!=null ? ${blog.getContent()}" style="display: none" ></textarea>
 </div>
```

- 这里我们与修改分类同理，需要传递博客信息给修改页面，为了解耦我们同样新建一个只包含需要的博客信息的dto`ShowBlog`

```java
public class ShowBlog {
    private Long id;
    private boolean published;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String tagIds;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;
}
```

- 我们在controller层中将前端得到的`showblog`信息传到service层中进行更新

```java
//修改博客
@PostMapping("/blogs/update")
public String updateBlog(ShowBlog showBlog, RedirectAttributes attributes){
    //设置blog中tags属性
    blogService.updateBlog(showBlog);
    System.out.println(showBlog.getTagIds());
    System.out.println("updateBlog的showBlog"+showBlog);
    attributes.addFlashAttribute("message", "修改成功");
    return "redirect:/admin/blogs";
}
```

- 在service层中预设更新时间，还需要把修改后的标签信息存入中间表中，我这里用的方法是先删原来的再加上后来的，也许可以通过外键的形式完成这个功能或者其他更好的方法，大家自行研究一下

```java
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
```

这里需要注意的是这个`getTagByString`是什么？这里是标签部分的内容，我们之前省略了现在这里补充一下。由于我们的标签与博客是多对一的形式，所以我们得到的标签是多个的，显然这不能直接存入数据库。我们从前端得到的是一串String类型的字符串，为了把它们依次存入`t_blog_tags`中间表中，我们需要将其转换成一个数组，然后进行遍历存储，与博客发布存储标签的方式一致

```java
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
```

- 在Mapper层中的实现

```xml
<update id="updateBlog" parameterType="com.kindnit.dto.ShowBlog">
    update t_blog set published = #{published},flag = #{flag} ,
    title = #{title}, content = #{content}, type_id = #{typeId}, tag_ids = #{tagIds},
    first_picture = #{firstPicture} , description = #{description} , recommend = #{recommend} ,
    share_statement = #{shareStatement}, appreciation = #{appreciation},
    commentabled = #{commentabled} ,update_time = #{updateTime}
    where id = #{id};
</update>

<select id="getTagById" resultType="Tag">
    select *
    from t_tag where id = #{id}
</select>
```

![admin_blogUpdate01](https://s1.ax1x.com/2022/07/31/vFo6eA.png)

![admin_blogUpdate02](https://s1.ax1x.com/2022/07/31/vFosLd.png)

![admin_blogUpdate03](https://s1.ax1x.com/2022/07/31/vForsH.png)

到此为止，博客后端管理的所有模块功能大致完成，接下来就是前端的几个展示页面了

### 9 前台-首页

#### 9.1 首页展示

- 我们首页需要有如下信息，一侧是所有已发布的博客，另一侧则是分类、标签、最新推荐的展示


![index01](https://s1.ax1x.com/2022/07/30/vitv4O.png)

- 在Controller层中我们将所有的信息都拿到且返回给前端

```java
@GetMapping("/")
public String toIndex(Model model, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
    PageHelper.startPage(pageNum,6); ////pageNum从第几页开始，后面的参数则是一页有多少数据
    List<FirstPageBlog> allFirstPageBlog = blogService.getAllFirstPageBlog(); //查询到所有已发布的博客信息
    System.out.println("allFirstPageBlog：----》"+allFirstPageBlog);
    List<Type> types=typeService.findTypeListBefore(7); //首页的分类信息，限定展示七个
    List<Tag> allTag = tagService.getAllTag(); //查到所有的标签
    System.out.println("alltag:"+allTag);
    List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog(); //最新推荐
    PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(allFirstPageBlog);
    model.addAttribute("pageInfo", pageInfo);
    model.addAttribute("tags", allTag);
    model.addAttribute("types", types);
    model.addAttribute("recommendedBlogs", recommendedBlog);
    return "index";
}
```

- 这里我们引入了`FirstPageBlog`、`RecommendBlog`dto

```java
public class FirstPageBlog {
    //Blog
    private Long id;
    private String title;
    private String firstPicture;
    private Integer views;
    private Date updateTime;
    private String description;
    //Type
    private String typeName;
    //User
    private String nickname;
    private String avatar;
}

public class RecommendBlog {
    private Long id;
    private String title;
    private boolean recommend;
}
```

- Mapper 层中查询语句如下

```xml
<!--客户端页面功能实现-->
<resultMap id="firstPageBlog" type="com.kindnit.dto.FirstPageBlog">
    <id property="id" column="id"/>
    <result property="title" column="title"/>
    <result property="firstPicture" column="first_picture"/>
    <result property="views" column="views"/>
    <result property="updateTime" column="update_time"/>
    <result property="description" column="description"/>
    <result property="typeName" column="name"/>
    <result property="nickname" column="nickname"/>
    <result property="avatar" column="avatar"/>
</resultMap>

<select id="getAllFirstPageBlog" resultMap="firstPageBlog">
    select b.id,b.title,b.first_picture, b.views,b.update_time,b.description,
           t.name,
           u.nickname, u.avatar
    from t_blog b, t_type t,t_user u
    where b.type_id = t.id
      and  u.id = b.user_id
      and  b.published = 1 
    order by b.update_time desc
</select>

<select id="getAllRecommendBlog" resultType="com.kindnit.dto.RecommendBlog">
    select id,title,recommend
    from t_blog
    where recommend = 1
      and published = 1
    ORDER BY
      t_blog.update_time DESC LIMIT 3 <!--这里我们按照更新时间的顺序来排，并限定数据为3-->
</select>

<!--为防止与博客id混淆取别名-->
<resultMap id="tags" type="Tag">
    <id property="id" column="tid"/>
    <result property="name" column="name"/>
    <collection property="blogs" ofType="Blog">
        <id property="id" column="bid"/>
        <result property="title" column="title"/>
    </collection>
</resultMap>

<select id="getAllTag" resultMap="tags">
    select t.id tid,t.name,b.id bid,b.title
    from t_tag t, t_blog b, t_blog_tags bt
    where b.published = 1
      and b.id = bt.blog_id
      and t.id = bt.tag_id
</select>

<!--两个id可能会相冲，取别名即可-->
<resultMap id="types" type="Type">
    <id property="id" column="tid"/>
    <result property="name" column="name"/>
    <collection property="blogs" ofType="Blog">
        <id property="id" column="bid"/>
        <result property="title" column="title"/>
        <result property="typeId" column="type_id"/>
    </collection>
</resultMap>

<!--首页的显示分类-->
<select id="findTypeListBefore" parameterType="int" resultMap="types">
    select t.id tid, t.name, b.id bid, b.title,b.type_id
    from t_type t,t_blog b
    where t.id = b.type_id
      and published = 1
    order by b.update_time desc limit 0,${size} <!--size我们在controller给了-->
</select>
```

实现后大致效果如上

#### 9.2 全局搜索功能

我们在博客首页的右上角，有一个搜索图标，因此我们需要去实现全局搜索功能

搜索功能，我们只检索博客标题以及博客正文部分

- 在mapper层中的体现

```xml
<select id="getSearchBlog" resultMap="firstPageBlog">
    <bind name="pattern" value="'%' + query + '%'" />
    select b.id,b.title,b.first_picture, b.views,b.update_time,b.description,
    t.name ,
    u.nickname, u.avatar
    from t_blog b, t_type t,t_user u
    where b.type_id = t.id
    and  u.id = b.user_id
    and  b.published = 1
    and (b.title like #{pattern}
    or b.content like  #{pattern})
    order by b.update_time desc
</select>
```

- 首先要将导航栏的搜索框设置为一个 form 表单的形式，这样点击搜索他才会进行提交


```html
<form name="search" action="#" th:action="@{/search}" method="post" target="_blank">
    <div class="ui icon transparent input m-margin-tb-tiny">
   <input type="text" class="menu-item-search" name="query" placeholder="Search...." th:value="${query}">
   <i onclick="document.forms['search'].submit()" class="search link icon"></i>
    </div>
</form>
```

- 查询到内容则会把信息和查询条件一并返回到搜索结果页面，无结果则到无结果页面


```java
//全局搜索
@PostMapping("/search")
public String toSearch(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                       Model model,@RequestParam String query){
    PageHelper.startPage(pageNum, 100);
    List<FirstPageBlog> searchBlog = blogService.getSearchBlog(query); //调用方法开始查询query的内容
    if(searchBlog.isEmpty()){
        return "searchNull"; //如果无搜索结果返回到无结果的页面
    }
    else{
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(searchBlog);
        model.addAttribute("pageInfo", pageInfo); //查到的信息
        model.addAttribute("query", query); //查询信息也传过去
        return "search"; 
    }
}
```

- 搜索成功，展示信息

![blog_Search](https://s1.ax1x.com/2022/07/31/vkZc0H.png)

- 如果搜索结果不存在，跳转到一个信息提示页面，提示用户该搜索词的搜索结果为 0


![blog_SearchNull](https://s1.ax1x.com/2022/07/31/vkZ6ne.png)

### 10 前台-博客正文

#### 10.1 博客正文及格式

- 博客正文的展示，在首页点击进行跳转的时候，根据 id 查到对应的内容和评论，然后显示到前端即可

```java
//到博客页面，并根据博客id查到评论与内容
@GetMapping("/blog/{id}")
public String toBlog(@PathVariable Long id, Model model){
    DetailedBlog detailedBlog = blogService.getDetailedBlog(id);
    List<Comment> comments = commentService.listCommentByBlogId(id);
    model.addAttribute("comments", comments);
    model.addAttribute("blog", detailedBlog);
    return "blog";
}
```

- 这里我们同样定义了一个dto来存储需要的博客正文信息`DetailedBlog`

```java
public class DetailedBlog {
    private Long id;
    private String firstPicture;
    private String flag;
    private String title;
    private String content;
    private Integer views;
    private Date updateTime;
    private boolean commentabled;
    private boolean shareStatement;
    private boolean appreciation;
    private String nickname;
    private String avatar;
}
```

- 在mapper层中的语句

```xml
<resultMap id="detailedBlog" type="com.kindnit.dto.DetailedBlog">
    <id property="id" column="bid"/>
    <result property="firstPicture" column="first_picture"/>
    <result property="flag" column="flag"/>
    <result property="title" column="title"/>
    <result property="content" column="content"/>
    <result property="views" column="views"/>
    <result property="updateTime" column="update_time"/>
    <result property="commentabled" column="commentabled"/>
    <result property="shareStatement" column="share_statement"/>
    <result property="appreciation" column="appreciation"/>
    <result property="nickname" column="nickname"/>
    <result property="avatar" column="avatar"/>
    <collection property="tags" ofType="Tag">
        <id property="id" column="tid"/>
        <result property="name" column="name"/>
    </collection>
</resultMap>

<select id="getDetailedBlog" resultMap="detailedBlog">
    select b.id bid,b.first_picture,b.flag,b.title,b.content,b.views,b.update_time,   	b.commentabled,b.share_statement,b.appreciation, u.nickname,u.avatar,t.id tid ,t.name
    from t_blog b,t_user u,t_tag t,t_blog_tags tb
    where b.user_id = u.id
      and tb.blog_id = b.id
      and tb.tag_id = t.id
      and  b.id = #{id}
</select>

<!--根据博客Id删除评论-->
<delete id="deleteCommentByblogId">
    delete from t_comment where blog_id = #{id}
</delete>
```

- 但是正文会出现格式问题它会显示 Markdown 源代码，所以我们应该想办法将它渲染为 HTML 

![blog_Html](https://s1.ax1x.com/2022/07/31/vku55j.png)

那么这东西应该怎么去实现？这里就需要使用一个第三方插件 `commonmark-java` ，该插件专门用来将 Markdown 转为 HTML，并有着一些扩展功能

- 首先需要在项目中引入依赖


```xml
<!--markdown转html依赖-->
<!--注意：这里的插件版本号必须一致，否则会报 ClassNotFound 的错误-->
<dependency>
    <groupId>com.atlassian.commonmark</groupId>
    <artifactId>commonmark</artifactId>
    <version>0.10.0</version>
</dependency>
<dependency>
    <groupId>com.atlassian.commonmark</groupId>
    <artifactId>commonmark-ext-heading-anchor</artifactId>
    <version>0.10.0</version>
</dependency>
<dependency>
    <groupId>com.atlassian.commonmark</groupId>
    <artifactId>commonmark-ext-gfm-tables</artifactId>
    <version>0.10.0</version>
</dependency>
```

然后需要去定义一个工具类，在该工具类中去自定义一些工具，比如表格转换、代码转换等等

- 自定义的转换工具类 `MarkdownUtils` 如下


```java
public class MarkdownUtils {
    /**
     * markdown格式转换成HTML格式
     * @param markdown
     * @return
     */
    public static String markdownToHtml(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }
    /**
     * 增加扩展[标题锚点，表格生成]
     * Markdown转换成HTML
     * @param markdown
     * @return
     */
    public static String markdownToHtmlExtensions(String markdown) {
        //h标题生成id
        Set<Extension> headingAnchorExtensions = Collections.singleton(HeadingAnchorExtension.crea
        //转换table的HTML
        List<Extension> tableExtension = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder()
                .extensions(tableExtension)
                .build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder()
                .extensions(headingAnchorExtensions)
                .extensions(tableExtension)
                .attributeProviderFactory(new AttributeProviderFactory() {
                    public AttributeProvider create(AttributeProviderContext context) {
                        return new CustomAttributeProvider();
                    }
                })
                .build();
        return renderer.render(document);
    }
    /**
     * 处理标签的属性
     */
    static class CustomAttributeProvider implements AttributeProvider {
        @Override
        public void setAttributes(Node node, String tagName, Map<String, String> attributes) {
            //改变a标签的target属性为_blank
            if (node instanceof Link) {
                attributes.put("target", "_blank");
            }
            if (node instanceof TableBlock) {
                attributes.put("class", "ui celled table");
            }
        }
    }
    public static void main(String[] args) {
        String table = "| hello | hi   | 哈哈哈   |\n" +
                "| ----- | ---- | ----- |\n" +
                "| 斯维尔多  | 士大夫  | f啊    |\n" +
                "| 阿什顿发  | 非固定杆 | 撒阿什顿发 |\n" +
                "\n";
        String a = "[imCoding 爱编程](http://www.lirenmi.cn)";
        System.out.println(markdownToHtmlExtensions(a));
    }
```

- 然后在 service层调用该工具类转换后，再返回给前端


```java
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
```

- 这里有个小细节，前端接受数据的时候，应该使用 `utext` 而非 `text` ，因为前端需要显示为 `html` 而不是文本


```html
<!--博客正文-->
<div id="content" class="typo  typo-selection js-toc-content m-padded-lr-responsive m-padded-tb-large"
     th:utext="${blog.content}">
```

- 启动项目，已经成功转换

![blog_NotHtml](https://s1.ax1x.com/2022/07/31/vku4aQ.png)

- 但是同时可能会出现内容样式问题，比如那里字不够粗，哪儿不够开阔等等，这个大家按需求修改`typo.css`

```html
<!--m-padded-lr-responsive:左右边距，手机端响应、m-padded-tb-large:上下边距；typo  typo-selection:引入外部插件的样式-->
<!--typo  typo-selection：排版样式直接照着用、自己在typo设置了包含.typo的元素才能起作用、js-toc-content：定位好生成目录-->
<!--中间主要内容部分-->
<div id="content" class="typo typo-selection js-toc-content m-padded-lr-responsive m-padded-tb-large"
     th:utext="${blog.content}">
    <h2 id="section1">一、关于 <i class="serif">Typo.css</i></h2>
    <pre><code class="language-css">p { color: red }</code></pre>
    <pre><code class="language-css">p { color: red }</code></pre>
    <p><i class="serif">Typo.css</i> 的目的是，在一致化浏览器排版效果的同时，构建最适合中文阅读的网页排版。</p>
    <h4>现状和如何去做：</h4>
    <p class="typo-first">排版是一个麻烦的问题 <sup><a href="#appendix1"># 附录一</a></sup>，需要精心设计，而这个设计却是常被视觉设计师所忽略的。前端工程
        OS 中的不同浏览器渲染不同，改动需要多的时间做回归测试，所以改变变得更困难。而像我们一般使用的
        Yahoo、Eric Meyer 和 Alice base.css 中采用的 Reset 都没有很好地考虑中文排版。<i class="serif">Typo.css</i>
        要做的就是解决中文排版的问题。</p>
    <h3 id="section3">二、附录</h3>
    <h5 id="appendix1">1、<i class="serif">Typo.css</i> 排版偏重点</h5>
    <h5 id="appendix2">2、开源许可</h5>
</div>
```

#### 10.2 添加文章目录

虽然文章显示没有什么大问题，但是我们发现一个超长的文章没有目录，这是不能忍受的，我们需要在正文的侧边栏出，添加一个目录

这里可以使用一个 tocbot 插件来完成

- 在文章页面引入插件


```html
<script rel="text/javascript" th:src="@{/lib/tocbot/tocbot.min.js}"></script>
<link rel="stylesheet" th:href="@{/lib/tocbot/tocbot.css}">
```

- 初始化插件


```html
<script>
tocbot.init({
    // Where to render the table of contents.
    tocSelector: '.js-toc',     //显示目录的区域的CSS
    // Where to grab the headings to build the table of contents.
    contentSelector: '.js-toc-content', //要生成目录的内容，对应内容元素，放在要生成目录的地方
    // Which headings to grab inside of the contentSelector element.
    headingSelector: 'h1, h2, h3, h4,h5,h6',      //生成目录的级别
});
</script>
```

注意在内容div里加好class属性`js-toc-content`以及在`tocbot.css`中修改目录样式等，这里不细说啦

- 配置好之后，我们打开文章，发现目录已经成功创建


![blog_Directory](https://s1.ax1x.com/2022/07/31/vklSiQ.png)

### 11 前端-评论功能

#### 11.1 评论列表展示

- 评论这个功能可以说是很繁琐了，主要结构为**父评论**、**子一级评论**、子二级评论，废话少说我们直接附代码

```java
//根据博客ID来把评论传到前端
@GetMapping("/comments/{blogId}")
public String comments(@PathVariable Long blogId, Model model) {
    List<Comment> comments = commentService.listCommentByBlogId(blogId);
    model.addAttribute("comments", comments);
    System.out.println("传到前端的comments"+comments);
    return "blog :: commentList";
}
```

```html
 <!--留言区-->
 <!--留言区域列表-->
 <div id="comment-container" class="ui teal segment">
     <div th:fragment="commentList">
         <!--comments:UI的留言板框架↓-->
         <div class="ui threaded comments" style="max-width: 100%;">
             <h3 class="ui dividing header">评论</h3>
             <div class="comment" th:each="comment : ${comments}">
                 <a class="avatar">
                     <img src="../static/images/avatar.jpg"  th:src="@{${comment.avatar}}">
                 </a>
                 .......略
```

- 在service层进行遍历查询

```java
@Override
public List<Comment> listCommentByBlogId(Long blogId) {
    //没有父节点的默认为-1, Long.parseLong("-1"),查询出父节点
    List<Comment> comments = commentMapper.findByBlogIdParentIdNull(blogId, Long.parseLong("-1"));
    System.out.println("listCommentByBlogId里面的findByBlogIdParentIdNull后的comments"+comments);
    for(Comment comment : comments){
        Long id = comment.getId();
        String parentNickname1 = comment.getNickname();
        List<Comment> childComments = commentMapper.findByBlogIdParentIdNotNull(blogId,id);
        //查询出子评论
        combineChildren(blogId, childComments, parentNickname1);
        comment.setReplyComments(tempReplys);
        tempReplys = new ArrayList<>();
    }
    return eachComment(comments);
}
/**
 * 循环每个顶级的评论节点
 * @param comments
 * @return
 */
private List<Comment> eachComment(List<Comment> comments) {
    List<Comment> commentsView = new ArrayList<>();
    for (Comment comment : comments) {
        Comment c = new Comment();
        BeanUtils.copyProperties(comment,c);
        commentsView.add(c);
    }
    //合并评论的各层子代到第一级子代集合中
    combineChildren(commentsView);
    return commentsView;
}
/**
 *
 * @param comments root根节点，blog不为空的对象集合
 * @return
 */
private void combineChildren(List<Comment> comments) {
    for (Comment comment : comments) {
        List<Comment> replys1 = comment.getReplyComments();
        for(Comment reply1 : replys1) {
            //循环迭代，找出子代，存放在tempReplys中
            recursively(reply1);
        }
        //修改顶级节点的reply集合为迭代处理后的集合
        comment.setReplyComments(tempReplys);
        //清除临时存放区
        tempReplys = new ArrayList<>();
    }
}
private void combineChildren(Long blogId, List<Comment> childComments, String parentNickname1) {
      判断是否有一级子评论
    if(childComments.size() > 0){
              循环找出子评论的id
        for(Comment childComment : childComments){
            String parentNickname = childComment.getNickname();
            childComment.setParentNickname(parentNickname1);
            tempReplys.add(childComment);
            Long childId = childComment.getId();
                  查询出子二级评论
            recursively(blogId, childId, parentNickname);
        }
    }
}
/**
 * 递归迭代，剥洋葱
 * @param comment 被迭代的对象
 * @return
 */
private void recursively(Comment comment) {
    tempReplys.add(comment);//顶节点添加到临时存放集合
    if (comment.getReplyComments().size()>0) {
        List<Comment> replys = comment.getReplyComments();
        for (Comment reply : replys) {
            tempReplys.add(reply);
            if (reply.getReplyComments().size()>0) {
                recursively(reply);
            }
        }
    }
}
private void recursively(Long blogId, Long childId, String parentNickname1) {
      根据子一级评论的id找到子二级评论
    List<Comment> replayComments = commentMapper.findByBlogIdAndReplayId(blogId,childId);
    if(replayComments.size() > 0){
        for(Comment replayComment : replayComments){
            String parentNickname = replayComment.getNickname();
            replayComment.setParentNickname(parentNickname1);
            Long replayId = replayComment.getId();
            tempReplys.add(replayComment);
            recursively(blogId,replayId,parentNickname);
        }
    }
}
```

- mapper层的语句

```xml
<select id="findByBlogIdParentIdNull" resultType="Comment">
    select *
    from t_comment c
    where blog_id = #{blogId} and parent_comment_id = #{blogParentId}
    order by create_time desc
</select>
<!--查询一级子评论-->
<select id="findByBlogIdParentIdNotNull" resultType="Comment">
    select *
    from t_comment c
    where c.blog_id = #{blogId} and c.parent_comment_id = #{id}
    order by c.create_time desc
</select>
<!--查询二级子评论-->
<select id="findByBlogIdAndReplayId" resultType="Comment">
    select *
    from t_comment c
    where c.blog_id = #{blogId} and c.parent_comment_id = #{childId}
    order by c.create_time desc
</select>
```

![admin_blogComment](https://s1.ax1x.com/2022/07/31/vFRoUU.png)

这里附上一个博主对于这部分的博客，写的肯定比我好 [SpringBoot和Mybatis实现评论楼中楼功能（一张表搞定）](https://onestar.newstar.net.cn/blog/35)

#### 11.2 回复评论@和博主提示

- 当我们点击回复某个人的时候，鼠标焦点会自动跳转到评论区域，并且内容中会自动 @ 被回复的人

```js
function reply(obj) {
    var commentId = $(obj).data('commentid');
    var commentNickname = $(obj).data('commentnickname');
    // alert(commentId)
    // alert(commentNickname)
    $("[name='content']").attr("placeholder", "@" + commentNickname).focus();
    $("[name='parentComment.id']").val(commentId);
    $(window).scrollTo($('#comment-form'), 500);
}
```

![admin_blogComment](https://s1.ax1x.com/2022/07/31/vFRoUU.png)

回复评论的实现就是提交评论，都是调用了提交评论的方法

#### 11.3 提交评论功能

- 提交评论这里有一点细节需要注意，当点击提交按钮后，Controller 层调用 Service 层之后，将评论数据存储到数据库中，然后需要重定向到写评论时的那个文章页面，所以需要在comment里存博客信息

```java
//保存评论
@PostMapping("/comments")
public String post(Comment comment, HttpSession session) {
    System.out.println("传过来的comment："+ comment);
    Long blogId = comment.getBlogId();
    System.out.println("saveComment的ID："+ blogId);
    comment.setBlog(blogService.getDetailedBlog(blogId));
    System.out.println("setBlog后的comment："+comment);
    User user = (User) session.getAttribute("user");
    if (user != null) {
        comment.setAvatar(user.getAvatar());
        comment.setAdminComment(true);
    } else {
        //如果user为空，设置默认头像
        comment.setAvatar(avatar);
    }
    commentService.saveComment(comment);
    return "redirect:/comments/" + blogId;
}
```

- 在service层中进行校验存储

```java
@Override
public int saveComment(Comment comment) {
    System.out.println("saveComment的comment:" + comment);
    //判断有没有在别人的评论上进行评论还是一个新的评论
    Long parentCommentId = comment.getParentCommentId();
    //没有父级评论默认是-1
    if (parentCommentId != -1) {
        //有父级评论
        comment.setParentComment(commentMapper.findByParentCommentId(comment.getParentCommentId()));
    } else {
        comment.setParentComment(null);
    }
    comment.setCreateTime(new Date());
    comment.setBlog(blogMapper.getDetailedBlog(comment.getBlogId()));
    return commentMapper.saveComment(comment);
}
```

mapper层中的语句

```xml
<select id="findByParentCommentId" resultType="Comment">
    select c.id,c.nickname,c.email,c.content,c.avatar,c.create_time,c.blog_id,
    c.parent_comment_id
    from t_comment c
    where c.parent_comment_id = #{parentCommentId}
</select>

<insert id="saveComment" parameterType="Comment">
    insert into t_comment (nickname,email,content,avatar,create_time,blog_id,parent_comment_id,admin_comment)
    values (#{nickname},#{email},#{content},#{avatar},#{createTime},#{blogId},#{parentCommentId},#{adminComment});
</insert>
```

#### 11.4 评论删除

- 评论删除我们只有是登录后，session里有了user信息才可以删除

```html
<a class="delete" href="#" th:href="@{/comment/{param1}/{param2}/delete(param1=${comment.blogId},param2=${comment.id})}" onclick="return confirm('确定要删除该评论吗？三思啊! 删了可就没了！')" th:if="${session.user}">删除</a>
```

- 在后台登录之后，拥有当前user的头像和删除按键

![admin_commentLogin](https://s1.ax1x.com/2022/07/31/vFRoUU.png)

- 在后台注销之后，会提供默认的访客评论头像，也没有了删除键

![admin_commentLogin](https://s1.ax1x.com/2022/07/31/vFRIET.png)

- controller获取id调用service删除即可，但我们仍需回到博客页面，所以需要传数据回去

```java
//    删除评论
@GetMapping("/comment/{blogId}/{id}/delete")
public String delete(@PathVariable Long blogId, @PathVariable Long id, Comment comment, RedirectAttributes attributes, Model model){
    commentService.deleteComment(comment,id);
    DetailedBlog detailedBlog = blogService.getDetailedBlog(blogId);
    List<Comment> comments = commentService.listCommentByBlogId(blogId);
    model.addAttribute("blog", detailedBlog);
    model.addAttribute("comments", comments);
    return "blog";
}
```

这里的评论功能是有缺陷和bug的，比如删除了子集评论父级评论虽然还留在数据库中，但是页面已经不显示了。说不定还有更多bug留给各位学习进步！(发现后记得附上解决方法给我留个言/狗头)

### 12 前端-分类页面

这里有以下几点需要注意

我们的分类表 `t_type` 中有十多种分类，但是不一定每一种分类都会有对应的文章，所以我们需要联合文章表和分类表，将有对应文章的分类查询出来，然后在前端只展示有文章的分类

- Mapper 层查询语句如下


```xml
<!--获得文章对应的所有分类列表-->
<!--两个id可能会相冲，取别名即可-->
<resultMap id="types" type="Type">
    <id property="id" column="tid"/>
    <result property="name" column="name"/>
    <collection property="blogs" ofType="Blog">
        <id property="id" column="bid"/>
        <result property="title" column="title"/>
        <result property="typeId" column="type_id"/>
    </collection>
</resultMap>

<!--查询首页标签-->
<select id="getAllType" resultMap="types">
    select t.id tid, t.name, b.id bid, b.title,b.type_id
    from t_type t,t_blog b
    where t.id = b.type_id
</select>
```

当我们从首页或者别的地方跳转到分类页面时，跳转之前并不知道分类页面的第一个分类 id 是什么，那怎么办？

- 我们可以设置从外部跳转到分类页时，设定分类 id 为 -1

```html
<a href="#" th:href="@{/tags/-1}" class="m-item menu-item-tags item m-mobile-hide" th:classappend="${n==3} ? 'active'"><i class="tags icon"></i>标签</a>
```

- 然后在 Controller 中根据判断一下，若为 -1，将其重新设定值即可


```java
@GetMapping("/types/{id}")
public String types(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum,
                    @PathVariable Long id, Model model) {
    //首页点进来显示Type显示的传过来id：-1
    System.out.println("Type显示的传过来id："+id);
    List<Type> types = typeService.getAllType();
    System.out.println("Type显示的getAllType的Types："+types);
    //-1表示从首页导航点进来的，给它传最顶上的ID
    if (id == -1) {
        id = types.get(0).getId();
    }
    System.out.println("Type显示的id："+id);
    model.addAttribute("types", types);
    List<FirstPageBlog> blogs = blogService.getByTypeId(id);
    System.out.println("Type显示的getByTypeId的blogs："+blogs);
    PageHelper.startPage(pageNum, 100);
    PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
    model.addAttribute("pageInfo", pageInfo);
    model.addAttribute("activeTypeId", id);
    return "types";
}
```

![type](https://s1.ax1x.com/2022/07/30/viN9vd.png)

**分类页面完成，标签页与分类页几乎完全一致，这里不再赘述**

### 13 前端-归档、关于我页面

#### 13.1 归档页面

- 我们这里的归档只是查到所有的博客信息


```xml
@GetMapping("/archives")
public String archive(Model model){
    List<BlogQuery> blogs = blogService.getAllBlogQuery();
    model.addAttribute("blogs", blogs);
    return "archives";
}
```

- mapper层中按更新时间的降序来排序


```java
<select id="getAllBlogQuery" resultMap="blogMap">
    select b.id, b.title, b.update_time, b.recommend, b.published, b.type_id, t.id, t.name
    from t_blog b left outer join t_type t
    on b.type_id = t.id
    order by b.update_time desc
</select>
```

- 使用了timeline.js插件

```html
<link rel="stylesheet" href="../static/css/timeline.css" th:href="@{/css/timeline.css}">
<script src="../static/lib/timeline/timeline.js" th:src="@{/lib/timeline/timeline.js}"></script>

<!--时间轴内容-->
<div id="waypoint" class="m-container-small m-padded-tb-super ">
    <div class="doc-container m-padded-tb-massivex m-opacity" id="doc-container">
        <th:block >
            <section class="timeline">
                <ul>
                    <li class="" th:each="blog : ${blogs}">
                        <div>
                            <time th:text="${#dates.format(blog.updateTime,'yyyy-MM-dd')}">2020/01/01</time>
                            <div class="scientist" >
                                <a href="#" target="_blank" th:href="@{/blog/{id}(id=${blog.id})}">
                                    <h3 class="state" style="text-align:center;font-size: 16px;color: #000;" th:text="${blog.title}">文章标题</h3>
                                </a>
                            </div>
                        </div>
                    </li>
                </ul>
            </section>
        </th:block>
    </div>
</div>
```

![archives](https://s1.ax1x.com/2022/07/30/vitbuR.png)

#### 13.2 友链页面

- 友链功能很好完成，将数据传回前台即可

```java
@GetMapping("/friends")
public String friends(Model model) {
    model.addAttribute("friendlinks",friendLinkService.listFriendLink());
    return "friends";
}
```

- mapper层的语句

```xml
<!--查询所有友链-->
<select id="listFriendLink" resultType="com.kindnit.pojo.FriendLink">
    select * from t_friend order by t_friend.create_time asc
</select>
```

![friends](https://s1.ax1x.com/2022/07/30/vitjUK.png)

### 14 前端-关于我页面

- 关于我页面应该是所有的页面中最好做的了，只是一个静态页面，使用一个 Controller 控制即可


```java
@Controller
public class AboutController {
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
```

![about](https://s1.ax1x.com/2022/07/30/vito34.png)

### 15 完结撒花

此文档以及项目都参考学习了很多大佬，在这里感谢各位大佬们的开源，项目文档有挺多细节没讲到大家请配合源码食用，当然了配合视频食用是最好的啦~

项目学习视频：[开发一个小而美的个人博客](https://www.bilibili.com/video/BV1nE411r7TF?spm_id_from=333.1007.top_right_bar_window_custom_collection.content.click)

我的项目开源地址： [Kindnit-Github](https://github.com/Kindnit/Kindnit_blog.git)

这里特别鸣谢**WuDaoJiuXiao**、**CodeSleep**这两位大佬的开源： [WuDaoJiuXiao-Github](https://github.com/WuDaoJiuXiao/jx-blog)、[CodeSleep-Gitee](https://gitee.com/he-jintao12138/my-blog_02)

关于项目中的一些插件的加入比如看板娘、音乐播放器、鼠标点击特效等，大家查查资料，参考一下源码直接拿来用就好，之后写了博客也会上到仓库里，欢迎大家Star关注

至此，该项目的所有功能都已经完成，完结撒花~

