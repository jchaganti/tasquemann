package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tm_item")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TMItem implements Serializable {

    private static final long serialVersionUID = 2154160898626321059L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @OneToOne
    @JoinColumn(name = "user_id")
    private TMUser user;

    public TMItem(Date created, Date modified, TMUser user) {
        super();
        this.created = created;
        this.modified = modified;
        this.user = user;
    }

    public TMItem() {
        this.created = new Date();
        this.modified = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public TMUser getUser() {
        return user;
    }

    protected void setUser(TMUser user) {
        this.user = user;
    }

}
