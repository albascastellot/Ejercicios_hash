package tablas_hash;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
	
	private List<Object>[] tabla; //la tabla es un array que contiene listas de objetos
	
	public Conjunto(int k) {
		tabla = new List[k]; // con esto acabas de crear la tabla y en cada posición/casilla le has dicho que se prepare porque puede contener arraylist pero todavía no contiene niguna
	}
	
	//no dicen nada en el enunciado pero necesito un codigo hash para saber codificar los elementos que va a manejar el conjunto
	//la clase object tiene dos metodos predefinidos que son: equals y hashCode (que te genera un hashCode bien definido)
	private int hash(Object x) {
		return Math.abs(x.hashCode()%tabla.length);
	}
	
	
	public void añade(Object x) {
		//lo primero de todo, generar el hashCode del objeto
		int pos = hash(x); //tabla.length=k
		
		//me genero el arrayList para la posicion del objeto x en mi tabla hash
		List<Object> listaObjetos = tabla[pos];
		if(!listaObjetos.contains(x))
			listaObjetos.add(x);	
	}
	
	public void add(Object x) {
		//lo primero genero su hashcode, que sera la casilla de la tabla en la que lo voy a guardar
		int pos = hash(x);
		//dentro de esa casilla yo me encuentro con un arrayList, que le voy a poner un nombre para poder preunatarle cosas (realmente no hace falta pero yo lo hago por mi propia claridad, para verlo, en los siguientes metodos ya no me refiero a ello con unnombre definido especificamente sino como tabla[pos])
		List<Object> objetosFila = tabla[pos];
		//compruebo si ya esta contenido el objeto x en la lista que hay en la posicion pos del conjunto asociada al objeto x
		if(!objetosFila.contains(x))
			objetosFila.add(x);
	}
	
	
	public boolean contains(Object x) {
		int pos = hash(x);
		return tabla[pos].contains(x);
	}
	
	public void remove(Object x) {
		int pos = hash(x);
		tabla[pos].remove(x); //no hace falta hacer un if(contains) porque el propio metodo remove de los arraylist ya comprueb si esta el objeto lo borra y si no lo encunetra no hace nada
	}

}
