package com.example.countriesusb.controllers;

import com.example.countriesusb.entities.CountriesEntiti;
import com.example.countriesusb.services.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {

    public final CountriesService countriesService;

    public CountriesController(CountriesService countriesService ){
        this.countriesService = countriesService;
    }

    @GetMapping
    public List<CountriesEntiti> getAllCountries(){
        return countriesService.getAllCountries();
    }

    @PostMapping
    public String createCountry(){
        return"Crea un pais";
    }

    @PutMapping
    public String updateCountry(){
        return"Actualizar un pais";
    }

    @DeleteMapping
    public String deleteCountry(){
        return"Eliminar un pais";
    }
}
