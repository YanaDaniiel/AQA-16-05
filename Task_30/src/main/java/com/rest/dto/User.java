package com.rest.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private String email;
    private String password;
    private String id;
    private String token;
    private String error;
}
