package jpa.many_to_many.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class OgrenciKimlik implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 10, nullable = false, unique=true)
	private String seriNo;
	@Temporal(TemporalType.DATE)
	private Date verilisTarihi;
	
	@OneToOne(mappedBy="kimlik") // Ogrenci sınıfında 
	// OgrenciKimlik sınıfı için kullanılan isim yazılır.
	private Ogrenci ogrenci;
	
	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public OgrenciKimlik() {}

	public OgrenciKimlik(String seriNo, Date verilisTarihi) {
		super();
		this.seriNo = seriNo;
		this.verilisTarihi = verilisTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public Date getVerilisTarihi() {
		return verilisTarihi;
	}

	public void setVerilisTarihi(Date verilisTarihi) {
		this.verilisTarihi = verilisTarihi;
	}

	@Override
	public String toString() {
		return "OgrenciKimlik [id=" + id + ", seriNo=" + seriNo + ", verilisTarihi=" + verilisTarihi + "]";
	}

	
}
