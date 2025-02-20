package org.example.dto;

import lombok.*;

@Getter
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private  Integer id;
    private String name;
    private  int qty;
    private double unitePrice;
    private Double total;


}
