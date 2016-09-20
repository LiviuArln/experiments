package org.rau.exp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.FileSystems;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@RequestMapping(value = "/null/**")
	String endpointNull() {
		return "nothing";
	}
}
