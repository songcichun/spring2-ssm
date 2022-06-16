package com.ryit.service.impl;

import com.ryit.entity.Student;
import com.ryit.mapper.ScoreMapper;
import com.ryit.mapper.StudentMapper;
import com.ryit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 21:43
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper mapper;


    @Override
    public List<Student> findAll() {
        return  mapper.findAll();
    }

    @Override
    public Student find(int id) {
       return mapper.find(id);
    }

    @Override
    public int add(Student student) {
        return   mapper.add(student);
    }

    @Override
    public void update(Student student){
        mapper.update(student);
    }

    @Override
    public void delete(int id) {
        if (find(id) != null)
            mapper.delete(id);

    }
}
