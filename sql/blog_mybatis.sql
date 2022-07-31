
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
