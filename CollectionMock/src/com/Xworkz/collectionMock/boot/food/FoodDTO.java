package com.Xworkz.collectionMock.boot.food;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@ToString@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class FoodDTO implements Serializable {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodDTO foodDTO = (FoodDTO) o;
        return Objects.equals(name, foodDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
