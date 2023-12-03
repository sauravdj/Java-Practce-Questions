// Saurav DJ
class Comparison{
 public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 10;

        System.out.println(x==y);//false
        System.out.println(x==z);//true

        Example el = new Example();
        Example e2 = new Example();
        Example e3 = e2;

        System.out.println(el == e2); //false
        System.out.println(e2 == e3); //true
        System.out.println(el == e2); //false
        System.out.println(e2 == e3); //true
        //Test t1 = new Test();
        //System.out.println(el == t1); //CE:ict
        
        System.out.println(el.equals(e2));
        System.out.println(e2.equals(e3));
       // System.out.println(el.equals(t1));

 }
}