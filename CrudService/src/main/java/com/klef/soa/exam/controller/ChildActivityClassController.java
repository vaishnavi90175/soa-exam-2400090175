
package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.ChildActivityClass;
import com.klef.soa.exam.repository.ChildActivityClassRepository;

@RestController
@RequestMapping("/activities")
public class ChildActivityClassController {

    @Autowired
    private ChildActivityClassRepository repository;
    @GetMapping("/")
    public String home() {
        return "Welcome to Child Activity Class API";
    }

    @PostMapping("/add")
    public ChildActivityClass addActivity(
            @RequestBody ChildActivityClass activity) {
        return repository.save(activity);
    } 
    @GetMapping("/displayall")
    public List<ChildActivityClass> getAllActivities() {
        return repository.findAll();
    }
   
    @DeleteMapping("/delete/{id}")
    public String deleteActivity(@PathVariable Long id) {
        repository.deleteById(id);
        return "Activity deleted successfully";
    }
}
