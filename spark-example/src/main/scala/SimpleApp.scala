import org.apache.spark.sql.SparkSession
import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark._
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.streaming.StreamingQuery

object SimpleApp {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("Simple Application").master("spark://127.0.0.1:7077").getOrCreate()

    import spark.implicits._
    val df= List( "hi ho").toDF()
    df.show()
    spark.stop()
  }
}

