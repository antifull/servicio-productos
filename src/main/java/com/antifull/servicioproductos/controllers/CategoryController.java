package com.antifull.servicioproductos.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
@Getter
@Setter
public class CategoryController {
    @Value("${app.testProp}")
    private String testProp;

    @GetMapping
    public String getTestProp(){
        return this.testProp;
    }
}
