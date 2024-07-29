package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.BasicModel;

@Repository
public interface BasicAccessRepository extends JpaRepository<BasicModel, Integer>{
}