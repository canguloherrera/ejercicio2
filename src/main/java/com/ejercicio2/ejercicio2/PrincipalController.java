package com.ejercicio2.ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PrincipalController {
    @Autowired
    PathService service;

    @GetMapping(value = {"*","{path1}","{path1}/{path2}"})

    public Object entryOther(@PathVariable(required = false) String path1,
                             @PathVariable(required = false) String path2,
                             @RequestParam(required = false) HashMap<String, String> query,
                             @RequestHeader(required = false) HashMap<String,String> header)
    {
        return service.getPaths(path1,path2,query,header);
    }

        @GetMapping(value = {"/","one"})
        public String entryOne(){

            return "Estoy en /, one";

        }





    }



