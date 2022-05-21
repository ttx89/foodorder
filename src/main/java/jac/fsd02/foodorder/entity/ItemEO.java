package jac.fsd02.foodorder.entity;

import jac.fsd02.foodorder.model.Active;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ItemEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private Long categoryId;
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;
}
