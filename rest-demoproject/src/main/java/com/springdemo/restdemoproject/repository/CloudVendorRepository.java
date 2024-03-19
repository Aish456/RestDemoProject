package com.springdemo.restdemoproject.repository;

import com.springdemo.restdemoproject.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
