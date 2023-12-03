
class ScopeInJava {
     //global variable x
     final int x = 3;
     public int scopeDemo()
     {
        //local variable y
        int y = 5;
        int z = x + y;
        return z;
     }
//     public int demo(){
//         global variable x is accessible 
//         local variable y is not accessible
//     int w = x + z; 
//     return w;
     // }
}