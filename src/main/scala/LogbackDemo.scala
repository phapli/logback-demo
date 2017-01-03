import org.slf4j.LoggerFactory

object LogbackDemo {
  def main(args: Array[String]): Unit = {
    //    println("Hello, world!")
    val logger = LoggerFactory.getLogger("demo.logback.test1")
    logger.debug("Hello world.")
  }
}
