package cn.ekgc.www.mapper;

import cn.ekgc.www.pojo.Courses;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursesMapper {

    //查询
    List<Courses> findCourses();

    //根据name查询
    List<Courses> findCoursesByName(String name);

    //添加
    int insertCourses(@Param("courses") Courses courses);

    //删除
    int deleteCourses(@Param("id") Integer id);

}
