package com.example.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BasicModel;
import com.example.service.BasicService;

import com.example.repository.BasicAccessRepository;

@Service
public class BasicServiceImpl implements BasicService{
    @Autowired
    private BasicAccessRepository testModelAccessRepository;

    @Override
    public List<BasicModel> retrieveAllTestModels(){
        return testModelAccessRepository.findAll();
    }


    @Override
    public BasicModel insertTestModel(BasicModel testModel){
        return testModelAccessRepository.save(testModel);
    }
}
