package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

    public class Details extends Utils{
        By _addBtn = By.id("btnAddAttachment");
        By _firstNameTxtField = By.id("personal_txtEmpFirstName");

//    String actual =  getElement(_firstNameTxtField).getAttribute("value");

        LoadProp loadProp = new LoadProp();

        public void verifyEmployeeAddedSuccessfully(){
            waitForClickable(_addBtn,20);
            System.out.println(getElement(_firstNameTxtField).getAttribute("value"));
        }

    }


