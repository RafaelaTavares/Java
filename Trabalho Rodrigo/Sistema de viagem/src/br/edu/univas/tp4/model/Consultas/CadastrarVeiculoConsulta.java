package br.edu.univas.tp4.model.Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.univas.tp4.model.Exception.CadastrarVeiculoExeption;
import br.edu.univas.tp4.model.TO.CadastrarVeiculoTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarVeiculoConsulta {
	
	public ArrayList<CadastrarVeiculoTO> selectCadastrarVeiculo(int codigo) throws CadastrarVeiculoExeption{
		
		String sentenca = "SELECT CODVEICULO, PLACA, MARCA, UF, ANO, TIPOCOMBUSTIVEL, QUANTPASSAGEIRO "
						+ " FROM CADASTRODVEICULO"
						+ " WHERE CODVEICULO = ?";
		
		ArrayList<CadastrarVeiculoTO> lista = new ArrayList<CadastrarVeiculoTO>();
		
		Connection conn = null;
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sentenca);
			prep.setInt(1, codigo);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				
				int codVeiculo = rs.getInt(1);
				String placa = rs.getString(2);
				String marca = rs.getString(3);
				String uf = rs.getString(4);
				int ano = rs.getInt(5);
				int tipoCombustivel = rs.getInt(6);
				int quantPassageiro = rs.getInt(7);
				
				CadastrarVeiculoTO to = new CadastrarVeiculoTO(codVeiculo, placa, marca, uf, ano, 
					                                      tipoCombustivel, quantPassageiro);
				lista.add(to);
			}
			
		} catch (Exception e) {
			throw new CadastrarVeiculoExeption("Erro ao consultar cadastro usuario");
		}finally {
			DBUtil.closeConnection(conn);
		}
		return lista;
	}

}
