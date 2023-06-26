package cn.ekgc.www.service;

import cn.ekgc.www.pojo.Courses;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursesService {

    //查询
    List<Courses> findCourses();

    //添加
    int insertCourses(@Param("courses") Courses courses);


    //删除
    int deleteCourses(@Param("id") Integer id);

    //模糊查询
    List<Courses> findCoursesByName(String name);
}
