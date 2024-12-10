package Association;

public class ClassB {
   ClassA classa;
   int numberA = 0;

   public void setClassA(ClassA a){
    if (classa == null) {
        classa = a;
        numberA++;
    }else {
        throw new IllegalStateException("Class A can only have one instance of Class B.");
    }
}


//    public ClassB(ClassA a){
//         if(classa == null) {
//             this.classa = a;
//             numberA++;
//         }else {
//             throw new IllegalStateException("Class A can only have one instance of Class B.");
//         }
//     }

   
}
