package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Item;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ItemController {

    String getItemById(Long itemId, Model model);

    List<Item> getItemListByCategoryId(Long categoryId);

}
