package app.season.mvpstructure.ui.moviedetailfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;

import app.season.mvpstructure.R;
import app.season.mvpstructure.ui.base.BaseFragment;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 14:52
 * FIXME
 */
public class StillsFragment extends BaseFragment implements IMovieIntroduceMvpView {
    @Bind(R.id.recycler)
    EasyRecyclerView mRecycler;


    private String mId;

    public void setId(String id) {
        mId = id;
    }


    @Override
    public EasyRecyclerView getRecyclerView() {
        return mRecycler;
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_move_stills, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 3));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
