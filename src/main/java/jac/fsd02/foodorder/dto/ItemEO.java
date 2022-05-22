package jac.fsd02.foodorder.dto;

import jac.fsd02.foodorder.model.Active;
import jac.fsd02.foodorder.model.Category;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="tbl_item")
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

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private CategoryEO category;

}
