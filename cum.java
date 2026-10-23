class cum extends details{
    public cum(int id,String name){
        super(id,name);
    }
    public static void main(String[] args){
        cum stu = new cum(1,"Nandan");
        cum stu1 = new cum(2,"Abhiram");
        stu.Display();
        stu1.Display();
    }
}