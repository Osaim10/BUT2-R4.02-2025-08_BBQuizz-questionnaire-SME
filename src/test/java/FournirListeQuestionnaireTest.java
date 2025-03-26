import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.FichierInexistantTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.QuestInvalideTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.ListeQuestRenvoyeTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.QuestInvalideException;

import java.util.ArrayList;

public class FournirListeQuestionnaireTest {

    @Test
    public void fichierInexistantExceptionTest() {
        FichierInexistantTest fichier = new FichierInexistantTest();
        String chemin = "";

        Assertions.assertThrows(FichierInexistantException.class, () -> fichier.fournirListeQuestionnaire(chemin));
    }

    @Test
    public void questInvalideExceptionTest() {
        QuestInvalideTest quest = new QuestInvalideTest();
        String chemin = "";

        Assertions.assertThrows(QuestInvalideException.class, () -> quest.fournirListeQuestionnaire(chemin));
    }

    @Test
    public void listeQuestRenvoyeTest() {
        QuestionnaireDTO quest1 = new QuestionnaireDTO("gaming");
        QuestionnaireDTO quest2 = new QuestionnaireDTO("sports");
        QuestionnaireDTO quest3 = new QuestionnaireDTO("cinema");
        ArrayList<QuestionnaireDTO> questionnaire = new ArrayList<>();
        questionnaire.add(quest1);
        questionnaire.add(quest2);
        questionnaire.add(quest3);

        Assertions.assertEquals(new ListeQuestRenvoyeTest().fournirListeQuestionnaire(""), questionnaire);
    }
}
