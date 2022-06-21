package Carro;

public class main {

	public static void main(String[] args) {
		CarroConsumo C = new CarroConsumo(10);
		System.out.println("Combustivel "+C.obtergasolina());
		System.out.println("Consumo "+C.consumo);
		C.Adicionargasolina(20);
		System.out.println("Combustivel " +C.obtergasolina());
		C.andar(60);
		System.out.println("Andou 60 km... ");
		System.out.println("combustivel " +C.obtergasolina()); 
		

	}

}
