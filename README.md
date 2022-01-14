# gear4j

## 什么是gear4j

开发过程中常用的基础代码

## 快速上手

本文默认使用maven做包管理

从源代码构建

    $ mkdir ~/downloads && cd ~/downloads
    $ git clone https://github.com/oold-father/gear4j.git
    $ cd gear4j
    $ mvn test
    $ mvn install

添加依赖

    <dependency>
        <groupId>com.gear4j</groupId>
        <artifactId>gear4j</artifactId>
        <version>0.0.1</version>
    </dependency>