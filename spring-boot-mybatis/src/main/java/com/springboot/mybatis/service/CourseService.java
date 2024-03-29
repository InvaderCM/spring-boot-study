package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Course> selectAll();

    Course getOne(Long courseId);

    void delete(Long courseId);

    Course insert(Course course);
    void update(Course course);
}
