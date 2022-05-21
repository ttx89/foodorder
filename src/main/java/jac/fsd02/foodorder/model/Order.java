package jac.fsd02.foodorder.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Integer id;
    private Integer userId;
    private Double itemTotalPrice;
    private Double tax;
    private Double shippingFee;
    private Double orderTotalPrice;
    private Date orderDate;
    private Integer paymentId;
    private OrderStatus orderStatus;
}
