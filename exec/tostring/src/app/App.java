package app;

public class App {
    public static void main(String[] args) throws Exception {
        potpie myPotpie = new potpie(2, 4, 6);
        tuna myTuna = new tuna("allen", myPotpie);

        System.out.println(myTuna);
    }
}