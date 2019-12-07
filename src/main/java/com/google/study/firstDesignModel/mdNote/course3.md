[toc]
#### 项目初始化

1. 一般的父子模块项目都是maven项目，进入之后右键new module创建子模块
2. 创建好之后选择你需要的技术架构，web，mysql，mybatis 等等
3. 选择好之后，项目开始初始化

#### 项目新建出错
1. **如果java或者test的文件夹没有变色**
需要右键将其重新mark一下，也有可能是jar包或者配置文件没有加载成功
2. **新导入公司代码加载不成功**
* 先检查java文件夹是否变色
* 检车jdk版本，语言版本，sdk

#### jar包冲突
* 如果maven编译报错，
* 检查maven配置，
* 检查maven中的jdk/jre版本，
* 如果公司使用的是私服，需要设置私服的位置

以上所部完，基本不出报出编译错误

> maven 父子模块
父子模块的模块如果使用spring boot初始化子模块，需要从新检查maven父版本，jar包应该统一管理