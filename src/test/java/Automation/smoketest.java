package Automation;

import org.junit.Assert;
import org.junit.Test;


public class smoketest extends Basetest{
    String username="admin",password="admin";


    Reusableclass reusableclass = new Reusableclass();
Adminpage adminclass = new Adminpage();
Timepage timepage=new Timepage();
    @Test
    public void verifyAdminCanAddSkill() {

        reusableclass.loginAsAdmin(username, password);

        Assert.assertTrue(reusableclass.isUserLoggedIn());
        adminclass.Addusers();
    }
    @Test
     public void verifyAdmincanviewtimesheets (){
        reusableclass.loginAsAdmin(username, password);
        Assert.assertTrue(reusableclass.isUserLoggedIn());
        timepage.viewemployeetimesheet();

    }
@Test
    public void verifyAdmincanADDleave(){

}

}
