package jpa.many_to_many.test;

import java.util.Date;
import javax.persistence.*;

import jpa.many_to_many.model.*;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager manager = factory.createEntityManager();
		
		@SuppressWarnings("deprecation")
		Ogrenci ogrenci = new Ogrenci("Ali","Veli",Cinsiyet.ERKEK, 
				new Date(100,02,01));
		
		Ders fizik = new Ders("Fizik","F100");
		Ders kimya = new Ders("Kimya","K200");
		
		ogrenci.getAldigiDersler().add(fizik);
		ogrenci.getAldigiDersler().add(kimya);
		
		OgrenciKimlik kimlik = new OgrenciKimlik("A123456789",
				new Date(122,01,01));
		
		ogrenci.setKimlik(kimlik);
		
		Adres adres = new Adres("123","456","XXX","YYY","ZZZ");
	
		//ogrenci.getAdresler().add(adres);
		// adresin de hangi öğrenciye ait olduğunu 
		// bildirmezsek adresler tablosunda ogrenciid null gelir. 
		//adres.setOgrenci(ogrenci);
		ogrenci.addAdres(adres);
		
		manager.getTransaction().begin();
		//manager.persist(adres);
		//manager.persist(kimlik);
		manager.persist(ogrenci);
		
		manager.getTransaction().commit();
		
		System.out.println(ogrenci);
		
	}
}
