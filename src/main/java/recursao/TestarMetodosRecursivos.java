package recursao;


public class TestarMetodosRecursivos {

	public static void main(String[] args) {
		MetodosRecursivos metodos = new MetodosRecursivos();
		System.out.println("Calcular soma de um array: ");
		int[] array_int = {10, 5, 21, 1};
		System.out.println(metodos.calcularSomaArray(array_int, array_int.length - 1));
		System.out.println("Questão 1:");
		System.out.println(metodos.calcularFatorial(5));
		System.out.println("Questão 2:");
		System.out.println(metodos.calcularFibonacci(8));
		System.out.println("Questão 3:");
		String[] array = {"1", "2", null, null, "5"};
		System.out.println(metodos.countNotNull(array, array.length - 1));
		System.out.println("Questão 4:");
		System.out.println(metodos.potenciaDe2(4));
		System.out.println("Questão 5:");
		System.out.println("PA: 3, 5, 7, 9, 11");
		System.out.println(metodos.progressaoAritmetica(3, 2, 5));
		System.out.println("Questão 6:");
		System.out.println("PG: 4, 12, 36, 108, 324");
		System.out.println(metodos.progressaoGeometrica(4, 3, 5));
	}
}
