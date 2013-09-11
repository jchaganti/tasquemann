package org.jchlabs.tasquemann.server.data.jpa.service;

import org.jchlabs.tasquemann.server.data.representation.TMTaskDTO;
import org.jchlabs.tasquemann.server.data.representation.TMTasksDTO;

/**
 * @author jchaganti
 *
 */
public interface TMTaskService extends TMService {

    /**
     * Find sub-tasks for a given parent.
     * @param parent - Parent Task
     * @param recurse - Recurse to find the entire task tree.
     * @return
     */
    TMTasksDTO findTasks(TMTaskDTO parent, boolean recurse);

    /**
     * Create a child task under a parent task.
     * @param parent
     * @param child
     * @return
     */
    TMTaskDTO createTask(TMTaskDTO parent, TMTaskDTO child);

    /**
     * Delete a child task under a parent task.
     * @param parent
     * @param child
     * @return
     */
    TMTaskDTO deleteTask(TMTaskDTO parent, TMTaskDTO child);

    /**
     * Set the child task as the first child task of a parent.
     * @param parent
     * @param child
     * @return
     */
    TMTaskDTO setFirstchildTask(TMTaskDTO parent, TMTaskDTO child);

    /**
     * Set the second task as the sibling of the first task
     * @param first
     * @param second
     * @return
     */
    TMTaskDTO setSiblingTask(TMTaskDTO first, TMTaskDTO second);

}
