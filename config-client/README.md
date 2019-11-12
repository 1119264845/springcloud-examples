# 配置中心使用方法
## applicaltion.yml
上述配置参数与Git中存储的配置文件中各个部分的对应关系如下：

+ spring.application.name：对应配置文件规则中的{application}部分
  + {application} -> 配置文件的名字
+ spring.cloud.config.profile：对应配置文件规则中的{profile}部分
  + {profile} -> 配置文件名字后的环境名  xxxx-xxx.yml
+ spring.cloud.config.label：对应配置文件规则中的{label}部分
  + {label} -> git上的分支
+ spring.cloud.config.uri：配置中心config-server的地址
