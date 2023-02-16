package com.example.train;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    MutableLiveData<Integer> score = new MutableLiveData<>();

    public  MainViewModel(){
        score.setValue(0);
        Log.i("mainViewmodel", "viewModel is created");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("mainViewmodel", "viewModel isdestroyed");
    }
    public void increment(){
        score.setValue(score.getValue() + 1);
    }
    public void decrement(){
        score.setValue(score.getValue() - 1);
    }
}
