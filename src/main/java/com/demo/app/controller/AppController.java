package com.demo.app.controller;

import com.demo.app.database.document.AddAppMessage;
import com.demo.app.database.document.AppMesssages;
import com.demo.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:8080")
public class AppController {
    @Autowired
    private AppService appService;


    @GetMapping("/getAllMessages")
    public ResponseEntity<List<AppMesssages>> getAllMessages() {
        return new ResponseEntity<>(appService.findAllMessages(), HttpStatus.OK);
    }

    @PostMapping("/saveMessage")
    @ResponseBody
    public ResponseEntity<String> saveMessage(@RequestBody AddAppMessage addAppMessage) {
        appService.saveMessage(addAppMessage);
        return new ResponseEntity<>("saved!", HttpStatus.CREATED);
    }

    @GetMapping("/getHelloWorld")
    public String getHelloWorld() {
        return "hello world!";
    }

    @PostMapping("/postMessage")
    public ResponseEntity<String> postMessage() {
        return new ResponseEntity<String>("Hello Post", HttpStatus.OK);
    }
}
