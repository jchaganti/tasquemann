package org.jchlabs.tasquemann.server.data.jpa.service;

import java.util.List;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMTask;

/**
 * @author jchaganti
 *
 */
public interface TMProjectService extends TMService{

    /**
     * This will return all the subtasks of a project 
     * @param id - Project id.
     * @param recurse - Flag to indicate if we have to recurse the tree.
     * @return List of TMTask
     */
    List<TMTask> getTasks(long id, boolean recurse);
    
    
    /**
     * @param projectId
     * @param parentId
     * @param siblingId
     * @param task
     * @return
     */
    boolean createTask(long projectId, long parentId, long siblingId, TMTask task);
    
    /**
     * @param taskId
     * @return
     */
    boolean deleteTask(long taskId);

}