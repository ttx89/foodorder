package jac.fsd02.foodorder.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Category {
    private Long id;
    private String categoryName;
    private String categorySrc;

}
