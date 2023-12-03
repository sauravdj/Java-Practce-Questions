class Area1 
 {
 	 float length, width, result ;
 	 void getdata(float x ,float y )
 	 {
 	 	length = x ;
 	 	width = y ;
 	 }
 	 void rectArea(float length, float width)
 	  {
 	  	 result = length * width;
 	  	  System.out.print(result);
 	  }
 }

public class classobject {
	public static void main(String[] args) {
		
		Area1 a1 = new Area1();
		
		 a1.rectArea(2.3f,4.5f);
		
	}
}