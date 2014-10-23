package Automation;


import org.openqa.selenium.

public class Recruitmentpage extends Baseclass{
    public void AddCandidates(){
driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        driver.findElement(By.id("menu_recruitment_viewCandidates"));
        driver.findElement(By.id("candidateSearch_jobTitle"));


    }
}
