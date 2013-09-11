package org.jchlabs.tasquemann.server.data.jpa.service;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMUser;
import org.jchlabs.tasquemann.server.data.representation.TMProjectDTO;
import org.jchlabs.tasquemann.server.data.representation.TMProjectsDTO;

/**
 * @author jchaganti
 * 
 */
public interface TMProjectService extends TMService {

    /**
     * Creates a project for a given user.
     * @param user
     * @param project
     * @return 
     */
    TMProjectDTO createProject(TMUser user, TMProjectDTO project);

    /**
     * Updates a project.
     * @param project
     * @return
     */
    TMProjectDTO updateProject(TMProjectDTO project);

    /**
     * Delete a project.
     * @param project
     * @return
     */
    TMProjectDTO deleteProject(TMProjectDTO project);

    /**
     * Retrieve all projects of a given user.
     * @param user
     * @return
     */
    TMProjectsDTO findAllProjects(TMUser user);

    /**
     * Retrieve project of a given id.
     * @param id
     * @return
     */
    TMProjectDTO findProject(long id);

}
