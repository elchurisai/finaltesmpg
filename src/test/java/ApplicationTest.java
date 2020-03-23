import org.junit.jupiter.api.*;

public class ApplicationTest {


    ApplicationPackage aPack = new ApplicationPackage();

    @BeforeAll
    public static void BeforRunnigClass() {
        System.out.println("Starting the web driver");
    }

    @BeforeEach
    public  void beforeRunningMethod() {
        System.out.println("Before running the method");
    }


    @Test
    public void test1() {
        System.out.println("Some  kind of test"+aPack.add_two(10,20));
        System.out.println("antother verify ");
        String data = "Hola";
        String expected = "Hola";

        Assertions.assertTrue(true);

    }
    @Test
    public void  test2() {
        System.out.println("I am in JUNIT 5 test"+aPack.multiple_test(15,16));
    }

    @AfterEach

    public  void afterrunningMethof() {

        System.out.println("After running th emethod");
    }

    @AfterAll
    public static void AfterRunningtheClass() {
        System.out.println("After running the all the classes");
    }

}
