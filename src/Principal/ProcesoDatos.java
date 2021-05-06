//Crear, modificar y eliminar
package Principal;
 import java.util.ArrayList;
public class ProcesoDatos {
    private ArrayList<Object> a = new ArrayList <Object>();
    
public ProcesoDatos(){
}
public ProcesoDatos(ArrayList<Object> a){ 
    this.a = a;
    }
public void crearRegistro(Datos_Personales p){
this.a.add(p);
            
}
public void modificarRegistro(int i, Datos_Personales p){
    this.a.set(i,p);
}

public void eliminarRegistros(int i){
this.a.remove(i);
            
}

public Datos_Personales obtenerRegistro(int i){
return (Datos_Personales)a.get(i);
            
}
public int cantidadRegistros(){
return this.a.size();         
}
//
public int buscarCogido (int codigo){
for (int i = 0; i<cantidadRegistros();i++){
    if(codigo== obtenerRegistro(i).getCodigo())return i;
}
  return -1;          
}
}