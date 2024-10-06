package com.nt.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ActorInfoEntity;

public interface ActorInfoRepo extends JpaRepository<ActorInfoEntity, Integer> {

}
