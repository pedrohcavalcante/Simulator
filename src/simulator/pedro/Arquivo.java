package simulator.pedro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    public class Arquivo {
    	public static Instrucao obj;
    	public static void main(String [] args) throws FileNotFoundException{
    		String line;
    		int aux = 0;
    		String[] parts = null;
    		ArrayList<String> instrucoes = new ArrayList<String>();
    		ArrayList<String> op1 = new ArrayList<String>();
    		ArrayList<String> op2 = new ArrayList<String>();
    		ArrayList<String> op3 = new ArrayList<String>();
    		ArrayList<Instrucao> inst_array = new ArrayList<Instrucao>();
    		// Use in home PC
    		//File archive = new File ("C:\\Users\\pedri\\git\\Simulator\\src\\simulator\\pedro\\thunder.txt");
    		
    		// Use in SINFO PC
    		File archive = new File ("C:/Users/SINFO/workspace/Simulator/src/simulator/pedro/thunder.txt");
    		
    		if (archive.exists()){
	    		System.out.println("File founded on system");
	    		try(BufferedReader buffer_reader = new BufferedReader(new FileReader(archive))){
	    			while ((line = buffer_reader.readLine()) != null){
	    				parts = line.split(" ");
	    				// O parts[1] s� n�o vai ter virgula no caso do JUMP;
	    				parts[1] = parts[1].substring(0, parts[1].length() -1);
	    				/**
	    				 * Testando se o parts[0] � igual a mult ou div
	    				 * que entra no caso de n�o ter o parts[3], de acordo com os 
	    				 * exemplos que M�nica fez. 
	    				 * Se n�o for igual, vai para o else que adiciona o 
	    				 * parts[3] de acordo com a fun��o em Intrucao.java
	    				 */
	    				if (parts[0].equals("mult") || parts[0].equals("div")){
	    					obj = new Instrucao(parts[0], parts[1], parts[2], null);
		    				inst_array.add(obj);
		    				instrucoes.add(parts[0]);
		    				op1.add(parts[1]);
		    				op2.add(parts[2]);
	    				}else{
	    					parts[2] = parts[2].substring(0, parts[2].length() -1);
		    				obj = new Instrucao(parts[0], parts[1], parts[2], parts[3]);
		    				inst_array.add(obj);
		    				instrucoes.add(parts[0]);
		    				op1.add(parts[1]);
		    				op2.add(parts[2]);
		    				op3.add(parts[3]);
	    				}
	    			}
	    			/**
	    			 * Impress�o dos operadores. 
	    			 */
	    			System.out.println("                Opera��o | Destino | Fonte1 | Fonte2");
	    			for (int i = 0; i < inst_array.size(); i++){
	    				System.out.print("Valor de i = "+ i + "|  ");
	    				System.out.print(instrucoes.get(i));
	    				System.out.print("       " + op1.get(i));
	    				System.out.print("       " + op2.get(i));
	    				//System.out.print("       " + op3.get(i));
	    				/**
	    				 * Se instrucoes for igual �queles que possuem tr�s registradores
	    				 */
	    				if (instrucoes.get(i).equals("addi")){
	    					//System.out.print("\n" + instrucoes.size());
	    					System.out.print("       " + op3.get(i));
	    					aux++;
	    				}
	    				
	    				System.out.print("\n");
	    				
	    			}
	    			System.out.print(op3.get(3));
	    		} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    	}
    }