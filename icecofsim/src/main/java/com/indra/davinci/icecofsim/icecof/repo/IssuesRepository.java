package com.indra.davinci.icecofsim.icecof.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.davinci.icecofsim.icecof.domain.Issue;

public interface IssuesRepository extends JpaRepository<Issue, Long> {

	
}
