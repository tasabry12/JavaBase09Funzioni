
public class mainClass {
//	public static void raddoppia(int numero)
//	{
//	System.out.println("Ho ricevuto il numero: "+numero+"\n");
//	numero *=2;
//	System.out.println("Che raddoppiato fa: "+numero+"\n");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int n =333;
//raddoppia(n);
//System.out.println("Dopo il richiamo del metodo: "+n+"\n");
//	}

	class contenitore
	{
	public int n=333;
	}
	
	public static void raddoppia(contenitore cont)
	{
	cont.n *=2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
contenitore c = new mainClass().new contenitore();   // oppure contenitore c = new contenitore(); e dichiari la classe contenitore di tipo static
System.out.println("Prima del richiamo del metodo: "+c.n+"\n");
raddoppia(c);
System.out.println("Dopo il richiamo del metodo: "+c.n+"\n");
	}

}
