import java.io.*;
import java.util.*;
class filehandel1
{
	static String fileName=("names.txt");
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader stdin = new BufferedReader(isr);
	String name="";
	void main(/*String[ ] args*/){

		try{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw =new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			for ( int i=0 ; i< 300 ; i++){
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.print(name);
				outFile.print("    ");
				i++;
				name =String.valueOf( (char)i);
				outFile.println(name);
			}
			outFile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}