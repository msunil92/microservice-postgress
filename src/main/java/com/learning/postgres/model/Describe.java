package com.learning.postgres.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Describe {
    private Student student;
    private String describe;
}
