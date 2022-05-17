package RelacionamentoClasses.teste;

import relacionamento.entreClasses.Contato;
import relacionamento.entreClasses.Endereco;
import relacionamento.entreClasses.Telefone;

public class TesteClasses {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Arthur");
		

		Endereco end = new Endereco();
		end.setNomeRua("Rua Brasília");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Capital City");
		end.setEstado("Capital Capital");
		end.setCep("999999");

		contato.setEndereco(end);
				
		Telefone tel1 = new Telefone();
		tel1.setTipo("celular");
		tel1.setNumero("9999-9999");
		tel1.setDDD("61");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setNumero("88888-9999");
		tel2.setDDD("11");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]= tel1;
		telefones[1]= tel2;
		
		contato.setTelefones(telefones);

		System.out.println(contato.getNome());
		
		/*if(contato !=null && contato.getTelefone() != null) {
		System.out.println("("+ contato.getTelefone().getDDD() +") " +contato.getTelefone().getNumero());
		}
		*/
		if(contato !=null && contato.getTelefones()!=null) {
			for(Telefone apelido:contato.getTelefones()) {
				System.out.println(apelido.getDDD()+" "+ apelido.getNumero());
			}
			
		}
		
		if(contato != null && contato.getEndereco()!=null) {
			System.out.println(contato.getEndereco().getCidade());
			

		}
	}

}
