package com.example.countriesusb.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountriesEntiti {

    private int id;
    private String countryName;
    private String countryCapital;
    private String countryContinent;
    private String countryCode;

    public  void generateID(){
        this.id = (int) (Math.random()*1000000);
    }
}
