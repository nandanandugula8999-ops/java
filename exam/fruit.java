package exam;

public class fruit extends farmproduce {
    String fruitvariety;
    char grade;

    fruit(int id,String name,double price,double stock,
        String farmer,String fruitvariety,char grade){
            super(id, name, price, grade, farmer);
            this.fruitvariety=fruitvariety;
            this.grade=grade;
        }
    double Discount(){
        return 0.08;
    }
    public double paybleAmount(double quantity){
        return pricePer() * quantity * 0.92;
    }
}
