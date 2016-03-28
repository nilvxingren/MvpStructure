package app.season.mvpstructure.ui.mainfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.MovieListResponse;
import app.season.mvpstructure.ui.base.BaseFragment;
import app.season.mvpstructure.ui.moviedetail.MovieDetailActivity;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class ComingSoonFragment extends BaseFragment implements IMovieMvpView,
        RecyclerArrayAdapter.OnLoadMoreListener,
        SwipeRefreshLayout.OnRefreshListener {

    @Bind(R.id.recycler)
    EasyRecyclerView mRecycler;

    @Inject
    MovieAdapter mMovieAdapter;

    @Inject
    MoviePresenter mMoviePresenter;


    @Override
    public RecyclerView.Adapter getAdapter() {
        return mMovieAdapter;
    }

    @Override
    public void onLoadMore() {

    }

    @Override
    public void onRefresh() {
        mMoviePresenter.getComingSoon(0, 20);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        ButterKnife.bind(this, view);
        mMoviePresenter.attachView(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycler.setAdapterWithProgress(mMovieAdapter);
        mRecycler.setRefreshListener(this);

        mMovieAdapter.setMore(R.layout.recycler_item_more, this);
        mMovieAdapter.setNoMore(R.layout.recycler_item_nomore);
        mMovieAdapter.setError(R.layout.recycler_item_error).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onRefresh();
            }
        });

        mMovieAdapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                MovieListResponse.SubjectsEntity entity = mMovieAdapter.getItem(position);
                Intent intent = new Intent();
                intent.putExtra(MovieDetailActivity.INTENT_MOVIE_ID, entity.getId());
                intent.setClass(getActivity(), MovieDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        mMoviePresenter.getComingSoon(0, 20);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        mMoviePresenter.detachView();
    }
}
