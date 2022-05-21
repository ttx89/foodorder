package jac.fsd02.foodorder.entity;


import jac.fsd02.foodorder.model.OrderStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="order")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private Long userId;
    private Double itemTotalPrice;
    private Double tax;
    private Double shippingFee;
    private Double orderTotalPrice;
    private Date orderDate;
    private Long paymentId;
    private OrderStatus orderStatus;
}
