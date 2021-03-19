package com.fisha.mvvm_livedata;

import android.view.View;

import java.util.Random;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private ScoreModel scoreModel;
    private Random rand;

    private MutableLiveData<Integer> teamAScore = new MutableLiveData<>();
    public MutableLiveData<Integer> teamBScore = new MutableLiveData<>();

    public ScoreViewModel() {
        scoreModel = new ScoreModel();
        rand = new Random();
        teamAScore.setValue(scoreModel.getScoreA());
        teamBScore.setValue(scoreModel.getScoreB());
    }

    public LiveData<Integer> getTeamAScore() {
        return teamAScore;
    }
    public MutableLiveData<Integer> getTeamBScore() {
        return teamBScore;
    }

    public void setModelScoreA() {
        teamAScore.setValue(rand.nextInt(10));
    }

    public void setModelScoreB() {
        teamBScore.setValue(rand.nextInt(10));
    }


    public void changeData(View view) {
        setModelScoreA();
        setModelScoreB();
    }

}
