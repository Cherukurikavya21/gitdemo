package com.kavyademo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kavyademo.entities.address;

public interface IAddressPersistence extends JpaRepository<address, Long> {

}
