package com.hexudong.entity;


public class GS {
	
	private String id     ;//编号
	private String gjz    ;//关键字
	private String ms     ;//描述
	private String gsname ;//公司名字
	private String cp     ;//产品
	private String address;//地址
	private String zb     ;//资本
	private String clsj   ;//成立时间
	private String njsj   ;//年检时间
	private String nzzt   ;//年检状态
	private String bz     ;//备注
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
	public String getNzzt() {
		return nzzt;
	}
	public void setNzzt(String nzzt) {
		this.nzzt = nzzt;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "GS [id=" + id + ", gjz=" + gjz + ", ms=" + ms + ", gsname=" + gsname + ", cp=" + cp + ", address="
				+ address + ", zb=" + zb + ", clsj=" + clsj + ", njsj=" + njsj + ", nzzt=" + nzzt + ", bz=" + bz + "]";
	}
	

	
	
}
