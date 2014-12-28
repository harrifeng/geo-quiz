package com.hfeng.geoquiz;

public class TrueFalse {
    private int _Question;
    public int getQuestion() {
        return _Question;
    }
    public void setQuestion(int value) {
        _Question = value;
    }

    private boolean _TrueQuestion;
    public boolean isTrueQuestion() {
        return _TrueQuestion;
    }
    public void setTrueQuestion(boolean value) {
        _TrueQuestion = value;
    }

    public TrueFalse(int question, boolean trueQuestion) {
        _Question = question;
        _TrueQuestion = trueQuestion;
    }
}
