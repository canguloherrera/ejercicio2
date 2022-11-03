package com.ejercicio2.ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
public class PrincipalController {

    @Autowired
    PathService service;





    @GetMapping(value = {"*","{path1}","{path1}/{path2}"})
    public Object entryOther(@PathVariable(required = false) String path1,
                                       @PathVariable(required = false) String path2,
                                       @RequestParam(required = false) HashMap<String, String> query,
                                       @RequestHeader(required = false) HashMap<String,String> header,
                                       @RequestBody(required = false) String body,
                                       HttpServletRequest request,
                                       ServletResponse response)
    {
        if(request.getHeader("REDIRIGE")!= null && request.getHeader("REDIRIGE").equals("SALTA")){
            return new ModelAndView("redirect:/salta");
        }
        if(request.getHeader("ADD")!= null && body != null){
            return body + "modificado";
        }

        return service.getPaths(path1,path2,query,header);
    }



        @GetMapping(value = {"/","one"})
        public String entryOne(){

            return "Estoy en /, one";

        }

        @GetMapping(value = "/salta")
        public String entryJump(){
        return "He ido a jump";
        }





    }



