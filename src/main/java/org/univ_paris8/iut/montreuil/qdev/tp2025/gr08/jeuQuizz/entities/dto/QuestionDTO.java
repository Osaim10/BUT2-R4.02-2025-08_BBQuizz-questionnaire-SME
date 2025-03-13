package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto;

import com.sun.tools.javac.comp.Todo;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.enums.Langue;

public class QuestionDTO {

    int num_question = 0;
    Enum<Langue> langue;
    String libelle_question, reponse, explication, reference;
    int difficulte;

    public QuestionDTO() {
        //TODO
        num_question++;
    }
}
