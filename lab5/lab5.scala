import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import scala.xml._

object getModels {
	 def main(args: Array[String]) {
		 val sc = new SparkContext()
		 val fileRdd = sc.wholeTextFiles("loudacre/activations/*.xml")
		 val seqRdd = fileRdd.map(x => XML.loadString(x._2) \ "activation")
		 val actRdd = seqRdd.flatMap(identity)
		 val tupleRdd = actRdd.map(x => (x \ "account-number").text + ":" + (x \ "model").text)
		 tupleRdd.saveAsTextFile("/user/xm2074/loudacre/account-models")
		 sc.stop() 
	 }
}