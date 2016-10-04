package simulator.pedro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class Arquivo {
    	
    	public static void main(String [] args) throws FileNotFoundException{
    		String line;
    		File archive = new File ("C:\\Users\\SINFO\\workspace\\Arquivo\\src"
    				+ "\\arquivo\\thunder.txt");
    		if (archive.exists()){
	    		System.out.println("File founded on system");
	    		try(BufferedReader buffer_reader = new BufferedReader(new FileReader(archive))){
	    			while ((line = buffer_reader.readLine()) != null){
	    				System.out.println(line);
	    			}
	    		} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    	}
    }