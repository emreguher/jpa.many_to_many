package jpa.many_to_many.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Ders implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=15, nullable = false, unique=true)
	private String ad;
	@Column(length=5, nullable = false, unique=true)
	private String kod;
	@ManyToMany(mappedBy="aldigiDersler")
	private List<Ogrenci> dersinOgrencileri = 
	new ArrayList<>();
	
	public List<Ogrenci> getDersinOgrencileri() {
		return dersinOgrencileri;
	}

	public void setDersinOgrencileri(List<Ogrenci> dersinOgrencileri) {
		this.dersinOgrencileri = dersinOgrencileri;
	}

	public Ders() {}

	public Ders(String ad, String kod) {
		this.ad = ad;
		this.kod = kod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}
	
	

}
