package exam;
public class order {
    static void Displayinventory(farmproduce[] items){
        for(farmproduce p : items){
            p.DisplayDetails();
        }
    }
    static void TotalTypes(farmproduce[] items){
        System.out.println("Total types are : "+items.length);
    }
    static void Totalstock(farmproduce[] items){
        double stock =0;
        for(farmproduce p:items){
            stock+=p.availableKg();
        }
        System.out.println("Available Stock is : "+stock+"Kg");
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
            new farmproduce(701,"Organic rice",60,100,"Ramesh"),
            new farmproduce(702,"Fresh tomatoes",40,80,"Me daddy"),
            new farmproduce(703,"Alphonso Mangoes",120,50,"Anand"),
            new farmproduce(704, "Turmeric powder", 200, 30, "pablo"),
            new fruit(701,"Organic rice",60,100,"Ramesh","alphonso",'A'),
            new spice(702,"Fresh tomatoes",40,80,"Me daddy","karam","hyd"),
            new grain(703,"Alphonso Mangoes",120,50,"Anand","classic",true),
            new vegetable(704, "Turmeric powder", 200, 30, "pablo","summer",false)
        };
        Displayinventory(items);
        Displayvalue(items);

    }
}
