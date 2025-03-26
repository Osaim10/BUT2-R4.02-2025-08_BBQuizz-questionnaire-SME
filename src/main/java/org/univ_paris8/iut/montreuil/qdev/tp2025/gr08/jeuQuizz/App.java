package org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.QuestInvalideTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.QuestionnaireServicesImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.QuestInvalideException;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) throws QuestInvalideException, FichierInexistantException {
        System.out.println( "Hello World!" );
        QuestionnaireDTO quest1 = new QuestionnaireDTO("maths");
        QuestionnaireDTO quest2 = new QuestionnaireDTO("litterature");
        ArrayList<QuestionnaireDTO> questionnaire = new ArrayList<>();
        questionnaire.add(quest1);
        questionnaire.add(quest2);
        new QuestionnaireServicesImpl().fournirListeQuestionnaire("src/main/resources/quest_valide.csv");

        for (int i = 0; i < questionnaire.size(); i++) {
            System.out.println("Questionnaire " + (i + 1) + " : " + questionnaire.get(i).toString());
        }
    }

}
