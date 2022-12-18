package kr.co.kybex.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.kybex.toy_servlets.beans.QuestionBean;
import kr.co.kybex.toy_servlets.beans.UserInfo;

public class DataInfo {
    // 본인 정보, 본인 소속 데이타를 넘겨주는 펑션
    public UserInfo getUserInfo() {
        UserInfo yongbeom = new UserInfo();
        yongbeom.setName("김용범");
        yongbeom.setDepartment("KYB Soft");
        return yongbeom;
    }

    // 연습삼아 데이타 한묶음을 servlet에게 넘겨주는 펑션
    public QuestionBean getSampleQuestion() {
        QuestionBean bean = new QuestionBean();
        bean.setQuestion("해당 매장을 방문시 매장은 청결 하였습니까?");
        bean.setQuestions_uid("Q1");
        ArrayList answers = new ArrayList();
        answers.add("전혀 아니다");
        answers.add("아니다");
        answers.add("보통이다");
        bean.setAnswers(answers);
        return bean;
    }

    // 질문과 답변들의 묶음을 배열 형태로 servlet에게 넘겨주는 펑션
    public ArrayList getQuestions() {
        // 자바스크립트에서 데이타를 하드코딩했던 내용을 그대로 자바로 옮겨온 모양이다.
        // questions_list data input
        ArrayList questions_list = new ArrayList();

        HashMap<String, String> question = new HashMap<>();
        question.put("question", "해당 매장을 방문시 매장은 청결 하였습니까?");
        question.put("questions_uid", "Q1");
        question.put("order", "1");
        questions_list.add(question);

        question = new HashMap<>();
        question.put("question", "주문시 직원은 고객님께 친절 하였습니까?");
        question.put("questions_uid", "Q2");
        question.put("order", "2");
        questions_list.add(question);

        question = new HashMap<>();
        question.put("question", "주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        question.put("questions_uid", "Q3");
        question.put("order", "3");
        questions_list.add(question);

        question = new HashMap<>();
        question.put("question", "직원이 제조한 음료에 대해 맛은 좋았습니까?");
        question.put("questions_uid", "Q4");
        question.put("order", "4");
        questions_list.add(question);

        question = new HashMap<>();
        question.put("question", "해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        question.put("questions_uid", "Q5");
        question.put("order", "5");
        questions_list.add(question);

        // example_list data input
        ArrayList example_list = new ArrayList();
        HashMap<String, String> example = new HashMap<>();
        example.put("example", "전혀 아니다");
        example.put("example_uid", "E1");
        example.put("order", "1");
        example_list.add(example);

        example = new HashMap<>();
        example.put("example", "아니다");
        example.put("example_uid", "E2");
        example.put("order", "2");
        example_list.add(example);

        example = new HashMap<>();
        example.put("example", "보통이다");
        example.put("example_uid", "E3");
        example.put("order", "3");
        example_list.add(example);

        example = new HashMap<>();
        example.put("example", "그렇다");
        example.put("example_uid", "E4");
        example.put("order", "4");
        example_list.add(example);

        example = new HashMap<>();
        example.put("example", "매우 그렇다");
        example.put("example_uid", "E5");
        example.put("order", "5");
        example_list.add(example);

        // questions_answers input data
        ArrayList questions_answers = new ArrayList();
        HashMap<String, String> questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q1");
        questionAnswerSet.put("example_uid", "E1");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q1");
        questionAnswerSet.put("example_uid", "E2");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q1");
        questionAnswerSet.put("example_uid", "E3");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q2");
        questionAnswerSet.put("example_uid", "E1");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q2");
        questionAnswerSet.put("example_uid", "E2");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q2");
        questionAnswerSet.put("example_uid", "E3");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q2");
        questionAnswerSet.put("example_uid", "E4");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q3");
        questionAnswerSet.put("example_uid", "E1");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q3");
        questionAnswerSet.put("example_uid", "E2");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q4");
        questionAnswerSet.put("example_uid", "E1");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q4");
        questionAnswerSet.put("example_uid", "E2");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q4");
        questionAnswerSet.put("example_uid", "E3");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q4");
        questionAnswerSet.put("example_uid", "E4");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q4");
        questionAnswerSet.put("example_uid", "E5");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q5");
        questionAnswerSet.put("example_uid", "E1");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q5");
        questionAnswerSet.put("example_uid", "E2");
        questions_answers.add(questionAnswerSet);

        questionAnswerSet = new HashMap<>();
        questionAnswerSet.put("questions_uid", "Q5");
        questionAnswerSet.put("example_uid", "E3");
        questions_answers.add(questionAnswerSet);

        // --------------------------------------

        ArrayList output = new ArrayList();
        HashMap<String, Object> bean;

        for (int i = 0; i < questions_list.size(); i++) {
            // 질문을 순서대로 나열하고 각 질문에 맞는 답변문항을 찾아내서 매칭해서 데이타를 수집한다.
            bean = new HashMap<>(); // bean이라는 바구니에 데이타들을 수집하고(질문한개+답변들) 나중에 이 바구니를 output배열에 넣어준다.
            // new를 해야 하는 이유는 새로운 객체를 만들어주지 않을때 바구니를 재사용할때 전 문항에서 썼던 데이타를 덮어쓰는 것을 방지하기 위해서
            // 새로운 바구니를 준비하는 것이다.
            question = (HashMap<String, String>) questions_list.get(i);
            bean.put("question", question.get("question"));
            bean.put("questions_uid", question.get("questions_uid"));
            ArrayList answers = new ArrayList();

            // 각 질문마다 답변문항을 찾아내서 answer에 배열로 넣고 bean에 넣어준다.
            for (int j = 0; j < questions_answers.size(); j++) {
                questionAnswerSet = (HashMap<String, String>) questions_answers.get(j);
                if (questionAnswerSet.get("questions_uid").equals(question.get("questions_uid"))) {
                    String exampleUid = questionAnswerSet.get("example_uid");
                    String answer = null;
                    for (int k = 0; k < example_list.size(); k++) {
                        example = (HashMap<String, String>) example_list.get(k);
                        if (example.get("example_uid").equals(exampleUid)) {
                            answer = example.get("example");
                        }
                    }
                    answers.add(answer);
                }
            }
            bean.put("answers", answers);

            // 한문항에 답변들을 모아다가 묶음(bean)을 만들어주고 output 배열에 추가해준다.
            output.add(bean);
        }

        return output;
    }
}
