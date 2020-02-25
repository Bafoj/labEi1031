public class GestorGruposStub extends GestorGrupos {
    public int[] grupos;
    public int[] subtotales;
    @Override
    public int[] obtener_subtotales_por_grupo(int[] lista, int[] grupos){
        return subtotales;
    }
    @Override
    public int[] obtener_grupos(int[] lista){
        return grupos;
    }
}
