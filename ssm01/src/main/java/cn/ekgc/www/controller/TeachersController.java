package cn.ekgc.www.controller;

import cn.ekgc.www.pojo.Teachers;
import cn.ekgc.www.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

    @Autowired
    private TeachersService teachersService;

    @GetMapping
    public List<Teachers> findTeachers(){
        System.out.println("findTeachers");
        return teachersService.findTeachers();
    }

    @PostMapping
    public int insertTeachers(@RequestBody Teachers teachers){
        System.out.println("insertTeachers");
        return teachersService.insertTeachers(teachers);
    }

    @DeleteMapping("/{id}")
    public int deleteTeachers(@PathVariable Integer id){
        System.out.println("deleteTeachers");
        return teachersService.deleteTeachers(id);
    }

}
