package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ItemControllerImpl implements ItemController{

    @Autowired
    ItemService itemService;

    @Override
    @PostMapping("/queryItems/{categoryId}")
    public String getItemListByCategoryId(@PathVariable(value = "categoryId") Long categoryId, Model model) {
        List<Item> itemList = itemService.getItemListByCategoryId(categoryId);
        model.addAttribute("itemList", itemList);
        return "/";
    }
}
