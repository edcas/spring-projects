package com.example.unitTests.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser() {
        return "Tom";
    }
}
