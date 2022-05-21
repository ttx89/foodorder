package jac.fsd02.foodorder.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//it means auto increment id for the table
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer cityId;
    private String address;
    private String userName;
    private String password;
    private UserType userType;
}
