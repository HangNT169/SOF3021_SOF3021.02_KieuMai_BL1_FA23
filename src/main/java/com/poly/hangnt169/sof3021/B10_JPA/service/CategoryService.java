package com.poly.hangnt169.sof3021.B10_JPA.service;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category>getAll();

    void add(Category category);
// product ID, cate code, cate name, product name,price
    // product => Load du lieu table
}
