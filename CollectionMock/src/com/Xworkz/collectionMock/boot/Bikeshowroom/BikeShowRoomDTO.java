package com.Xworkz.collectionMock.boot.Bikeshowroom;

import lombok.*;

import java.io.Serializable;
@ToString@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class BikeShowRoomDTO implements Serializable {
    private String name;
    private String city;
    private double pincode;

}
