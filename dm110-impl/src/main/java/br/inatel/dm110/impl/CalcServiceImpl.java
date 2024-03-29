package br.inatel.dm110.impl;

import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.api.CalcService;

@RequestScoped
public class CalcServiceImpl implements CalcService {

	@Override
	public String doAddition(String op1, String op2) {
		try {
			return "<h1>Operação de soma: "+
					op1 + " + " + op2 + " = "+
					(Integer.parseInt(op1)+Integer.parseInt(op2)) + "</h1>";
		}catch(Exception e) {
			return "<h1>Algo deu errado, verifique os parâmetros da operação</h1>";
		}
	}

	@Override
	public String doSubtraction(String op1, String op2) {
		try {
			return "<h1>Operação de subtração: "+
					op1 + " - " + op2 + " = "+
					(Integer.parseInt(op1)-Integer.parseInt(op2)) + "</h1>";
		}catch(Exception e) {
			return "<h1>Algo deu errado, verifique os parâmetros da operação</h1>";
		}
	}

	@Override
	public String doMultiplication(String op1, String op2) {
		try {
			return "<h1>Operação de multiplicação: "+
					op1 + " * " + op2 + " = "+
					(Integer.parseInt(op1)*Integer.parseInt(op2)) + "</h1>";
		}catch(Exception e) {
			return "<h1>Algo deu errado, verifique os parâmetros da operação</h1>";
		}
	}

	@Override
	public String doDivision(String op1, String op2) {
		try {
			return "<h1>Operação de divisão: "+
					op1 + " / " + op2 + " = "+
					(Double.parseDouble(op1)/Double.parseDouble(op2)) + "</h1>";
		}catch(Exception e) {
			return "<h1>Algo deu errado, verifique os parâmetros da operação</h1>";
		}
	}
}
