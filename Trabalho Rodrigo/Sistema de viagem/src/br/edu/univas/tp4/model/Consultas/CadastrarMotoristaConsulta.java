package br.edu.univas.tp4.model.Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.univas.tp4.model.Exception.CadastarMotoristaException;
import br.edu.univas.tp4.model.TO.CadastrarMotoristaTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarMotoristaConsulta {
	
	public  ArrayList<CadastrarMotoristaTO> selectCadastrarMotorista(int codigo) throws CadastarMotoristaException{
	
	String sentenca = "SELECT CODMOTORISTA, NOME, CPF, RG, CNH, SEXO, DATANASCIMENTO, TELEFONE, ENDERECO "
					+ " FROM CADASTRODEMOTORISTA"
					+ " WHERE CODMOTORISTA = ?";
	
	ArrayList<CadastrarMotoristaTO> lista = new ArrayList<CadastrarMotoristaTO>();
	
	Connection conn = null;
	try{
		
		conn = DBUtil.openConnection();
		PreparedStatement prep = conn.prepareStatement(sentenca);
		prep.setInt(1, codigo);
		
		ResultSet rs = prep.executeQuery();
		while(rs.next()){
			
			int codMotorista = rs.getInt(1);
			String nome = rs.getString(2);
			int cpf = rs.getInt(3);
			int rg = rs.getInt(4);
			int cnh = rs.getInt(5);
		//	char sexo = rs.getCharacterStream(6,);
			Date dataNascimento = rs.getDate(7);
			int telefone = rs.getInt(8);
			String endereco = rs.getString(9);
						
		//	CadastrarMotoristaTO to = new CadastrarMotoristaTO(codMotorista, nome, cpf, rg, cnh, sexo, 
		//			                                      dataNascimento, telefone, endereco);
		//	lista.add(to);
			
		}	
	}catch (Exception e) {
		throw new CadastarMotoristaException("Erro ao consultar cadastro motorista");
	}finally {
		DBUtil.closeConnection(conn);
	}
	return lista;		
	}

}
