package simulator.pedro;
/**
 * 
 * @author Pedro H B Cavalcante
 * @version 0.1 - 04/10/2016
 *
 */
public class Instrucao {
	private String inst, op1, op2, op3;
	public Instrucao(String inst, String op1, String op2, String op3){
		this.inst = inst;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
	}
	
	public void print(){
		System.out.println(inst + " " + op1 + " " + op2 + " " + op3 );
	}
}
