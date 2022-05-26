package jac.fsd02.foodorder.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="tbl_city")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CityEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private String cityName;
    private Double shippingFee;
    private String shippingTime;
}
