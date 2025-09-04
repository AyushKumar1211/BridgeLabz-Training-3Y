public class StaticThisFinal {
    static int num;
    int num2;
    {
        num2=10;
        System.out.println("I am here at this instance.");
    }
    static{
        System.out.println("I am here in Static Block.");
    }
    public StaticThisFinal(){
        System.out.println("I am in Constructor.");
    }
    // public String getName(){
    //     return this.name;
    // }
}
