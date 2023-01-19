package org.testConfServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/* below annotation is to enable read properties */
@RunWith(SpringJUnit4ClassRunner/*SpringRunner*/.class)
@SpringBootTest
public class ExampleTest {
    private static final Logger log = LoggerFactory.getLogger(ExampleTest.class);

    @Value("${solace.jms.msgVpn}")
    public String SOLACE_VPN_NAME;

    @Value("${solace.queueName}")
    public String SOLACE_QUEUE_NAME;


    @Test
    public void testCrossModuleTransmition() {
        log.info("=============="+SOLACE_VPN_NAME+"=======================");
        log.info("=============="+SOLACE_QUEUE_NAME+"=======================");

    }

}
