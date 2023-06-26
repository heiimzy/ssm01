package cn.ekgc.www.controller;

import cn.ekgc.www.pojo.Courses;
import cn.ekgc.www.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping
    public List<Courses> findCourses(){
        System.out.println("findCourses");
        return coursesService.findCourses();
    }

    @GetMapping("/{name}")
    public List<Courses> findCoursesByName(@RequestBody String name){
        System.out.println("findCoursesByNAme");
        return coursesService.findCoursesByName(name);
    }

    @PostMapping
    public int insertCourses(@RequestBody Courses courses){
        System.out.println("insertCourses");
        return coursesService.insertCourses(courses);
    }

    @DeleteMapping("/{id}")
    public int deleteCourses(@PathVariable Integer id){
        System.out.println("deleteCourses");
        return coursesService.deleteCourses(id);
    }

}
