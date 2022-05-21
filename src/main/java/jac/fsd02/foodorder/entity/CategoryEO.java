package jac.fsd02.foodorder.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private String categoryName;
    private String categorySrc;

}
