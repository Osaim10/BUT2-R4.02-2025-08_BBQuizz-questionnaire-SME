package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.interfaces.QuestionnaireServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.QuestInvalideException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionnaireServicesImpl implements QuestionnaireServices {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire(String chemin) throws QuestInvalideException, FichierInexistantException {
        ArrayList<QuestionnaireDTO> questionnaires = new ArrayList<>();
        QuestionnaireDTO questionnaire = new QuestionnaireDTO("Sports");

        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length >= 8) {
                    try {
                        int num_question = Integer.parseInt(values[1].trim());
                        Langue langue = Langue.valueOf(values[2].trim().substring(0, 2));
                        String libelle_question = values[3].trim();
                        String reponse = values[4].trim();
                        int difficulte = Integer.parseInt(values[5].trim());
                        String explication = values[6].trim();
                        String reference = values[7].trim();

                        QuestionDTO questionDTO = new QuestionDTO(num_question, langue, libelle_question, reponse, difficulte, explication, reference);
                        questionnaire.addQuestion(questionDTO);

                    } catch (IllegalArgumentException e) {
                        throw new QuestInvalideException();
                    }
                } else {
                    throw new QuestInvalideException();
                }
            }
            questionnaires.add(questionnaire);

        } catch (IOException e) {
            throw new FichierInexistantException();
        }
        return questionnaires;
    }
}
