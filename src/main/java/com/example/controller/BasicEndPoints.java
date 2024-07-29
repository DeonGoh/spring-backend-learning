package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.BasicModel;
import com.example.service.BasicService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BasicEndPoints {

    @Autowired
    private BasicService testService;

    @PostMapping("/post-example")
    public ResponseEntity<BasicModel> postTestModels(@RequestBody BasicModel testModel) {
        try{
            return ResponseEntity.ok().body(testService.insertTestModel(testModel));
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(null);
        }
        
    }

    @GetMapping("/get-all-example")
    public ResponseEntity<List<BasicModel>> getAllTestModels() {
        return ResponseEntity.ok().body(testService.retrieveAllTestModels());
    }
}

