package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

import com.software.fire.dialogsfordays.R;

/**
 * Created by Brad on 12/23/2016.
 */

public class ListDialog extends DialogFragment {

    private static final int FIRST_OPTION = 0;
    private static final int SECOND_OPTION = 1;
    private static final int THIRD_OPTION = 2;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.list_dialog_title);
        builder.setItems(R.array.array_of_words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case FIRST_OPTION:
                        showToast(getString(R.string.first_option));
                        break;
                    case SECOND_OPTION:
                        showToast(getString(R.string.second_option));
                        break;
                    case THIRD_OPTION:
                        showToast(getString(R.string.third_option));
                        break;
                }
            }
        });
        return builder.create();
    }

    private void showToast(String str) {
        Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
    }
}
