import java.io.File;
import java.io.FileFilter;

public class NewDownloadFileHelper
{
	
	public static File GetLatestDownloadedFile(String extension)
	{
		 File choice = null;
		    try {
		        File fl = new File("C:/Users/" + System.getProperty("user.name")
		                + "/Downloads/");
		        File[] files = fl.listFiles(new FileFilter() 
		        {
		            public boolean accept(File file)
		            {
		            	if( file.isFile())
		            	{
		            		
		            	String extensionCheck = "";
		            	String fileName=file.getName();
		            	int i = fileName.lastIndexOf('.');
		            	if (i >= 0) 
		            	{
		            		extensionCheck = fileName.substring(i+1);
		            	}
		            	if (extension.equalsIgnoreCase(extensionCheck) )
		            	{
		            		
		            		return true;
		            	}
		            	}
		            	return false;
		      
		            }
		        });

		        long lastMod = Long.MIN_VALUE;

		        for (File file : files) 
		        {
		            if (file.lastModified() > lastMod)
		            {
		                choice = file;
		                lastMod = file.lastModified();
		            }
		        }
		    } catch (Exception e) 
		    {
		        System.out.println("Exception while getting the last download file :" + e.getMessage());
		    }
		   System.out.println("The last downloaded file is " + choice.getPath());

		    return choice;
	}

}
