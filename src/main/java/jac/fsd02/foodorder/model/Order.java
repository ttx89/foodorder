package jac.fsd02.foodorder.model;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {

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