package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.BasicModel;

@Service
public interface BasicService {
    List<BasicModel> retrieveAllTestModels();

    BasicModel insertTestModel(BasicModel testModel);
}
