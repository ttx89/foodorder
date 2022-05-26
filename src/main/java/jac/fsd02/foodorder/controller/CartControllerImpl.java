package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CartControllerImpl implements CartController{

    @Autowired
    CartService cartService;



//    @Override
//    @PostMapping("/addCart")
//    public String addItemToCart(@ModelAttribute(value = "cart") Cart cart) {
//        System.out.println("@@@@@@@@@@@@@@@@@@@"+cart.toString());
//        cartService.addItemToCart(cart);
//        return "cart";    //添加完购物车，如果想保留在本页，需要仿造写个jqery方法，post
//    }

    @Override
    @ResponseBody
    @PostMapping("/addCart")
    public String addItemToCart(Cart cart) {
        System.out.println("@@@@@@@@@@@@@@@@@@@"+cart.toString());
        cartService.addItemToCart(cart);
        return "cart";  //string
    }
}
