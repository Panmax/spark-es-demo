## Spark 写入和读取 elasticsearch 的 demo

**需要注意 scala 版本，spark 版本还有 es 版本一定要对应，否则无法运行**

比如

- `scalaVersion` 版本是 `2.11.11`
- `spark` 版本是 `1.6.2`
- `es` 版本是 `5.5.2`
   
依赖需要写成下边这样：

```sbtshell
libraryDependencies += "org.elasticsearch" % "elasticsearch-spark-13_2.11" % "5.5.2"
```