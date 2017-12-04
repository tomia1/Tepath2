package com.gluonapplication.views;

import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginPresenter {

		
    private static final ActionEvent event = null;

	@FXML
    private View primary;

    @FXML
    private Label label;
	

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
    		

            anmelden.setGraphic(new Icon(MaterialDesignIcon.LANGUAGE));
            anmelden.setOnAction(e -> label.setText("Wrong password!"));
    	//System.out.println("Wrong password!");
    	
    	 
    	

    }
//    public static void maind(String[] args){
//    	loginPresenter pr = new loginPresenter();
//    	pr.MakeLogin(event);;
//    }
}
		
		
		
		
		

