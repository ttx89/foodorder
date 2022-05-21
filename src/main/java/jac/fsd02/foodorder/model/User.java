package jac.fsd02.foodorder.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private Long cityId;
    private String address;
    private String userName;
    private String password;
    private UserType userType;
}
