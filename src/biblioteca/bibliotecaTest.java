package biblioteca;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class bibliotecaTest {

    @Test
    public void testCalcularIdade() {
        Usuario usuario = new Usuario();
        usuario.setIdade(30);
        assertEquals(30, usuario.getIdade());
    }

    // Adicione mais métodos de teste conforme necessário
}
