/**
 * (c) 2017 Sgt-Tesla
 *
 */

import java.io.File;
import java.io.IOException;

public class ExecuteOther 
{
	public static void main(String[] args)
	{
		try 
    {
			ExecuteFile("Executed");
		} catch (IOException e) 
    {
			e.printStackTrace();
		}
	}
  
	/**
	 * Executes the class file specified in name in the same directory as this file
	 * @param name The other class file (no extension)
	 * @throws IOException
	 */
	public static void ExecuteFile(String name) throws IOException
	{
		File f = new File("");
		String dir = f.getAbsolutePath().replace("\\", "/");
		ProcessBuilder pb = new ProcessBuilder("java", "-cp", dir, name);
		pb.inheritIO();
		pb.start();
	}
}
