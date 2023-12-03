import java.util.*;
public class random{
    public static void main(String [] args){
        Random r = new Random();
        int value = r.nextInt(6 - 1 + 1) + 1;
        System.out.println(value);
    }
}
