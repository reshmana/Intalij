package com.xworkx.functional.DTO;

import lombok.*;

import java.io.Serializable;
@Getter@ToString@AllArgsConstructor@NoArgsConstructor@Setter

public class SkyWalkDTO implements Serializable {
  private   String  name;
   private   double length;
   private  double height;
   private int capacity;

}
