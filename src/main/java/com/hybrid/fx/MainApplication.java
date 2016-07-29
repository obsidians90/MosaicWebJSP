package com.hybrid.fx;
import com.gluonhq.particle.application.ParticleApplication;
import com.hybrid.MosaicWebApplication;

import javafx.application.Platform;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
public class MainApplication extends ParticleApplication {
	public static ConfigurableApplicationContext ctx;
    public MainApplication() {
        super("Gluon Desktop Application");
    }
    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(MainApplication.class.getResource("style.css").toExternalForm());
        setTitle("Gluon Desktop Application");
        getParticle().buildMenu("File -> [exit]", "Help -> [about]");
        getParticle().getToolBarActions().addAll(actions("---", "about", "exit"));
        setShowCloseConfirmation(false);
        Platform.runLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("Platform.runlater");
				getPrimaryStage().setOnCloseRequest(e -> {
					close();
				});
			}
		});
    }
    public static void close() {
		System.out.println("Spring Close");
		ctx.close();
    }
    public static void main(String[] args) {
    	/*
    	 *  Spring Boot Start
    	 */
    	ctx = SpringApplication.run(MosaicWebApplication.class, args);
		/*
		 *  Gluon Start
		 */
		launch(args);
	}
}