package A08_Functional_Programming_Makes_Java_Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class A35_Files_Using_Functional_Programming {

	public static void main(String[] args) throws IOException {
		
//		Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		
		Files.lines(Paths.get("file.txt"))
		     .map(str -> str.split(""))
		     .flatMap(Arrays::stream)
		     .forEach(System.out::println);
		
		System.out.println();
		
		Files.lines(Paths.get("file.txt"))
	     .map(str -> str.split(" "))
	     .flatMap(Arrays::stream)
	     .forEach(System.out::println);
		
		System.out.println();
		
		Files.lines(Paths.get("file.txt"))
	     .map(str -> str.split(" "))
	     .flatMap(Arrays::stream)
	     .distinct()
	     .sorted()
	     .forEach(System.out::println);
		
		System.out.println();
		
		Files.list(Paths.get("."))
		     .forEach(System.out::println);
/*

Printing all the directories and files which present in this folder

Output: 
		
.\.classpath
.\.project
.\.settings
.\bin
.\file.txt
.\src
						
*/
		
		// If you want to figure out only directories
		
		Files.list(Paths.get("."))
		     .filter(Files::isDirectory)
	         .forEach(System.out::println);		
		
	}

}
