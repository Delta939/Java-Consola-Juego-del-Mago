/**
 * @(#)Juego.java
 *
 *
 * @author 
 * @version 1.00 2019/5/12
 */
import java.util.*;

public class Juego {
 	private int vidamago=100;
    private int vidajugador=100;
    private int casas;
    int hadas=0;
    private String salvarhadas;
    
    Scanner sc=new Scanner(System.in);

public void start(){
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println("\t\t\t\t\t\tJuego de Magos y Hadas");
	System.out.println("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
	System.out.println("\t\t\t\t\t\tBienvenido Jugador");
	System.out.println("\t\t\t\t\t\tInstrucciones del Juego");
	System.out.println("El objetivo del juego es salvar a 10 hadas");
	System.out.println("para salvarlas necesitas crear 1 casa para cada hada");
	System.out.println("las hadas estan capturadas por el Mago");
	System.out.println("si logras rescatar 1 o mas hadas, el porcentaje de la vida del Mago ira disminuyendo");
	System.out.println("cuidate de los golpes del ogro, te restan porcentaje de vida");
	
	
	
	
	
	do{
	 
	System.out.println("**************************************************************************"); 
	System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	System.out.println("**************************************************************************"); 
	
	System.out.print("Cuantas casas deseas construir: ");
	
	casas=sc.nextInt();
	sc.nextLine(); //limpiar el buffer de entrada del scanner para leer otro dato 
	System.out.println("Haz construido "+casas+" casas");
	System.out.println("Podras salvar "+casas+" hadas quieres hacerlo (si/no)");
	salvarhadas=sc.nextLine();
	
	if(salvarhadas.equals("si")){
		switch(casas){
		
			case 1:
		System.out.println("El ogro te golpeo y pierdes 10% de vida");
		vidajugador=vidajugador-10;
		vidamago=vidamago-10;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+1;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
	
			break;
			case 2:
				System.out.println("El ogro te golpeo y pierdes 20% de vida");
		vidajugador=vidajugador-20;
		vidamago=vidamago-20;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+2;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
			break;
			case 3:
			System.out.println("El ogro te golpeo y pierdes 30% de vida");
		vidajugador=vidajugador-30;
		vidamago=vidamago-30;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+3;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
			break;
			case 4:
				System.out.println("El ogro te golpeo y pierdes 40% de vida");
		vidajugador=vidajugador-40;
		vidamago=vidamago-40;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
		System.out.println("Vida del Jugador: "+vidajugador+"%");
		hadas=hadas+4;
		System.out.println("Haz salvado: "+hadas+" hadas");
		System.out.println("**************************************************************************"); 
			break;
			case 5:
				System.out.println("El ogro te golpeo y pierdes 50% de vida");
		vidajugador=vidajugador-50;
		vidamago=vidamago-50;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+5;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;							
  			case 6:
  				System.out.println("El ogro te golpeo y pierdes 60% de vida");
		vidajugador=vidajugador-55;
		vidamago=vidamago-60;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+6;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;
  			case 7:
  				System.out.println("El ogro te golpeo y pierdes 70% de vida");
		vidajugador=vidajugador-65;
		vidamago=vidamago-70;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+7;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;
  			case 8:
  				System.out.println("El ogro te golpeo y pierdes 80% de vida");
		vidajugador=vidajugador-75;
		vidamago=vidamago-80;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+8;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;
  			case 9:
  				System.out.println("El ogro te golpeo y pierdes 85% de vida");
		vidajugador=vidajugador-85;
		vidamago=vidamago-90;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+9;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;
  			case 10:
  				System.out.println("El ogro te golpeo y pierdes 90% de vida");
		vidajugador=vidajugador-90;
		vidamago=vidamago-100;
		System.out.println("**************************************************************************"); 
		System.out.println("Vida del Mago: "+vidamago+"%");
	System.out.println("Vida del Jugador: "+vidajugador+"%");
	hadas=hadas+10;
	System.out.println("Haz salvado: "+hadas+" hadas");
	System.out.println("**************************************************************************"); 
  			break;	
		}
				
		
		}else{ System.out.println("El ogro no te golpea porque no salvaste a ningun hada");    }
		
	 
	}while(vidamago!=0);
	
	if(vidajugador>0){
	System.out.println("Tu Ganas!!!");
	System.out.println("El Mago ha muerto haz salvado 10 hadas");
	}else{
		System.out.println("Nadie Gana :( ");
		System.out.println("El Mago ha muerto y tu tambien");   }
	
	}

public static void main(String args[]){
	
     Juego juego=new Juego();
     juego.start();
      
 
	
	
	
	}
    
    
}