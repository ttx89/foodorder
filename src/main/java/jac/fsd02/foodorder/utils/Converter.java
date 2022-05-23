package jac.fsd02.foodorder.utils;

import jac.fsd02.foodorder.dto.CategoryEO;
import jac.fsd02.foodorder.dto.ItemEO;
import jac.fsd02.foodorder.model.Category;
import jac.fsd02.foodorder.model.Item;

public class Converter {

    public static Category convCategoryEOToCategory(CategoryEO categoryEO){
        Category category = new Category();
        category.setId(categoryEO.getId());
        category.setCategoryName(categoryEO.getCategoryName());
        category.setCategorySrc(categoryEO.getCategorySrc());
        return category;
    }


    public static Item convItemEOToItem(ItemEO itemEO){
        Item item = new Item();
        item.setId(itemEO.getId());
        item.setItemName(itemEO.getItemName());
        item.setItemPrice(itemEO.getItemPrice());
        item.setItemSrc(itemEO.getItemSrc());
        item.setDescription(itemEO.getDescription());
        item.setActive(itemEO.getActive());
        item.setCategory(convCategoryEOToCategory(itemEO.getCategory()));
        return item;
    }
}
