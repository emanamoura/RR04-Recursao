package recursao;

public class MetodosRecursivos {

	public int calcularSomaArray(int[] array, int index){
		if(index < 0) {
			return 0;
		}
		int element = array[index];
		return calcularSomaArray(array, index - 1) + element;
	}
	public long calcularFatorial(int n) {
		if(n == 1 || n == 0) {
			return n;
		}
		return calcularFatorial(n-1) * n;
	}

	public int calcularFibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);

	}

	public int countNotNull(Object[] array, int index) {
		if(index < 0) {
			return 0;
		}
		Object element = array[index];
		if(element != null) {
			return countNotNull(array, index - 1) + 1;
		} else {
			return countNotNull(array, index - 1);
		}
	}

	public long potenciaDe2(int expoente) {
		if(expoente < 0) {
			throw new RuntimeException("Expoente não pode ser um númeiro inteiro negativo");
		}
		if(expoente == 0) {
			return 1;
		}
		if(expoente == 1) {
			return 2;
		}
		return potenciaDe2(expoente - 1) * 2;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		if(n == 1) {
			return  termoInicial;
		}
		double proximo = termoInicial + razao;
		return progressaoAritmetica(proximo, razao, n - 1);


	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		if(n == 1) {
			return  termoInicial;
		}
		double proximo = termoInicial * razao;
		return progressaoGeometrica(proximo, razao, n - 1);
	}
	
	
}
