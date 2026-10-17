
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

    @PostMapping("/add")
    public ChildActivityClass addActivity(
            @RequestBody ChildActivityClass activity) {
        return repository.save(activity);
    } 
    @GetMapping("/all")
    public List<ChildActivityClass> getAllActivities() {
        return repository.findAll();
    }
    @PutMapping("/update/{id}")
    public ChildActivityClass updateActivity(
            @PathVariable Long id,
            @RequestBody ChildActivityClass activity) {

        activity.setId(id);
        return repository.save(activity);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteActivity(@PathVariable Long id) {
        repository.deleteById(id);
        return "Activity deleted successfully";
    }
}
