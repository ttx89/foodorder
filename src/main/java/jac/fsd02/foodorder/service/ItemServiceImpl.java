package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.entity.CategoryEO;
import jac.fsd02.foodorder.entity.ItemEO;
import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> getItemListByCategoryId(Long categoryId){

        CategoryEO categoryEO = new CategoryEO();

        //todo: transfer categoryId to CategoryEO
        List<ItemEO> itemE0s = itemRepository.findByCategoryId(categoryEO);

        //todo: transfer itemE0s to Page<Item>
        List<Item> itemList = new ArrayList<>();

        return itemList;
    }

}
