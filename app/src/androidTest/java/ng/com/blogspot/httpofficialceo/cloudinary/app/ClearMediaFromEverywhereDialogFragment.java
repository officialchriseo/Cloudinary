package ng.com.blogspot.httpofficialceo.cloudinary.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

import com.cloudinary.android.sample.R;

public class ClearMediaFromEverywhereDialogFragment extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext())
                .setTitle(R.string.clear_remote_media_dialog_title)
                .setMessage(R.string.clear_remote_media_dialog_message)
                .setNegativeButton(R.string.clear_remote_media_button_cancel, null)
                .setPositiveButton(R.string.clear_remote_media_button_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((DeleteRequestsCallback) getActivity()).onDeleteEverywhere();
                    }
                }).create();
    }
}
