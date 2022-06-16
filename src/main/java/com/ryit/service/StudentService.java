package com.ryit.service;

import com.ryit.entity.Student;
import com.ryit.mapper.ScoreMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 21:40
 */
public interface StudentService {

    List<Student> findAll();

    Student find(int id);

    int add(Student student);

    void update(Student student);

    void delete(int id);

}
