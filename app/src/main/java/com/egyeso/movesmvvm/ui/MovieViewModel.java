package com.egyeso.movesmvvm.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.egyeso.movesmvvm.model.Movies;

public class MovieViewModel extends ViewModel {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        String movieName = getMoviesDatabase().getName();
        mutableLiveData.setValue(movieName);
    }
    private Movies getMoviesDatabase(){
        return new Movies("eslam");
    }
}
