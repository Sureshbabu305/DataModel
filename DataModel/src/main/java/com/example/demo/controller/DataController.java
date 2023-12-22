// DataController.java
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DataModel;
import com.example.demo.repository.DataRepository;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping
    public List<DataModel> getAllData() {
        return dataRepository.findAll();
    }

    @GetMapping("/filtered")
    public List<DataModel> getDataWithFilters(
            @RequestParam(name = "endYear", required = false) Integer endYear,
            @RequestParam(name = "topics", required = false) String topics,
            @RequestParam(name = "sector", required = false) String sector,
            @RequestParam(name = "region", required = false) String region,
            @RequestParam(name = "pest", required = false) String pest,
            @RequestParam(name = "source", required = false) String source,
            @RequestParam(name = "swot", required = false) String swot) {

       
        return null;
    }
}
