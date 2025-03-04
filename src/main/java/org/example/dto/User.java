package org.example.dto;

import lombok.*;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
}
