import java.util.ArrayList;
import java.util.List;

public class BakeryDatabase {
    private BakedGood bakedGood;
    private List<BakedGood> bakedGoods;

    public BakeryDatabase(){
        bakedGoods = new ArrayList<>();
        bakedGoods.add(new BakedGood("Banana Bread", 5.95, "Dec 31 2019",false, true, false, true, false, true, 29));
        bakedGoods.add(new BakedGood("Chocolate Chip Cookie", 2.85, "Oct 03 2019", false, true, false, false, true, true, 345));
        bakedGoods.add(new BakedGood("Vegan Cookie Dough Truffles", 2.50, "Oct 31 2019",false, true, false, true, false, false, 60));
        bakedGoods.add(new BakedGood("Remedy Cookie Brownie Bar", 4.95, "Sept 30 2019",false, true, false, false, true, false, 145));
        bakedGoods.add(new BakedGood("Caramel Crunch Torte", 5.90, "Sept 28 2019",false, true, false, true,false, true, 30));
        bakedGoods.add(new BakedGood("Cocoa Mousse Cake", 6.85, "Sept 27 2019",false, true, false, false, true, true, 8));
        bakedGoods.add(new BakedGood("Chocolate Mint Chunk Cookie", 4.25, "Sept 30 2019",false, true, true, true, false, false, 120));
        bakedGoods.add(new BakedGood("Cowboy Cookie", 3.50, "Oct 05 2019",true, false, true, false, true, false, 45));
        bakedGoods.add(new BakedGood("Waffle Mix", 8.50, "Dec 15 2019",true, false, true, true, false, true, 30));
        bakedGoods.add(new BakedGood("Spring Easy Cakes (Dozen)", 44.00, "Nov 18 2019",true, false, true, false, true, true, 15));
        bakedGoods.add(new BakedGood("Cinnamon Easy Cake", 3.99, "Oct 06 2019",true, false, true, true, false, false, 35));
        bakedGoods.add(new BakedGood("Double Chocolate Cupcakes (6)", 24.95, "Dec 31 2019",true, false, true, false, true, false, 75));
        bakedGoods.add(new BakedGood("Gluten Free Dinner Rolls", 3.00, "Oct 12 2019",true, false, true, true, false, true, 48));
        bakedGoods.add(new BakedGood("Blue Citrus Bar", 4.50, "Sept 26 2019",true, false, true, false, true, true, 24));
        bakedGoods.add(new BakedGood("Muffins (6-pack)", 16.50, "Oct 22 2019",true, false, true, true, false, false, 15));
    }

    public BakedGood getDietList(){
        String item;
        String ans;
        for(BakedGood item : bakedGoods){
            if("Gluten".equalsIgnoreCase(item.getisNoGluten()) {
                return BakedGood;
            }else if("Dairy".equalsIgnoreCase(item.getisNoDairy()){
                return item;
            }else if("Egg".equalsIgnoreCase(item.getisNoEgg()){
                return item;
            }
        }

    public List<BakedGood> getAllBakedGoods(){
        return BakedGood;
    }
    public void setBakedGoods(List<BakedGood> bakedGoods){
        this.bakedGoods = bakedGoods;
    }
        @Override
        public String toString(){
            return ;
        }
}
