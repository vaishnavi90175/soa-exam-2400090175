
package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.ChildActivityClass;
import com.klef.soa.exam.repository.ChildActivityClassRepository;

@Service
public class ChildActivityClassServiceImpl
        implements ChildActivityClassService {

    @Autowired
    private ChildActivityClassRepository repository;

    @Override
    public ChildActivityClass addActivity(ChildActivityClass activity) {
        return repository.save(activity);
    }

    @Override
    public List<ChildActivityClass> getAllActivities() {
        return repository.findAll();
    }

    @Override
    public ChildActivityClass updateActivity(
            Long id, ChildActivityClass activity) {
        activity.setId(id);
        return repository.save(activity);
    }

    @Override
    public String deleteActivity(Long id) {
        repository.deleteById(id);
        return "Activity deleted successfully";
    }
}
