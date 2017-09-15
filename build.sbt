name := "scala-es-test"

version := "1.0"

scalaVersion := "2.11.11"

//scalacOptions += "-Ylog-classpath"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.2"
libraryDependencies += "org.elasticsearch" % "elasticsearch-spark-13_2.11" % "5.5.2"