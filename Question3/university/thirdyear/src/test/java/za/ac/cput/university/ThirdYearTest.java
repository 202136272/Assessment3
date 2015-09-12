package za.ac.cput.university;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.university.Impl.ThirdYearImpl;

/**
 * Created by student on 2015/02/20.
 */
public class ThirdYearTest {
    private ThirdYear thirdYear;

    @Before
    public void setUp() throws Exception {
        thirdYear = new ThirdYearImpl();
    }

    @Test
    public void testName() throws Exception {
            //System.out.println(thirdYear.welcome("211113409"));
        Assert.assertEquals("Student Detail:", "Phelang#Qhu#NDIT",thirdYear.welcome("211113409"));
    }


    @After
    public void testAfter() throws Exception {

    }

}
