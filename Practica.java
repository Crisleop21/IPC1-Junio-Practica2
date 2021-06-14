package src;
import	java.util.*;
public class Practica{
	public static void main(String[] args) {
       Practica pra = new Practica();
	   pra.mostrarMenu();
		
    }

	Scanner scanner = new Scanner(System.in);
	

   	public void  mostrarMenu(){
		System.out.println("******************************************************");
        System.out.println("Bienvenido a Memorabilia");
		System.out.println("******************************************************");
		System.out.println("Seleccione una de las siguientes opciones: ");
		System.out.println("******************************************************");
		int opcion;
		do 	{

			System.out.println("1. Prestamo de Peliculas ");
			System.out.println("2. Devolucon de Peliculas ");
			System.out.println("3. Mostrar Peliculas ");
			System.out.println("4. Ingreso de Peliculas ");
			System.out.println("5. Ordenar Peliculas(ascendente)");
			System.out.println("6. Ingresar clientes nuevos ");
			System.out.println("7. Mostrar clientes ");
			System.out.println("8. Reportes ");
			System.out.println("9. Salir");
			
			opcion = scanner.nextInt();

			switch(opcion){
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					verMatriz(peliculas, numeroColumnasPeliculas, idPelicula);
					break;
				case 4:
					crearnuevasPeliculas();
					break;
				case 5:
					
					break;
				case 6:
					crearNuevasClientes();
					break;
				case 7:
					verMatriz(clientes, numeroColumnasClientes, idCliente);
					break;
				case 8:
					
					break;
				default:
									
			}
		}while(opcion != 9);
		System.out.println("Gracias por utilizar Memorabilia");

	}
	//formato de la matriz
	int numeroColumnasClientes = 4, numeroColumnasPeliculas = 5, numerocolumnasPrestamos = 3;
	public String clientes[][] = new String[30][numeroColumnasClientes];
	public String peliculas[][] = new String[30][numeroColumnasPeliculas];
	public String prestamosPeliculas[][] = new String[30][numerocolumnasPrestamos];
	int idCliente = 0, idPelicula = 0;

	public void crearnuevasPeliculas(){
		if (idPelicula < 30) {
			scanner.nextLine();
			System.out.println("**********************************************");
			System.out.println("4. Ingreso de peliculas");
			System.out.println("**********************************************");
			peliculas[idPelicula][0] = idPelicula + " ";
			System.out.println("introduce el nombre");
            peliculas[idPelicula][1] = scanner.nextLine();
            System.out.println("introduce el anio");
            peliculas[idPelicula][2] = scanner.nextLine();
            System.out.println("introduce la categoria");
            peliculas[idPelicula][3] = scanner.nextLine();
            peliculas[idPelicula][4] = "False";
            idPelicula++;
            mostrarMenu();
        } else {
            System.out.println("******************************************************");
            System.out.println("ya no puede agregar mas datos, porque llego al limite");
            System.out.println("******************************************************");
            mostrarMenu();
        }	
	
	}
	

	public void crearNuevasClientes() {
        if (idCliente < 30) {
            System.out.println("******************************************************");
            System.out.println("6. Ingresar clientes nuevos");
            System.out.println("******************************************************");
            clientes[idCliente][0] = idCliente + "";
            System.out.println("introduce el nombre");
			scanner.nextLine();
            clientes[idCliente][1] = scanner.nextLine();
            System.out.println("introduce el telefono");
            clientes[idCliente][2] = scanner.nextLine();
            clientes[idCliente][3] = "False";
            idCliente++;
            mostrarMenu();
        } else {
            System.out.println("******************************************************");
            System.out.println("ya no puede agregar mas datos, porque llego al limite");
            System.out.println("******************************************************");
            mostrarMenu();
        }
    }
	public void verMatriz(String[][] matriz, int numeroColumnas, int iteracionFila) {
        int i, j = 0;
        imprimirDivision(numeroColumnas);
        for (i = 0; i < iteracionFila; i++) {
            System.out.print("| ");
            for (j = 0; j < numeroColumnas; j++) {
                System.out.print(String.format("%s |", matriz[i][j]));
            }
            System.out.println();
        }
        imprimirDivision(numeroColumnas);
    }
	private void imprimirDivision(int numeroColumnas) {
        System.out.print("+");
        for (int j = 0; j < numeroColumnas; j++) {
            System.out.print("-------------");
        }
        System.out.print("+\n");
    }
}
	

