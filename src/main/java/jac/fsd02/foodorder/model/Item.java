package jac.fsd02.foodorder.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Item {

    private Long id;
    private Long categoryId;
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;
}