
package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.ChildActivityClass;

public interface ChildActivityClassService {

    ChildActivityClass addActivity(ChildActivityClass activity);

    List<ChildActivityClass> getAllActivities();

    ChildActivityClass updateActivity(Long id, ChildActivityClass activity);

    String deleteActivity(Long id);
}
