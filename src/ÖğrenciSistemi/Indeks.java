package ÖğrenciSistemi;
import java.io.*;

public class Indeks implements Serializable{
	int  indeks;
        String ad;
        long no;
	public void ogretmenindeks(String ad,int sayi){
		File f=new File("C://indexOgretmen.txt");
		try {
			FileOutputStream out=new FileOutputStream(f,true);
			ObjectOutputStream obj=new ObjectOutputStream(out);
			Indeks i=new Indeks();
			i.indeks=sayi;
                        i.ad=ad;
			obj.writeObject(i);
			obj.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
        public void ogrenciindeks(long no, int sayi){
		File f=new File("C://indexOgrenci.txt");
		try {
			FileOutputStream out=new FileOutputStream(f,true);
                        ObjectOutputStream obj=new ObjectOutputStream(out);
			Indeks i=new Indeks();
			i.indeks=sayi;
                        i.no=no;
                        obj.writeObject(i);
                        obj.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
        }
	public int ogrenciindeksgoster(long no,int sayi){
		File f=new File("C://indexOgrenci.txt");
		try {
		     FileInputStream out=new FileInputStream(f);
		     ObjectInputStream obj=new ObjectInputStream(out);
		     Indeks i;
                     for(int inds=0;inds<sayi;inds++){
			i=(Indeks)obj.readObject();
			if(i.no==no){
			return i.indeks;
                            }
			}
			obj.close();
	            }catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	public int ogretmenindeksgoster(String ad,int sayi){
		File f=new File("C//:indexOgretmen.txt");
		try {
			FileInputStream out=new FileInputStream(f);
			ObjectInputStream obj=new ObjectInputStream(out);
			Indeks i=new Indeks();
			for(int inds=0;inds<sayi;inds++){
			    i=(Indeks)obj.readObject();
			    if(i.ad==ad){
			    return i.indeks;
			    }
			}
			obj.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
		
}


