package cn.ekgc.www.service.impl;


import cn.ekgc.www.mapper.CoursesMapper;
import cn.ekgc.www.pojo.Courses;
import cn.ekgc.www.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesMapper coursesMapper;

    @Override
    public List<Courses> findCourses() {
        return coursesMapper.findCourses();
    }

    @Override
    public int insertCourses(Courses courses) {
        return coursesMapper.insertCourses(courses);
    }


    @Override
    public int deleteCourses(Integer id) {
        return coursesMapper.deleteCourses(id);
    }

    @Override
    public List<Courses> findCoursesByName(String name) {
        return coursesMapper.findCoursesByName(name);
    }
}
