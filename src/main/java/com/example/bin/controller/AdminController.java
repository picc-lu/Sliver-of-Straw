package com.example.bin.controller;


import com.example.bin.entity.Admin;
import com.example.bin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Lu
 * @since 2018-05-25
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {this.adminService = adminService;}

    @RequestMapping("/CRUD/{id}")
    @ResponseBody
    public Admin selectArticleById(@PathVariable("id") Long id) {
        return adminService.selectById(id);
    }
}

