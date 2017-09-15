package demo

import org.apache.spark.{SparkConf, SparkContext}
import org.elasticsearch.spark._


object ElasticSparkHelloWorld {
  def main(args: Array[String]) {


    val conf = new SparkConf().setAppName(ElasticSparkHelloWorld.getClass.getName)
    conf.setMaster("local")
    conf.set("es.nodes", "localhost")
    conf.set("es.port", "9200")
    conf.set("es.index.auto.create", "true")
    conf.set("es.nodes.wan.only", "true")
    conf.set("es.query", "?q=*")
    conf.set("es.resource", "spark/docs")

    val sc = new SparkContext(conf)
    val numbers = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
    val airports = Map("OTP" -> "Otopeni", "SFO" -> "San Fran")

    sc.makeRDD(Seq(numbers, airports)).saveToEs("spark/docs")

    println(sc.esRDD().count())

  }
}