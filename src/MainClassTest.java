import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void verifyLocalNumber()
    {
        int number = getLocalNumber();
        if (number == 14)
        {
            System.out.println("You are right, it is 14");
        }
        else
        {
            System.out.println("You are mistaken, it is not 14");
        }

    }
}
