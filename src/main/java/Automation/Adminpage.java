package Automation;

import org.openqa.selenium.By;



public class Adminpage extends Baseclass {

    public void Addusers() {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
        driver.findElement(By.id("btnAdd")).click();

    }
}


