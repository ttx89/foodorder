package jac.fsd02.foodorder.entity;

import jac.fsd02.foodorder.model.Active;
import jac.fsd02.foodorder.model.Category;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;
    private Category category;

}
