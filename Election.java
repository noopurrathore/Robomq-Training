package com.robomq.assignment3;

public class Election {
	private int id;
	private String name;
	private String electionDate;
	private String district;
	private String constituency;
	private String countingDate;
	public Election(int id, String name, String electionDate, String district, String constituency, String countingDate) {
		super();
		this.id = id;
		this.name = name;
		this.electionDate = electionDate;
		this.district = district;
		this.constituency = constituency;
		this.countingDate = countingDate;
	}
	@Override
	public String toString() {
		return "Election [id=" + id + ", name=" + name + ", electionDate=" + electionDate + ", district=" + district
				+ ", Constituency=" + constituency + ", countingDate=" + countingDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getCountingDate() {
		return countingDate;
	}
	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}	
	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object o) {
		boolean flag=false;
		if (o instanceof Election) {
			Election e =(Election)o;
					if(e.id==this.id)
						flag=true;
		}
		return flag;
	}
	public int compareTo(Election e1) {
		int r=this.getName().compareTo(e1.getName());
		return r;
	}
}
