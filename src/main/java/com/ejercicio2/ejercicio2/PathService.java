package com.ejercicio2.ejercicio2;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PathService {
    public Object getPaths(String path1, String path2, HashMap<String,String> query, HashMap<String,String> header){
        return new Object(path1,path2,query,header);

    }
}
