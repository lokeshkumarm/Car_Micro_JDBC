package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/cars")
public class CarController {
	private final CarRepository carRepo;
	@Autowired
	public CarController(CarRepository carrepo){
		this.carRepo = carrepo;
	}
	@RequestMapping(method = RequestMethod.GET)
	public Iterable findAll() {
		return carRepo.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car find(@PathVariable String id) {
           return carRepo.findOne(id);        
    }
}
