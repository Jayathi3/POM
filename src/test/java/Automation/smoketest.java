package Automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by RJPG on 22/10/2014.
 */


public class smoketest extends Basetest{
    String username="admin",password="admin";


    Reusableclass reusableclass = new Reusableclass();
Adminclass adminclass = new Adminclass();

    @Test
    public void verifyAdminCanAddSkill() {

        reusableclass.loginAsAdmin(username, password);

        Assert.assertTrue(reusableclass.isUserLoggedIn());
        adminclass.Addusers();





    }}
