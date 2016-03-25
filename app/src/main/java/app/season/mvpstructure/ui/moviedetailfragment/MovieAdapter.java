package app.season.mvpstructure.ui.moviedetailfragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import app.season.mvpstructure.data.bean.MovieIntroduceResponse;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 16:54
 * FIXME
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private static final int MOVIE_BASEINFO = 0x0001;
    private static final int MOVIE_ACTOR = 0x0002;
    private static final int MOVIE_SHORT_COMMENT = 0x0003;
    private MovieIntroduceResponse mMovieIntroduceResponse;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return MOVIE_BASEINFO;
        }
        return super.getItemViewType(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
