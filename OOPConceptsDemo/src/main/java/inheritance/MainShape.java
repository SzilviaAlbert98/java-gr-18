package inheritance;

import java.util.Arrays;

public class MainShape {
    public static void main(String[] args) {
        Cerc cerc = new Cerc();
        cerc.setColor("verde");
        System.out.println("Culoare cerc: " + cerc.getColor());
        cerc.draw();
        cerc.erase();
        cerc.move();

        Triunghi triunghi = new Triunghi();
         triunghi.setColor("mov");
         triunghi.draw();
         triunghi.erase();
         triunghi.flipHorizontal();
         triunghi.flipVertical();

         //polimorfism
        Shape cerc1 = new Cerc();
        /*Shape triunghi1 = new Triunghi();
        ((Triunghi) triunghi1).flipVertical();

        Triunghi t1 = new Triunghi();
        t1.setColor("verde");
        Cerc c1 = new Cerc();
        c1.setColor("roz");
        Patrat p1 = new Patrat();
        p1.setColor("albastru");

        Shape[] listaForme = new Shape[3];
        listaForme[0] = t1;
        listaForme[1] = c1;
        listaForme[2] = p1;

        for (Shape forma: listaForme) {
            System.out.println(forma.getColor());

            if (forma instanceof Triunghi){
                ((Triunghi) forma).flipVertical();
            }*/

        //felepitunk egy arrayt
        //v1
        Shape[] listaFormeBasic = new Shape[2];
        listaFormeBasic[0] = cerc;
        listaFormeBasic[1] = triunghi;


        //v2
        Shape[] listaForme = new Shape[1];
        listaForme = add(triunghi, listaForme);
        Shape [] newLista = add(cerc, listaForme);
        Shape [] newLista2 = add(cerc, newLista);

       for (Shape shape : listaForme) {
           if (shape != null) {
               System.out.println(shape.getColor());
           }
       }

    }


    public static Shape[] add(Shape shapeToAdd, Shape[] arraytToAddShape) {
        Shape[] newArray = Arrays.copyOf(arraytToAddShape,arraytToAddShape.length+1);
        newArray[arraytToAddShape.length] = shapeToAdd;

        return newArray;
    }
}
