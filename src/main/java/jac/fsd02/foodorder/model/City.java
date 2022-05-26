package jac.fsd02.foodorder.model;

import lombok.*;


import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class City {

    private Long id;
    private String cityName;
    private Double shippingFee;
    private String shippingTime;    //
}
