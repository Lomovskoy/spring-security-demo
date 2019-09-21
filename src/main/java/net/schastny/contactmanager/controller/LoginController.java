package net.schastny.contactmanager.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path ="/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {

    @ApiOperation("Залогинится")
    @PostMapping
    public String getInfo(){
        return "Вы залогировались.";
    }
}
