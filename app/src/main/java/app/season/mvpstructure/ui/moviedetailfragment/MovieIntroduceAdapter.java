package app.season.mvpstructure.ui.moviedetailfragment;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.MovieIntroduceResponse;
import app.season.mvpstructure.injection.ActivityContext;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 16:54
 * FIXME
 */
public class MovieIntroduceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int MOVIE_BASEINFO = 0x0001;
    private static final int MOVIE_ACTOR = 0x0002;
    private static final int MOVIE_SHORT_COMMENT = 0x0003;
    private MovieIntroduceResponse mMovieIntroduceResponse;

    public void setMovieIntroduceResponse(MovieIntroduceResponse movieIntroduceResponse) {
        mMovieIntroduceResponse = movieIntroduceResponse;
    }

    @Inject
    public MovieIntroduceAdapter(@ActivityContext Context context) {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case MOVIE_BASEINFO:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_introduce_baseinfo, parent, false);
                return new BaseInfoViewHolder(view);
            case MOVIE_ACTOR:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_cast, parent, false);
                return new ActorViewHolder(view);
            case MOVIE_SHORT_COMMENT:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.movie_cast, parent, false);
                return new CommentViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BaseInfoViewHolder) {
            BaseInfoViewHolder baseInfoViewHolder = (BaseInfoViewHolder) holder;
            baseInfoViewHolder.mMoviePicture
                    .setImageURI(Uri.parse(mMovieIntroduceResponse.getImages().getMedium()));
            baseInfoViewHolder.mRatingCounts
                    .setText(mMovieIntroduceResponse.getRatings_count() + "");
            baseInfoViewHolder.mYear
                    .setText(mMovieIntroduceResponse.getYear());
            baseInfoViewHolder.mGenres
                    .setText(mMovieIntroduceResponse.getGenres().get(0));
            baseInfoViewHolder.mCountry
                    .setText(mMovieIntroduceResponse.getCountries().get(0));
            baseInfoViewHolder.mSummary
                    .setText(mMovieIntroduceResponse.getSummary());

        } else if (holder instanceof ActorViewHolder) {
            ActorViewHolder actorViewHolder = (ActorViewHolder) holder;
            actorViewHolder.mPicture
                    .setImageURI(Uri.parse(mMovieIntroduceResponse.getCasts().get(position - 1)
                            .getAvatars().getSmall()));
            actorViewHolder.mName.setText(mMovieIntroduceResponse.getCasts().get(position - 1)
                    .getName());
        } else {

        }
    }

    @Override
    public int getItemCount() {
        return mMovieIntroduceResponse.getCasts().size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return MOVIE_BASEINFO;
        }
        if (position <= mMovieIntroduceResponse.getCasts().size() && position > 0) {
            return MOVIE_ACTOR;
        }
        return super.getItemViewType(position);
    }

    static class BaseInfoViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.movie_picture)
        SimpleDraweeView mMoviePicture;
        @Bind(R.id.rating_counts)
        TextView mRatingCounts;
        @Bind(R.id.year)
        TextView mYear;
        @Bind(R.id.genres)
        TextView mGenres;
        @Bind(R.id.country)
        TextView mCountry;
        @Bind(R.id.summary)
        TextView mSummary;

        public BaseInfoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    static class ActorViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.picture)
        SimpleDraweeView mPicture;
        @Bind(R.id.name)
        TextView mName;
        @Bind(R.id.english_name)
        TextView mEnglishName;

        public ActorViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    static class CommentViewHolder extends RecyclerView.ViewHolder {

        public CommentViewHolder(View itemView) {
            super(itemView);
        }
    }


}
