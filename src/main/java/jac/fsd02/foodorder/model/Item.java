package jac.fsd02.foodorder.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Item {

    private Long id;
    private Category category;
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", category=" + category +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemSrc='" + itemSrc + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
