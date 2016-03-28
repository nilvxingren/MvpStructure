package app.season.mvpstructure.ui.note;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
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
    Toolbar mToolbar;
    @Bind(R.id.search_view)
    MaterialSearchView mSearchView;
    @Bind(R.id.edit)
    EditText mEdit;
    @Bind(R.id.button)
    Button mButton;
    @Bind(R.id.recycler)
    RecyclerView mRecycler;

    @Inject
    NoteAdapter mNoteAdapter;
    @Inject
    NotePresenter mNotePresenter;

    @OnClick(R.id.button)
    public void onClick() {
        Note note = new Note();
        note.text = mEdit.getText().toString().trim();
        note.date = "2016-3-24";
        mNotePresenter.insert(note);
    }

    @Override
    public void addNote(Note note) {
        mNoteAdapter.addNote(note);
    }

    @Override
    public void deleteNote(int position) {
        mNoteAdapter.deleteNote(position);
    }

    @Override
    public void addData(List<Note> notes) {
        mNoteAdapter.addData(notes);
    }

    @Override
    public void onItemClick(int rowId, int position) {
        mNotePresenter.delete(rowId, position);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        getActivityComponent().inject(this);
        mNotePresenter.attachView(this);

        mNoteAdapter.setOnItemClickListener(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(linearLayoutManager);
//        mRecycler.addItemDecoration();
        mRecycler.setAdapter(mNoteAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mNotePresenter.query();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mNotePresenter.detachView();
    }
}
