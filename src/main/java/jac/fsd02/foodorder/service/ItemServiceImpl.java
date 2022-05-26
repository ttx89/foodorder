package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.dto.ItemEO;
import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.repository.ItemRepository;
import jac.fsd02.foodorder.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> getItemListByCategoryId(Long categoryId){
        List<ItemEO> itemEOList = itemRepository.findByCategoryId(categoryId);

        List<Item> itemList = new ArrayList<>();
        for (ItemEO itemEO: itemEOList){
            Item item = Converter.convItemEOToItem(itemEO);
            itemList.add(item);
        }
        return itemList;
    }

    @Override
    public Item getItemById(Long itemId) {
        Optional<ItemEO> optItemEO = itemRepository.findById(itemId);
        Item item = new Item();
        if (optItemEO.isPresent()) {
            ItemEO itemEO = optItemEO.get();
            item = Converter.convItemEOToItem(itemEO);
        }
        return item;
    }


}
