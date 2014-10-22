package Automation;

import org.junit.Assert;
import org.junit.Test;


public class smoketest extends Basetest{
    String username="admin",password="admin";


    Reusableclass reusableclass = new Reusableclass();
Adminpage adminclass = new Adminpage();

    @Test
    public void verifyAdminCanAddSkill() {

        reusableclass.loginAsAdmin(username, password);

        Assert.assertTrue(reusableclass.isUserLoggedIn());
        adminclass.Addusers();





    }}
