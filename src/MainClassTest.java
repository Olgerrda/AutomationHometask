import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassNumber() {
        int number = this.getClassNumber();
        if (number > 45) {
            System.out.println("getClassNumber returns number > 45");
        } else {
            System.out.println("getClassNumber returns number <= 45");
        }

    }
}
