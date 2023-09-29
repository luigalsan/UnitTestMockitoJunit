package com.example.UnitTest.service;

import com.example.UnitTest.repository.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    @Autowired
    DataService dataService;

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}