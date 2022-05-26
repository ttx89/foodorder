package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartControllerImpl implements CartController{

    @Autowired
    CartService cartService;

    @Override
    @ResponseBody
    @PostMapping("/addCart")
    public String addItemToCart(Cart cart) {
        Long userId = 2L; //TODO: get userId from session
        cart.setUserId(userId);

        cartService.addItemToCart(cart);
        return "cart";  //string
    }
}
