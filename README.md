# Spring + Vue 前后分离模版

## 工程结构

```
project
│   README.md
│   pom.xml    
│
└───server // 后端工程
│   
└───vue-app // vue工程
```

## 使用方法

### 打包 vue 项目
在项目打包前，在 vue-app 工程中执行打包命令:
```
npm run build:spring
```
vue的构建文件将会打包输出到 server/src/main/resources/templates/vue 文件夹中

### 打包 spring 项目
```
mvn clean package
```
