package com.askp.springjdbc.springbootjdbc.resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class InsertData {
    JdbcTemplate jdbc;
    Integer n;
    @GetMapping
    public String hello(){

        jdbc.execute("Insert into test values('Well Done')");
        return("Data Inserted");

    }
}
