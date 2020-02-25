import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;


@RunWith(Parameterized.class)
public class GestorGruposPruebas {
    private static GestorGrupos gestor = null;
    int vectorEntrada[];
    float fraccion;
    int salidaEsperada[][];


    public GestorGruposPruebas(int[] vectorEntrada, float fraccion, int[][] salidaEsperada) {
        this.vectorEntrada = vectorEntrada;
        this.fraccion = fraccion;
        this.salidaEsperada = salidaEsperada;

    }

    @Before
    public void creaGestorGrupos() {
        gestor = new GestorGrupos();
    }

    @After
    public void eliminaGestorGrupos() {
        gestor = null;
    }

    @Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 2, 4, 4, 6, 6}, 0.5f, new int[][]{{0, 2, 4}, {1, 3, 5}}},
                {new int[]{0, 1, 2, 3, 4}, 0.1f, new int[][]{{0, 1, 2, 3, 4}, {}}},
                {new int[]{1, 1, 1, 1, 1}, 0.5f, new int[][]{{0, 1, 2}, {3, 4}}},
                {new int[]{1}, 1.0f, new int[][]{{0}, {}}},
                {new int[]{1}, 0.0f, new int[][]{{}, {0}}}
        });
    }

    @Test
    public void prueabaDividirLista() {
        assertArrayEquals(salidaEsperada,gestor.dividir_lista(vectorEntrada,fraccion));
    }
}
