package jac.fsd02.foodorder.entity;

import jac.fsd02.foodorder.model.UserType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String userName;
    private String password;
    private UserType userType;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="city_Id")
    private CityEO cityEO;
}
