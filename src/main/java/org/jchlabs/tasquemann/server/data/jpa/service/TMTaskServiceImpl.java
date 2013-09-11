package org.jchlabs.tasquemann.server.data.jpa.service;

import javax.annotation.Resource;

import org.jchlabs.tasquemann.server.data.jpa.repository.TMTaskRepository;
import org.jchlabs.tasquemann.server.data.representation.TMTaskDTO;
import org.jchlabs.tasquemann.server.data.representation.TMTasksDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMTaskServiceImpl implements TMTaskService {
    
private static final Logger LOGGER = LoggerFactory.getLogger(TMTaskServiceImpl.class);
    
    @Resource
    private TMTaskRepository taskRepository;

    @Override
    public TMTasksDTO findTasks(TMTaskDTO parent, boolean recurse) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TMTaskDTO createTask(TMTaskDTO parent, TMTaskDTO child) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TMTaskDTO deleteTask(TMTaskDTO parent, TMTaskDTO child) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TMTaskDTO setFirstchildTask(TMTaskDTO parent, TMTaskDTO child) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TMTaskDTO setSiblingTask(TMTaskDTO first, TMTaskDTO second) {
        // TODO Auto-generated method stub
        return null;
    }

}
