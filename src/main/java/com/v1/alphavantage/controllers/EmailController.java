package com.v1.alphavantage.controllers;

import com.v1.alphavantage.dtos.FormEmailDTO;
import com.v1.alphavantage.managers.EmailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmailController {

    @Autowired
    EmailManager emailManager;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/FormData", method = RequestMethod.GET)
    public void getFormData(){//@RequestBody FormEmailDTO formEmailDTO
        FormEmailDTO formEmailDTO = new FormEmailDTO();
        emailManager.sendEmail(formEmailDTO); //return
    }

}
