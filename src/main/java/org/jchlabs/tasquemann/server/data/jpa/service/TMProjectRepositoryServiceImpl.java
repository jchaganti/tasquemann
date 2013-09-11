package org.jchlabs.tasquemann.server.data.jpa.service;

import javax.annotation.Resource;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMTask;
import org.jchlabs.tasquemann.server.data.jpa.repository.TMClosureRepository;
import org.jchlabs.tasquemann.server.data.jpa.repository.TMProjectRepository;
import org.jchlabs.tasquemann.server.data.representation.TMProjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TMProjectRepositoryServiceImpl implements TMProjectService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TMProjectRepositoryServiceImpl.class);
    
    @Resource
    private TMProjectRepository projectRepository;
    @Resource
    private TMClosureRepository closureRepository;

    @Transactional
    public TMProjects getTasks(long id, boolean recurse) {
        LOGGER.debug("Getting Tasks for id = " + id + "  recurse = " + recurse);
        return null;
    }

    public boolean createTask(long projectId, long parentId, long siblingId, TMTask task) {
        return false;
    }

    public boolean deleteTask(long taskId) {
        return false;
    }

}
