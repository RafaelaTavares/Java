package br.edu.univas.tp4.model.Runner;

import br.edu.univas.tp4.model.DAO.AgendarViagemDAO;
import br.edu.univas.tp4.model.TO.AgendarViagemTO;

public class AgendarViagem {

	public static void main(String[] args) {
		
		AgendarViagemDAO viagemDAO = new AgendarViagemDAO();
		AgendarViagemTO to = new AgendarViagemTO(102, "Rua", 5, "09/11/2017", "10/11/2017", "12:00", "13:00", 1, (float) 500.00);
		try{
			viagemDAO.insertNewAgendarViagem(to);
		}catch (Exception e) {
			System.out.println("Erro ao agendar viagem.");
			e.printStackTrace();
		}
			System.out.println("Sucesso ao agendar viagem.");

	}

}
