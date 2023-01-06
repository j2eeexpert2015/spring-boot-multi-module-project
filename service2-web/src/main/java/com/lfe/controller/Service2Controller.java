package com.lfe.controller;

import com.lfe.service.DummyService;
import com.lfe.data.domain.Domain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/service2")
public class Service2Controller {

    @Resource(name = "dummyService")
    DummyService dummyService;

    @GetMapping("/invokeService1")
    public Domain getDomain(){
        return dummyService.getDummyDataFromService1();
    }
}
