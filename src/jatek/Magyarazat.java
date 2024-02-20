
package jatek;

public class Magyarazat {

    public static void main(String[] args) {
        String eredeti = "abc.12x";
        int hossz = eredeti.length();
        System.out.println("első: "+ eredeti.charAt(0));
        System.out.println("első: "+ eredeti.charAt(hossz-1));
        eredeti = eredeti.substring(1);
        System.out.println(eredeti);
        
        
        String uj = eredeti.substring(4);
        uj= eredeti.substring(0);
        uj= eredeti.substring(1);
        uj= eredeti.substring(4);
        System.out.println(uj);
        
        uj = eredeti.substring(0,3);
        System.out.println(uj);
        uj = eredeti.substring(4,6);
        System.out.println(uj);
        
        uj = eredeti.substring(3);
        System.out.println(uj);
        
        uj = eredeti.substring(3);
        uj = eredeti.substring(eredeti.indexOf("."));
        System.out.println(uj);
        
        int k = eredeti.indexOf(".");
        int v = eredeti.length();
        uj = eredeti.substring(k, v);
        int szam = Integer.parseInt(uj);
        System.out.println(szam+2);
        
        boolean abcKezdes = eredeti.startsWith("abc");
        boolean vege2x = eredeti.endsWith("2x");
        boolean vanBennePont = eredeti.contains(".");
        uj = eredeti.replaceAll("12x", "hu");
        System.out.println("abc-vel kezdődik: " + abcKezdes);
        System.out.println("abc-vel végződik: " + vege2x);
        System.out.println("abc-vel pont: " + vanBennePont);
        System.out.println(""+uj);
        
        
        
    }
    
}
