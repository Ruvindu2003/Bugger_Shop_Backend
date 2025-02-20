package org.example.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {
    private Integer id;
    private String name;
    private String description;
    private String category;
    private String imagepaath;
}
