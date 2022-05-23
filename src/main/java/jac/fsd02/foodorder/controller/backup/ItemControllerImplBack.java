package jac.fsd02.foodorder.controller.backup;

import jac.fsd02.foodorder.model.Category;
import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.service.CategoryService;
import jac.fsd02.foodorder.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemControllerImplBack implements ItemControllerBack {

    @Autowired
    ItemService itemService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Category> categoryList = categoryService.getCategoryList();
        model.addAttribute("categoryList",categoryList);
        return "index";
    }

    @GetMapping("/queryItems/{categoryId}")
    public String getItemListByCategoryId(@PathVariable(value = "categoryId") Long categoryId, Model model) {
        List<Item> itemList = itemService.getItemListByCategoryId(categoryId);
        model.addAttribute("itemList", itemList);
        return "index_items";
    }


}
