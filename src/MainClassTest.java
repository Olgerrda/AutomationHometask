import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassString() {
        String strFromGetClassString = this.getClassString();
        String strToSearch = "Hello";
        boolean contains = strFromGetClassString.toLowerCase().contains(strToSearch.toLowerCase());
        if (contains){
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }

    }
}
