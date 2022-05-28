package jac.fsd02.foodorder.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jac.fsd02.foodorder.model.*;
import jac.fsd02.foodorder.repository.CartRepository;
import jac.fsd02.foodorder.repository.OrderDetailRepository;
import jac.fsd02.foodorder.repository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    OrderRespository orderRespository;

    @Autowired
    OrderDetailRepository orderDetailRepository;

    private ObjectMapper mapper;

    public OrderService(OrderRespository orderRespository, ObjectMapper mapper) {
        this.orderRespository = orderRespository;
        this.mapper = mapper;
    }

    public Order createOrder(CartListForm cartListForm) {
        List<Cart> cartList = cartListForm.getCartList();

        //insert into tbl_order
        Order order = new Order();
        order.setUserId(cartList.get(0).getUserId());
        order.setItemTotalPrice(cartListForm.getItemTotalPrice());
        order.setTax(cartListForm.getTax());
        order.setShippingFee(cartListForm.getShippingFee());
        order.setOrderTotalPrice(cartListForm.getOrderTotalPrice());
        order.setOrderDate(new Date());
        order.setOrderStatus(OrderStatus.UNPAID);
        Order savedOrder = orderRespository.save(order);

        //insert into tbl_order_detail
        List<OrderDetail> orderDetailList = new ArrayList<>();
        for (Cart cart : cartList) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderId(savedOrder.getId());
            orderDetail.setItemId(cart.getItemId());
            orderDetail.setPrice(cart.getItemPrice());
            orderDetail.setQuantity(cart.getQuantity());
            orderDetailList.add(orderDetail);
        }
        orderDetailRepository.saveAll(orderDetailList);

        //delete from cart
        for (Cart cart : cartList) {
            cartRepository.deleteById(cart.getId());
        }

        return savedOrder;
    }

}
