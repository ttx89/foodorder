package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.dto.CategoryEO;
import jac.fsd02.foodorder.model.Category;
import jac.fsd02.foodorder.repository.CategoryRepository;
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
            //convert to Category
            category.setId(categoryEO.getId());
            category.setCategoryName(categoryEO.getCategoryName());
            category.setCategorySrc(categoryEO.getCategorySrc());
        }
        return category;
    }

    @Override
    public List<Category> getCategoryList() {
        List<CategoryEO> categoryEOList = categoryRepository.findAll();

        List<Category> categoryList = new ArrayList<>();
        for(CategoryEO categoryEO: categoryEOList) {
            //convert to Category
            Category category = new Category();
            category.setId(categoryEO.getId());
            category.setCategoryName(categoryEO.getCategoryName());
            category.setCategorySrc(categoryEO.getCategorySrc());
            categoryList.add(category);
        }

        return categoryList;
    }
}
