package exam;

public class fruit extends farmproduce {
    String fruitvariety;
    char grade;

    fruit(int id,String name,double price,double stock,
        String farmer,String fruitvariety,char grade){
            super(id, name, price, stock, farmer);
            this.fruitvariety=fruitvariety;
            this.grade=grade;
        }
    @Override 
    public double Discount(){
        return 0.08;
    }
    public double paybleAmount(double quantity){
        return pricePer() * quantity * 0.92;
    }
    @Override
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Fruit :"+fruitvariety);
        System.out.println("Grade: "+grade);
    }
}
