package app.season.mvpstructure.ui.moviedetailfragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import javax.inject.Inject;

import app.season.mvpstructure.data.bean.MovieIntroduceResponse;
import app.season.mvpstructure.injection.ActivityContext;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 15:55
 * FIXME
 */
public class MovieIntroduceAdapter extends RecyclerArrayAdapter<MovieIntroduceResponse.CastsEntity> {
    private static final int MOVIE_BASEINFO = 0x0001;
    private static final int MOVIE_ACTOR = 0x0002;
    private static final int MOVIE_SHORT_COMMENT = 0x0003;

    @Inject
    public MovieIntroduceAdapter(@ActivityContext Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getViewType(int position) {
        return 0;
    }

    static class ViewHolder extends BaseViewHolder<MovieIntroduceResponse.CastsEntity> {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
