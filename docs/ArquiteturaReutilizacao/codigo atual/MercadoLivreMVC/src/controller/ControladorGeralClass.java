package controller;

import model.*;

public class ControladorGeralClass implements ControladorGeral {

	public Reputacao mudarReputacao(Vendedor vendedor) {
		Reputacao r = vendedor.getReputacaoVendedor();
		return r == Reputacao.PRATA ? Reputacao.PLATINA : Reputacao.OURO;
	}
	public Nivel mudarClasse(Comprador comprador) {
		Nivel nivel = comprador.getClasseComprador();
		
		if(nivel == Nivel.NIVEL_1)
			nivel = Nivel.NIVEL_2;
		else if(nivel == Nivel.NIVEL_2)
			nivel = Nivel.NIVEL_3;
		else if(nivel == Nivel.NIVEL_3)
			nivel = Nivel.NIVEL_4;
		else 
			nivel = Nivel.NIVEL_5;
		
		return nivel;
	}

}
