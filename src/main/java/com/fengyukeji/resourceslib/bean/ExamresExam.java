package com.fengyukeji.resourceslib.bean;

public class ExamresExam {
    private Integer id;

    private Integer examId;

    private Integer subjectId;

    private String userAnwser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getUserAnwser() {
        return userAnwser;
    }

    public void setUserAnwser(String userAnwser) {
        this.userAnwser = userAnwser == null ? null : userAnwser.trim();
    }
}