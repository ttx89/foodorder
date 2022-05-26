package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.dto.CategoryEO;
import jac.fsd02.foodorder.model.Category;
import jac.fsd02.foodorder.repository.CategoryRepository;
import jac.fsd02.foodorder.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long categoryId) {
        Optional<CategoryEO> optCategoryEO = categoryRepository.findById(categoryId);

        Category category = new Category();
        if (optCategoryEO.isPresent()) {
            CategoryEO categoryEO = optCategoryEO.get();
            Converter.convCategoryEOToCategory(categoryEO);
        }
        return category;
    }

    @Override
    public List<Category> getCategoryList() {
        List<CategoryEO> categoryEOList = categoryRepository.findAll();

        List<Category> categoryList = new ArrayList<>();
        for(CategoryEO categoryEO: categoryEOList) {
            Category category = Converter.convCategoryEOToCategory(categoryEO);
            categoryList.add(category);
        }

        return categoryList;
    }
}
