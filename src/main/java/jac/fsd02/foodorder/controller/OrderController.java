package jac.fsd02.foodorder.controller;

import jac.fsd02.foodorder.model.CartListForm;
import jac.fsd02.foodorder.model.Payment;
import jac.fsd02.foodorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    //add of
    @GetMapping("/checkout")
    public String createOrder(@ModelAttribute("cartListForm") CartListForm cartListForm, Model model){
//        cartList = (ArrayList<Cart>)model.getAttribute("result");
        System.out.println(cartListForm.toString());
        orderService.createOrder(cartListForm);

        model.addAttribute("payment", new Payment());
        model.addAttribute("orderTotalPrice", cartListForm.getOrderTotalPrice());
        return "payment";
    }



}
