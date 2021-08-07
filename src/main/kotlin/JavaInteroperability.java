public class JavaInteroperability {
    public static void main(String[] args) {

        //Call  Kotlin class ()
        int sum = KtInteroperabilityKt.add(3,4);
        System.out.println("SUM from java file : "+ sum);

    }

    public  static int getArea(int l, int b){
        return l*b;
    }

}
