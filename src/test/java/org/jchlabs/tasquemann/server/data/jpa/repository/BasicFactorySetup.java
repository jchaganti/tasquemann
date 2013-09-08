package org.jchlabs.tasquemann.server.data.jpa.repository;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jchlabs.tasquemann.server.data.jpa.domain.TMProject;
import org.jchlabs.tasquemann.server.data.jpa.domain.TMUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public class BasicFactorySetup {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa.tasquemann");

    private TMProjectRepository projectRepository;
    private TMUserRepository userRepository;
    private EntityManager em;

    private TMProject project;
    private TMUser  user;

    /**
     * Creates a {@link SimpleUserRepository} instance.
     * 
     * @throws Exception
     */
    @Before
	public void setUp() {

		em = factory.createEntityManager();

		projectRepository = new JpaRepositoryFactory(em).getRepository(TMProjectRepository.class);
		userRepository = new JpaRepositoryFactory(em).getRepository(TMUserRepository.class);

		em.getTransaction().begin();
		user = new TMUser("jchaganti", "jch");
		user = userRepository.save(user);

		//project = new TMProject(new Date(), new Date(), user , "description", 10.0f, 12.0f, 11.0f, new Date(), new Date(), Boolean.TRUE, "title", TMProject.STATE.ACTIVE);
		
		project = TMProject.getBuilder(user,  "description", "title").build();

		project = projectRepository.save(project);
		em.getTransaction().commit();

	}

    /**
     * Rollback transaction.
     */
    @After
    public void tearDown() {

        //em.getTransaction().rollback();
    }

    /**
     * Showing invocation of finder method.
     */
    @Test
    public void executingFinders() {
        System.out.println("Count = " +projectRepository.count());
        assertEquals(project, projectRepository.findByTitle("title"));
    }
}
