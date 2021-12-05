package com.example.amigos_leson.product;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return List.of(
                new Product(
                        1L,
                        "First Product",
                        "Fist product description",
                        200.00,
                        "Felix Onjomba",
                        LocalDate.of(2021, Month.APRIL, 20),
                        LocalDate.of(2021, Month.DECEMBER, 21)
                ),
                new Product(
                        1L,
                        "First Product",
                        "Fist product description",
                        200.00,
                        "Felix Onjomba",
                        LocalDate.of(2021, Month.APRIL, 20),
                        LocalDate.of(2021, Month.DECEMBER, 21)
                )
        );
    }
}
