package com.motanis.pondmanagement.controller;

import com.motanis.pondmanagement.model.Pond;
import com.motanis.pondmanagement.service.PondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class PondController {

    @Autowired
    private PondService service;


    @PostMapping(path = "/ponds", consumes = "application/json", produces = "application/json")
    public Pond createPond(@RequestBody Pond pond) {

        return null;
    }
}
