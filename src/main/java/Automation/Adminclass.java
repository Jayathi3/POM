package Automation;

import org.openqa.selenium.By;


/**
 * Created by RJPG on 22/10/2014.
 */
public class Adminclass extends Baseclass {

    public void Addusers() {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
        driver.findElement(By.id("btnAdd")).click();

    }
}


