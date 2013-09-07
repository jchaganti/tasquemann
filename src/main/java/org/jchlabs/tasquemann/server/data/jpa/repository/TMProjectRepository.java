package org.jchlabs.tasquemann.server.data.jpa.repository;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMProject;
import org.springframework.data.repository.CrudRepository;

public interface TMProjectRepository extends CrudRepository<TMProject, Long> {
    
    TMProject findByTitle(String title);

}
