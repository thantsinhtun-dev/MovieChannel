package com.stone.moviechannel.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stone.moviechannel.R;
import com.stone.moviechannel.adapter.MovieAdapter;
import com.stone.moviechannel.data.Movie;
import com.stone.moviechannel.databinding.FragmentDramaBinding;

import java.util.ArrayList;
import java.util.List;


public class DramaFragment extends Fragment {

    private FragmentDramaBinding binding;
    private List<Movie> movieList;
    MovieAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drama, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentDramaBinding.bind(view);

        movieList=new ArrayList<>();
        init();


        adapter = new MovieAdapter(getContext());
        adapter.setMovieList(movieList);
        binding.rcDrama.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.rcDrama.setHasFixedSize(true);
        binding.rcDrama.setAdapter(adapter);


    }
    void init(){
        movieList.add(new Movie("testing","","","https://1.bp.blogspot.com/-hu8UkD96vUo/XfUqEBvgB6I/AAAAAAAABDg/evxNz84MTQA1NbairvLaKVqYpc-8wnMKACLcBGAsYHQ/s1600/spiderman_homecoming.jpg",""));
        movieList.add(new Movie("testing","","","https://1.bp.blogspot.com/-hu8UkD96vUo/XfUqEBvgB6I/AAAAAAAABDg/evxNz84MTQA1NbairvLaKVqYpc-8wnMKACLcBGAsYHQ/s1600/spiderman_homecoming.jpg",""));
        movieList.add(new Movie("testing","","","https://1.bp.blogspot.com/-hu8UkD96vUo/XfUqEBvgB6I/AAAAAAAABDg/evxNz84MTQA1NbairvLaKVqYpc-8wnMKACLcBGAsYHQ/s1600/spiderman_homecoming.jpg",""));
        movieList.add(new Movie("testing","","","https://1.bp.blogspot.com/-hu8UkD96vUo/XfUqEBvgB6I/AAAAAAAABDg/evxNz84MTQA1NbairvLaKVqYpc-8wnMKACLcBGAsYHQ/s1600/spiderman_homecoming.jpg",""));
        movieList.add(new Movie("testing","","","https://1.bp.blogspot.com/-hu8UkD96vUo/XfUqEBvgB6I/AAAAAAAABDg/evxNz84MTQA1NbairvLaKVqYpc-8wnMKACLcBGAsYHQ/s1600/spiderman_homecoming.jpg",""));

    }

}