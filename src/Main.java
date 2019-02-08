
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File file = NewDownloadFileHelper.GetLatestDownloadedFile("csv");
		final String fileToCompare="./src/csvToCompare.csv";
		System.out.println(CsvCompareHelper.CompareFiles(file, fileToCompare));
	}

}
