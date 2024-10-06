package com.nt.repojeter;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entit.MarriageSeeker;

public interface IMarriageSeekerRepojeter extends JpaRepository<MarriageSeeker, Integer> {

	Optional<MarriageSeeker> findById(Long id);

}
