package simulator.pedro;
/**
 * 
 * @author Pedro H B Cavalcante
 * @version 0.1 - 04/10/2016
 *
 */
public class Instrucao {
	private String inst, op1, op2, op3;
	/**
	 * 
	 * @param inst String da instrução
	 * @param op1 String do operador1
	 * @param op2 String do operador2
	 * @param op3 String do operador3
	 */
	public Instrucao(String inst, String op1, String op2, String op3){
		this.inst = inst;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
	}
	/**
	 * Função sobrecarregada
	 * @param inst String da instrução
	 * @param op1 String do operador1
	 * @param op2 String do operador2
	 */
	public Instrucao(String inst, String op1, String op2){
		this.inst = inst;
		this.op1 = op1;
		this.op2 = op2;
	}
	/**
	 * Print (alterar para quando só tiver dois ops;
	 */
	public void print(){
		System.out.println(inst + " " + op1 + " " + op2 + " " + op3 );
	}
}
