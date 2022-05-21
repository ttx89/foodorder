package jac.fsd02.foodorder.entity;

import jac.fsd02.foodorder.model.PaymentStatus;
import jac.fsd02.foodorder.model.PaymentType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="payment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private Long userId;
    private Long orderId;
    private Integer transactionNum;
    private PaymentStatus paymentStatus;
    private PaymentType paymentType;
}
