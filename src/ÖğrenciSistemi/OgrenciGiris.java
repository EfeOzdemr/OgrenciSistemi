package ÖğrenciSistemi;
import java.io.*;
import java.util.*;

public class OgrenciGiris extends Kullanici implements Serializable {
	String aldigiDers[]=new String[5];
	int ders1[]=new int[2];
        int ders2[]=new int[2];
        int ders3[]=new int[2];
        int ders4[]=new int[2];
        int ders5[]=new int[2];
	double ort_ders1,ort_ders2,ort_ders3,ort_ders4,ort_ders5;
	long okulNo;
	public OgrenciGiris(String ad,String soyad,long okulNo){
	        super(ad,soyad);
                this.okulNo=okulNo;
		ders1[0]=-1;ders2[0]=-1;ders3[0]=-1;ders4[0]=-1;ders5[0]=-1;
		ders1[1]=-1;ders2[1]=-1;ders3[1]=-1;ders4[1]=-1;ders5[1]=-1;
		ort_ders1=-1;ort_ders2=-1;ort_ders3=-1;ort_ders4=-1;ort_ders5=-1;
	}
        public OgrenciGiris(){
		
	}
	public void ogrenciDersSec(){
                Scanner inp=new Scanner(System.in);
                System.out.println("5 ders seçmelisiniz.Seçeceğiniz derslerin kodunu giriniz");
		System.out.println("Dersler:\n 1.JAVA\n 2.BİLİŞİM HUKUKU\n 3.VLSI\n 4.ANDROİD\n 5.KRİPTOLOJİ\n 6.BULANIK MANTIK\n 7.YÖNEYLEM\n 8.CALCULUS\n 9.FORMAL DİLLER\n");
		
	        for(int i=0;i<5;i++){
			int ders=inp.nextInt();
			switch(ders){
			case 1:aldigiDers[i]="JAVA";
                        break;
			case 2:aldigiDers[i]="BİLİŞİM HUKUKU";
                        break;
			case 3:aldigiDers[i]="VLSI";
                        break;
			case 4:aldigiDers[i]="ANDROİD";
                        break;
			case 5:aldigiDers[i]="KRİPTOLOJİ";
                        break;
			case 6:aldigiDers[i]="BULANIK MANTIK";
                        break;
                        case 7:aldigiDers[i]="YÖNEYLEM";
                        break;
                        case 8:aldigiDers[i]="CALCULUS";
                        break;
                        case 9:aldigiDers[i]="FORMAL DİLLER";
                        break;    
			default:System.out.print("Yanlış sayı girdiniz");
                        break;
			}
		}
		System.out.println("Dersler Kaydedildi");
	}
}


