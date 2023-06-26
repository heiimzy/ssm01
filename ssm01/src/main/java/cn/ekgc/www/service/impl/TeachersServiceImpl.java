package cn.ekgc.www.service.impl;

import cn.ekgc.www.mapper.TeachersMapper;
import cn.ekgc.www.pojo.Teachers;
import cn.ekgc.www.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersServiceImpl implements TeachersService {

    @Autowired
    private TeachersMapper teachersMapper;

    @Override
    public List<Teachers> findTeachers() {
        return teachersMapper.findTeachers();
    }

    @Override
    public int insertTeachers(Teachers teachers) {
        return teachersMapper.insertTeachers(teachers);
    }

    @Override
    public int deleteTeachers(Integer id) {
        return teachersMapper.deleteTeachers(id);
    }

}
