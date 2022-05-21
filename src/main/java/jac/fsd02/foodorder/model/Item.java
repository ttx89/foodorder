package jac.fsd02.foodorder.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Integer id;
    private Integer categoryId;
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;
}
