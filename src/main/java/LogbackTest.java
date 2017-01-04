import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by trantientin on 04/01/2017.
 */
public class LogbackTest {
    public static void main(String[] args){
        // assume SLF4J is bound to logback in the current environment
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // print logback's internal status
        StatusPrinter.print(lc);
        //    println("Hello, world!")
        Logger logger = LoggerFactory.getLogger("demo.logback.test1");
        logger.debug("Hello world.");
    }
}
