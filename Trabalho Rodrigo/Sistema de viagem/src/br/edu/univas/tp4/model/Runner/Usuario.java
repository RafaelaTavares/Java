package br.edu.univas.tp4.model.Runner;

import br.edu.univas.tp4.model.DAO.CadastrarUsuarioDAO;
import br.edu.univas.tp4.model.DAO.CadastrarVeiculoDAO;
import br.edu.univas.tp4.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.tp4.model.Exception.CadastrarVeiculoExeption;
import br.edu.univas.tp4.model.TO.CadastrarUsuarioTO;
import br.edu.univas.tp4.model.TO.CadastrarVeiculoTO;

public class Usuario {

	public static void main(String[] args) {
		
		CadastrarUsuarioDAO usuarioDAO = new CadastrarUsuarioDAO();
		CadastrarUsuarioTO to = new CadastrarUsuarioTO(105, "Rafaela", 123, 1234, 'F', 1-12-199, 12345, "Rua");
		try {
			usuarioDAO.insertNewCadastrarUsuario(to);
		} catch (CadastrarUsuarioExeption e) {
			System.out.println("Erro salvando cadastro veiculo");
			e.printStackTrace();
		}
		System.out.println("Sucesso salvando cadastro veiculo.");
	}

//	CadastrarVeiculoDAO areaDAO = new CadastrarVeiculoDAO();
//	CadastrarVeiculoTO to = new CadastrarVeiculoTO(103, "placa", "marca", "mg", 1996, 1, 5);
//	try {
//		areaDAO.deleteCadastrarVeiculo(103);
//	} catch (CadastrarVeiculoExeption e) {
//		System.out.println("Erro salvando cadastro veiculo");
//		e.printStackTrace();
//	}
//	System.out.println("Sucesso salvando cadastro veiculo.");
//	}
	
//	CadastrarVeiculoDAO areaDAO = new CadastrarVeiculoDAO();
//	CadastrarVeiculoTO to = new CadastrarVeiculoTO(103, "placa", "marca", "sp", 1997, 1, 5);
//	try {
//		areaDAO.updateCadastrarVeiculo(to);
//	}catch (CadastrarVeiculoExeption e) {
//		System.out.println("Erro salvando cadastro veiculo");
//		e.printStackTrace();
//	}
//		System.out.println("Sucesso salvando cadastro veiculo.");
//	}
//		
//
//	}

}
