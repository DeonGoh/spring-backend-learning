package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NAME")
public class BasicModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXAMPLE_ID")
    private Integer exampleID;

    @Column(name = "EXAMPLE_DATA")
    private String exampleData;

    // Getters and Setters
    public Integer getExampleID() {
        return exampleID;
    }

    public void setExampleID(Integer exampleID) {
        this.exampleID = exampleID;
    }

    public String getExampleData() {
        return exampleData;
    }

    public void setExampleData(String exampleData) {
        this.exampleData = exampleData;
    }
}