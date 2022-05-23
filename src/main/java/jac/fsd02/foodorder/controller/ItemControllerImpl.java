package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.service.CategoryService;
import jac.fsd02.foodorder.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemControllerImpl implements ItemController {

    @Autowired
    ItemService itemService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/queryItems2/{categoryId}")
    public List<Item> getItemListByCategoryId(@PathVariable(value = "categoryId") Long categoryId) {
        List<Item> itemList = itemService.getItemListByCategoryId(categoryId);
        return itemList;
    }
}
