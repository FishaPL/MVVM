package com.fisha.mvvm_livedata;

public class ScoreModel {
    private int scoreA;
    private int scoreB;

    public ScoreModel() {
        this.scoreA = 10;
        this.scoreB = 0;
    }

    public ScoreModel(int scoreA, int scoreB) {
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }
}
