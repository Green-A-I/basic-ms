package com.myservice.firstproject.controller;

import com.myservice.firstproject.bean.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${ms1.url}")
    private String ms1url;


    @GetMapping("/hitms-1")
    public String hitms1(){

        // logic to hit ms-1

        ResponseEntity<String> resp = restTemplate.exchange(ms1url, HttpMethod.GET,null,String.class);
       return resp.getBody();
    }

    @GetMapping("/hitms-1-post")
    public String hitms2(){
        String url = "http://localhost:1111/post-hello";
        // logic to hit ms-1
        String str= "swapnil";
        HttpEntity<String> req = new HttpEntity<>(str, null);
        ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.POST,req,String.class);
        return resp.getBody();
    }
}
