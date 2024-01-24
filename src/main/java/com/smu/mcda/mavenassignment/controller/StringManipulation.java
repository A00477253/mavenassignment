package com.smu.mcda.mavenassignment.controller;


import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
        byte[] md5Hash = DigestUtils.md5Digest(input.getBytes());
        return DigestUtils.md5DigestAsHex(md5Hash);
    }
}
