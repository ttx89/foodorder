package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.constant.Constants;
import jac.fsd02.foodorder.model.Cart;
import jac.fsd02.foodorder.model.CartListForm;
import jac.fsd02.foodorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

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
        return "cart";  //just a string, not website
    }

    @Override
    @GetMapping("/cart")
    public String getCartListByUser(Long userid, Model model) {
        Long userId = 2L; //TODO: get userId from session
        ArrayList<Cart> cartList = (ArrayList<Cart>) cartService.getCartListByUserId(userId);
        Double itemTotalPrice = cartService.getTotalOrderPrice(userId);

        CartListForm cartListForm = new CartListForm();
        cartListForm.setCartList(cartList);
        cartListForm.setItemTotalPrice(itemTotalPrice);

        Double shippingFee = 5.55;//todo: query shipping fee
        cartListForm.setShippingFee(shippingFee);

        double amountBeforeTax = itemTotalPrice + shippingFee;
        double taxAmount = BigDecimal.valueOf(amountBeforeTax)
                .multiply(BigDecimal.valueOf(Constants.TAX_RATE))
                .setScale(2,  RoundingMode.HALF_UP)
                .doubleValue();


        cartListForm.setTax(taxAmount) ;
        cartListForm.setOrderTotalPrice(amountBeforeTax + taxAmount);

        model.addAttribute("cartListForm",cartListForm);
        return "cart"; //this is a website!
    }


    @GetMapping("/deleteCart/{id}")
    public String deleteCartById(@PathVariable(value = "id") Long id){
        cartService.deleteCartById(id);
        return "redirect:/cart";  //刷新本页
    }

    public void deleteCartListByUser(Long userid){

        Long userId = 2L;
        cartService.getCartListByUserId(userId);
    }
}
