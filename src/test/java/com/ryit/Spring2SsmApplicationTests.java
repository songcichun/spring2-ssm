package com.ryit;

import com.ryit.entity.Score;
import com.ryit.entity.Student;
import com.ryit.mapper.ScoreMapper;
import com.ryit.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Spring2SsmApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ScoreMapper scoreMapper;

    @Test
    void contextLoads() {

        List<Student> list = studentMapper.findAll();

        for (Student  stu : list){
            System.out.println(stu);
        }

    }

    @Test
    void save(){

        System.out.println(Math.random());
       /* List<Score> list = scoreMapper.findAll();
        for (Score  sco : list){
            System.out.println(sco);
        }*/
    }


}
