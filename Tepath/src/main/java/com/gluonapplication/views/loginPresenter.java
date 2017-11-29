package com.gluonapplication.views;

import java.io.IOException;

import com.gluonhq.charm.glisten.mvc.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class loginPresenter {

	public class PrimaryPresenter {

	    @FXML
	    private View primary;

	    @FXML
	    private Button anmelden;

	    @FXML
	    void anmeldenClick(ActionEvent event) throws IOException {
	    	System.out.println("You are loggin in");
	    	Parent Home_page_parent = FXMLLoader.load(getClass().getResource("home.fxml"));

	    }

	}


}
