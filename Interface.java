interface circle{
    
    public double area(double r);
}
class oneClass implements circle{
  public double area (double r){
      return 3.14 * r * r;
  }
}
public class Interface{
    public static void main(String [] args){
        oneClass o = new oneClass();
        double area = o.area(2);
        System.out.println(area);
    }
}