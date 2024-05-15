package com.Xworkz.collectionMock.boot.book;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@Setter@Getter@NoArgsConstructor@AllArgsConstructor@ToString

public class BookDTO implements Serializable {
    private LocalDate publicationYear;
    private String author;
    private Double rating;
    private double price;

}
