package springconfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class ConfigServerApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ConfigServerApplication.class)
    	.run(args);
  }
}
