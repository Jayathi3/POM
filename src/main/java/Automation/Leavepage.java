package Automation;


import org.openqa.selenium.By;

public class Leavepage extends Baseclass {
    public void AddLeave(){
        driver.findElement(By.id("menu_leave_viewLeaveModule"));
        driver.findElement(By.id("menu_leave_Entitlements"));
        driver.findElement(By.id("menu_leave_addLeaveEntitlement"));


    }
}
