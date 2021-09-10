
package kincseslada;

public class Ladak {
    String[] valaszok={"Arany", "Ezüst", "Bronz"};
    String[] ladak={"1. Arany-'Bennem van a kincs'","2. Ezüst-'Nincsen bennem kincs'", "3. Bronz-'Az arany ládában van a kincs'"};
    
     Jatekos jatekos=new Jatekos();
     
     int helyesValasz=2;
    
    public void indit(){
       
        System.out.println("Találd ki melyik ládában van a kincs!");
        for (String lehetosegek : ladak) {
            System.out.println(lehetosegek);
            
        }
        jatekos.jatekosTippel();
        kitalal();
        
        
    }
    
    public void kitalal(){
     if (jatekos.tipp == helyesValasz){
         System.out.println("Nyertél: a helyes válasz a(z) "+valaszok[1]+" volt");
         
     }
        
      
        
    }
    
}
