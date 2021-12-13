## 第一步 编写攻击类

这里以 Exploit 为例，会打开 mac 系统的计算器软件。windows 同理修改一下命令即可。

## 第二步 启动 http 服务

将统计类 Exploit 编译换成 class 文件，并在 class 文件的目录下启动 http 服务 `python3 -m http.server 8100`

启动成功后，访问 http://localhost:8100/Exploit.class，会下载到 Exploit.class 文件

## 第三步 启动 ladp 服务

LDAPRefServer 启动

## 模拟攻击

Test 启动
