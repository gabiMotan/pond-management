package com.motanis.pondmanagement.controller;

import com.motanis.pondmanagement.model.Pond;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PondController {

    @PostMapping(path = "/ponds", consumes = "application/json", produces = "application/json")
    public Pond createPond(@RequestBody Pond pond) {
        pond.
        return null;
    }
}
