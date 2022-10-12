package ÖğrenciSistemi;
import java.io.*;

public class Yaz implements Serializable{
	public static void OgrenciYaz(OgrenciGiris ogr,int indis){
            
	        File bunayaz=new File("C://OgrenciBilgi.txt");
                FileOutputStream cikti=null;
		RandomAccessFile rando=null;
                ObjectOutputStream yazan = null;
		try{
			rando=new RandomAccessFile(bunayaz, "rw");
                        rando.seek(indis*363);
			cikti=new FileOutputStream(bunayaz);
                        yazan=new ObjectOutputStream(cikti);
			yazan.writeObject(ogr);
                        rando.close();
			}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi:" +e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void OgrenciYaz(OgrenciGiris ogr){
		File bunayaz=new File("C://OgrenciBilgi.txt");
		FileOutputStream cikti=null;
                ObjectOutputStream yazan = null;
		try{
			cikti=new FileOutputStream(bunayaz,true);
			yazan=new ObjectOutputStream(cikti);
                        yazan.writeObject(ogr);
			}
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi:" +e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void OgretmenYaz(OgretmenGiris ogr){
		File bunayaz=new File("C://OgretmenBilgi.txt");
		FileOutputStream cikti=null;
                ObjectOutputStream yazan = null;
		try{
		     cikti=new FileOutputStream(bunayaz,true);
                     yazan=new ObjectOutputStream(cikti);
		     yazan.writeObject(ogr);
	        }
		catch(FileNotFoundException e){
			System.out.print("Dosya bulunamadi:" +e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
