package com.rkz.controller;

import java.util.List;

import com.rkz.model.Course;
import com.rkz.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;
 
    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
