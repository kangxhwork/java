package app;

public class tuna{
    private String name;
    private potpie birthday;

    public tuna(String n, potpie b){
        name = n;
        birthday = b;
    }

    public String toString(){

        return String.format("My name is %s and my birthday is %s", name, birthday);
    }

}