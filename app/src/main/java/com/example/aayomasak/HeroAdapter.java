package com.example.aayomasak;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
    private ArrayList<Hero> localDataSet;


    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvName;
        private final TextView tvUser;
        private final ImageView imgFoodPoster;
        private final ImageView imgUserPoster;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            tvName = view.findViewById(R.id.food_name);
            tvUser = view.findViewById(R.id.food_creator);
            imgFoodPoster =  view.findViewById(R.id.food_poster);
            imgUserPoster = view.findViewById(R.id.food_pfp);
        }

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        int foodPoster = localDataSet.get(position).getFoodPoster();
        int userPoster = localDataSet.get(position).getUserPoster();
        String name = localDataSet.get(position).getName();
        String rating = localDataSet.get(position).getRating();
        String user = localDataSet.get(position).getUser();


        viewHolder.imgFoodPoster.setImageResource(foodPoster);
        viewHolder.imgUserPoster.setImageResource(userPoster);
        viewHolder.tvName.setText(name);
        viewHolder.tvUser.setText(user);

//        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(viewHolder.itemView.getContext(), DetailActivity.class);
//                intent.putExtra("foodPoster", foodPoster);
//                intent.putExtra("userPoster", userPoster);
//                intent.putExtra("name", name);
//                intent.putExtra("description", description);
//                intent.putExtra("ingredients", ingredients);
//                intent.putExtra("steps", steps);
//                intent.putExtra("rating", rating);
//                intent.putExtra("user", user);
//                viewHolder.itemView.getContext().startActivity(intent);
//            }
//        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
