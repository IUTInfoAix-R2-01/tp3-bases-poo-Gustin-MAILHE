package Bibliotheque;

public class TestLivre {

    public static void main(String[] args) {
        Livre l1 = new Livre();
        System.out.println("Le livre s'appelle " 
        + l1.getName() + ", il coute " + l1.getPrice() + ", et il y a " +
                l1.getQuantity() + " exemplaire");
          //Ceci est un commentaire
        System.out.println(l1.toString());
    }

}