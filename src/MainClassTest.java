import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{


    //First exersise in first homework
    @Test
    public void testGetLocalNumber(){
        if (this.getLocalNumber() == 14){
            System.out.println("First test was successfull. "+this.getLocalNumber() +"=14");

        }
        else {
            System.out.println("First test was failed. "+this.getLocalNumber() +"!=14");
        }
    }



    //Second exersise in first homework
    @Test
    public void testGetClassNumber(){
        if (this.getClassNumber() > 45){
            System.out.println("Second test was successfull. "+ this.getClassNumber() +">45");
        }
        else {
            System.out.println("Second test was failed. "+this.getClassNumber()+"<=45");
        }
    }


    //Third exersise in first homework
    @Test
    public void testGetClassString(){
        if (this.getClassString().contains("hello") | this.getClassString().contains("Hello")) {
            System.out.println("Third test was successfull. String '"+this.getClassString()+"' contains Hello or hello");
        }
        else {
        //    System.out.println("Third test was failed. String '" + this.getClassString() +"' doesn't contain Hello or hello");
        Assert.fail("Third test was failed. String '" + this.getClassString() +"' doesn't contain Hello or hello");
        }
    }
}
