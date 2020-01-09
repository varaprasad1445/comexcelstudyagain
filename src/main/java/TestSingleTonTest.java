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



}
