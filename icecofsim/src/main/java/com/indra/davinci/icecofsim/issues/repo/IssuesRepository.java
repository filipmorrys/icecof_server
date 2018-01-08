package com.indra.davinci.icecofsim.issues.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.davinci.icecofsim.issues.data.Issue;

public interface IssuesRepository extends JpaRepository<Issue, Long> {

	
}
