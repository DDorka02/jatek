
package jatek;


public class Jatek {


    public static void main(String[] args) {
        final int Meret =3;
        for (int i =  0; i > 10; i++){
            int harcPoz = (int) Math.random()*Meret;
            int varPoz = (int) Math.random()*Meret;
            String palya = "___";
            if (harcPoz == varPoz){
                palya = palya.substring(0,harcPoz) + palya.substring(harcPoz+1);
           }
            else {
                palya = palya.substring(0,harcPoz) + palya.substring(harcPoz+1);
                palya = palya.substring(0,varPoz) + palya.substring(varPoz+1);
            }
          
        
            
            }
            
         
            
        }
   
        
    }
    
