package com.software.fire.dialogsfordays.ui.activities;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.software.fire.dialogsfordays.R;
import com.software.fire.dialogsfordays.ui.dialogs.CustomLayoutDialog;
import com.software.fire.dialogsfordays.ui.dialogs.DialogWithButton;
import com.software.fire.dialogsfordays.ui.dialogs.GetFeedBackFromDialog;
import com.software.fire.dialogsfordays.ui.dialogs.ListDialog;
import com.software.fire.dialogsfordays.ui.dialogs.MultipleChoiceDialog;
import com.software.fire.dialogsfordays.ui.dialogs.SimpleDialog;
import com.software.fire.dialogsfordays.ui.dialogs.SingleChoiceDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, GetFeedBackFromDialog.NotifyDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleDialogButton = (Button) findViewById(R.id.simple_dialog_button);
        simpleDialogButton.setOnClickListener(this);

        Button dialogWithButtonsButton = (Button) findViewById(R.id.dialog_with_buttons);
        dialogWithButtonsButton.setOnClickListener(this);

        Button dialogWithList = (Button) findViewById(R.id.dialog_with_list);
        dialogWithList.setOnClickListener(this);

        Button singleChoiceDialog = (Button) findViewById(R.id.single_choice_dialog);
        singleChoiceDialog.setOnClickListener(this);

        Button multipleChoiceDialog = (Button) findViewById(R.id.multiple_choice_dialog);
        multipleChoiceDialog.setOnClickListener(this);

        Button customLayoutDialogButton = (Button) findViewById(R.id.custom_layout_dialog);
        customLayoutDialogButton.setOnClickListener(this);

        Button feedbackDialogButton = (Button) findViewById(R.id.get_feedback_dialog);
        feedbackDialogButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simple_dialog_button:
                displaySimpleDialog();
                break;
            case R.id.dialog_with_buttons:
                displayDialogWithButtons();
                break;
            case R.id.dialog_with_list:
                displayDialogWithList();
                break;
            case R.id.single_choice_dialog:
                displaySingleChoiceDialog();
                break;
            case R.id.multiple_choice_dialog:
                displayMultipleChoiceDialog();
                break;
            case R.id.custom_layout_dialog:
                displayCustomLayoutDialog();
                break;
            case R.id.get_feedback_dialog:
                displayFeedbackDialog();
                break;
        }
    }

    private void displayFeedbackDialog() {
        GetFeedBackFromDialog feedBackFromDialog = new GetFeedBackFromDialog();
        feedBackFromDialog.show(getSupportFragmentManager(), null);
    }

    private void displayCustomLayoutDialog() {
        CustomLayoutDialog customLayoutDialog = new CustomLayoutDialog();
        customLayoutDialog.show(getSupportFragmentManager(), null);
    }

    private void displayMultipleChoiceDialog() {
        MultipleChoiceDialog multipleChoiceDialog = new MultipleChoiceDialog();
        multipleChoiceDialog.show(getSupportFragmentManager(), null);
    }

    private void displaySingleChoiceDialog() {
        SingleChoiceDialog singleChoiceDialog = new SingleChoiceDialog();
        singleChoiceDialog.show(getSupportFragmentManager(), null);
    }

    private void displayDialogWithList() {
        ListDialog listDialog = new ListDialog();
        listDialog.show(getSupportFragmentManager(), null);
    }

    private void displayDialogWithButtons() {
        DialogWithButton dialogWithButton = new DialogWithButton();
        dialogWithButton.show(getSupportFragmentManager(), null);
    }

    private void displaySimpleDialog() {
        SimpleDialog simpleDialog = new SimpleDialog();
        simpleDialog.show(getSupportFragmentManager(), null);
    }

    @Override
    public void onPostiveClick(DialogFragment dialogFragment) {
        //This listener allows you to use variables/methods in your host activity when the user
        //has clicked the postive/negative/(neutral button)
        Toast.makeText(MainActivity.this, getString(R.string.accept), Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onNegativeClick(DialogFragment dialogFragment) {
        Toast.makeText(MainActivity.this, getString(R.string.cancel), Toast.LENGTH_SHORT).show();
    }
}
