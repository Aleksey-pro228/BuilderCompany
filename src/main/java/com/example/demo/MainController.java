package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

public class MainController {

    @FXML
    private ListView<String> projectList;

    @FXML
    private void addProject() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Новый проект");
        dialog.setHeaderText("Добавление проекта");
        dialog.setContentText("Введите название и статус:");

        dialog.showAndWait().ifPresent(result -> {
            if (!result.trim().isEmpty()) {
                projectList.getItems().add(result);
            }
        });
    }

    @FXML
    private void removeProject() {
        int selectedIndex = projectList.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            projectList.getItems().remove(selectedIndex);
        }
    }
}