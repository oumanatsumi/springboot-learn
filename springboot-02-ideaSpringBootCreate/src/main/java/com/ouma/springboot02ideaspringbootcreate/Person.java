package com.ouma.springboot02ideaspringbootcreate;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
}
