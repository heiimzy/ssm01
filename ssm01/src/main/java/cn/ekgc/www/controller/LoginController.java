package cn.ekgc.www.controller;


import cn.ekgc.www.pojo.Students;
import cn.ekgc.www.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    StudentsService studentsService;

    @GetMapping
    public String login(){

        return "login";
    }
    @PostMapping
    public  String login2(@RequestParam("name") String name , @RequestParam("password") String password){
        Students s = studentsService.findStudentByName(name);
        return "";



    }
}
