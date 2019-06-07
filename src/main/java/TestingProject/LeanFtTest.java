package TestingProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Image;
import com.hp.lft.sdk.web.ImageDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
    	System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() throws Exception {
    	System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    	System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    	System.out.println("After Method");
    }

    @Test
    public void test() throws GeneralLeanFtException {
    	
    	//Launch the Chrome browser.
    	Browser browser = BrowserFactory.launch(BrowserType.CHROME);
      		//Navigate to the New Tours website.  
    		browser.navigate("http://newtours.demoaut.com/");
    		//Identify username
    		 EditField un = browser.describe(EditField.class, new EditFieldDescription.Builder()
    				.type("text")
    				.tagName("INPUT")
    				.name("userName").build());
    		 //Enter username value as mercury
    		 un.setValue("mercury");
    		 //Identfy password
    		 EditField psd=browser.describe(EditField.class, new EditFieldDescription.Builder()
    					.type("password")
    					.tagName("INPUT")
    					.name("password").build());
    		 //enter password
    		 psd.setSecure("mercury");
    		 //click sign-in
    		 Image signin=browser.describe(Image.class, new ImageDescription.Builder()
    					.alt("Sign-In")
    					.type(com.hp.lft.sdk.web.ImageType.BUTTON)
    					.tagName("INPUT").build());
    		 signin.click();
    		 //close broswer
    		 browser.close();
    }

}