package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tm_project")
public class TMProject extends TMTask {

    private static final long serialVersionUID = 1L;
    // private Long id;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "calendar_id")
    private TMCalendar calendar;

    public static enum STATE {
        ACTIVE, INACTIVE, ARCHIVED
    }

    @Enumerated(EnumType.STRING)
    private STATE state;

    public TMProject() {
        super();
    }

    public TMProject(Date created, Date modified, TMUser user, String description, Float estimatedHrs, Float actualHrs,
            Float todoHrs, Date startDate, Date endDate, Boolean dirty, String title, STATE state) {
        super(created, modified, user, description, estimatedHrs, actualHrs, todoHrs, startDate, endDate, dirty);
        this.title = title;
        this.state = state;
    }

    // public Long getId() {
    // return id;
    // }
    //
    // public void setId(Long id) {
    // this.id = id;
    // }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public TMCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(TMCalendar calendar) {
        this.calendar = calendar;
    }

}
