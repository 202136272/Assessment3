package za.ac.cput.university;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.university.Config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class StudentThirdYearTest {
    private Student thirdYear;
    private ApplicationContext ctx;

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Student Detail:", "Phelang#Qhu#NDIT", thirdYear.thirdYear("211113409"));

    }

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        thirdYear = (Student)ctx.getBean("std");

    }

    @After
    public void tearDown() throws Exception {


    }
}
