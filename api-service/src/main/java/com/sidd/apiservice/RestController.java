package com.sidd.apiservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    RestTemplate restTemplate;
    String userServiceUrl = "http://localhost:8081";

    public RestController()
    {
        restTemplate = new RestTemplate();
    }
    @GetMapping(value = "/")
    public String hello()
    {
        return "API service is up and running \n";
    }
    @GetMapping(path="/users/{id}")
    public ResponseEntity <User> getUserById(@PathVariable("id") Integer id)
    {
        ResponseEntity <User> u = restTemplate.getForEntity(userServiceUrl + "/users/"+ id, User.class);
        return u;
    }

}
