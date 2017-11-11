package br.edu.univas.tp4.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.univas.tp4.model.Exception.CadastarMotoristaException;
import br.edu.univas.tp4.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.tp4.model.TO.CadastrarUsuarioTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarUsuarioDAO {
	
public void insertNewCadastrarUsuario(CadastrarUsuarioTO to) throws CadastrarUsuarioExeption{
	
	String sentenca = "INSERT INTO CADASTRO_USUARIO"
						+ "( COD_USUARIO, NOME, CPF, RG, SEXO, DATA_NASCIMENTO "
						+ " TELEFONE, ENDERECO)"
						+ " VALUES (?,?,?,?,?,?,?,?)";
		
		
		
		Connection conn = null;
		try{
			
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
						
			prepStat.setInt(1, to.getCodUsuario());
			prepStat.setString(2, to.getNome());
			prepStat.setInt(3, to.getCpf());
			prepStat.setInt(4, to.getRg());
		//	prepStat.setCharacterStream(6, to.getSexo());  VER O QUE EH
			prepStat.setDate(7, to.getDataNascimento());
			prepStat.setInt(8, to.getTelefone());
			prepStat.setString(9, to.getEndereco());
			
			prepStat.execute();
		}catch (Exception e){			
			throw new CadastrarUsuarioExeption("Erro ao incluir cadastro de usuario" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteCadastrarUsuario(int codigo) throws CadastrarUsuarioExeption{
		
		String sql = "DELETE FROM CADASTRAR_USUARIO WHERE COD_USUARIO = ?";
		
		Connection conn = null;		
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			prep.setInt(1, codigo);
			
			prep.execute();
		}catch (SQLException e) {
			throw new CadastrarUsuarioExeption("Erro excluindo a Cadastrar usuario " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void updateCadastrarUsuario(CadastrarUsuarioTO to) throws CadastarMotoristaException, CadastrarUsuarioExeption{
		
		String sentenca = "UPDATE CADASTRO_USUARIO SET NOME = ?, CPF = ?, RG = ?, SEXO = ?, DATA_NASCIMENTO = ?"
						+ " TELEFONE = ?, ENDERECO = ?"
						+ " WHERE COD_USUARIO = ?";
		
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getNome());
			prepStat.setInt(2, to.getCpf());
			prepStat.setInt(3, to.getRg());
		//	prepStat.setCharacterStream(5, to.getSexo());  VER O QUE EH
			prepStat.setDate(6, to.getDataNascimento());
			prepStat.setInt(7, to.getTelefone());
			prepStat.setString(8, to.getEndereco());
			
			prepStat.execute();
		}catch (Exception e) {
			throw new CadastrarUsuarioExeption("Erro ao atualizar cadastrar USUARIO" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}


}
