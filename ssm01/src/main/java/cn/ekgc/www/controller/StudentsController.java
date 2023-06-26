package cn.ekgc.www.controller;

import cn.ekgc.www.pojo.Students;
import cn.ekgc.www.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<Students> findStudents(){
        System.out.println("findStudents");
        return studentsService.findStudents();
    }

    @PostMapping
    public int insertStudents(@RequestBody Students students){
        System.out.println("insertStudents");
        return studentsService.insertStudents(students);
    }

    @DeleteMapping("/{id}")
    public int deleteStudents(@PathVariable Integer id){
        System.out.println("deleteStudents");
        return studentsService.deleteStudents(id);
    }

    @GetMapping(value = " ",params = "name")
    public List<Students> findStudentsByName(@RequestParam("name") String name){
        System.out.println("findStudentsByName");
        return studentsService.findStudentsByName(name);
    }

}
