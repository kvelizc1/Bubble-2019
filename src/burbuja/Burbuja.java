
package burbuja;
import javax.swing.JOptionPane;

/**
 *
 * @author kenyv
 */
public class Burbuja {
    //Ordenamiento de burbuja. En sintesis: 1. cuenta, 2. compara, 3. intercambia si es necesario; caso contrario, pasa a la siguiente posicion. 
    public static void main(String[] args) {
        int aux; //La variable magica <3
        boolean cambalache=false; //La otra variable magica
        int nums;
        //Vamos a pedir unos cuantos numeros en desorden para ordenarlos luego.
        nums = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros vamos a ordernar?"));
        int[] arr = new int[nums];//Un arreglo con la cantidad de numeros deseados para luego ordenarlo
        for(int i=0;i<nums;i++){    //Llenando el arreglo
            aux=i+1;
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el numero "+aux));
            System.out.print(arr[i]+" ");//Verifico que mis numeros se hayan guardado
        }        
  
        while(true){
            //el arreglo se comienza a verificar desde la pocision 1 y compara con la pocision previa, sea esta 0
            cambalache=false;
            for(int i=1;i<arr.length;i++){ //Vamos a revisar cada pocision del arreglo
                if(arr[i]<arr[i-1]){    //Si el valor que estoy verificando es menor que mi valor previo, vamor a hacer magia (cambio)
                    aux=arr[i]; //"sacamos/copiamos" el valor desde el arreglo
                    //Intercambiamos:
                    arr[i]=arr[i-1]; //Mi valor menor lo asigno a la posicion previa
                    arr[i-1]=aux;//"Pegamos" el vamor mayor a la posicion que estabamos evaluando
                    cambalache=true;
                }
            }
            if(cambalache==false)break;
        }//Voy a hacer esto hasta que ya no haya hecho ningun cambio

/*
       //ESTO NO FUNCIONA Y NO ENTIENDO POR QUE, SI DEBERIA FUNCIONAR IGUAL! >:'v
        do{
            //el arreglo se comienza a verificar desde la pocision 1 y compara con la pocision previa, sea esta 0
            cambalache=false;
            for(int i=1;i<arr.length;i++){ //Vamos a revisar cada pocision del arreglo
                if(arr[i]<arr[i-1]){    //Si el valor que estoy verificando es menor que mi valor previo, vamor a hacer magia (cambio)
                    aux=arr[i]; //"sacamos/copiamos" el valor desde el arreglo
                    //Intercambiamos:
                    arr[i]=arr[i-1]; //Mi valor menor lo asigno a la posicion previa
                    arr[i-1]=aux;//"Pegamos" el vamor mayor a la posicion que estabamos evaluando
                    cambalache=true;
                }
            }
        }while(cambalache=false);//Voy a hacer esto hasta que ya no haya hecho ningun cambio
 */
        System.out.println("\nValores ordenados: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
