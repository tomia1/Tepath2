package com.gluonapplication.views;

import com.gluonhq.charm.glisten.mvc.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginPresenter {

		
    private static final ActionEvent event = null;

	@FXML
    private View primary;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;
    @FXML
    private Button anmelden;

    @FXML
    void MakeLogin(ActionEvent event) {
    	String usrName = userName.getText();
    	String pass = password.getText();
    	if(usrName.equals("Tepapp") && pass.equals("Tepapp")){
    		System.out.println("Welcome to TepApp!");
    	}else
    		
    	System.out.println("Wrong password!");
    	
    	 
    	

    }
    public static void maind(String[] args){
    	loginPresenter pr = new loginPresenter();
    	pr.MakeLogin(event);;
    }
}
		
		
		
		
		

