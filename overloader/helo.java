package overloader;
public class helo {
    String name;
    String email;
    int id;
    
    helo(){
        this.name="Not given";
        this.email="Not provided";
        this.id=0;
    }
    helo(String name){
        this.name= name;
        this.email="Not given";
        this.id = 0;
    }
    helo(String name,String email,int id){
        this.name=name;
        this.email=email;
        this.id=id;
    }
    public static void main(String[] args){
        helo user = new helo("Nandan");
        helo user1 = new helo();
        helo user2 = new helo("Dhruthi vummethala","dhruthilovesnandu@gmail.com",69);
        System.out.println("NAme is |"+user.name);
         System.out.println("email is |"+user.email);
          System.out.println("id is |"+user.id);

          System.out.println("NAme is |"+user1.name);
         System.out.println("email is |"+user1.email);
          System.out.println("id is |"+user1.id);

          System.out.println("NAme is |"+user2.name);
         System.out.println("email is |"+user2.email);
          System.out.println("id is |"+user2.id);
    }
}
