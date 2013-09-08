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

    public static Builder getBuilder(TMUser user, String description, String title) {
        return new Builder(user, description, title);
    }

    public String getTitle() {
        return title;
    }

    public STATE getState() {
        return state;
    }

    public TMCalendar getCalendar() {
        return calendar;
    }

    public static class Builder {
        private TMProject built;

        public Builder(TMUser user, String description, String title) {
            built = new TMProject();
            built.setUser(user);
            built.setDescription(description);
            built.title = title;
            built.state = STATE.ACTIVE;
            built.setLevel(-1);
        }

        public Builder startDate(Date startDate) {
            built.setStartDate(startDate);
            return this;
        }

        public Builder estimatedHrs(Float estimatedHrs) {
            built.setEstimatedHrs(estimatedHrs);
            return this;
        }

        public Builder todoHrs(Float todoHrs) {
            built.setTodoHrs(todoHrs);
            return this;
        }

        public TMProject build() {
            return built;
        }
    }
}
