import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Slf4j
public class Test {

//    static Logger log = LoggerFactory.getLogger(Test.class);
//    static Logger log = LoggerFactory.getLogger("myLogger");
    public static void main(String[] args) {

        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error{} is {}", 133, "not found");

    }
}
