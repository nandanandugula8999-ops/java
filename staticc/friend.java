package staticc;

public class friend {
    String name;
    static int count;

     friend(String name){
        this.name=name;
        count++;
    }


    public static void main(String[] args){
        friend Friend= new friend("Nandan");
        friend Friend1= new friend("Dhruthi");
        friend Friend2= new friend("Medha");
        System.out.println(Friend.name);
        System.out.println(Friend1.name);
        System.out.println(Friend2.name);
        System.out.println("Number of friends are "+friend.count);
    }
}
