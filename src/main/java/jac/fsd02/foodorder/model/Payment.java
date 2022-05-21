package jac.fsd02.foodorder.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Integer id;
    private Integer userId;
    private Integer orderId;
    private Integer transactionNum;
    private PaymentStatus paymentStatus;
    private PaymentType paymentType;
}
