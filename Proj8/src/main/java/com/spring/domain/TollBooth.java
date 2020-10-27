package com.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TollBooth {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id; 
    
    @Column(name = "laneNumber")
    private Integer laneNumber;
    
    @ManyToOne
	@JoinColumn(name="plaza_id")
    private Plaza plazaIns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(Integer laneNumber) {
        this.laneNumber = laneNumber;
    }

    public Plaza getPlazaIns() {
        return plazaIns;
    }

    public void setPlazaIns(Plaza plazaIns) {
        this.plazaIns = plazaIns;
    }
    
    
    
}
