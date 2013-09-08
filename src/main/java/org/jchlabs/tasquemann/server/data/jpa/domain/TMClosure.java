package org.jchlabs.tasquemann.server.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tm_closure")
public class TMClosure implements Serializable {

    private static final long serialVersionUID = -9055893097631168462L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ancestor")
    private Integer ancestor;
    @Column(name = "descendant")
    private Integer descendant;
    @Column(name = "path_length")
    private Integer pathLength;

    public TMClosure() {
        super();
    }

    public TMClosure(Integer ancestor, Integer descendant, Integer pathLength) {
        super();
        this.ancestor = ancestor;
        this.descendant = descendant;
        this.pathLength = pathLength;
    }

    public Long getId() {
        return id;
    }

    public Integer getAncestor() {
        return ancestor;
    }

    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    public Integer getDescendant() {
        return descendant;
    }

    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }

    public Integer getPathLength() {
        return pathLength;
    }

    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
    }

}
