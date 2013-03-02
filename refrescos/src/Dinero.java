
public class Dinero {
	static int acumulado=0;
	static int cambio=0;
	static String acumS = "$0";
	static String cambioS = "$0";
	
	public static String ingresa(int moneda){
		if(moneda==0)
			acumulado+=1;
		else if(moneda==1)
			acumulado+=2;
		else if(moneda==2)
			acumulado+=5;
		else if(moneda==3)
			acumulado+=10;
		
		acumS=("$"+acumulado);
		return acumS;
	}
	public static String cambio(String Seleccionado){
		
		if(Seleccionado.equals("Coca-Cola"))
			cambio=acumulado-producto.coca();
		else if(Seleccionado.equals("Coca-Cola Zero"))
			cambio=acumulado-producto.cocaz();
		else if(Seleccionado.equals("Fanta"))
			cambio=acumulado-producto.fanta();
		else if(Seleccionado.equals("Sprite"))
			cambio=acumulado-producto.sprite();
	
		if(cambio>=0){
			cambioS=("$"+cambio);
			acumulado=0; 
		}
		else
			cambioS=("Te falta dinero");
		return cambioS;
	}
}
