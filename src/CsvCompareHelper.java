import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvCompareHelper {
	
	
	
	public static boolean CompareFiles(File Actualfile,File Expectedfile) throws IOException {
		
		String Actual = CsvToString(Actualfile);
		String Expected = CsvToString(Expectedfile);
		if(!Actual.equals(Expected))
		{
			System.out.println("ACTUAL   :" + Actual );
			System.out.println("EXPECTED :" + Expected);
			return false;
		}
		return true;
	}
	
	public static boolean CompareFiles(File Actualfile,String Expectedfile) throws IOException {
		
		String Actual = CsvToString(Actualfile);
		File f = new File(Expectedfile);
		String Expected = CsvToString(f);
		if(!Actual.equals(Expected))
		{
			System.out.println("ACTUAL   :" + Actual );
			System.out.println("EXPECTED :" + Expected);
			return false;
		}
		return true;
	}
	
	
	
	private static String CsvToString(File file) throws IOException
	{
		//FileReader fr1 = new FileReader(file);
		BufferedReader br1 = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String Line;
		while((Line=br1.readLine())!=null)
		{
			sb.append(Line);
			sb.append(",");
		}
		return sb.toString();
	}

}
