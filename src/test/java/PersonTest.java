import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonTest() throws Exception{

      Person testP = new Person(30 ,"Ryan","male"
              ,new String[]{"being a hardarse", "agile", "ssd hard drives"});

         //String greetings = testP.Hello();

         Assert.assertEquals(testP.Hello(),"hello, my name is Ryan and i am 30 years old.My interests are being " +
                 "a hardarse, agile and ssd hard drives");

         Assert.assertEquals(testP.getAge(),30);
        Assert.assertEquals(testP.getName(),"Ryan");
        Assert.assertEquals(testP.getGender(),"male");
        Assert.assertEquals(testP.getInterest(),new String[]{"being a hardarse", "agile", "ssd hard drives"});

     }


}