package com.example.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Controller {
    @FXML
    private TextArea textField;
    @FXML
    private TextField userText;

    public void clickCheckButton(ActionEvent actionEvent) {
        Date date = new Date();
        String time ;
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);

        final String text = userText.getText();
        textField.appendText(formattedDate+ "   "+"username: "+text+"\n");
        userText.clear();
        userText.requestFocus();

    }

}