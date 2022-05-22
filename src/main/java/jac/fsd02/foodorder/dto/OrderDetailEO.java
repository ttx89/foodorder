package jac.fsd02.foodorder.dto;

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
public class OrderDetailEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private Integer quantity;
    private Double discount;
    @ManyToOne
    @JoinColumn(name = "item_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ItemEO item;
    @ManyToOne
    @JoinColumn(name = "order_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private OrderEO order;

}
