package demo

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by jiapan on 2017/9/15.
  */
object SimpleApp {

  def main(args: Array[String]): Unit = {
    val logFile = "/data/bin/spark-1.6.0-bin-hadoop2.6/README.md"
    println(SimpleApp.getClass.getName)
    val conf = new SparkConf().setAppName(SimpleApp.getClass.getName).setMaster("local[*]")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    print(logData)

    val numAs = logData.filter(line => line.contains("a")).count
    val numBs = logData.filter(line => line.contains("b")).count()

    println("Lines with a: %s, Lines with b %s, Total %s".format(numAs, numBs, logData.count()))
  }

}
