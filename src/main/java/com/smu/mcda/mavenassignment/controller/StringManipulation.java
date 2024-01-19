package com.smu.mcda.mavenassignment.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/hash")
public class StringManipulation {
    @PostMapping("/processString")
    public String processString(@RequestBody String input) {
        String capitalizedInput = captializeString(input);
        String md5Hash = generateMD5Hash(capitalizedInput);
        return md5Hash;
    }

    public String captializeString( String input) {
        String capitalizedInput = input.toUpperCase();
        return capitalizedInput;
    }

    String generateMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found");
        }
    }
}
