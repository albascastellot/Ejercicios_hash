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
	
}
