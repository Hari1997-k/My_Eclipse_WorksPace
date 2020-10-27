package com.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Fare {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
    private Integer id;
	
	@Column(name = "vehicleType")
    private String vehicleType;
	
	@Column(name ="oneWayRate" )
    private Double oneWayRate;
	
	@Column(name ="twoWayRate" )
	private Double twoWayRate ;
	
	@Column(name ="passRate" )
	private Double passRate;
	
	@ManyToOne
	@JoinColumn(name="plaza_id")
	private Plaza plaza;
    
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getOneWayRate() {
        return oneWayRate;
    }

    public void setOneWayRate(Double oneWayRate) {
        this.oneWayRate = oneWayRate;
    }

    public Double getTwoWayRate() {
        return twoWayRate;
    }

    public void setTwoWayRate(Double twoWayRate) {
        this.twoWayRate = twoWayRate;
    }

    public Double getPassRate() {
        return passRate;
    }

    public void setPassRate(Double passRate) {
        this.passRate = passRate;
    }

    public Plaza getPlaza() {
        return plaza;
    }

    public void setPlaza(Plaza plaza) {
        this.plaza = plaza;
    }
    
    
}
