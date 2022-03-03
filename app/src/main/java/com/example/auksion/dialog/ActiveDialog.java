package com.example.auksion.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.auksion.listener.OnItemSelected;

public class ActiveDialog extends DialogFragment {

    private String title = "";
    private String[] catNamesArray;
    private OnItemSelected key;
    private int id = -1;


    public void getData(String title, String[] array, OnItemSelected active_key) {
        this.title = title;
        this.catNamesArray = array;
        this.key = active_key;

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(title)
                .setSingleChoiceItems(catNamesArray, -1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int item) {
                                ActiveDialog.this.id = item;
                            }
                        })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        key.itemSelected(id);
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Bekor qilish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

        return builder.create();
    }


}
