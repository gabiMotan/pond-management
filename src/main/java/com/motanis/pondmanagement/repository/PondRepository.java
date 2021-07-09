package com.motanis.pondmanagement.repository;

import com.motanis.pondmanagement.model.Pond;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PondRepository extends JpaRepository <Pond,Integer> {



}
