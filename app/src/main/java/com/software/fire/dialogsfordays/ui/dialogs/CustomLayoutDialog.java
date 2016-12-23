package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.software.fire.dialogsfordays.R;

/**
 * Created by Brad on 12/23/2016.
 */

public class CustomLayoutDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.custom_layout_title);
        View view = getActivity().getLayoutInflater().inflate(R.layout.custom_layout, null);
        builder.setView(view);
        return builder.create();
    }
}
