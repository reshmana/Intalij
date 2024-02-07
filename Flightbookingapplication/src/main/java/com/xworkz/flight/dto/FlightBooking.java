   package com.xworkz.flight.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class FlightBooking {
  private   int id;
   private String FlightName;
   private String Source;
  private   String Destination;
   private int Price;

    public FlightBooking(String FlightName, String Source, String Destination, int Price){
        this.FlightName=FlightName;
        this.Source=Source;
        this.Destination=Destination;
        this.Price=Price;

    }

    //what is jdbc
    //steps of jdbc
    //what is connection ], statement,preparedstatememnts
    //deff b/w satement and preperstatement
}





