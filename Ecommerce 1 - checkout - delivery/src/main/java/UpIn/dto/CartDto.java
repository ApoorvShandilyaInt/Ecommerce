package UpIn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto
{
    private Long userId;
    private Long productId;
    private int quantity;
    private int productPrice;
    private int totalPrice;

    private String productName;
    private int price;

}