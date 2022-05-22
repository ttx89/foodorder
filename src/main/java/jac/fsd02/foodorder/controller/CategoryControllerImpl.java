package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Category;
import jac.fsd02.foodorder.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryControllerImpl implements CategoryController{

    @Autowired
    CategoryService categoryService;

    @Override
    @GetMapping("/queryCategoryById/{id}")
    public String getCategoryById(Long categoryId, Model model) {
        Category category = categoryService.getCategoryById(categoryId);
        model.addAttribute("category",category);
        return "/";
    }

    @Override
    @GetMapping("/queryCategoryList")
    public String getCategoryList(Model model) {
        List<Category> categoryList = categoryService.getCategoryList();
        model.addAttribute("categoryList", categoryList);
        return "/";
    }
}
