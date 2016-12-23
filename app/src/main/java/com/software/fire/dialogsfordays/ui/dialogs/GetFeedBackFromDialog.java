package com.software.fire.dialogsfordays.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.software.fire.dialogsfordays.R;

/**
 * Created by Brad on 12/23/2016.
 */

public class GetFeedBackFromDialog extends DialogFragment {

    public interface NotifyDialogListener {
        public void onPostiveClick(DialogFragment dialogFragment);

        public void onNegativeClick(DialogFragment dialogFragment);
    }

    private NotifyDialogListener mNotifyDialogListener;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.feedback_dialog_title);
        builder.setMessage(R.string.feedback_dialog_message);
        builder.setPositiveButton(R.string.accept, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mNotifyDialogListener.onPostiveClick(GetFeedBackFromDialog.this);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mNotifyDialogListener.onNegativeClick(GetFeedBackFromDialog.this);
            }
        });
        return builder.create();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mNotifyDialogListener = (NotifyDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement NotifyDialogListener");
        }
    }
}
