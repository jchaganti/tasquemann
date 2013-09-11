package org.jchlabs.tasquemann.server.data.jpa.repository;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMTask;
import org.springframework.data.repository.CrudRepository;

public interface TMTaskRepository extends CrudRepository<TMTask, Long> {

}
