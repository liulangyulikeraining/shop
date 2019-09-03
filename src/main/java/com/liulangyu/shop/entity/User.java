package com.liulangyu.shop.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Component
public class User {
    private int id;
    private String username;
    private String password;

}
