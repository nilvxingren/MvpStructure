package app.season.mvpstructure.ui.note;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.Note;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * NoteActivity's adapter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/24.
 */
public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    private OnItemClickListener onItemClickListener;
    private List<Note> list;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Inject
    public NoteAdapter() {
        list = new ArrayList<>();
    }

    public void deleteNote(int position) {
        list.remove(position);
        notifyItemRemoved(position);
        //this line below gives you the animation and also updates the
        //list items after the deleted item
        notifyItemRangeChanged(position, getItemCount());
    }

    public void addNote(Note note) {
        list.add(note);
        notifyItemInserted(list.size() - 1);
    }

    public void addData(List<Note> data) {
        this.list.clear();
        this.list.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemView.setTag(R.id.row_id, list.get(position).id);
        holder.text.setText(list.get(position).text);
        holder.date.setText(list.get(position).date);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(list.get(position).id, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.text)
        TextView text;
        @Bind(R.id.date)
        TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int rowId, int position);
    }
}
