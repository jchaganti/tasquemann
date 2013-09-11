package org.jchlabs.tasquemann.server.data.jpa.service;

import javax.annotation.Resource;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMUser;
import org.jchlabs.tasquemann.server.data.jpa.repository.TMProjectRepository;
import org.jchlabs.tasquemann.server.data.representation.TMProjectDTO;
import org.jchlabs.tasquemann.server.data.representation.TMProjectsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TMProjectRepositoryServiceImpl implements TMProjectService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TMProjectRepositoryServiceImpl.class);
    
    @Resource
    private TMProjectRepository projectRepository;

    @Override
    public TMProjectDTO createProject(TMUser user, TMProjectDTO project) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public TMProjectDTO updateProject(TMProjectDTO project) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public TMProjectDTO deleteProject(TMProjectDTO project) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public TMProjectsDTO findAllProjects(TMUser user) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public TMProjectDTO findProject(long id) {
        // TODO Auto-generated method stub
        return null;
    }


}
