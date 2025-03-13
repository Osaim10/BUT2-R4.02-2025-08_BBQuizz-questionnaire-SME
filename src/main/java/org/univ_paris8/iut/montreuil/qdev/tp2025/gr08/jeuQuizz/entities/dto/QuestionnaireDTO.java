package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {

    int id = 0;
    ArrayList<QuestionDTO> questions;
    String theme;

    public QuestionnaireDTO(String theme) {
        questions = new ArrayList<>();
        this.theme = theme;
        id++;
    }

}
