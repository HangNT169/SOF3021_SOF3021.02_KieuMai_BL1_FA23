package com.poly.hangnt169.sof3021.B10_JPA.controller;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService service;

    private List<Category> list;

    @GetMapping("/category/hien-thi")
    public String hienThi(Model model){
        list = service.getAll();
        model.addAttribute("listCategory", list);
        return "/buoi10/category";
    }
}
