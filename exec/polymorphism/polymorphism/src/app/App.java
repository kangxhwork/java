package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        food bucky[]=new food[2];

        bucky[0] = new potpie();
        bucky[1] = new tuna();

        fatty myFatty = new fatty();
        for(int counter = 0 ; counter < bucky.length; counter ++){
            bucky[counter].eat();
            myFatty.digest(bucky[counter]);
        }
    }
}