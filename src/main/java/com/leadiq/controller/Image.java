package com.leadiq.controller;

import java.util.UUID;

import com.leadiq.models.User;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Image {
    private static final Logger logger = Logger.getLogger(HelloWorld.class);

    @RequestMapping(value = "/image", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(){
        logger.info("Imgae upload call");
        String jobid = UUID.randomUUID().toString();
        return new ResponseEntity<String>(jobid, HttpStatus.OK);
    }
}
