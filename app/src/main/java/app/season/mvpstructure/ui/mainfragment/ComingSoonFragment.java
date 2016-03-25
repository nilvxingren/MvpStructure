package app.season.mvpstructure.ui.mainfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.MovieListResponse;
import app.season.mvpstructure.ui.base.BaseFragment;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class ComingSoonFragment extends BaseFragment implements IMovieMvpView {

    @Bind(R.id.recycler)
    EasyRecyclerView mRecycler;

    @Inject
    MovieAdapter mMovieAdapter;

    @Inject
    MoviePresenter mMoviePresenter;


    @Override
    public RecyclerArrayAdapter getAdapter() {
        return mMovieAdapter;
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
