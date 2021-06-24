package com.mf.tkmybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Jduser {

    private Integer user_id;
    private String login_name;
    private String password;

}
