package jac.fsd02.foodorder.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.service.CategoryService;
import jac.fsd02.foodorder.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ItemControllerImpl implements ItemController {

    @Autowired
    ItemService itemService;
    @Autowired
    CategoryService categoryService;

    @Override
    @GetMapping("/queryItem/{itemId}")
    public String getItemById(@PathVariable(value = "itemId") Long itemId, Model model) {
        Item item = itemService.getItemById(itemId);
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> data = mapper.convertValue(item, Map.class);
//
//        for (Map.Entry<String, Object> entry: data.entrySet()){
//            System.out.println("key="+entry.getKey()+", value="+entry.getValue());
//            System.out.println("-------------------------");
//        }
        model.addAttribute("item", item);
//        model.addAttribute("cart", new Cart());
        return "item";
    }

    @Override
    @ResponseBody
    @GetMapping("/getItemListByCategoryId/{categoryId}")
    public List<Item> getItemListByCategoryId(@PathVariable(value = "categoryId") Long categoryId) {
        List<Item> itemList = itemService.getItemListByCategoryId(categoryId);
        return itemList;
    }



}
