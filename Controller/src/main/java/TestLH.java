import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.testLH.*"})
@EntityScan(basePackages = {"com.testLH.*"})
@EnableJpaRepositories(basePackages = {"com.testLH.*"})
public class TestLH {

    private static final Logger logger = LoggerFactory.getLogger(TestLH.class);

    public static void main(String[] args) {
        SpringApplication.run(TestLH.class);

        logger.debug("----Application Started----");
        logger.error("Message logged at ERROR level");
        logger.warn("Message logged at WARN level");
        logger.info("Message logged at INFO level");
    }
}
