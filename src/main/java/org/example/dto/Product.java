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
    private Double price;
    private String category;
    private String image_path;
}
