package cn.ekgc.www.service;

import cn.ekgc.www.pojo.Courses;
import cn.ekgc.www.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsService {

    //查询
    List<Students> findStudents();

    //添加
    int insertStudents(@Param("students") Students students);

    //删除
    int deleteStudents(@Param("id") Integer id);

    //根据gender查询
    List<Students> findStudentsByName(String name);

    Students findStudentByName(String name);
}
