package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Category;
import org.springframework.ui.Model;

public interface CategoryController {

    String getCategoryById(Long categoryId, Model model);

    String getCategoryList(Model model);
}
