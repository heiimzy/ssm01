package cn.ekgc.www.service.impl;

import cn.ekgc.www.mapper.StudentsMapper;
import cn.ekgc.www.pojo.Courses;
import cn.ekgc.www.pojo.Students;
import cn.ekgc.www.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> findStudents() {
        return studentsMapper.findStudents();
    }

    @Override
    public int insertStudents(Students students) {
        return studentsMapper.insertStudents(students);
    }

    @Override
    public int deleteStudents(Integer id) {
        return studentsMapper.deleteStudents(id);
    }

    @Override
    public List<Students> findStudentsByName(String name) {
        return studentsMapper.findStudentsByName(name);
    }

    @Override
    public Students findStudentByName(String name) {
        return studentsMapper.findStudentByName(name);
    }

}
