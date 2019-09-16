package msimsek.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
@Slf4j
public class EmployeeController {

    @GetMapping
    public ResponseEntity test() {


        return new ResponseEntity("Murat Test on OpenShift :) :) :)", null, HttpStatus.OK);

    }
}
