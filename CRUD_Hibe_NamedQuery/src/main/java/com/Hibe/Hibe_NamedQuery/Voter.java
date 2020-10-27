package com.Hibe.Hibe_NamedQuery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries(value = {
@NamedQuery(name = "getVoterById" , query = "from Voter where vid=:vid") ,
@NamedQuery (name = "getVoterByName" , query = "from Voter where vname=:vname") ,
@NamedQuery(name = "getVoterByIdAndName" , query = "from Voter where vid =:vid and vname=:vname") ,
@NamedQuery(name ="GetVoterList" , query = "from Voter")
})


@Entity
public class Voter {
	@Id
	private int vid ;
	private String vname ;
	private String vrole;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVrole() {
		return vrole;
	}
	public void setVrole(String vrole) {
		this.vrole = vrole;
	}
	
	

}
