package org.example;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@DataAmount
@Data
public class Users {
    private String firstName;
    private String lastName;
    private String userName;
    private String message;
    private String chatID;

}
