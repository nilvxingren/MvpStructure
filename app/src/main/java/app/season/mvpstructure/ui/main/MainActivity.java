package app.season.mvpstructure.ui.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.Repo;
import app.season.mvpstructure.ui.base.BaseActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * MainActivity
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class MainActivity extends BaseActivity implements IMainMvpView {

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
    MainPresenter mainPresenter;

    @Inject
    MainAdapter mainAdapter;

    @OnClick(R.id.network_error)
    public void onClick() {
        mainPresenter.listRepos("ssseasonnn");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        getActivityComponent().inject(this);
        mainPresenter.attachView(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linearLayoutManager);
//        recycler.addItemDecoration();
        recycler.setAdapter(mainAdapter);

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
        mainPresenter.listRepos("ssseasonnn");
    }

    @Override
    protected void onDestroy() {
        mainPresenter.detachView();
        super.onDestroy();
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

    }

    /**
     * implement IMainMvpView method
     */
    @Override
    public void onListRepos(List<Repo> list) {
        recycler.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
        networkError.setVisibility(View.GONE);
        mainAdapter.addData(list);
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
