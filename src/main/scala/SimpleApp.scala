import org.apache.spark.internal.Logging
import org.apache.spark.sql.SparkSession

object SimpleApp extends Logging {
  def main(args: Array[String]) {
    val logFile = args.head
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    logInfo(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}