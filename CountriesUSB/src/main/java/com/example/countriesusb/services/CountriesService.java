package com.example.countriesusb.services;

import com.example.countriesusb.entities.CountriesEntiti;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountriesService {

    private final List<CountriesEntiti> countries=new ArrayList<>();

    public CountriesService(){
        countries.add(new CountriesEntiti(10,"Colombia","Bogota","Suramerica","57"));
        countries.add(new CountriesEntiti(11,"Argentina","Buenos Aires","Suramerica","54"));
        countries.add(new CountriesEntiti(12,"Chile","Santiago","Suramerica","56"));
        countries.add(new CountriesEntiti(13,"Perú","Lima","Suramerica","51"));
        countries.add(new CountriesEntiti(14,"Venezuela","Caracas","Suramerica","58"));
        countries.add(new CountriesEntiti(15,"Ecuador","Quito","Suramerica","593"));
        countries.add(new CountriesEntiti(16,"Bolivia","Sucre","Suramerica","591"));
        countries.add(new CountriesEntiti(17,"Paraguay","Asunción","Suramerica","595"));
        countries.add(new CountriesEntiti(18,"Uruguay","Montevideo","Suramerica","598"));
        countries.add(new CountriesEntiti(19,"Guyana","Georgetown","Suramerica","592"));
        countries.add(new CountriesEntiti(20,"Surinam","Paramaribo","Suramerica","597"));

    }

    public List<CountriesEntiti> getAllCountries() {
        return countries;
    }
}
