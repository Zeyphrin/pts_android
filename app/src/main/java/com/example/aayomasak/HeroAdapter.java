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

    public HeroAdapter(ArrayList<Hero> dataset){
        localDataSet = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
//        private final TextView tvName;
//        private final TextView tvUser;
        private final ImageView imgFoodPoster;
//        private final ImageView imgUserPoster;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
//            tvName = view.findViewById(R.id.nama_makanan);
//            tvUser = view.findViewById(R.id.nama);
            imgFoodPoster =  view.findViewById(R.id.imageView3);
//            imgUserPoster = view.findViewById(R.id.profile);
        }

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        System.out.println(localDataSet.get(0).getFoodPoster());
        System.out.println(localDataSet.get(1).getFoodPoster());
        System.out.println(localDataSet.get(2).getFoodPoster());
        System.out.println(localDataSet.get(3).getFoodPoster());
        System.out.println(localDataSet.get(4).getFoodPoster());

        int foodPoster = localDataSet.get(position).getFoodPoster();
        int userPoster = localDataSet.get(position).getUserPoster();
        String name = localDataSet.get(position).getName();
        String user = localDataSet.get(position).getUser();


        viewHolder.imgFoodPoster.setImageResource(foodPoster);



//        viewHolder.imgUserPoster.setImageResource(userPoster);
//        viewHolder.tvName.setText(name);
//        viewHolder.tvUser.setText(user);


//        viewHolder.itemView.setOnClickListener(view -> {
//            Intent intent = new Intent(viewHolder.itemView.getContext(), DetailActivity.class);
//
//            intent.putExtra("nama", name);
//
//            viewHolder.itemView.getContext().startActivity(intent);
//        });


    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
