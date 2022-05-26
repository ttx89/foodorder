package jac.fsd02.foodorder.service;

import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart addItemToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    //查当前用户购物车中所有数据
    @Override
    public List<Cart> getCartListByUserId(){
        List<Cart> result = cartRepository.findAll();
        return result;
    }

}


