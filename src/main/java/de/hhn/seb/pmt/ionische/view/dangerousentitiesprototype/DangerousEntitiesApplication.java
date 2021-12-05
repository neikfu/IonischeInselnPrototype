package de.hhn.seb.pmt.ionische.view.dangerousentitiesprototype;

import de.hhn.seb.pmt.ionische.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.orm.PersistentException;

import java.io.IOException;

public class DangerousEntitiesApplication extends Application {


    // Main gets launched from MainClass --> Comment from start() explains steps
    public static void main(String[] args) throws PersistentException {
        // printDangerousEntities();
        launch();
    }


    // Start method to load fxml-File and create first scene. Main is started from MainClass due to problems (tutorial by S. Schweizer)
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DangerousEntitiesApplication.class.getResource("dangerousEntities.fxml"));
        Scene      scene      = new Scene(fxmlLoader.load());
        stage.setTitle("Dangerous Entities");
        stage.setScene(scene);
        stage.setWidth(320);
        stage.setHeight(600);
        stage.setMinWidth(320);
        stage.show();
    }

    // Print Entities to console - used to check correct database access
    private static void printDangerousEntities() throws PersistentException {
        System.out.println("Listing entity names + description...");
        DangerousEntity[] dangerousEntities = DangerousEntityDAO.listDangerousEntityByQuery(null, null);
        for (DangerousEntity dangerousEntity : dangerousEntities) {
            System.out.println(dangerousEntity.getName() + " " + dangerousEntity.getDescription() + " " + dangerousEntity.getPicture());// + review.getRating());
        }
    }

    // Possibility to add new Entity to database if necessary
    private static void createDangerousEntity(String name, String description, String image)
            throws PersistentException {
        DangerousEntity dangerousEntity = new DangerousEntity();
        dangerousEntity.setName(name);
        dangerousEntity.setDescription(description);
        dangerousEntity.setPicture(image);
        DangerousEntityDAO.save(dangerousEntity);
    }
}