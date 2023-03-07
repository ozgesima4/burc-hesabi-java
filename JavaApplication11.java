package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String burc;
        int gün,ay;
        
        System.out.println("dogdugunuz ayı rakamla girin: ");
        ay=input.nextInt();
        
        System.out.println("dogdugunuz gun:");
        gün=input.nextInt();
        
        if(ay==12 ){
            if(gün>=1 && gün <=21){
                burc="yay";
            }
            else{
                burc="oğlak";
        }
            if(ay==1){
                if(gün>=1 && gün <=21){
                    burc="oğlak";
                }
                else{
                    burc="kova";
                }
            }
            if(ay==2){
                 if(gün>=1 && gün <=19){
                    burc="kova";
                }
                 else{
                     burc="balık";
                 }
            }
            if(ay==3){
                 if(gün>=1 && gün <=20){
                    burc="balık";
                }
                 else{
                     burc="koç";
                 }
            }
            if(ay==4){
                 if(gün>=1 && gün <=20){
                    burc="koç";
                }
                 else{
                     burc="boğa";
                 }
            }
            if(ay==5){
                 if(gün>=1 && gün <=21){
                    burc="boğa";
                }
                 else{
                     burc="ikizler";
                 }
            }
            if(ay==6){
                 if(gün>=1 && gün <=22){
                    burc="ikizler";
                }
                 else{
                     burc="yengeç";
                 }
            }
            if(ay==7){
                 if(gün>=1 && gün <=22){
                    burc="yengeç";
                }
                 else{
                     burc="aslan";
                 }
            }
            if(ay==8){
                 if(gün>=1 && gün <=22){
                    burc="aslan";
                }
                 else{
                     burc="başak";
                 }
            }
            if(ay==9){
                 if(gün>=1 && gün <=19){
                    burc="başak";
                }
                 else{
                     burc="terazi";
                 }
            }
            if(ay==10){
                 if(gün>=1 && gün <=22){
                    burc="terazi";
                }
                 else{
                     burc="akrep";
                 }
            }
            if(ay==11){
                 if(gün>=1 && gün <=21){
                    burc="akrep";
                }
                 else{
                     burc="yay";
                 }
            }
            System.out.println("burcunuz:"+burc);
    }
        
    }
    
}
