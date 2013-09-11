package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tm_closure")
public class TMClosure implements Serializable {

    private static final long serialVersionUID = -9055893097631168462L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ancestor")
    private long ancestor;
    @Column(name = "descendant")
    private long descendant;
    @OneToOne
    @JoinColumn(name = "project_id")
    private TMProject project;

    public TMClosure() {
        super();
    }

    public TMClosure(Integer ancestor, Integer descendant, TMProject project) {
        super();
        this.ancestor = ancestor;
        this.descendant = descendant;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public long getAncestor() {
        return ancestor;
    }

    public void setAncestor(long ancestor) {
        this.ancestor = ancestor;
    }

    public long getDescendant() {
        return descendant;
    }

    public void setDescendant(long descendant) {
        this.descendant = descendant;
    }

    public TMProject getProject() {
        return project;
    }
}
