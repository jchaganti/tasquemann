package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.io.Serializable;
import java.util.Collection;

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
    private int wkDays;
    @Column(name = "holi_days")
    private int holiDays;
    @Column(name = "wkg_day_hrs")
    private float wkgDayHrs;
    @Column(name = "holi_day_hrs")
    private float holiDayHrs;
    @OneToMany(mappedBy = "calendar")
    private Collection<TMProject> projects;

    private static final float DEFAULT_WKG_DAY_HRS = 8.0f;
    private static final float DEFAULT_HOLI_DAY_HRS = 0.0f;

    private static final int MON = 0x1;
    private static final int TUE = 0x2;
    private static final int WED = 0x4;
    private static final int THURS = 0x8;
    private static final int FRI = 0x10;
    private static final int SAT = 0x20;
    private static final int SUN = 0x40;

    public TMCalendar() {
        super();
    }

    public static Builder getBuilder(TMUser user, String name) {
        return new Builder(user, name);
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

    public String getOverrideWkgDays() {
        return overrideWkgDays;
    }

    public void setOverrideWkgDays(String overrideWkgDays) {
        this.overrideWkgDays = overrideWkgDays;
    }

    public String getOverrideHoliDays() {
        return overrideHoliDays;
    }

    public void setOverrideHoliDays(String overrideHoliDays) {
        this.overrideHoliDays = overrideHoliDays;
    }

    public int getWkDays() {
        return wkDays;
    }

    public void setWkDays(int wkDays) {
        this.wkDays = wkDays;
    }

    public int getHoliDays() {
        return holiDays;
    }

    public void setHoliDays(int holiDays) {
        this.holiDays = holiDays;
    }

    public float getWkgDayHrs() {
        return wkgDayHrs;
    }

    public void setWkgDayHrs(float wkgDayHrs) {
        this.wkgDayHrs = wkgDayHrs;
    }

    public float getHoliDayHrs() {
        return holiDayHrs;
    }

    public void setHoliDayHrs(float holiDayHrs) {
        this.holiDayHrs = holiDayHrs;
    }

    public static class Builder {
        private TMCalendar built;

        public Builder(TMUser user, String name) {
            built = new TMCalendar();
            built.setUser(user);
            built.wkDays = MON | TUE | WED | THURS | FRI;
            built.holiDays = SAT | SUN;
            built.holiDayHrs = DEFAULT_HOLI_DAY_HRS;
            built.wkgDayHrs = DEFAULT_WKG_DAY_HRS;
        }

        public Builder overrideHoliDays(String overrideHoliDays) {
            built.overrideHoliDays = overrideHoliDays;
            return this;
        }

        public Builder overrideWkgDays(String overrideWkgDays) {
            built.overrideWkgDays = overrideWkgDays;
            return this;
        }

        public TMCalendar build() {
            return built;
        }

    }
}
