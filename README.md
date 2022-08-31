#### 项目概述

本项目是一个简单的个人博客系统，系统集成了文章、标签、分类、日志、友链五大模块的增删改查功能

现在我将我的项目开源，方便大家学习

此项目是用来熟悉springboot框架开发的不二之选哦

#### 项目技术栈

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

#### 项目预览

博客首页

![index01](https://s1.ax1x.com/2022/07/30/vitv4O.png)

博客后台

![adminBlog01](https://s1.ax1x.com/2022/07/30/vit44U.png)

#### Quick start

##### 1 下载项目

- 使用clone命令

```git clone https://github.com/Kindnit/Kindnit_blog.git```

-  直接下载zip包解压

##### 2 搭建数据库

新建一个数据库然后运行项目里**sql**文件夹里面的`blog_mybatis.sql`文件即可

##### 3 下载依赖

打开项目依赖文件`pom.xml`文件，安装项目所需依赖

##### 4 修改配置文件

修改 `application-dev.yaml` 中的数据库配置信息为自己的数据库相关信息

##### 5 测试数据库连接是否成功

##### 6 启动项目

默认为8080端口

==PS==：更多信息请查阅`Kindnit_blog开发笔记`
