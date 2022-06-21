package Carro;

public class CarroConsumo {
	 double consumo;
	 private double  combustivel=0;
	 
	 public CarroConsumo(double consumo) {
		 this.consumo= consumo;
		 this.combustivel=0;
	 }
	 public void andar (double km ) {
		 consumo =(km/this.consumo);
		 this.combustivel= consumo ;
	 }
	 public double obtergasolina() {
		 return combustivel;
	 }
	 public void  Adicionargasolina(double combustivel) {
		 this.combustivel = combustivel;
	 }
 }	
