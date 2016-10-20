package ddi.gobelins.takenote.notes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ddi.gobelins.takenote.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListNotesFragment extends Fragment {


    public ListNotesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_notes, container, false);

        return view;
    }

}
