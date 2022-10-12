package ÖğrenciSistemi;
import java.util.*;
import java.io.*;

public class MainCode{
    public static void main(String[] args){
            Scanner input=new Scanner(System.in);
	    try{
		File f=new File("C//Kayitlar.txt");
		int secenek= 0,ogrencisayi= 0,ogretmensayi = 0;
                boolean ogrenci=false; 
                boolean ogretmen=false;
		if(f.exists()){
			FileInputStream fis = new FileInputStream(f);
                        DataInputStream dis = new DataInputStream(fis);
			ogrencisayi = dis.readInt();
                        ogretmensayi = dis.readInt();
			fis.close();
                        dis.close();
			}
			do{
                            System.out.println("Öğrenci sistemine Hoşgeldiniz.Sectiginiz secenegin kodunu giriniz:");
                            System.out.println(" 1.Yönetici girisi\n 2.Öğretmen girisi\n 3.Öğrenci girisi\n 4.Çıkış");
                            secenek=input.nextInt();
			     if(secenek==1){
				YoneticiGirisi(ogrencisayi,ogretmensayi);
					if(ogrenci){
						ogrenci=false;
                                                ogrencisayi++;
					}if(ogretmen){
						ogretmen=false;
                                                ogretmensayi++;
					}
				}else if(secenek==2){
                                        ogretmenGirisi(ogrencisayi);
				}else if(secenek==3){
					ogrenciGirisi(ogrencisayi);
				}else if(secenek==4){
                                input.close();
				FileOutputStream fis1 = new FileOutputStream(f);DataOutputStream dis1 = new DataOutputStream(fis1);
				dis1.writeInt(ogrencisayi);dis1.writeInt(ogretmensayi);
				fis1.close();dis1.close();
				System.exit(0);
				}else{
					System.out.println("Yanlış sayı girildi");
				}
			}while(true);
		}catch(NoSuchElementException e){
		     e.printStackTrace();
		}catch (FileNotFoundException e) {
		     e.printStackTrace();
		}catch (IOException e){
	            e.printStackTrace();
		}
	}
    public static void YoneticiGirisi(int ogrencisayi,int ogretmensayi){
                Scanner input=new Scanner(System.in);
                boolean ogrenci=false;
                boolean ogretmen=false;
                System.out.println("seciminizi yapiniz");
		System.out.println("1.Öğrenci ekle\n2.Öğretmen ekle");
                int sec=input.nextInt();
		if(sec==1){
                   System.out.print("Öğrenci adi :");
                   String ad=input.next();
		   System.out.print("Öğrenci soyadi :");
                   String soyad=input.next();
		   System.out.print("Okul nosu :");
                   long no=input.nextLong();
		   OgrenciGiris ogr=new OgrenciGiris(ad,soyad,no);
		   Indeks i=new Indeks();
		   i.ogrenciindeks(no,ogrencisayi);
		   ogrenci=true;
                   Yaz.OgrenciYaz(ogr);
		}
		else if(sec==2){
			System.out.print("Öğretmen adi :");
                        String ad=input.next();
			System.out.print("Öğretmen soyadi :");
                        String soyad=input.next();
			System.out.print("Verecegi ders :");
                        String ders=input.next();
			OgretmenGiris ogr=new OgretmenGiris(ad,soyad,ders);
			Indeks i=new Indeks();
			i.ogretmenindeks(ad,ogretmensayi);
                        ogretmen=true;
			Yaz.OgretmenYaz(ogr);
		}
	}
    public static void ogrenciGirisi(int sayi){
                Scanner input=new Scanner(System.in);
		System.out.println("1.Öğretmen listesi\n 2.Ders Seç\n 3.Notları Görüntüle:");
		System.out.println("İstediğiniz seçeneğin kodunu girin:");
		int secim=input.nextInt();
		System.out.print("okul numaranız: ");
		long no=input.nextLong();
		if(secim==1){
			OgrenciGiris og=null;
			og=Oku.OgrenciOku();
		}
		else if(secim==2){
                        OgrenciGiris ogr=null;
                        Indeks i=new Indeks();
			int index=i.ogrenciindeksgoster(no,sayi);
			if(index==-1){
				System.out.println("Öğrenci no yanlış");
				return;
			}
			ogr=Oku.OgrenciOku(index);ogr.ogrenciDersSec();
			Yaz.OgrenciYaz(ogr,index);
                }else if(secim==3){
			OgrenciGiris ogr=null;
                        Indeks i=new Indeks();
			int index=i.ogrenciindeksgoster(no,sayi);
			if(index==-1){
				System.out.println("Öğrenci no yanlışl");
				return;
			}
			ogr=Oku.OgrenciOku(index);Notlar d= new Notlar();
			Notlar.notOrtalama(ogr);d.notlarGoruntule(ogr);
		}

	}
    public static void ogretmenGirisi(int sayi){
                Scanner input=new Scanner(System.in);
                System.out.println("1.Final notu gir\n 2.vize notu gir");
		System.out.println("seciminizi yapiniz");
		int sec = 0;
		if(input.hasNextInt())sec=input.nextInt();
		System.out.print("öğrenci numarasini giriniz : ");
		long no;no=input.nextLong();
		if(sec==1){
			OgrenciGiris ogr=null;
			Indeks i2=new Indeks();
			int indis=i2.ogrenciindeksgoster(no, sayi);
			if(indis==-1){
				System.out.println("Öğrenci Numarası yanlış");
				return;
			}
			ogr=Oku.OgrenciOku(indis);Notlar d= new Notlar();
			Notlar.notOrtalama(ogr);d.notlarGoruntule(ogr);
			d.GuncelleFinal(ogr);Yaz.OgrenciYaz(ogr,indis);
		}
		else if(sec==2){
                        OgrenciGiris ogr=null;
			Indeks i2=new Indeks();
			int indis=i2.ogrenciindeksgoster(no, sayi);
			if(indis==-1){
				System.out.println("Öğrenci Numarası yanlış");
				return;
			}
			ogr=Oku.OgrenciOku(indis);Notlar d= new Notlar();
			Notlar.notOrtalama(ogr);d.notlarGoruntule(ogr);
			d.GuncelleVize(ogr);Yaz.OgrenciYaz(ogr,indis);
                        
		}
		
	}
}


