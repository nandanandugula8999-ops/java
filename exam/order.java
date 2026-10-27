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
            System.out.println("Price per Kg: "+c.produce.pricePer());
            System.out.println("Subtotal: "+c.subtotal());
            System.out.println("Discount percentage :"+c.discountPercentage()+"%");
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
    static void Payableamounts(farmproduce[] items){
        double quantity=15;
        for(farmproduce p: items){
        System.out.println("Produce: "+p.Name());
        System.out.println("Quantity: "+quantity+"kg");
        System.out.println("Payable amount: "+p.payableamount(quantity));
        System.out.println("_------------------");
        }
    }
    
static void Placeorder(farmproduce[] items, int id, double quantity) {

    for (farmproduce p : items) {

        if (p.produceId() == id) {

            if (quantity <= 0) {
                System.out.println("Invalid quantity");
            }
            else if (quantity > p.availableKg()) {
                System.out.println("Insufficient quantity");
            }
            else {
                for (cartEntry c : cart) {

                    if (c.produce.issameProduce(p)) {
                        c.increaseProduce(quantity);
                        p.setavailKg(p.availableKg() - quantity);
                        System.out.println("Order confirmed");
                        
                        return;
                    }
                }

                cart.add(new cartEntry(p, quantity));
                p.setavailKg(p.availableKg() - quantity);
                System.out.println("Order confirmed");
            }

            return;
        }
    }

    System.out.println("Produce not found");
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
            
        }
        System.out.println("The total inventory value is :"+total);
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
            new grain(701,"Organic rice",60,100,"Ramesh","Rice",true),
            new vegetable(702,"Fresh tomatoes",40,80,"Me daddy","Summer",false),
            new fruit(703,"Alphonso Mangoes",120,50,"Anand","Alphonso",'A'),
            new spice(704, "Turmeric powder", 200, 30, "pablo","Turmeric","Hyd")
        };  
    /*
         AddtoCart(items[0], 10);
        AddtoCart(items[0], 5);
        Displayinventory(items);
        Displayvalue(items);
        searchproducebyId(items, 702);
        searchbyName(items, "Mangoes");
        compareObject(items[0], items[1]);
        Displaycart();
        Placeorder(items, 101, 6);
        System.out.println("Payable amount: ₹"+ items[0].payableamount(15));
        Payableamounts(items);*/
        
        Placeorder(items, 701, 10);
        Placeorder(items, 702, 5);
        Placeorder(items, 703, 3);
        Placeorder(items, 704, 2);
        Placeorder(items, 701, 5);
        System.out.println("###############################");
        Placeorder(items, 701, 90);  // Insufficient stock: only 85 kg left
        Placeorder(items, 701, 0);   // Zero quantity
        Placeorder(items, 701, -5);  // Negative quantity
        Placeorder(items, 701, 100); // More than available stock
        Displaycart();
       searchproducebyId(items, 999);
        searchbyName(items, "Unknown Produce");
        System.out.println("\nProduce Details and Polymorphism");

    for (farmproduce p : items) {
        p.DisplayDetails();
}
        Totalstock(items);
        Displayvalue(items);
        System.out.println("Proude objefct copying");

        farmproduce original = items[0];
        farmproduce copy = new grain(
            original.produceId(),
            original.Name(),
            original.pricePer(),
            original.availableKg(),
            original.fathername(),
            "Rice",true
        );
        System.out.println("Original rice");
        original.DisplayDetails();
        System.out.println("Copied rice");
        copy.DisplayDetails();
        copy.setavailKg(150);
        System.out.println("Modified values");
        System.out.println("Original rice value: "+original.availableKg()+"Kg");
        System.out.println("Copied rice value: "+copy.availableKg()+"Kg");
    }
    
}
