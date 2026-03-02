package com.FirstProject.JavaLearner.Controller;

import com.FirstProject.JavaLearner.Entity.Address;
import com.FirstProject.JavaLearner.Repository.AddressRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AddressController {
    private final AddressRepo addressRepo;

    public AddressController(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;

    }
    @GetMapping("/get")
    public List<Address> getAddress(){
        return addressRepo.findAll();
    }
    @PostMapping("/address")
    public Address saveAddress(@RequestBody Address address){
        return addressRepo.save(address);
    }
}
