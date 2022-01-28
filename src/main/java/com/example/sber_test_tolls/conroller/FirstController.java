package com.example.sber_test_tolls.conroller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public String test(){
        return "Test_new_conveer_CD";

    }
}
