package com.klef.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.sdp.model.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

}
