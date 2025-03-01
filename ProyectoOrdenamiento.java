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
        puntosFaltantes.add("4. Algoritmo de Ordenamiento - BUBBLE SORT");
        puntosFaltantes.add("5. Algoritmo de Ordenamiento - ENHANCED BUBBLE SORT");
        puntosFaltantes.add("6. Algoritmo de Ordenamiento - QUICK SORT");
        puntosFaltantes.add("7. Algoritmo de Ordenamiento - SELECTION SORT");
        puntosFaltantes.add("8. Algoritmo de Ordenamiento - MERGE SORT");
        puntosFaltantes.add("9. Algoritmo de Búsqueda - BINARY SEARCH");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println("---- Información ----");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente);
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
            System.out.println("2. Ordenar datos usando BUBBLE SORT");
            System.out.println("3. Ordenar datos usando ENHANCED BUBBLE SORT");
            System.out.println("4. Ordenar datos usando QUICK SORT");
            System.out.println("5. Ordenar datos usando SELECTION SORT");
            System.out.println("6. Ordenar datos usando MERGE SORT");
            System.out.println("7. Buscar un número con BINARY SEARCH");
            System.out.println("8. Salir");
            System.out.print("\nIngrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            // Ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("📂 Opción seleccionada: Cargar datos desde un CSV");
                    CargarDatosCSV.opcionCargarDatos(listaDatos);
                    actualizarPuntos("3. Carga de Datos desde un CSV");
                    break;
                case 2:
                    System.out.println("🔄 Opción seleccionada: Bubble Sort");
                    BubbleSort.opcionBubbleSort(listaDatos);
                    actualizarPuntos("4. Algoritmo de Ordenamiento - BUBBLE SORT");
                    break;
                case 3:
                    System.out.println("🔄 Opción seleccionada: Enhanced Bubble Sort");
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    actualizarPuntos("5. Algoritmo de Ordenamiento - ENHANCED BUBBLE SORT");
                    break;
                case 4:
                    System.out.println("⚡ Opción seleccionada: Quick Sort");
                    QuickSort.opcionQuickSort(listaDatos);
                    actualizarPuntos("6. Algoritmo de Ordenamiento - QUICK SORT");
                    break;
                case 5:
                    System.out.println("🎯 Opción seleccionada: Selection Sort");
                    SelectionSort.opcionSelectionSort(listaDatos);
                    actualizarPuntos("7. Algoritmo de Ordenamiento - SELECTION SORT");
                    break;
                case 6:
                    System.out.println("🔀 Opción seleccionada: Merge Sort");
                    MergeSort.opcionMergeSort(listaDatos);
                    actualizarPuntos("8. Algoritmo de Ordenamiento - MERGE SORT");
                    break;
                case 7:
                    System.out.println("🔎 Opción seleccionada: Binary Search");
                    BinarySearch.opcionBinarySearch(listaDatos);
                    actualizarPuntos("9. Algoritmo de Búsqueda - BINARY SEARCH");
                    break;
                case 8:
                    System.out.println("👋 Saliendo del programa...\n");
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
            System.out.println("\n⚠️ Nota: El punto ya estaba completado: " + puntoCompletado);
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