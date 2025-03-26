import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.FichierInexistantTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.QuestInvalideTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.ListeQuestRenvoyeTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.QuestionnaireServicesImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.interfaces.QuestionnaireServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.QuestInvalideException;

import java.util.ArrayList;

public class FournirListeQuestionnaireTest {

    static QuestionnaireServices questionnaireServices;

    @BeforeAll
    public static void  init(){
        questionnaireServices = new QuestionnaireServicesImpl();
    }
    @Test
    public void fichierInexistantExceptionTest() {
       // questionnaireServices= new FichierInexistantTest();
        String chemin = "src/main/resources/quest_inexistant.csv";

        Assertions.assertThrows(FichierInexistantException.class, () -> questionnaireServices.fournirListeQuestionnaire(chemin));
    }

    @Test
    public void questInvalideExceptionTest() {
      //  questionnaireServices = new QuestInvalideTest();
        String chemin = "src/main/resources/quest_invalide.csv";

        Assertions.assertThrows(QuestInvalideException.class, () -> questionnaireServices.fournirListeQuestionnaire(chemin));
    }

    @Test
    public void listeQuestRenvoyeTest() throws QuestInvalideException, FichierInexistantException {
      //  questionnaireServices = new ListeQuestRenvoyeTest();
        QuestionnaireDTO quest1 = new QuestionnaireDTO("maths");
        QuestionnaireDTO quest2 = new QuestionnaireDTO("litterature");
        ArrayList<QuestionnaireDTO> questionnaire = new ArrayList<>();
        questionnaire.add(quest1);
        questionnaire.add(quest2);

        Assertions.assertTrue(questionnaire.equals(questionnaireServices.fournirListeQuestionnaire("src/main/resources/quest_valide.csv")));

        //Assertions.assertEquals(questionnaireServices.fournirListeQuestionnaire("src/main/resources/quest_valide.csv"), questionnaire);
    }
}
