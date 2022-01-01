public class paciente {
	
	double altura;
	double peso;
	
	public paciente(double peso,double altura){
		
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public double calcularIMC() {
		 return peso/(altura*altura);
	}
	
	public String diagnostico() {
		double IMC = calcularIMC();
		if(IMC < 16) {
			return "Baixo peso muito grave";
		}
		else if(IMC >= 16 && IMC <= 16.99) {
			return "Baixo peso grave";
		}
		else if(IMC >= 17 && IMC <= 18.49) {
			return "Baixo peso";
		}
		else if(IMC >= 18.5 && IMC <= 24.99) {
			return "Peso normal";
		}
		else if(IMC >= 25 && IMC <= 29.99) {
			return "Sobrepeso";
		}
		else if(IMC >= 30 && IMC <= 34.99) {
			return "Obesidade grau I";
		}
		else if(IMC >= 35 && IMC <= 39.99) {
			return "Obesidade grau II";
		}
		else {
			return "Obesidade grau III (obesidade mórbida)";
		}
		
	}
}
