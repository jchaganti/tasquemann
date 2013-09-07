package org.jchlabs.tasquemann.server.data.jpa.repository;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMUser;
import org.springframework.data.repository.CrudRepository;

public interface TMUserRepository extends CrudRepository<TMUser, Long> {
    TMUser findByName(String name);

}
