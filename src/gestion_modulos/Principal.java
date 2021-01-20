package gestion_modulos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aux=0;
		Modulos p = new Modulos("Programacion","PGR", 2);
		Modulos b = new Modulos("Base de datos","BDD", 1);
		Modulos l = new Modulos("Lenguaje Marcas","LM", 3);
		
		Modulos vModulos[]=new Modulos[7];
		vModulos[0]= p;
		vModulos[1]= b;
		vModulos[2]= l;
		
		
	
for (Modulos m : vModulos) {
	if(m!=null) {
			aux = m.getHoras() + aux;
	}
		}
System.out.println("El numero de horas totales son: "+ aux);
	}
	

}
