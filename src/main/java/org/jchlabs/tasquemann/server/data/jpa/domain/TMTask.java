package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tm_task")
public class TMTask extends TMItem {

    private static final long serialVersionUID = 1L;
    // private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "estimated_hrs")
    private Float estimatedHrs;
    @Column(name = "actual_hrs")
    private Float actualHrs;
    @Column(name = "todo_hrs")
    private Float todoHrs;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "dirty")
    private Boolean dirty;
    @OneToOne
    @JoinColumn(name = "parent_id")
    private TMTask parent;
    @OneToOne
    @JoinColumn(name = "previous_id")
    private TMTask previous;

    public TMTask(Date created, Date modified, TMUser user, String description, Float estimatedHrs, Float actualHrs,
            Float todoHrs, Date startDate, Date endDate, Boolean dirty) {
        super(created, modified, user);
        this.description = description;
        this.estimatedHrs = estimatedHrs;
        this.actualHrs = actualHrs;
        this.todoHrs = todoHrs;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dirty = dirty;
    }

    public TMTask() {

    }

    // public Long getId() {
    // return id;
    // }
    //
    // public void setId(Long id) {
    // this.id = id;
    // }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getEstimatedHrs() {
        return estimatedHrs;
    }

    public void setEstimatedHrs(Float estimatedHrs) {
        this.estimatedHrs = estimatedHrs;
    }

    public Float getActualHrs() {
        return actualHrs;
    }

    public void setActualHrs(Float actualHrs) {
        this.actualHrs = actualHrs;
    }

    public Float getTodoHrs() {
        return todoHrs;
    }

    public void setTodoHrs(Float todoHrs) {
        this.todoHrs = todoHrs;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getDirty() {
        return dirty;
    }

    public void setDirty(Boolean dirty) {
        this.dirty = dirty;
    }

    public TMTask getParent() {
        return parent;
    }

    public void setParent(TMTask parent) {
        this.parent = parent;
    }

    public TMTask getPrevious() {
        return previous;
    }

    public void setPrevious(TMTask previous) {
        this.previous = previous;
    }

}
