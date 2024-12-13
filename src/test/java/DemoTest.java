import org.junit.Assert;
import org.junit.Test;

//GIven: AN array of numbers as strings
//Task: sort from smallest to largest
//Restriction: They must stay strings - no converting to numbrs

public class DemoTest {
    //Before
    Demo demo = new Demo();

    @Test
    public void SortArrayTest() {
        //Given
        String[] givenTest = {"1","15","6","9","4"};
        String[]expected = {"1","4","6","9","15"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void sortNegativeNumArray() {
        //Given
        String[] givenTest = {"-1","-4","15","-6","-9","4"};
        String[]expected = {"-9","-6","-4","-1","4","15"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        Assert.assertArrayEquals(expected,actual);

    }




}