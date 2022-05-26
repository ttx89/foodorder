package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CartService {

//    void addItemsToCart(List<Cart> itemList);

    Cart addItemToCart(Cart cart);


}
