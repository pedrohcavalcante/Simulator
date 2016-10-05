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
    		String[] parts = null;

    		ArrayList<Instrucao> inst_array = new ArrayList<Instrucao>();
    		File archive = new File ("C:\\Users\\pedri\\git\\Simulator\\src\\simulator\\pedro\\thunder.txt");
    		
    		if (archive.exists()){
	    		System.out.println("File founded on system");
	    		try(BufferedReader buffer_reader = new BufferedReader(new FileReader(archive))){
	    			while ((line = buffer_reader.readLine()) != null){
	    				parts = line.split(" ");
	    				parts[1] = parts[1].substring(0, parts[1].length() -1);
	    				parts[2] = parts[2].substring(0, parts[2].length() -1);
	    				obj = new Instrucao(parts[0], parts[1], parts[2], parts[3]);
	    				inst_array.add(obj);
	    			}
	    			for (int i = 0; i < inst_array.size(); i++){
	    				inst_array.get(i).print();
	    			}
	    		} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    		
    	}
    }