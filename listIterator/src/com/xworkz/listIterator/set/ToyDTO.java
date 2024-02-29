package com.xworkz.listIterator.set;

import java.io.Serializable;
import java.util.Objects;

public class ToyDTO implements Serializable, Comparable<ToyDTO> {

    private  String  name;
    private  String Material;
    private  String size;

    public ToyDTO(String name, String Material, String size) {
        this.name=name;
        this.Material=Material;
        this.size=size;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ToyDTO toyDTO = (ToyDTO) o;
//        return Objects.equals(name, toyDTO.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToyDTO toyDTO = (ToyDTO) o;
        return Objects.equals(name, toyDTO.name) && Objects.equals(Material, toyDTO.Material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(ToyDTO o) {
        return 0;
    }
}
