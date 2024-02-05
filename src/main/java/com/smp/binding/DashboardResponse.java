package com.smp.binding;

public class DashboardResponse {
	
	private Integer totalEnq;
	private Integer enRolled;
	private Integer  missEnrolled;
	public Integer getTotalEnq() {
		return totalEnq;
	}
	public void setTotalEnq(Integer totalEnq) {
		this.totalEnq = totalEnq;
	}
	public Integer getEnRolled() {
		return enRolled;
	}
	public void setEnRolled(Integer enRolled) {
		this.enRolled = enRolled;
	}
	public Integer getMissEnrolled() {
		return missEnrolled;
	}
	public void setMissEnrolled(Integer missEnrolled) {
		this.missEnrolled = missEnrolled;
	}

}
