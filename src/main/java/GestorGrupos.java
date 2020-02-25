import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class GestorGrupos {
    public int[][] dividir_lista(int[] elementos, float fraccion){
        if(elementos == null ){
            throw new IllegalArgumentException("elementos es nulo");
        }
        if(elementos.length == 0){
            throw new IllegalArgumentException("la longitud de elementos es 0");
        }
        if(fraccion > 1.0f || fraccion<0.0f){
            throw new IllegalArgumentException("La fracción esta fuera de rango");
        }
        int [] grupos= obtener_grupos(elementos);
        int [] subtotales= obtener_subtotales_por_grupo(elementos,grupos);
        int [][] sol=new int[2][];
        int longL1=0;
        int [] asignarL1=new int[subtotales.length];
        for (int i = 0; i < subtotales.length; i++) {
            int cantidad=Math.round(subtotales[i]*fraccion);
            longL1 += cantidad;
            asignarL1[i]=cantidad;
        }
        int [] l1 = new int[longL1];
        int [] l2 = new int[elementos.length-longL1];
        int i1=0,i2=0;
        for (int i = 0; i < elementos.length; i++) {
            int indice=0;
            for (int j = 0; j <grupos.length; j++) {
                if(grupos[j]==elementos[i]) {
                    indice = j;
                    break;
                }
            }
            if(asignarL1[indice]>0){
                l1[i1]=i;
                asignarL1[indice]--;
                i1++;
            }else{
                l2[i2]=i;
                i2++;
            }
        }
        sol[0]=l1;
        sol[1]=l2;
        return sol;
    }
    public int[] obtener_grupos(int[] lista){
// Dada lista de elementos, devuelve lista de etiquetas
// Para lista ejemplo, debería devolver [3,5,1,7]
        throw new NotImplementedException();
    }
    public int[] obtener_subtotales_por_grupo(int[] lista, int[] grupos){
// Dada lista de elementos y una lista de grupos,
// devuelve una lista con los subtotales por grupo
// Para lista ejemplo, debería devolver [5,3,3,2]
        throw new NotImplementedException();
    }

}
