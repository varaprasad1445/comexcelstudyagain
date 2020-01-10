import org.testng.annotations.Test;

public class TestSingleTonTest {

    static TestSingleTonTest testSingleTonTest = null;
    private TestSingleTonTest(){
        System.out.println( " i am in constructor");

    }
    public static TestSingleTonTest createObject(){

        if(testSingleTonTest == null){
            testSingleTonTest = new TestSingleTonTest();
        }
        return testSingleTonTest;
    }

    @Test
    public void getResutls(){
        TestSingleTonTest x1 = TestSingleTonTest.createObject();
        TestSingleTonTest x2 = TestSingleTonTest.createObject();
        System.out.println(x1);
        System.out.println(x2);
    }


}
