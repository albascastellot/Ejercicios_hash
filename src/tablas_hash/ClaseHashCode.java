package tablas_hash;

public class ClaseHashCode {

	String s;
	public ClaseHashCode(String s) {
		this.s = s;
	}
	
	public int hashCode() {
		char c = s.charAt(0);
		return c%128;
	}
}
