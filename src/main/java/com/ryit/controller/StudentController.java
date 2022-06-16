package com.ryit.controller;

import com.ryit.entity.Student;
import com.ryit.service.ScoreService;
import com.ryit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 22:08
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void add(Student student){




    }
    @GetMapping("/find")
    public String find(){
        return null;
    }

    @GetMapping("/findAll")
    public String findAll(){
        return null;
    }

    @PostMapping("/update")
    public void update(){

    }

    @PostMapping("/delete")
    public void delete(){

    }



}
