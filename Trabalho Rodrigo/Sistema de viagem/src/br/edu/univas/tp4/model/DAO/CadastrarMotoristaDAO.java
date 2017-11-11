package br.edu.univas.tp4.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.univas.tp4.model.Exception.CadastarMotoristaException;
import br.edu.univas.tp4.model.TO.CadastrarMotoristaTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarMotoristaDAO {
	
	public void insertNewCadastrarMotorista(CadastrarMotoristaTO to) throws CadastarMotoristaException{
		
		String sentenca = "INSERT INTO CADASTRO_MOTORISTA"
						+ " COD_MOTORISTA, NOME, CPF, RG, CNH, SEXO, DATA_NASCIMENTO "
						+ " TELEFONE, ENDERECO"
						+ " VALUES (?,?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		try{
			
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setInt(1, to.getCodMotorista());
			prepStat.setString(2, to.getNome());
			prepStat.setInt(3, to.getCpf());
			prepStat.setInt(4, to.getRg());
			prepStat.setInt(5, to.getCnh());
		//	prepStat.setCharacterStream(6, to.getSexo());  VER O QUE EH
		//	prepStat.setDate(7, to.getDataNascimento());
			prepStat.setInt(8, to.getTelefone());
			prepStat.setString(9, to.getEndereco());
			
			prepStat.execute();
		}catch (Exception e){			
			throw new CadastarMotoristaException("Erro ao incluir cadastro de motorista" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteCadastrarMotorista(int codigo) throws CadastarMotoristaException{
		
		String sql = "DELETE FROM CADASTRO_MOTORISTA WHERE COD_MOTORISTA = ?";
		
		Connection conn = null;		
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			prep.setInt(1, codigo);
			
			prep.execute();
		}catch (SQLException e) {
			throw new CadastarMotoristaException("Erro excluindo a Cadastrar Motorista " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void updateCadastrarMotorista(CadastrarMotoristaTO to) throws CadastarMotoristaException{
		String sentenca = "UPDATE CADASTRO_MOTORISTA SET NOME = ?, CPF = ?, RG = ?, CNH = ?, SEXO = ?, DATA_NASCIMENTO = ?"
						+ " TELEFONE = ?, ENDERECO = ?"
						+ " WHERE COD_MOTORISTA = ?";
		
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getNome());
			prepStat.setInt(2, to.getCpf());
			prepStat.setInt(3, to.getRg());
			prepStat.setInt(4, to.getCnh());
		//	prepStat.setCharacterStream(5, to.getSexo());  VER O QUE EH
			prepStat.setDate(6, to.getDataNascimento());
			prepStat.setInt(7, to.getTelefone());
			prepStat.setString(8, to.getEndereco());
			
			prepStat.execute();
		}catch (Exception e) {
			throw new CadastarMotoristaException("Erro ao atualizar cadastrar motorista" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}

}
