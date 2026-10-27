package exam;
public class order {
    static void Displayinventory(farmproduce[] items){
        for(farmproduce p : items){
            p.DisplayDetails();
        }
    }
    static void Displayvalue(farmproduce[] items){
        double total =0;
        for(farmproduce p : items){
            total+=p.stockvalue();
            System.out.println("The total inventory value is :"+total);
        }
    }
    public static void main(String[] args){
        farmproduce [] items= {
            new farmproduce(101,"ragi",80,6,"Sairam"),
            new farmproduce(102,"jonnalu",70,5,"Me daddy"),
            new farmproduce(103,"wheat",60,7,"Anand"),
        };
        Displayinventory(items);
        Displayvalue(items);

    }
}
