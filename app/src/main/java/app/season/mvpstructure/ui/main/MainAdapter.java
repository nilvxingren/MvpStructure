package app.season.mvpstructure.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import app.season.mvpstructure.R;
import app.season.mvpstructure.data.bean.Repo;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * MainActivity's Adapter
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {


    private List<Repo> mData;

    @Inject
    public MainAdapter() {
        mData = new ArrayList<>();
    }

    public void addData(List<Repo> data) {
        this.mData.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.repoIcon.setImageURI(Uri.parse(mData.get(position).get));
        holder.repoName.setText(mData.get(position).getName());
        holder.repoDescribe.setText(mData.get(position).getDescription());
        holder.repoLanguage.setText(mData.get(position).getLanguage());
        holder.repoStar.setText(mData.get(position).getStargazers_count() + "");
        holder.repoFork.setText(mData.get(position).getForks_count() + "");
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.repo_icon)
        ImageView repoIcon;
        @Bind(R.id.repo_name)
        TextView repoName;
        @Bind(R.id.repo_describe)
        TextView repoDescribe;
        @Bind(R.id.repo_language)
        TextView repoLanguage;
        @Bind(R.id.repo_star)
        TextView repoStar;
        @Bind(R.id.repo_fork)
        TextView repoFork;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
