package com.gjing.project.scala;

import cn.gjing.tools.swagger.core.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gjing
 */
@SpringBootApplication
@EnableSwagger
public class ScalaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalaDemoApplication.class, args);
    }

}
