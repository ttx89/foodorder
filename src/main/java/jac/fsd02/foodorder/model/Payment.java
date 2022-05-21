package jac.fsd02.foodorder.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Payment {

    private Long id;
    private Long userId;
    private Long orderId;
    private Integer transactionNum;
    private PaymentStatus paymentStatus;
    private PaymentType paymentType;
}
