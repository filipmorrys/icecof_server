package com.indra.davinci.icecofsim.topology.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.davinci.icecofsim.topology.domain.Node;

public interface NodeRepository extends JpaRepository<Node, Long> {

	
}
