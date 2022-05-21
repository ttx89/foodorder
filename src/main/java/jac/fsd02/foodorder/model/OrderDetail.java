package jac.fsd02.foodorder.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Integer id;
    private Integer itemId;
    private Integer quantity;
    private Double discount;

}
