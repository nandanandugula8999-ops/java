package exam;

import java.util.ArrayList;

public class order {
    static ArrayList<cartEntry> cart = new ArrayList<>();

    static void AddtoCart(farmproduce p,double quantity){
        if(quantity<=0){
            System.out.println("Invalid quantity");
            return;
        }
        if(quantity>p.availableKg()){
            System.out.println("Insufficient quantity");
            return;
        }
    
    for(cartEntry c:cart){
        if(c.produce.issameProduce(p)){
            if(c.quantity + quantity >p.availableKg){
                System.out.println("Insufficient quantity");
                return ;
            }
        c.increaseProduce(quantity);
        System.out.println("quantity increased");
        return;
        }
    }
    cart.add(new cartEntry(p,quantity));
    System.out.println("Produce added to the cart");
}
    static void Displaycart(){
        double totalQuantity=0;
        double totalsubTotal=0;
        double totalDiscount=0;
        double totalbill=0;
        System.out.println("\n customer order cart");
        for(cartEntry c : cart){
            System.out.println("Produce: "+c.produce.Name());
            System.out.println("Quantity: "+c.quantity+"kg");
            System.out.println("Subtotal: "+c.subtotal());
            System.out.println("Discount: "+c.discount());
            System.out.println("Final amount : "+c.finalamount());
            System.out.println("--------------------");

            totalQuantity+=c.quantity;
            totalsubTotal+=c.subtotal();
            totalDiscount+=c.discount();
            totalbill+=c.finalamount();
        }
        System.out.println("Total quantity: "+totalQuantity);
        System.out.println("Total subtotal: "+totalsubTotal);
        System.out.println("Total Discount: "+totalDiscount);
        System.out.println("Total Amount to be paid: "+totalbill);
    }
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

    static void searchproducebyId(farmproduce[] items,int id){
        for(farmproduce p : items){
            if(p.produceID==id){
                System.out.println("Produce is found.");
                p.DisplayDetails();
                return ;
            
            }
        }
        System.out.println("Produce not found");
    }
    static void searchbyName(farmproduce[] items,String name){
        for(farmproduce p : items){
            if(p.Name().equalsIgnoreCase(name)){
                System.out.println("Name is found.");
                p.DisplayDetails();
                return;
            }
            }
        
            System.out.println("Name is not found");
    }
    static void compareObject(farmproduce p1,farmproduce p2){
        if(p1.issameProduce(p2)){
            System.out.println("The producce is same.");
        }
        else{
            System.out.println("The produce is not same.");
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
        AddtoCart(items[0], 2);
        AddtoCart(items[1], 3);
        AddtoCart(items[3], 2);

        Displayinventory(items);
        Displayvalue(items);
        searchproducebyId(items, 702);
        searchbyName(items, "Mangoes");
        compareObject(items[0], items[1]);
        Displaycart();
    }
}
