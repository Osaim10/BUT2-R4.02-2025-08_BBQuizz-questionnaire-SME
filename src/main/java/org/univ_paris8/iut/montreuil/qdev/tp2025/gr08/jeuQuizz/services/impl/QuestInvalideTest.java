package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.interfaces.QuestionnaireServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.QuestInvalideException;

import java.util.ArrayList;

public class QuestInvalideTest implements QuestionnaireServices {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire(String chemin) throws QuestInvalideException {
        throw new QuestInvalideException();
    }
}
