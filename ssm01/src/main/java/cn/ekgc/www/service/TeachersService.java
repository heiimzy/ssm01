package cn.ekgc.www.service;

import cn.ekgc.www.pojo.Students;
import cn.ekgc.www.pojo.Teachers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersService {

    //查询
    List<Teachers> findTeachers();

    //添加
    int insertTeachers(@Param("teachers") Teachers teachers);

    //删除
    int deleteTeachers(@Param("id") Integer id);

}
