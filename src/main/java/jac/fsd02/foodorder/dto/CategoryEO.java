package jac.fsd02.foodorder.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_category")
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
