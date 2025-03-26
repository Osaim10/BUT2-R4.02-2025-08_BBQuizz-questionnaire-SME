package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto;

import java.util.ArrayList;
import java.util.List;
public class QuestionnaireDTO {

    int id = 0;
    ArrayList<QuestionDTO> questions;
    String theme;

    public QuestionnaireDTO(String theme) {
        questions = new ArrayList<>();
        this.theme = theme;
        id++;
    }
    public void addQuestion(QuestionDTO question) {
        this.questions.add(question);
    }
    public String toString() {
        return "Nom du questionnaire : " ;
    }
    public List<QuestionDTO> getQuestions() {
        return questions;
    }
}
