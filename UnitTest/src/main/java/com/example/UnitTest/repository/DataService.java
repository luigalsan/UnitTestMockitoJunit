package com.example.UnitTest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DataService {
    public int[] retrieveAllData() {
        // Some dummy data
        // Actually this should talk to some database to get all the data
        return new int[] { 1, 2, 3, 4, 5 };
    }
}