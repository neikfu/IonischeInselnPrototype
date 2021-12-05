package de.hhn.seb.pmt.ionische.view.dangerousentitiesprototype;

import de.hhn.seb.pmt.ionische.model.DangerousEntity;
import de.hhn.seb.pmt.ionische.model.DangerousEntityDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import org.orm.PersistentException;

import java.io.IOException;

public class DangerousEntitiesController {
    @FXML
    ScrollPane mainScrollPane;
    @FXML
    VBox mainVBox;
    @FXML
    TextField searchField;
    @FXML
    Button searchButton;
    @FXML
    Button backButton;


    // Show all database contents as overview of all dangerous entitites
    public void initialize() {
        showEntities();
    }

    // Add new entry(children) to prototype
    private void addChildren(DangerousEntity dangerousEntity,
                             Text description,
                             Label name,
                             HBox dangerousEntityContainer,
                             VBox containerVBox) {
        containerVBox.getChildren().add(name);
        loadImage(dangerousEntity, containerVBox);
        containerVBox.getChildren().add((createEmptyLabel()));
        containerVBox.getChildren().add(description);
        dangerousEntityContainer.getChildren().add(containerVBox);
        mainVBox.getChildren().add(dangerousEntityContainer);
    }

    // Method to add an empty text
    private void addChildren(Text emptyLabel) {
        mainVBox.getChildren().add(emptyLabel);
    }

    // Return Entity as HBox
    private HBox getMainContainer(DangerousEntity dangerousEntity) {
        HBox dangerousEntityContainer = new HBox();
        dangerousEntityContainer.setPadding(new Insets(10, 10, 10, 10));
        styleDangerousEntityContainerBorderAndBackground(dangerousEntityContainer, Color.LIGHTGRAY, "gray");
        return dangerousEntityContainer;
    }

    // Return subcontainer as VBox
    private VBox getSubContainer() {
        VBox containerVBox = new VBox();
        containerVBox.setPadding(new Insets(10, 10, 10, 10));
        return containerVBox;
    }

    // Style for container
    private void styleDangerousEntityContainerBorderAndBackground(HBox dangerousEntityContainer, Color lightblue, String color) {
        dangerousEntityContainer.setBackground(new Background(new BackgroundFill(lightblue, null, null)));
        dangerousEntityContainer.setStyle("-fx-border-style: solid inside;"
                + "-fx-border-width: 1;" + "-fx-border-color: " + color + ";");
    }

    // Return name of an entity as Label + styling
    private Label getName(DangerousEntity dangerousEntity) {
        Label title = new Label(dangerousEntity.getName());
        title.setWrapText(true);
        title.setFont(Font.font("Times new Roman", FontWeight.BOLD, 16));
        title.setStyle("-fx-padding: 10px 10px 10px 0px;");
        return title;
    }

    // Get description of an entity as Text + styling
    private Text getDescription(DangerousEntity dangerousEntity) {
        Text text = new Text(dangerousEntity.getDescription());
        text.setWrappingWidth(250);
        // text.wrappingWidthProperty().bind(mainScrollPane.widthProperty());
        text.setStyle("-fx-padding: 20px 20px 20px 0px;");
        text.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
        TextFlow textFlow = new TextFlow(text);
        // text.setWrapText(true);
        // text.setEditable(false);
        return text;
    }

    // To create a space between the image and the description due to less style possibilities for "Text"
    private Label createEmptyLabel() {
        Label emptyLabel = new Label();
        emptyLabel.setFont(Font.font("Arial", FontWeight.LIGHT, 8));
        return emptyLabel;
    }

    // Method to load image from string (URL)
    private void loadImage(DangerousEntity dangerousEntity, VBox containerVBox) {
        try {
            ImageView image = new ImageView(new Image(dangerousEntity.getPicture()));
            image.setPreserveRatio(true);
            image.setFitWidth(250);
            containerVBox.getChildren().add(image);
        } catch (NullPointerException e) {
        }
    }

    // Method to show each entity before search is used. Previous version showed an empty list before search is used.
    // Now you see all results in case you don't want to search anything specific.
    public void showEntities() {
        DangerousEntity[] dangerousEntities = getDangerousEntities();
        for (DangerousEntity dangerousEntity : dangerousEntities) {
            Text description = getDescription(dangerousEntity);
            Label name = getName(dangerousEntity);
            HBox dangerousEntityContainer = getMainContainer(dangerousEntity);
            VBox containerVBox = getSubContainer();
            addChildren(dangerousEntity, description, name, dangerousEntityContainer, containerVBox);
        }
    }

    // Method for search function. Loop goes through all database entries and looks if name-String contains searched String.
    // Adds a new children for each search result
    public void searchForEntities(String elementName) {
        DangerousEntity[] dangerousEntities = getDangerousEntities();
        for (DangerousEntity dangerousEntity : dangerousEntities) {
            if (dangerousEntity.getName().trim().toLowerCase().contains(elementName.trim().toLowerCase())) {
                Text description = getDescription(dangerousEntity);
                Label name = getName(dangerousEntity);
                HBox dangerousEntityContainer = getMainContainer(dangerousEntity);
                VBox containerVBox = getSubContainer();
                addChildren(dangerousEntity, description, name, dangerousEntityContainer, containerVBox);
            } else if (dangerousEntity.getName().trim().toLowerCase().isBlank()) { // show all if search is blank
                showEntities();
            }
        }
    }

    // If search is used again previous results are removed (with help of removeSearchResults()
    @FXML
    void searchUsed() {
        removeSearchResults();
        searchForEntities(searchField.getText());
    }

    // Method for searchUsed() where results are removed
    private void removeSearchResults() {
        if (mainVBox.getChildren().size() > 1) {
            mainVBox.getChildren().remove(1, mainVBox.getChildren().size());
        }
    }

    // To get all entity entries inside Database as array.
    private DangerousEntity[] getDangerousEntities() {
        DangerousEntity[] dangerousEntities = null;
        try {
            dangerousEntities = DangerousEntityDAO.listDangerousEntityByQuery(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return dangerousEntities;
    }

    // Method for back button if previous scene is available - not implemented yet.
    @FXML
    void backTriggered() throws IOException {
        ScrollPane pane = FXMLLoader.load(getClass().getResource("-path to fxml file you want to go back to"));
        mainScrollPane.setContent(pane);
    }

}