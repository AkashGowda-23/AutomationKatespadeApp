package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import PageObject.Singup;
import Utils.BaseTest;

public class SingUpTest extends BaseTest {

    @BeforeMethod
    public void initalize() {
        initializeBrowser();
    }

    @AfterMethod
    public void exit() {
        teardown();
    }

    @DataProvider(name = "userData")
    public Object[][] getUserTestData() {
        return new Object[][] {
            {"John", "Doe", "john.doe@example.com", "password123", "1234567890"}
           
          
        };
    }
    

  

    @Test(dataProvider = "userData")
    public void signUpWithUserData(String firstName, String lastName, String email, String password, String phoneNumber) throws InterruptedException {
        Singup p = new Singup();
        p.accountButton();
        p.enterfname(firstName);
        p.lastName(lastName);
        p.enterEmail(email);
        p.enterPassword(password);
        p.enterPhNo(phoneNumber);
        p.cap();
        p.Submit();
    }
    
    
    @DataProvider(name = "emptyFirstNameData")
    public Object[][] getEmptyFirstNameData() {
        return new Object[][] {
        	 {"", "Alice", "alice@example.com", "pass123", "9876543210"}
        };
        	
        }
    

    @Test(dataProvider = "emptyFirstNameData")
    public void signupWithoutFirstname(String firstName, String lastName, String email, String password, String phoneNumber) throws InterruptedException {
        Singup p = new Singup();
        p.accountButton();
        p.enterfname(firstName);
        p.lastName(lastName);
        p.enterEmail(email);
        p.enterPassword(password);
        p.enterPhNo(phoneNumber);
       
        p.Submit();
        p.validatewithoutfname();
    }
    
    @DataProvider(name = "emptylastNameData")
    public Object[][] getEmptyLastNameData() {
        return new Object[][] {
        	 {"Alice", "", "alice@example.com", "pass123", "9876543210"}
        	
        };
        }

    @Test(dataProvider = "emptylastNameData")
    public void signupWithoutLastname(String firstName, String lastName, String email, String password, String phoneNumber) throws InterruptedException {
        Singup p = new Singup();
        p.accountButton();
        p.enterfname(firstName);
        p.lastName(lastName);
        p.enterEmail(email);
        p.enterPassword(password);
        p.enterPhNo(phoneNumber);
     
        p.Submit();
        p.validatewithoutlname();
    }

    @DataProvider(name = "emptyEmailData")
    public Object[][] getEmptyEmaileData() {
        return new Object[][] {
        	 {"Alice", "alice", "", "pass123", "9876543210"}
        	
        };
        }
    @Test(dataProvider = "emptyEmailData")
    public void signupWithoutEmail(String firstName, String lastName, String email, String password, String phoneNumber) throws InterruptedException {
        Singup p = new Singup();
        p.accountButton();
        p.enterfname(firstName);
        p.lastName(lastName);
        p.enterEmail(email);
        p.enterPassword(password);
        p.enterPhNo(phoneNumber);
       
        p.Submit();
        p.validatewithoutemail();
    }

    @DataProvider(name = "emptyPswrdData")
    public Object[][] getEmptyPswrdData() {
        return new Object[][] {
        	 {"Alice", "alice", "alice@example.com", "", "9876543210"}
        	
        };
        }
    @Test(dataProvider = "emptyPswrdData")
    public void signupWithoutPassword(String firstName, String lastName, String email, String password, String phoneNumber) throws InterruptedException {
        Singup p = new Singup();
        p.accountButton();
        p.enterfname(firstName);
        p.lastName(lastName);
        p.enterEmail(email);
        p.enterPassword(password);
        p.enterPhNo(phoneNumber);
       
        p.Submit();
        p.validatewithoutpassword();
    }
}
