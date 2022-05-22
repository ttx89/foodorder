package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Item;
import org.springframework.ui.Model;

import java.util.List;

public interface ItemController {

    String getItemListByCategoryId(Long categoryId, Model model);
}
