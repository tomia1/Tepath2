package com.gluonapplication.views;

import com.gluonapplication.GluonApplication;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;

import javafx.fxml.FXML;

public class ChecklistPresenter {
	
	@FXML
	private View checklist;
	
	 public void initialize() {
	        checklist.showingProperty().addListener((obs, oldValue, newValue) -> {
	            if (newValue) {
	                AppBar appBar = MobileApplication.getInstance().getAppBar();
	                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> 
	                        MobileApplication.getInstance().showLayer(GluonApplication.MENU_LAYER)));
	                appBar.setTitleText("Checkliste");
	                appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> 
	                        System.out.println("Search")));
	            }
	        });
	    }

}
