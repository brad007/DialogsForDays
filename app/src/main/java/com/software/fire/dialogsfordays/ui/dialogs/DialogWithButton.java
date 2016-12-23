package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.software.fire.dialogsfordays.R;

/**
 * Created by Brad on 12/23/2016.
 */

public class DialogWithButton extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_with_button_title);
        builder.setMessage(R.string.dialog_with_button_message);
        builder.setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast(getString(R.string.accept));
            }
        });
        builder.setNeutralButton(R.string.undecided, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast(getString(R.string.undecided));
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast(getString(R.string.cancel));
            }
        });
        return builder.create();
    }

    private void showToast(String str){
        Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
    }
}
