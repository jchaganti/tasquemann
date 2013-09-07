package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tm_calendar")
@DiscriminatorValue("CALENDAR")
public class TMCalendar extends TMItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "used_status")
    private Boolean usedStatus;
    @Column(name = "ovride_wkg_days")
    private String overrideWkgDays;
    @Column(name = "ovride_holi_days")
    private String overrideHoliDays;
    @Column(name = "wk_days")
    private Integer wkDays;
    @Column(name = "holi_days")
    private Integer holiDays;
    @Column(name = "wkg_day_hrs")
    private Float wkgDayHrs;
    @Column(name = "holi_day_hrs")
    private Float holiDayHrs;
    @OneToMany(mappedBy = "calendar")
    private Collection<TMProject> projects;

    public TMCalendar() {
        super();
    }

    public TMCalendar(Date created, Date modified, TMUser user, String name, Boolean usedStatus,
            String overrideWkgDays, String overrideHoliDays, Integer wkDays, Integer holiDays, Float wkgDayHrs,
            Float holiDayHrs, Collection<TMProject> projects) {
        super(created, modified, user);
        this.name = name;
        this.usedStatus = usedStatus;
        this.overrideWkgDays = overrideWkgDays;
        this.overrideHoliDays = overrideHoliDays;
        this.wkDays = wkDays;
        this.holiDays = holiDays;
        this.wkgDayHrs = wkgDayHrs;
        this.holiDayHrs = holiDayHrs;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUsedStatus() {
        return usedStatus;
    }

    public void setUsedStatus(Boolean usedStatus) {
        this.usedStatus = usedStatus;
    }

    public Collection<TMProject> getProjects() {
        return projects;
    }

    public void setProjects(Collection<TMProject> projects) {
        this.projects = projects;
    }

}
