package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.model.Cart;

import java.util.List;

public interface CartService {

    Cart addItemToCart(Cart cart);

    List<Cart> getCartListByUserId();
}
