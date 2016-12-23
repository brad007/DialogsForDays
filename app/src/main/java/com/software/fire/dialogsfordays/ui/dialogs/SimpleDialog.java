package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import com.software.fire.dialogsfordays.R;

/**
 * Created by Brad on 12/23/2016.
 */

public class SimpleDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.simple_dialog_title);
        builder.setMessage(R.string.simple_dialog_message);

        return builder.create();
    }
}
