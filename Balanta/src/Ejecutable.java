
public class Ejecutable {

	public static void main(String[] args) {

		Serie listaSeries[]=new Serie[5];
	    Videojuego listaVideojuegos[]=new Videojuego[5];
	    
	    listaSeries[0]=new Serie();
	    listaSeries[1]=new Serie("jjorge el curioso", "los picapiedra ");
	    listaSeries[2]=new Serie("como entrenar a tu mascota", 28, "accion", "los power ranger");
	    listaSeries[3]=new Serie("como entrenar a un heroe ", 19 ,"Humor", "cobra kai");
	    listaSeries[4]=new Serie("georgina", 5, "home", "los terroristas");

	    listaVideojuegos[0]=new Videojuego();
	    listaVideojuegos[1]=new Videojuego("pokemon", "mortal kombat");
	    listaVideojuegos[2]=new Videojuego("forest", "accion");
	    listaVideojuegos[3]=new Videojuego("mi hero city", 44, "power war", "ps4");
	    listaVideojuegos[4]=new Videojuego("freefire", 450, "battle royale", "garena");
	    
	    listaSeries[1].entregar();
	    listaSeries[4].entregar();
	    listaVideojuegos[0].entregar();
	    listaVideojuegos[3].entregar();
	    
	    int entregados=0;
	    
	    for(int i=0;i<listaSeries.length;i++){
	        if(listaSeries[i].isEntregado()){
	            entregados+=1;
	            listaSeries[i].devolver();

	        }
	        if(listaVideojuegos[i].isEntregado()){
	            entregados+=1;
	            listaVideojuegos[i].devolver();
	        }
	    }

	    System.out.println("Hay un total de " + entregados + " articulos que se van a entrgar");
	    
	    Serie serieMayor=listaSeries[0];
	    Videojuego videojuegoMayor=listaVideojuegos[0];
	    
	    for(int i=1;i<listaSeries.length;i++){
	        if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
	            serieMayor=listaSeries[i];
	        }
	        if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.mayor){
	            videojuegoMayor=listaVideojuegos[i];
	        }

	    }
	    
	    System.out.println(videojuegoMayor);
	    System.out.println(serieMayor);
	}
	

	
	



	}

