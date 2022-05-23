package jac.fsd02.foodorder.model;



import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="tbl_order")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="payment_Id")
    private Payment payment;
    @ManyToOne
    @JoinColumn(name = "user_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
    private Double itemTotalPrice;
    private Double tax;
    private Double shippingFee;
    private Double orderTotalPrice;
    private Date orderDate;

    private OrderStatus orderStatus;
}
