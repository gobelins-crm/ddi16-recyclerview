package ddi.gobelins.takenote.notes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ddi.gobelins.takenote.R;

/**
 * Created by louisbl on 10/20/16.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {
    private List<Note> notes;
    private static NotesAdapterListener listener;

    public NotesAdapter(List<Note> notes) {
        this.notes = notes;
    }

    public void setNotesAdapterListner(NotesAdapterListener adapterListener) {
        listener = adapterListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View itemView = layoutInflater.inflate(R.layout.list_item_note, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Note note = notes.get(position);

        holder.noteDescriptionTv.setText(note.description);
        holder.noteTitleTv.setText(note.title);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView noteTitleTv;
        private final TextView noteDescriptionTv;

        ViewHolder(View itemView) {
            super(itemView);

            noteTitleTv = (TextView) itemView.findViewById(R.id.item_note_title);
            noteDescriptionTv = (TextView) itemView.findViewById(R.id.item_note_description);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(getAdapterPosition());
        }
    }

    public interface NotesAdapterListener {
        void onItemClick(int position);
    }
}
