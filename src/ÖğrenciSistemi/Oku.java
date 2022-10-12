package ÖğrenciSistemi;

import java.io.*;

public class Oku{
       public static OgrenciGiris OgrenciOku(int indis){
           File bunayaz=new File("C://OgrenciBilgi.txt");
           RandomAccessFile rand = null;
           FileInputStream cikti=null;
           ObjectInputStream yazan = null;
           OgrenciGiris ogr=null;
	       try{
		        cikti=new FileInputStream(bunayaz);
                        yazan=new ObjectInputStream(cikti);
			ogr=(OgrenciGiris)yazan.readObject();
                        rand=new RandomAccessFile(bunayaz, "r");
                        rand.seek(indis*363);
	        }
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi:" +e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
	                e.printStackTrace();
		}
		return ogr;
	}
	public static OgrenciGiris OgrenciOku(){
		File bunayaz=new File("C://OgrenciBilgi.txt");
		FileInputStream cikti=null;
                ObjectInputStream yazan = null;
		OgrenciGiris ogr=null;
		try{
                       cikti=new FileInputStream(bunayaz);
                       yazan=new ObjectInputStream(cikti);
		       ogr=(OgrenciGiris)yazan.readObject();
		       return ogr;
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya Bulanamadi:" +e.getMessage());
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return ogr;
	}
	public static OgretmenGiris OgretmenOku(){
		File bunayaz=new File("C://OgretmenBilgi.txt");
		FileInputStream cikti=null;
                ObjectInputStream yazan = null;
		OgretmenGiris ogr=null;
		try{
			cikti=new FileInputStream(bunayaz);
                        yazan=new ObjectInputStream(cikti);
			ogr=(OgretmenGiris)yazan.readObject();
			return ogr;
		}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi:" +e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	   return ogr;	
	}
}

