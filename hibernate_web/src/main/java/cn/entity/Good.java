package cn.entity;

import org.hibernate.annotations.Entity;

@Entity
public class Good {
	private int mid;
	private String namee;
	private String authore;
	private int typee;
	public int getMid() {
		return mid;
	}
	@Override
	public String toString() {
		return "Good [mid=" + mid + ", namee=" + namee + ", authore=" + authore + ", typee=" + typee + "]";
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public String getAuthore() {
		return authore;
	}
	public void setAuthore(String authore) {
		this.authore = authore;
	}
	public int getTypee() {
		return typee;
	}
	public void setTypee(int typee) {
		this.typee = typee;
	}
}
