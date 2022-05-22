package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {

    List<Item> getItemListByCategoryId(Long categoryId);
}
