package algoritmos;

public class Aleatorio {

	public static void main(String[] args) {

		int lista[] = { 25, 54, 28, 36, 95, 47, 74, 58, 26, 17, 25, 78 };

		int[] aleatorio = new int[lista.length];
		int i = lista.length;
		boolean[] bandera = new boolean[lista.length];
		int j = 0;

		while (j != i) {
			int r = (int) (Math.random() * aleatorio.length);
			if (aleatorio[j] == 0 && bandera[r] == false) {
				aleatorio[j] = lista[r];
				bandera[r] = true;
				j++;
			}
		}
		for (int ii = 0; ii < aleatorio.length; ii++) {
			System.out.println(aleatorio[ii]);
		}
	}

}
