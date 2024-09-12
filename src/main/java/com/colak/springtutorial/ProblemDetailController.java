package com.colak.springtutorial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/problemdetail")
public class ProblemDetailController {

    // http://localhost:8080/api/problemdetail/getResponseStatusException
    @GetMapping(path = "getResponseStatusException")
    String getResponseStatusException() {
        // Does not Show problem details response
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Noooooo!");
    }

    // http://localhost:8080/api/problemdetail/getRuntimeException
    @GetMapping(path = "getRuntimeException")
    String getRuntimeException() {
        // Shows problem details response
        throw new RuntimeException("Noooooo!");
    }
}
