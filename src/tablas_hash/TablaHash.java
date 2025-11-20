package tablas_hash;

import java.util.List;

public class TablaHash {

	private List<Integer>[] tablaValor;
	private List<ClaseHashCode>[] tablaClave;
	
	public TablaHash() {
		tablaClave = new List[128];
		tablaValor = new List[128];
	}
	
	public void put (ClaseHashCode clave, Integer valor) {
		List<ClaseHashCode> colisiones = tablaClave[clave.hashCode()];
		List<Integer> valores = tablaValor[clave.hashCode()]; //el numero verde tiene que ir exactamente a la misma posicion pero en la tabla de valores
		if(!colisiones.contains(clave)) {
			colisiones.add(clave);
			valores.add(valor);
		}
		
	}
	
	//LO QUE HEMOS HECHO EN ESTE EJERCICIO CON ESTAS 2 TABLAS HASH ES EL FUNCIONAMIENTO INTERNO DE UN MAP
	//EL FUNCIONAMIENTO INTERNO DE UN SET TENDRÍA SOLO UNA TABLA
	/**
	 * ¿pero y cuando hay que hacer esto, si ya existen los map y los set que lo hacen por nosotros?
	 * bueno pues para programitas y cosas sin importancia o mierderos pues puedes usarte esas colecciones predefinidas
	 * pero en esta asignatura estamos aprendiendo a ver como funcionan las cosas por dentro (los algoritmos)
	 * para aprender a programarlos nosotros mismos cuando nos haga falta porque cuando tengamos que hacer un programa
	 * tocho, importante y que tenga que ser muy pro, nos interesará hacernos nosotros mismos las tablas hash porque
	 * de esa manera tú puedes tener absolutamente todo controlado (tamaño de la tabla, posiciones y de todo)
	 * mientras que si usas los map o los set pues eso lo hace internamente eclipse y tu no te enteras de nada y no
	 * puedes controlarlo segun tus necesidades.
	 */
	
}
