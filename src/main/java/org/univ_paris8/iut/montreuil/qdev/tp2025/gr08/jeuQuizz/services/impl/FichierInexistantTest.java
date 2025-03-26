package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.interfaces.QuestionnaireServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;

import java.util.ArrayList;

public class FichierInexistantTest implements QuestionnaireServices {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire(String chemin) throws FichierInexistantException {
        throw new FichierInexistantException();
    }
}
