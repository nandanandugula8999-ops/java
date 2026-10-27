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
            new farmproduce(101,"ragi",80,6,"Ramesh"),
            new farmproduce(102,"jonnalu",70,5,"Me daddy"),
            new farmproduce(103,"wheat",60,7,"Anand"),
            new farmproduce(104, "drugs", 100, 20, "pablo"),
            new fruit(101,"mango",80,6,"Ramesh","alphonso",'A'),
            new spice(102,"jonnalu",70,5,"Me daddy","karam","hyd"),
            new grain(103,"wheat",60,5,"Anand","classic",true),
            new vegetable(104,"drugs",100,5,"Pablo","summer",false)
        };
        Displayinventory(items);
        Displayvalue(items);

    }
}
