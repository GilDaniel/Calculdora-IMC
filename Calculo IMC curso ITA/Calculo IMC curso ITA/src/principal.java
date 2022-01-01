/*
	
	Cálculo IMC- Por Gil Daniel S. Fernandes
	Para Curso de Orientação por Objeto em Java - ITA


*/
	public class principal {
	
		public static void main(String[] args) {
			paciente gil = new paciente(50,1.7);
			paciente joao = new paciente(70,1.8);
			paciente maria = new paciente(30,1.7);
			System.out.println("Gil: " + gil.diagnostico());
			System.out.println("João: " + joao.diagnostico());
			System.out.println("Maria: " + maria.diagnostico());
		}
	
	}
