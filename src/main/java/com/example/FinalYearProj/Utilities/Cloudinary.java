package com.example.FinalYearProj.Utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ObjectUtils;

public class Cloudinary {
    @Value("${com.cloudinary.cloudname}")
    private String CLOUDNAME;
    @Value("${com.cloudinary.api_key}")
    private String API_KEY;
    @Value("${com.cloudinary.api_secret}")
    private String API_SECRET ;


    @Bean
    public Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name" , CLOUDNAME,
                "api_key",API_KEY,
                "api_secret",API_SECRET
        ));
    }
}
