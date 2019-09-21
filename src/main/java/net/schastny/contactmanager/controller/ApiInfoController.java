package net.schastny.contactmanager.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@RequestMapping(path ="/v1/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Controller
@CrossOrigin
@ApiIgnore
class ApiInfoController {

    /**
     * Редирект на страничку сваггера
     */
    @GetMapping
    public String getInfo(){
        return "redirect:/swagger-ui.html";
    }
}
