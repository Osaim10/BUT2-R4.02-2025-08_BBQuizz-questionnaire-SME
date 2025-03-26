package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.interfaces.QuestionnaireServices;

import java.util.ArrayList;

public class ListeQuestRenvoyeTest implements QuestionnaireServices {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire(String chemin) {
        QuestionnaireDTO quest1 = new QuestionnaireDTO("maths");
        QuestionnaireDTO quest2 = new QuestionnaireDTO("litterature");
        ArrayList<QuestionnaireDTO> questionnaire = new ArrayList<>();
        questionnaire.add(quest1);
        questionnaire.add(quest2);
        return questionnaire;
    }
}
