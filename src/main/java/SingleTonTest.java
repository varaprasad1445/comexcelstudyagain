public class SingleTonTest {

    public static void main(String[]args){


        TestSingleTonTest x1 = TestSingleTonTest.createObject();
        TestSingleTonTest x2 = TestSingleTonTest.createObject();
        System.out.println(x1);
        System.out.println(x2);


    }
}
