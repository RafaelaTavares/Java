package br.edu.univas.tp4.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.univas.tp4.model.Exception.CadastarMotoristaException;
import br.edu.univas.tp4.model.Exception.CadastrarVeiculoExeption;
import br.edu.univas.tp4.model.TO.CadastrarVeiculoTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class CadastrarVeiculoDAO {
	
public void insertNewCadastrarVeiculo(CadastrarVeiculoTO to) throws CadastarMotoristaException{
		
		String sentenca = "INSERT INTO CADASTRO_VEICULO "
						+ " (cod_veiculo, placa, marca, uf, ano, tipo_combustivel, quant_passageiro)"
						+ " VALUES (?,?,?,?,?,?,?)";
		
		Connection conn = null;
		try{
			
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setInt(1, to.getCodVeiculo());
			prepStat.setString(2, to.getPlaca());
			prepStat.setString(3, to.getMarca());
			prepStat.setString(4, to.getUf());
			prepStat.setInt(5, to.getAno());
			prepStat.setInt(6, to.getTipoComb());
			prepStat.setInt(7, to.getQuantPassageiro());
			
			prepStat.execute();
		}catch (Exception e){			
			throw new CadastarMotoristaException("Erro ao incluir cadastro de veiculo\n" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteCadastrarVeiculo(int codigo) throws CadastrarVeiculoExeption{
		
		String sql = "DELETE FROM CADASTRO_VEICULO WHERE COD_VEICULO = ?";
		
		Connection conn = null;		
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			prep.setInt(1, codigo);
			
			prep.execute();
		}catch (SQLException e) {
			throw new CadastrarVeiculoExeption("Erro excluindo veiculo " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void updateCadastrarVeiculo(CadastrarVeiculoTO to) throws CadastrarVeiculoExeption{
		String sentenca = "UPDATE CADASTRO_VEICULO SET PLACA = ?, MARCA = ?, UF = ?, ANO = ?, "
						+ " TIPO_COMBUSTIVEL = ?, QUANT_PASSAGEIRO = ?"
						+ " WHERE COD_VEICULO = ?";
		
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
//			prepStat.setInt(1, to.getCodVeiculo());
			prepStat.setString(1, to.getPlaca());
			prepStat.setString(2, to.getMarca());
			prepStat.setString(3, to.getUf());
			prepStat.setInt(4, to.getAno());
			prepStat.setInt(5, to.getTipoComb());
			prepStat.setInt(6, to.getQuantPassageiro());
			prepStat.setInt(7, to.getCodVeiculo());
			
			prepStat.execute();
		}catch (Exception e) {
			throw new CadastrarVeiculoExeption("Erro ao atualizar cadastro veiculo" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}


}
