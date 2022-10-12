package ÖğrenciSistemi;

import java.io.*;
public class OgretmenGiris extends Kullanici implements Serializable{
	String verdigiDers;
	public OgretmenGiris(String ad,String soyad,String verdigiDers){
		super(ad,soyad);
		this.verdigiDers=verdigiDers;
	}
        public OgretmenGiris(){
            
        }
} 

