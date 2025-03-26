import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.services.impl.FichierInexistantTest;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr08.jeuQuizz.utils.exceptions.FichierInexistantException;

public class FournirListeQuestionnaireTest {

    @Test
    public void fichierInexistantExceptionTest() {
        FichierInexistantTest fichier = new FichierInexistantTest();

        Assertions.assertThrows(FichierInexistantException.class, () -> fichier.fournirListeQuestionnaire(""));
    }

    @Test
    public void questInvalideExceptionTest() {

    }
}
