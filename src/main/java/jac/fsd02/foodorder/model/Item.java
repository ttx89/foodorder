package jac.fsd02.foodorder.model;

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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    @ManyToOne
    @JoinColumn(name = "category_Id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;
    private String itemName;
    private Double itemPrice;
    private String itemSrc;
    private String description;
    private Active active;


}
