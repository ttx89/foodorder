package jac.fsd02.foodorder.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDetail {

    private Long id;
    private Long orderId;
    private Long itemId;
    private Integer quantity;
    private Double discount;

}
