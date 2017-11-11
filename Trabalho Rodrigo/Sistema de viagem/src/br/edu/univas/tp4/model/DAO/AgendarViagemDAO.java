package br.edu.univas.tp4.model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import br.edu.univas.tp4.model.Exception.AgendarViagemException;
import br.edu.univas.tp4.model.TO.AgendarViagemTO;
import br.edu.univas.tp4.model.Util.DBUtil;

public class AgendarViagemDAO {
	
	public void insertNewAgendarViagem(AgendarViagemTO to) throws AgendarViagemException{
		
		String sentenca = "INSERT INTO AGENDAMENTO_VIAGEM"
						+ " COD_VIAGEM, ENDERECO, QUANT_PASSAGEIRO, DATA_SAIDA, DATA_RETORNO, "
						+ " HORA_SAIDA, HORA_RETORNO, STATUS_VIAGEM, VALOR_VIAGEM"
						+ " VALUES (?,?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		try{
			
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setInt(1, to.getCodViagem());
			prepStat.setString(2, to.getEndereco());
			prepStat.setInt(3, to.getQuantPassageiro());
			prepStat.setDate(4, Date.valueOf(to.getDataSaida()));
			//prepStat.setString(4, to.getDataSaida());
			prepStat.setDate(5, Date.valueOf(to.getDataRetorno()));
			//prepStat.setString(5, to.getDataRetorno());
			prepStat.setTime(6, Time.valueOf(to.getHoraSaida()));
			//prepStat.setTime(6, to.getHoraSaida());
			prepStat.setTime(7, Time.valueOf(to.getHoraRetorno()));
			//prepStat.setTime(7, to.getHoraRetorno());
			prepStat.setInt(8, to.getStatusViagem());
			prepStat.setFloat(9, to.getValorViagem());
			
			prepStat.execute();
		}catch (Exception e){			
			throw new AgendarViagemException("Erro ao incluir agendar viagem" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteAgendarViagem(int codigo) throws AgendarViagemException{
		
		String sql = "DELETE FROM AGENDAMENTO_VIAGEM WHERE COD_VIAGEM = ?";
		
		Connection conn = null;		
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			prep.setInt(1, codigo);
			
			prep.execute();
		}catch (SQLException e) {
			throw new AgendarViagemException("Erro excluindo aagendar Viagem " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void updateAgendarViagem(AgendarViagemTO to) throws AgendarViagemException{
		String sentenca = "UPDATE AGENDAMENTO_VIAGEM SET ENDERECO = ?, QUANT_PASSAGEIRO = ?, DATA_SAIDA = ?"
				        + " DATA_RETORNO = ?, HORA_SAIDA = ?, HORA_RETORNO = ?, STATUS_VIAGEM = ?, VALOR_VIAGEM = ?"
						+ " WHERE COD_VIAGEM = ?";
		
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getEndereco());
			prepStat.setInt(2, to.getQuantPassageiro());
			//prepStat.setDate(3, to.getDataSaida());
			prepStat.setDate(3, Date.valueOf(to.getDataSaida()));			
			//prepStat.setDate(4, to.getDataRetorno());
			prepStat.setDate(4, Date.valueOf(to.getDataRetorno()));
			//prepStat.setTime(5, to.getHoraSaida());
			prepStat.setTime(5, Time.valueOf(to.getHoraSaida()));
			//prepStat.setTime(6, to.getHoraRetorno());
			prepStat.setTime(6, Time.valueOf(to.getHoraRetorno()));
			prepStat.setInt(7, to.getStatusViagem());
			prepStat.setFloat(8, to.getValorViagem());
			
			prepStat.execute();
		}catch (Exception e) {
			throw new AgendarViagemException("Erro ao atualizar agendar viagem" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	
}
