package com.tyss.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeansConfog.class) // if u want to configure others also we can achive using this
@ComponentScan(basePackages = "com.tyss.springcore.beans")
public class SpringConfig {

}
