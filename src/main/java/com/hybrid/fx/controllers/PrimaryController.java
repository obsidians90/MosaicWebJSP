package com.hybrid.fx.controllers;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;
public class PrimaryController {
    @Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    @Inject private StateManager stateManager;
    private boolean first = true;
    @FXML
    private Label label;
    @FXML
    private Button button, home;
    @FXML
    private WebView myweb;
    @FXML
    private TextField url;
    @FXML
    private ResourceBundle resources;
    private Action actionSignin;
	@FXML private ProgressBar progress;
    public void initialize() {
        ActionMap.register(this);
        actionSignin =  ActionMap.action("signin");
       WebEngine engine = myweb.getEngine();
       engine.load("http://localhost:8080/");
       home.setOnAction(e -> {
    	   engine.load("http://localhost:8080/");
    	   url.setText(engine.getLocation());
       });
       url.setOnAction(e -> {
    	   engine.load(url.getText());
    	   url.setText(engine.getLocation());
       });
       engine.getLoadWorker().runningProperty().addListener(new ChangeListener<Boolean>() {
		@Override
		public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
			if (newValue = true) {
				url.setText(engine.getLocation());
			}
		}	
	});
       engine.getLoadWorker().progressProperty().addListener(new ChangeListener<Number>() {
   		@Override
   		public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
   			progress.setProgress(newValue.doubleValue());
   		}
   	});
    }
    
    public void postInit() {
        if (first) {
            stateManager.setPersistenceMode(StateManager.PersistenceMode.USER);
            addUser(stateManager.getProperty("UserName").orElse("").toString());
            first = false;
        }
        app.getParticle().getToolBarActions().add(0, actionSignin);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionSignin);
    }
    
    public void addUser(String userName) {
        stateManager.setProperty("UserName", userName);
    }

    @ActionProxy(text="Sign In")
    private void signin() {
        TextInputDialog input = new TextInputDialog(stateManager.getProperty("UserName").orElse("").toString());
        input.setTitle("User name");
        input.setHeaderText(null);
        input.setContentText("Input your name:");
        input.showAndWait().ifPresent(this::addUser);
    }
    
}