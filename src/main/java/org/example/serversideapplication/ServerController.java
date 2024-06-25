package org.example.serversideapplication;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ServerController {

    @GetMapping("/server")
    public Map<String, Object> getStudentDetails(){
        Map<String ,Object>  map  = new HashMap<String, Object>();
        List<String> listOfStudent = new ArrayList<String>();
        listOfStudent.add("Raman");
        listOfStudent.add("Rahul");
        listOfStudent.add("Aman");
        listOfStudent.add("Ashok");
        map.put("StudentDetails" , listOfStudent);
        return map;
    }


}
