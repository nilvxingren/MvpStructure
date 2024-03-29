package app.season.mvpstructure.ui.moviedetailfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.ui.base.BaseFragment;
import app.season.mvpstructure.ui.mainfragment.MoviePresenter;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 14:51
 * FIXME
 */
public class IntroduceFragment extends BaseFragment implements IMovieIntroduceMvpView {
    @Bind(R.id.recycler)
    EasyRecyclerView mRecycler;

    @Inject
    MovieIntroduceAdapter mMovieIntroduceAdapter;
    @Inject
    MoviePresenter mMoviePresenter;

    private String mId;

    public void setId(String id) {
        mId = id;
    }


    @Override
    public RecyclerView.Adapter getAdapter() {
        return mMovieIntroduceAdapter;
    }

    @Override
    public EasyRecyclerView getRecyclerView() {
        return mRecycler;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_introduce, container, false);
        ButterKnife.bind(this, view);
        mMoviePresenter.attachView(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onStart() {
        super.onStart();
        mMoviePresenter.getMovieIntroduce(mId);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        mMoviePresenter.detachView();
    }
}
