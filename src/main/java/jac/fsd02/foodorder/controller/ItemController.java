package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Item;

import java.util.List;

public interface ItemController {

    List<Item> getItemListByCategoryId(Long categoryId);

}
