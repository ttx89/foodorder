package jac.fsd02.foodorder.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_cart")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.NO_ACTION)
//    private UserEO user;

//    @ManyToOne
//    @JoinColumn(name = "item_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.NO_ACTION)
//    private ItemEO item;

    private Long userId;
    private Long itemId;
    private String itemName;
    private Integer quantity;
    private Double itemPrice;

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
