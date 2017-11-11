package br.edu.univas.tp4.model.Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.univas.tp4.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.tp4.model.TO.CadastrarUsuarioTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarUsuarioConsulta {
	
	public ArrayList<CadastrarUsuarioTO> selectCadastrarUsuario(int codigo) throws CadastrarUsuarioExeption{
		
		String sentenca = "SELECT CODVEICULO, NOME, CPF, RG, CNH, SEXO, DATANASCIMENTO, TELEFONE, ENDERECO "
						+ " FROM CADASTRODEUSUARIO"
						+ " WHERE CODUSUARIO = ?";
		
		ArrayList<CadastrarUsuarioTO> lista = new ArrayList<CadastrarUsuarioTO>();
		
		Connection conn = null;
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sentenca);
			prep.setInt(1, codigo);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				
				int codUsuario = rs.getInt(1);
				String nome = rs.getString(2);
				int cpf = rs.getInt(3);
				int rg = rs.getInt(4);
			//	char sexo = rs.getCharacterStream(5);
				Date dataNascimento = rs.getDate(6);
				int telefone = rs.getInt(7);
				String endereco = rs.getString(8);
				
//				CadastrarUsuarioTO to = CadastrarUsuarioTO(codUsuario, nome, cpf, rg, //sexo, 
//					                                      dataNascimento, telefone, endereco);
//				lista.add(to);
			}
			
		} catch (Exception e) {
			throw new CadastrarUsuarioExeption("Erro ao consultar cadastro usuario");
		}finally {
			DBUtil.closeConnection(conn);
		}
		return lista;
	}
}
