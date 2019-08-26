package com.tx.springboot.controller;

import com.tx.springboot.service.PatientInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/dcm")
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)  //解决前后台的分离跨域问题
public class PatientInformationController {


    @Autowired
    private PatientInformationService patientInformationService;

    @RequestMapping("/countNumberBySex/{sex}")
    public String countNumberBySex(@PathVariable String sex){
        return patientInformationService.countNumberBySex(sex).toString();
    }


    @RequestMapping("/countNumber/{sex}")
    public String countNumber(@PathVariable String sex) {
        return patientInformationService.countNumber(sex).toString();
    }



//    public String mulitCondition(Map map) {
//
//    }


}
