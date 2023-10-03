package com.poly.hangnt169.sof3021.B10_JPA.service.impl;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.repository.CategoryRepository;
import com.poly.hangnt169.sof3021.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll(); // lay toan bo du lieu trong DB
        // add/update
        //categoryRepository.save(Doi tuong can add/update)
        // delete
        // delete theo id
        //categoryRepository.deleteById(Khoa chinh);
        // delete ca Object
        //categoryRepository.delete(Doi tuong can xoa);
        // getOne
        // categoryRepository.getOne(Khoa chinh)
        //categoryRepository.findById(Khoa chinh).get()
        //....
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }
}
