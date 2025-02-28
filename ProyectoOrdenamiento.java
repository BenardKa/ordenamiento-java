import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoOrdenamiento {

    public static List<Integer> listaDatos = new ArrayList<>();
    public static List<String> puntosHechos = new ArrayList<>();
    public static List<String> puntosFaltantes = new ArrayList<>();

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Ingrese su nombre: ");
        String estudiante = scanner.nextLine();

        // Se inicia el proyecto con los primeros puntos completados
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");

        // Lista de tareas restantes
        puntosFaltantes.add("3. Carga de Datos desde un CSV");
        puntosFaltantes.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosFaltantes.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosFaltantes.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosFaltantes.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosFaltantes.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosFaltantes.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + "\n");

        // Mostrar tareas completadas
        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        // Mostrar tareas pendientes
        System.out.println("\nPUNTOS FALTANTES:");
        for (String punto : puntosFaltantes) {
            System.out.println("❌ " + punto);
        }

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();  // Captura la entrada del usuario

        // Llamar al menú principal
        mostrarMenu(scanner);
    }

    public static void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            // Mostrar opciones
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            // Ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("📂 Opción seleccionada: Cargar datos desde un CSV (Implementando).");
                    CargarDatosCSV.opcionCargarDatos(listaDatos);
                    actualizarPuntos("3. Carga de Datos desde un CSV");
                    break;
                case 2:
                    System.out.println("🔄 Opción seleccionada: Bubble Sort (Implementando).");
                    BubbleSort.opcionBubbleSort(listaDatos);
                    actualizarPuntos("4. Algoritmo de Ordenamiento - Bubble Sort");
                    break;
                case 3:
                    System.out.println("🔄 Opción seleccionada: Enhanced Bubble Sort (Implementando).");
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    actualizarPuntos("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
                    break;
                case 4:
                    System.out.println("⚡ Opción seleccionada: Quick Sort (Implementando).");
                    QuickSort.opcionQuickSort(listaDatos);
                    actualizarPuntos("6. Algoritmo de Ordenamiento - Quick Sort");
                    break;
                case 5:
                    System.out.println("🎯 Opción seleccionada: Selection Sort (Implementando).");
                    SelectionSort.opcionSelectionSort(listaDatos);
                    actualizarPuntos("7. Algoritmo de Ordenamiento - Selection Sort");
                    break;
                case 6:
                    System.out.println("🔀 Opción seleccionada: Merge Sort (Implementando).");
                    MergeSort.opcionMergeSort(listaDatos);
                    actualizarPuntos("8. Algoritmo de Ordenamiento - Merge Sort");
                    break;
                case 7:
                    System.out.println("🔎 Opción seleccionada: Binary Search (Implementando).");
                    BinarySearch.opcionBinarySearch(listaDatos);
                    actualizarPuntos("9. Algoritmo de Búsqueda - Binary Search");
                    break;
                case 8:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);
    }

    public static void actualizarPuntos(String puntoCompletado) {
        // Mover el punto completado de la lista de faltantes a la lista de hechos
        if (puntosFaltantes.contains(puntoCompletado)) {
            puntosFaltantes.remove(puntoCompletado);
            puntosHechos.add(puntoCompletado);
            System.out.println("\n✅ Punto completado: " + puntoCompletado);
        } else {
            System.out.println("\n⚠️ El punto ya estaba completado: " + puntoCompletado);
        }

        // Mostrar las listas actualizadas
        System.out.println("\nPUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        System.out.println("\nPUNTOS FALTANTES:");
        for (String punto : puntosFaltantes) {
            System.out.println("❌ " + punto);
        }
    }

    public static void main(String[] args) {
        mostrarInformacion();// Llamamos a la función principal
    }
}