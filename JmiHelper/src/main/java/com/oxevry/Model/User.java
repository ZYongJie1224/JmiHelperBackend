package com.oxevry.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String passWord;
    private String nickName;

}
