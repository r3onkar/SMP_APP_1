package com.smp.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ENQ_ID	;
	 private String NAME;
	 private int PHNO;
	private String CLASSMODE;
	private String COURSE;
	private String STATUS;
	private LocalDate CREATED_DATE;
	private String CID;
	
	public Student() {
		super();
	}
	public Student(int eNQ_ID, String nAME, int pHNO, String mODE, String cOURSE, String sTATUS, LocalDate cREATED_DATE,
			String cID) {
		super();
		ENQ_ID = eNQ_ID;
		NAME = nAME;
		PHNO = pHNO;
		CLASSMODE = mODE;
		COURSE = cOURSE;
		STATUS = sTATUS;
		CREATED_DATE = cREATED_DATE;
		CID = cID;
	}
	public int getENQ_ID() {
		return ENQ_ID;
	}
	public void setENQ_ID(int eNQ_ID) {
		ENQ_ID = eNQ_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getPHNO() {
		return PHNO;
	}
	public void setPHNO(int pHNO) {
		PHNO = pHNO;
	}
	public String getMODE() {
		return CLASSMODE;
	}
	public void setMODE(String mODE) {
		CLASSMODE = mODE;
	}
	public String getCOURSE() {
		return COURSE;
	}
	public void setCOURSE(String cOURSE) {
		COURSE = cOURSE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public LocalDate getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(LocalDate cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	
}
