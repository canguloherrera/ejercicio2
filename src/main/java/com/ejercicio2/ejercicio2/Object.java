package com.ejercicio2.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Object {
    private List<String> paths = new ArrayList<>();

    private List<Map> querys = new ArrayList<>();

    private List<Map> headers = new ArrayList<>();

    public Object(String path1, String path2, HashMap<String,String> query, HashMap<String,String> header){
        this.paths.add(path1);
        this.paths.add(path2);
        this.querys.add(query);
        this.headers.add(header);

    }


}
