package jac.fsd02.foodorder.entity;


import jac.fsd02.foodorder.model.OrderStatus;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="paymentId")
    private PaymentEO paymentEO;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserEO userEO;
}
