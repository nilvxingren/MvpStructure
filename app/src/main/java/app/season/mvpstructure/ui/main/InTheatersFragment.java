package app.season.mvpstructure.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;

import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.InTheatersResponse;
import app.season.mvpstructure.ui.base.BaseFragment;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class InTheatersFragment extends BaseFragment implements IMovieMvpView {
    @Bind(R.id.recycler)
    EasyRecyclerView recycler;

    @Inject
    MovieAdapter mMovieAdapter;

    @Inject
    MoviePresenter mMoviePresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_in_theaters, container, false);
        ButterKnife.bind(this, view);
        mMoviePresenter.attachView(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapterWithProgress(mMovieAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        mMoviePresenter.getInTheaters("成都");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onGetMovie(List<InTheatersResponse.SubjectsEntity> list) {
        mMovieAdapter.addAll(list);
    }
}
