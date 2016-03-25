package app.season.mvpstructure.ui.mainfragment;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.MovieListResponse;
import app.season.mvpstructure.injection.ActivityContext;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
public class MovieAdapter extends RecyclerArrayAdapter<MovieListResponse.SubjectsEntity> {

    @Inject
    public MovieAdapter(@ActivityContext Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_movie_item, parent, false);
        return new ViewHolder(view);
    }


    static class ViewHolder extends BaseViewHolder<MovieListResponse.SubjectsEntity> {
        @Bind(R.id.movie_picture)
        SimpleDraweeView moviePicture;
        @Bind(R.id.movie_name)
        TextView movieName;
        @Bind(R.id.movie_actor)
        TextView movieActor;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void setData(MovieListResponse.SubjectsEntity data) {
            super.setData(data);
            moviePicture.setImageURI(Uri.parse(data.getImages().getSmall()));
            movieName.setText(data.getTitle());
            movieActor.setText(data.getOriginal_title());
        }
    }
}
