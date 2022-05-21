package jac.fsd02.foodorder.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="orderDetail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDetailEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private Long itemId;
    private Integer quantity;
    private Double discount;

}
