package jac.fsd02.foodorder.model;


import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="tbl_order_detail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    @ManyToOne
    @JoinColumn(name = "item_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Item item;
    @ManyToOne
    @JoinColumn(name = "order_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Order order;
    private Integer quantity;
    private Double discount;

}
