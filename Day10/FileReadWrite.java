package com.java.Day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	static void writeToFile() {
		FileWriter fw = null;
		
		try {
//			fw = new FileWriter("./FileHandlingFiles1/xyz.txt");
            fw = new FileWriter("./FileHandlingFiles1/xyz.txt", true);  // for appending 
			fw.write("Hello! How are you?");
			System.out.println("File writing sucessful.");
			fw.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void readFromFile() throws IOException
    {
        FileReader fr = null;
        fr = new FileReader("./FileHandlingFiles1/xyz.txt");
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();
    }
	
	
	
	public static void main(String[] args) {
		FileReadWrite f1 = new FileReadWrite();
		f1.writeToFile();
		
		try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Catch from main");
        }

	}

}
