package kr.co.kybex.toy_servlets.beans;

import java.util.ArrayList;

public class QuestionBean {
    String question;
    String questionsUid;
    ArrayList answers;

    public String getQuestion() {
        return this.question;
    }

    public String getQuestionsUid() {
        return this.questionsUid;
    }

    public ArrayList getAnswers() {
        return this.answers;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestions_uid(String questionsUid) {
        this.questionsUid = questionsUid;
    }

    public void setAnswers(ArrayList answers) {
        this.answers = answers;
    }

}
