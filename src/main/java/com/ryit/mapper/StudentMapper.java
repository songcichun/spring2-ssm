package com.ryit.mapper;

import com.ryit.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:
 *
 * @author soncihun
 * @date 2022/5/9 16:51
 */
@Mapper
public interface StudentMapper {

    List<Student> findAll();

    Student find(int id);

    int add(Student student);

    void update(Student student);

    void delete(int id);

}
