package jpa.many_to_many.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Adres implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String mah;
	private String cad;
	private String sokak;
	private String ilce;
	private String il;
	
	@ManyToOne
	private Ogrenci ogrenci;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public Adres() {
		// TODO Auto-generated constructor stub
	}

	public Adres(String mah, String cad, String sokak, String ilce, String il) {
		this.mah = mah;
		this.cad = cad;
		this.sokak = sokak;
		this.ilce = ilce;
		this.il = il;
	}

	public String getMah() {
		return mah;
	}

	public void setMah(String mah) {
		this.mah = mah;
	}

	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}
	

}
