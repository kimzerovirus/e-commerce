package me.kzv.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminHome(){
        return "admin/index";
    }

    @GetMapping("/admin/manage/category")
    public String manageCategory(){
        return "admin/manage/category";
    }
}