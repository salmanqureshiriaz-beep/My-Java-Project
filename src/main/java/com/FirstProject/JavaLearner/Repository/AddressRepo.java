package com.FirstProject.JavaLearner.Repository;


import com.FirstProject.JavaLearner.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
