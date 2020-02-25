import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GestorGruposPruebasExcepciones {
    private static GestorGrupos gestorGrupos;
    @Before
    public void creaGestorGrupos(){
        gestorGrupos=new GestorGrupos();
    }
    @After
    public void eliminaGestorGrupos(){
        gestorGrupos=null;
    }
    @Test(expected = IllegalArgumentException.class)
    public void excepcionListaVacia() {
        gestorGrupos.dividir_lista(new int[]{},0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void excepcionListaNula() {
        gestorGrupos.dividir_lista(null,0.9f);
    }
    @Test(expected = IllegalArgumentException.class)
    public void excepcionFraccionMayorUno() {
        gestorGrupos.dividir_lista(new int[]{1,2,2,3,5},2.0f);
    }
    @Test(expected = IllegalArgumentException.class)
    public void excepcionFraccionMenorZero() {
        gestorGrupos.dividir_lista(new int[]{1,5,4,2,2,1},-1.0f);
    }
}
