package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Category;
import org.springframework.ui.Model;

public interface ItemController {

    String getItemListByCategoryId(Long categoryId, Model model);
}
