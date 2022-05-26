package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.model.Cart;

import jac.fsd02.foodorder.model.Item;
import jac.fsd02.foodorder.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    // Map<userId, itemList>
//    private static Map<Long, List<Cart>> cart = new HashMap<>();
//
//    public void addItemsToCart(List<Cart> itemList) {
//        Long userId = 11111L; //TODO: get userId from session
//        cart.put(userId, itemList);
//    }


    @Autowired
    CartRepository cartRepository;

    //查所有
    public List<Cart> getCartList(){
        List<Cart> result = cartRepository.findAll();
        return result;
    }

    @Override
    public Cart addItemToCart(Cart cart) {
        Long userId = 11111L;
        return cartRepository.save(cart);

    }
}


