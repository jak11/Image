package com.leadiq.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
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
@RequestMapping("/api")
public class HelloWorld {
    private static final Logger logger = Logger.getLogger(HelloWorld.class);

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@PathVariable("id") long id){
        logger.info("Inside rest method call");
        JSONObject jobject = new JSONObject();
        User u = new User();
        try {
            jobject.put("user", u);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<JSONObject>(jobject, HttpStatus.OK);
    }
}


