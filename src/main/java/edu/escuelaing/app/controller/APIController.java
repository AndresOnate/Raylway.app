package edu.escuelaing.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @RequestMapping("/v1/health")
    public String checkAPI(){
        return "<h1>Andrés Camilo Oñate Quimbayo</h1>";
    }
}
