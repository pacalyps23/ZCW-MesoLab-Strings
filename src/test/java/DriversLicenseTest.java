import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by luisgarcia on 5/21/17.
 */


public class DriversLicenseTest
{
    private static  String  fileName = "StringLab.csv";
    DriversLicense driver;

    @Before
    public void setUp()
    {
         driver = new DriversLicense();
    }

    @Test
    public void deserializeCSVTestSize()
    {
        //given
        ArrayList driverList = driver.deserializeFromCSV(fileName);
        int expected = 13;

        //when
        int actual = driverList.size();

        //
        Assert.assertEquals("create list ", expected, actual);

    }


}
