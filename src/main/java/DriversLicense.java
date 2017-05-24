import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by luisgarcia on 5/21/17.
 */
public class DriversLicense
{
    private String lastName;
    private String firstName;
    private String address;
    private String state;
    private String licenseNum;
    private String dob;
    private String issue;
    private String expire;
    private String eyes;
    private String sex;
    private String height;
    private String donor;
    private String classType;

    public DriversLicense(String lastName, String firstName, String address, String state, String licenseNum, String dob, String issue, String expire, String eyes, String sex, String height, String donor, String clasType)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.state = state;
        this.licenseNum = licenseNum;
        this.dob = dob;
        this.issue = issue;
        this.expire = expire;
        this.eyes = eyes;
        this.sex = sex;
        this.height = height;
        this.donor = donor;
        this.classType = clasType;
    }

    public DriversLicense(){};

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setLicenseNum(String licenseNum)
    {
        this.licenseNum = licenseNum;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public void setIssue(String issue)
    {
        this.issue = issue;
    }

    public void setExpire(String expire)
    {
        this.expire = expire;
    }

    public void setEyes(String eyes)
    {
        this.eyes = eyes;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public void setDonor(String donor)
    {
        this.donor = donor;
    }

    public void setClasType(String clasType)
    {
        this.classType = clasType;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getState()
    {
        return state;
    }

    public String getLicenseNum()
    {
        return licenseNum;
    }

    public String getDob()
    {
        return dob;
    }

    public String getIssue()
    {
        return issue;
    }

    public String getExpire()
    {
        return expire;
    }

    public String getEyes()
    {
        return eyes;
    }

    public String getSex()
    {
        return sex;
    }

    public String getHeight()
    {
        return height;
    }

    public String getDonor()
    {
        return donor;
    }

    public String getClasType()
    {
        return classType;
    }

    public String getCSVHeader()
    {
        return "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS";
    }

    public static ArrayList<DriversLicense> deserializeFromCSV(String csvFile)
    {
        ArrayList<DriversLicense> licenseList = new ArrayList<DriversLicense>();
        DriversLicense newDriver = new DriversLicense();
        String [] driverInfo;

        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                driverInfo = line.split(cvsSplitBy);
                newDriver = new DriversLicense(driverInfo[0], driverInfo[1], driverInfo[2],
                        driverInfo[3], driverInfo[4], driverInfo[5], driverInfo[6], driverInfo[7], driverInfo[8],
                        driverInfo[9], driverInfo[10], driverInfo[11], driverInfo[12]);

                System.out.println(driverInfo[0]);
                licenseList.add(newDriver);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return licenseList;
    }



}
