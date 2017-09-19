## Spark1.6 读写 elasticsearch5.5.2 的 demo

**需要注意 scala 版本，spark 版本还有 es 版本一定要对应，否则无法运行**

比如

- `scalaVersion` 版本是 `2.11.11`
- `spark` 版本是 `1.6.2`
- `es` 版本是 `5.5.2`
   
依赖需要写成下边这样：

```sbtshell
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.2"  // 这里指定 spark-core 的版本
libraryDependencies += "org.elasticsearch" % "elasticsearch-spark-13_2.11" % "5.5.2" 
```

解释一下 `"elasticsearch-spark-13_2.11" % "5.5.2"` 这部分

`-13` 是给 `Spark1.3-1.6` 提供的
`-20` 是给 `Spark2.0` 提供的

`_2.11` 是 `scalaVersion` 的前边两位

`5.5.2` 是 `elasticsearch` 的版本号

官方文档中提到

> The Spark connector framework is the most sensitive to version incompatibilities.

Spark 连接器框架是对版本号非常敏感并且不兼容的。