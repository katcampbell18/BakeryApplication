public class BakedGood {
    private String name;
    private double price;
    private String date;
    private boolean isNoGluten;
    private boolean isNoDairy;
    private boolean isNoEgg;
    private boolean isNotTreenut;
    private boolean isNoSoy;
    private boolean isNoSesame;
    private int quantity;

     public BakedGood(String name, double price, String date, boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, int quantity){
        this.name = name;
        this.price = price;
        this.date = date;
        this.isNoGluten = b;
        this.isNoDairy = b1;
        this.isNoEgg = b2;
        this.isNotTreenut = b3;
        this.isNoSoy = b4;
        this.isNoSesame = b5;
        this.quantity = quantity;
    }
}

