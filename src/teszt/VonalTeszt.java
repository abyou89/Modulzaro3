
package teszt;

import main.Vonal;

public class VonalTeszt {
     public static void main(String[] args) throws Exception {
        tesztEsetek();

    }

    private static void tesztEsetek() throws Exception {

        eltolasTeszt();
        szinTeszt();
        stilusTeszt();
        
    }

    private static void eltolasTeszt() throws Exception {
        System.out.println("---Eltolas teszt: ");
        int eltolas = 3;
        Vonal obj = new Vonal(eltolas);
        System.out.println(obj.info());
        int kapott = obj.getEltolas();
        int vart = eltolas;
        String hiba = "hibas eredmeny: %d\n".formatted(vart);
        assert kapott == vart : hiba;

    }

    private static void szinTeszt() throws Exception {
        System.out.println("---Szin teszt: ");
        Vonal.Szinek szin = Vonal.Szinek.KEK;
        Vonal obj = new Vonal(szin, Vonal.Stilusok.DUPLA);
        System.out.println(obj.info());
        Vonal.Szinek kapott = obj.getSzin();
        Vonal.Szinek vart = szin;
        String hiba = "hibas eredmeny: %s\n".formatted(vart);
        assert kapott == vart : hiba;

    }

    private static void stilusTeszt() throws Exception {
        System.out.println("---Stilus teszt: ");
        Vonal.Stilusok stilus = Vonal.Stilusok.DUPLA;
        Vonal obj = new Vonal(Vonal.Szinek.KEK, stilus);
        System.out.println(obj.info());
        Vonal.Stilusok kapott = obj.getStilus();
        Vonal.Stilusok vart = stilus;
        String hiba = "hibas eredmeny: %s\n".formatted(vart);
        assert kapott == vart : hiba;
        
    }
    
}
