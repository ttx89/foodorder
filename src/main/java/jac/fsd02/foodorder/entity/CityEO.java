package jac.fsd02.foodorder.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="city")
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
    private Date shippingDate;
}
