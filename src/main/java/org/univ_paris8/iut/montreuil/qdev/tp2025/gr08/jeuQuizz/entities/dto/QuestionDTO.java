package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.enums.Langue;

public class QuestionDTO {

    int num_question = 0;
    Enum<Langue> langue;
    String libelle_question, reponse, explication, reference;
    int difficulte;

    public QuestionDTO(int num_question, Langue langue, String libelle_question, String reponse, int difficulte, String explication, String reference) {
        this.num_question = num_question;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.explication = explication;
        this.reference = reference;
        this.difficulte = difficulte;
    }
}
