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

    @Column(name = "description")
    private String description;
    @Column(name = "estimated_hrs")
    private float estimatedHrs;
    @Column(name = "actual_hrs")
    private float actualHrs;
    @Column(name = "todo_hrs")
    private float todoHrs;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "dirty")
    private Boolean dirty;
    @OneToOne
    @JoinColumn(name = "previous_id")
    private TMTask previous;
    @Column(name = "level")
    private int level;

    public static Builder getBuilder(TMUser user, String description, String title, int level) {
        return new Builder(user, description, title, level);
    }

    public TMTask() {
        super();
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public float getEstimatedHrs() {
        return estimatedHrs;
    }

    protected void setEstimatedHrs(float estimatedHrs) {
        this.estimatedHrs = estimatedHrs;
    }

    public float getActualHrs() {
        return actualHrs;
    }

    public void setActualHrs(float actualHrs) {
        this.actualHrs = actualHrs;
    }

    public float getTodoHrs() {
        return todoHrs;
    }

    public void setTodoHrs(float todoHrs) {
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

    public TMTask getPrevious() {
        return previous;
    }

    protected void setPrevious(TMTask previous) {
        this.previous = previous;
    }

    public int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    public static class Builder {
        private TMTask built;

        public Builder(TMUser user, String description, String title, int level) {
            built = new TMProject();
            built.setUser(user);
            built.setDescription(description);
            built.setLevel(level);
        }

        public Builder startDate(Date startDate) {
            built.setStartDate(startDate);
            return this;
        }

        public Builder estimatedHrs(float estimatedHrs) {
            built.setEstimatedHrs(estimatedHrs);
            return this;
        }

        public Builder todoHrs(float todoHrs) {
            built.setTodoHrs(todoHrs);
            return this;
        }

        public TMTask build() {
            return built;
        }

    }
}
