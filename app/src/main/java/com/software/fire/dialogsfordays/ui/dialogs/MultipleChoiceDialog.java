package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.software.fire.dialogsfordays.R;

import java.util.ArrayList;

/**
 * Created by Brad on 12/23/2016.
 */

public class MultipleChoiceDialog extends DialogFragment {

    ArrayList mSelectedItems;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Predefine the arraylist size to prevent poor performance
        mSelectedItems = new ArrayList(3);
        boolean[] checkedItems = new boolean[]{false, false, false};

        builder.setTitle(R.string.multiple_choice_dialog_title);
        builder.setMultiChoiceItems(R.array.array_of_words, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if (b) {
                    mSelectedItems.add(new Integer(i));
                } else {
                    mSelectedItems.remove(new Integer(i));
                }
            }
        });

        builder.setPositiveButton(R.string.display_choices, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                displayChoices();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //do nothing
            }
        });
        return builder.create();
    }

    private void displayChoices() {
        String temp = "Selected Items\n";
        for (int i = 0; i < mSelectedItems.size(); i++) {
            temp += mSelectedItems.get(i) + "\n";
        }
        Toast.makeText(getActivity(), temp, Toast.LENGTH_SHORT).show();
    }
}
