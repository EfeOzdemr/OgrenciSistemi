package ÖğrenciSistemi;
import java.util.*;

public class Notlar{
    public void notlarGoruntule(OgrenciGiris ogr){
        
	       //ders1----------------------
        
		if(ogr.ders1[0]!=-1 && ogr.ders1[1]!=-1){
			System.out.print(ogr.aldigiDers[0]+ " vize : "+ogr.ders1[0] + " final: "+ ogr.ders1[1]+ " Ortalama: "+ogr.ort_ders1);
                        
			if((ogr.ort_ders1>=35) && (ogr.ders1[1]>=50)){
				System.out.println(" Gecildi ");
			}
			else{
				System.out.println(" Kalındı ");
			}
		}
                else if(ogr.ders1[0]!=-1){
			System.out.println(ogr.aldigiDers[0]+" vize : "+ogr.ders1[0]);
                        if(ogr.ders1[1]!=-1){
                        System.out.println(ogr.aldigiDers[0]+" final : "+ogr.ders1[1]);
                    }
                else{
                       System.out.println("Final Okunmadı"); 
                    }
		}
		else{
			System.out.println(" Vize Okunmadı");
		}
                
		//ders2----------------------
                
		if(ogr.ders2[0]!=-1 && ogr.ders2[1]!=-1){
			System.out.print(ogr.aldigiDers[0]+ " vize : "+ogr.ders2[0] + " final: "+ ogr.ders2[1]+ " Ortalama: "+ogr.ort_ders2);
                        
			if((ogr.ort_ders2>=35) && (ogr.ders2[1]>=50)){
				System.out.println(" Gecildi");
			}
			else{
				System.out.println("  Kalındı ");
			}
		}
		else if(ogr.ders2[0]!=-1){
			System.out.println(ogr.aldigiDers[1]+" vize : "+ogr.ders2[0]);
                         if(ogr.ders2[1]!=-1){
                        System.out.println(ogr.aldigiDers[1]+" final : "+ogr.ders2[1]);
                  }
                else{
                       System.out.println("Final Okunmadı"); 
                   }
                       
		}
		else{
			System.out.println("Vize Okunmadı");
		}
               
		//ders3---------------------
                
		if(ogr.ders3[0]!=-1 && ogr.ders3[1]!=-1){
			System.out.print(ogr.aldigiDers[0]+ " vize : "+ogr.ders3[0] + " final: "+ ogr.ders3[1]+ " Ortalama: "+ogr.ort_ders3);
                        
			if((ogr.ort_ders3>=35) && (ogr.ders3[1]>=50)){
				System.out.println(" Gecildi ");
			}
			else{
				System.out.println("  Kalındı ");
			}
		}
		else if(ogr.ders3[0]!=-1){
			System.out.println(ogr.aldigiDers[2]+" vize : "+ogr.ders3[0]);
                        if(ogr.ders3[1]!=-1){
                        System.out.println(ogr.aldigiDers[2]+" final : "+ogr.ders3[1]);
                  }
                else{
                       System.out.println("Final Okunmadı"); 
                   }
		}
		else{
			System.out.println("Vize Okunmadı");
		}
              
		//ders4---------------------
                
		if(ogr.ders4[0]!=-1 && ogr.ders4[1]!=-1){
			System.out.print(ogr.aldigiDers[0]+ " vize : "+ogr.ders4[0] + " final: "+ ogr.ders4[1]+ " Ortalama: "+ogr.ort_ders4);
                        
			if((ogr.ort_ders4>=35) && (ogr.ders4[1]>=50)){
				System.out.println(" Gecildi ");
			}
			else{
				System.out.println(" Kalındı ");
			}
		}
		else if(ogr.ders4[0]!=-1){
			System.out.println(ogr.aldigiDers[3]+" vize : "+ogr.ders4[0]);
                        if(ogr.ders4[1]!=-1){
                        System.out.println(ogr.aldigiDers[3]+" final : "+ogr.ders4[1]);
                  }
                else{
                       System.out.println("Final Okunmadı"); 
                   }
		}
		else{
			System.out.println("Vize Okunmadı");
		}
                
               //ders5---------------------
                
                if(ogr.ders5[0]!=-1 && ogr.ders5[1]!=-1){
			System.out.print(ogr.aldigiDers[0]+ " vize : "+ogr.ders5[0] + " final: "+ ogr.ders5[1]+ " Ortalama: "+ogr.ort_ders5);
                        
			if((ogr.ort_ders5>=35) && (ogr.ders5[1]>=50)){
				System.out.println(" Gecildi ");
			}
			else{
				System.out.println(" Kalındı ");
			}
		}
                else if(ogr.ders5[0]!=-1){
			System.out.println(ogr.aldigiDers[0]+" vize : "+ogr.ders5[0]);
                         if(ogr.ders5[1]!=-1){
                        System.out.println(ogr.aldigiDers[0]+" final : "+ogr.ders5[1]);
                  }
                else{
                       System.out.println("Final Okunmadı"); 
                   }
		}
		else{
			System.out.println(" Vize Okunmadı");
		}
                
	}
	public void GuncelleVize(OgrenciGiris ogr){
		Scanner inp=new Scanner(System.in);
                System.out.print("Güncellencek dersin kodunu giriniz:");
		System.out.print("1."+ogr.aldigiDers[0]+"\n"+
                                 "2."+ogr.aldigiDers[1]+"\n"+
                                 "3."+ogr.aldigiDers[2]+"\n"+
                                 "4."+ogr.aldigiDers[3]+"\n"+
                                 "5."+ogr.aldigiDers[4]);
		int secim=inp.nextInt();
		System.out.print("Dersin Vize Notunu Giriniz: ");
		switch(secim){
			case 1:ogr.ders1[0]=inp.nextInt();
                           break;
			case 2:ogr.ders2[0]=inp.nextInt();
                            break;
			case 3:ogr.ders3[0]=inp.nextInt();
                            break;
			case 4:ogr.ders4[0]=inp.nextInt();
                             break;
                        case 5:ogr.ders5[0]=inp.nextInt();
                             break;
                }
		System.out.println("Tamamdır");
	}
	public void GuncelleFinal(OgrenciGiris ogr){
		Scanner inp=new Scanner(System.in);
                System.out.println("Güncellencek Dersin Kodunu Giriniz :");
		System.out.println("1."+ogr.aldigiDers[0]+"\n"+
                                   "2."+ogr.aldigiDers[1]+"\n"+
                                   "3."+ogr.aldigiDers[2]+"\n"+
                                   "4."+ogr.aldigiDers[3]+"\n"+
                                   "5."+ogr.aldigiDers[4]);
		
		int secim=inp.nextInt();
		System.out.print("Dersin Final Notunu Giriniz : ");
		switch(secim){
			case 1:ogr.ders1[1]=inp.nextInt();
                           break;
			case 2:ogr.ders2[1]=inp.nextInt();
                           break;
			case 3:ogr.ders3[1]=inp.nextInt();
                           break;
			case 4:ogr.ders4[1]=inp.nextInt();
                           break;
                        case 5:ogr.ders5[1]=inp.nextInt();
                           break;
		}
		System.out.println("İşlem Başarılı.");
	}
        public static void notOrtalama(OgrenciGiris ogr){
		ogr.ort_ders1=(ogr.ders1[0]+ogr.ders1[1])/2;
		ogr.ort_ders2=(ogr.ders2[0]+ogr.ders2[1])/2;
		ogr.ort_ders3=(ogr.ders3[0]+ogr.ders3[1])/2;
		ogr.ort_ders4=(ogr.ders4[0]+ogr.ders4[1])/2;
                ogr.ort_ders5=(ogr.ders5[0]+ogr.ders5[1])/2;
	}
     
}



