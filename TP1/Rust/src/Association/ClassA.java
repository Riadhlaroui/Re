package Association;

public class ClassA {
   ClassB classb;
   int numberB = 0; 
   
   public void setClassB(ClassB b){
        if (classb == null) {
            classb = b;
            numberB++;
        }else {
            throw new IllegalStateException("Class A can only have one instance of Class B.");
        }
   }

//    public ClassA(ClassB b){
//         if(classb == null) {
//             this.classb = b;
//             numberB++;
//         }else {
//             throw new IllegalStateException("Class A can only have one instance of Class B.");
//         }
//    }



}
