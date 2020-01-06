package com.hexudong.entity;

public class Vo {
	private String id;
	private String gjz;
	private String ms;
	private String gsname;
	private String cp;
	private String address;
	private String zb;
	private String clsj;
	private String njsj;
	
	private String njrq1;//年检日期1
	private String njrq2;//年检日期2
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGjz() {
		return gjz;
	}
	public void setGjz(String gjz) {
		this.gjz = gjz;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getGsname() {
		return gsname;
	}
	public void setGsname(String gsname) {
		this.gsname = gsname;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZb() {
		return zb;
	}
	public void setZb(String zb) {
		this.zb = zb;
	}
	public String getClsj() {
		return clsj;
	}
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	public String getNjsj() {
		return njsj;
	}
	public void setNjsj(String njsj) {
		this.njsj = njsj;
	}
	public String getNjrq1() {
		return njrq1;
	}
	public void setNjrq1(String njrq1) {
		this.njrq1 = njrq1;
	}
	public String getNjrq2() {
		return njrq2;
	}
	public void setNjrq2(String njrq2) {
		this.njrq2 = njrq2;
	}
	@Override
	public String toString() {
		return "Vo [id=" + id + ", gjz=" + gjz + ", ms=" + ms + ", gsname=" + gsname + ", cp=" + cp + ", address="
				+ address + ", zb=" + zb + ", clsj=" + clsj + ", njsj=" + njsj + ", njrq1=" + njrq1 + ", njrq2=" + njrq2
				+ "]";
	}
	
}
