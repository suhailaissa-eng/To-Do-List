package com.example.todooolist;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ToDoListController {

    @FXML
    private ListView<String> taskList;
    @FXML
    private TextField newTaskField;
    @FXML
    private Button deleteButton;


    @FXML
    private void addTask() {
        String task = newTaskField.getText();
        if (!task.trim().isEmpty()) {
            taskList.getItems().add(task);
            newTaskField.clear();
        }
    }


    @FXML
    private void deleteTask() {
        String selectedTask = taskList.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            taskList.getItems().remove(selectedTask);
        }
    }




    @FXML
    private void selectTask(MouseEvent event) {
        String selectedTask = taskList.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            newTaskField.setText(selectedTask);
        }
    }
}
