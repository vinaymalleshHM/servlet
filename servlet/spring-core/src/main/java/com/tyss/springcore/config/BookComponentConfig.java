package com.tyss.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.tyss.springcore.beans")
public class BookComponentConfig {

}
