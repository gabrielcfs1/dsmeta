package com.gabrielcfs.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielcfs.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
