package ddi.gobelins.takenote.notes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ddi.gobelins.takenote.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListNotesFragment extends Fragment implements NotesAdapter.NotesAdapterListener {


    public ListNotesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_notes, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list_notes_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        List<Note> notes = new ArrayList<>();
        notes.add(new Note(0, "Le titre", "la description"));

        NotesAdapter notesAdapter = new NotesAdapter(notes);
        recyclerView.setAdapter(notesAdapter);

        notesAdapter.setNotesAdapterListner(this);

        return view;
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getContext(), "click on item: " + position, Toast.LENGTH_SHORT).show();
    }
}
