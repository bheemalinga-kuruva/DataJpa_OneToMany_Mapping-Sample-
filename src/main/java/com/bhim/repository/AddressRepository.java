package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
