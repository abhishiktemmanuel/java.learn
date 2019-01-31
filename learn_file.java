import java.io.*;
class learn_file{
	static String filename = ("namm.txt");
	static InputStreamReader isr =new InputStreamReader(System.in);
	static BufferedReader stdin = new BufferedReader(isr);
	void main(){
		try{
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outfile = new PrintWriter (bw);
			for(int i=0;i<5 ;i++){
				System.out.print("ENTER NAME");
				String name = stdin.readLine();
				outfile.println(name);
			}
			outfile.close();
		}
		catch(IOException e){
			System.err.println(e);
		}
	}
}