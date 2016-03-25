package app.season.mvpstructure.ui.note;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.Note;
import app.season.mvpstructure.ui.base.BaseActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class NoteActivity extends BaseActivity implements INoteMvpView, NoteAdapter.OnItemClickListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.search_view)
    MaterialSearchView searchView;
    @Bind(R.id.edit)
    EditText edit;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.recycler)
    RecyclerView recycler;

    @Inject
    NoteAdapter noteAdapter;
    @Inject
    NotePresenter notePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        getActivityComponent().inject(this);
        notePresenter.attachView(this);

        noteAdapter.setOnItemClickListener(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
//        recycler.addItemDecoration();
        recycler.setAdapter(noteAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        notePresenter.query();
    }

    @Override
    protected void onDestroy() {
        notePresenter.detachView();
        super.onDestroy();
    }

    @OnClick(R.id.button)
    public void onClick() {
        Note note = new Note();
        note.text = edit.getText().toString().trim();
        note.date = "2016-3-24";
        notePresenter.insert(note);
    }

    @Override
    public void addNote(Note note) {
        noteAdapter.addNote(note);
    }

    @Override
    public void deleteNote(int position) {
        noteAdapter.deleteNote(position);
    }

    @Override
    public void addData(List<Note> notes) {
        noteAdapter.addData(notes);
    }

    @Override
    public void onItemClick(int rowId, int position) {
        notePresenter.delete(rowId, position);
    }
}
