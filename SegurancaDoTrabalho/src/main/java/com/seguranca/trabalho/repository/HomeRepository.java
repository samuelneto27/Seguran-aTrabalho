package com.seguranca.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguranca.trabalho.model.HomeModel;

@Repository
public interface HomeRepository extends JpaRepository<HomeModel, Long> {

}
