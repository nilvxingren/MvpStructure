package app.season.mvpstructure.ui.main;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.ui.base.BaseActivity;
import app.season.mvpstructure.ui.note.NoteActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * RepoActivity
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class RepoActivity extends BaseActivity implements IRepoMvpView {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.recycler)
    RecyclerView recycler;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.search_view)
    MaterialSearchView searchView;
    @Bind(R.id.network_error)
    TextView networkError;
    @Bind(R.id.progressbar)
    ContentLoadingProgressBar progressBar;

    @Inject
    RepoPresenter repoPresenter;

    @Inject
    RepoAdapter repoAdapter;

    @OnClick(R.id.network_error)
    public void onClick() {
        repoPresenter.listRepos("ssseasonnn");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            getWindow().setEnterTransition(new Explode());
            getWindow().setExitTransition(new Explode());
        }

        setContentView(R.layout.activity_repo);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        getActivityComponent().inject(this);
        repoPresenter.attachView(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
//        recycler.addItemDecoration();
        recycler.setAdapter(repoAdapter);

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Do some magic
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        repoPresenter.listRepos("ssseasonnn");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        repoPresenter.detachView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.fab)
    public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        Intent intent = new Intent();
        intent.setClass(RepoActivity.this, NoteActivity.class);
        startActivity(intent);
    }

    /**
     * implement IRepoMvpView method
     */
    @Override
    public void onListRepos(List<Repo> list) {
        recycler.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
        networkError.setVisibility(View.GONE);
        repoAdapter.addData(list);
    }

    @Override
    public void onNetworkError() {
        networkError.setVisibility(View.VISIBLE);
        recycler.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
        networkError.setVisibility(View.GONE);
        recycler.setVisibility(View.GONE);
    }


}
