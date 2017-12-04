package com.gluonapplication.views;

import java.awt.Button;

import com.sun.glass.events.MouseEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

public class HomePagePresenter {
	 @FXML
	    private HBox Calendar;

	    @FXML
	    private Button ablauf;

	    @FXML
	    private Button checkList;

	    @FXML
	    private Button Contacts;

	    @FXML
	    private Button GesundheitZustand;

	    @FXML
	    void ShowCalendar(MouseEvent event) {
Calendar.getOnMouseClicked();
	    }

	    @FXML
	    void showAblauf(ActionEvent event) {
	    	ablauf.getActionListeners();

	    }

	    @FXML
	    void showCheckList(ActionEvent event) {
checkList.getName();
	    }

	    @FXML
	    void showContacts(ActionEvent event) {
	    	//Contacts.setVisible(b);

	    }

	    @FXML
	    void showHealthSTatus(ActionEvent event) {

	    }
}
