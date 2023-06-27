package com.example.androidquiz.models;

public class SpojniceAnswerModel {
    String left;
    String right;

    public void setLeft(String left) {
        this.left = left;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public SpojniceAnswerModel(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public SpojniceAnswerModel() {
    }
}
