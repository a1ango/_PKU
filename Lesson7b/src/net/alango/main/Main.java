
package net.alango.main;

import java.io.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		printFolderInfo("/Users/al/OneDrive/~GD/IT/Eclipse/workspace", "*");

		saveFolderInfoToFile("/Users/al/OneDrive/~GD/IT/Eclipse/workspace");
		showMyCodeBufferedReader();
		showMyCodeScanner();
	}

	static void printFolderInfo(String folderName, String exc) {

		File folder = new File(folderName);

		// Проверка есть ли этот файл, и не папка ли он
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Wrong address inout");
			return;
		}

		// если объект существует и он папка
		// сздаю массив имён из перечня имен в папке

		String[] fileNames = folder.list();

		// вывожу в цикле
		for (String fileName : fileNames) {
			File file = new File(folder, fileName);
			String ext = (fileName.substring(fileName.lastIndexOf(".") + 1));
			if (file.isFile() && (ext.equals(exc))) {

				System.out.println(file.getName() + "<" + ext + ">");
			}
		}
	}

	static void saveFolderInfoToFile(String folderName) {

		File folder = new File(folderName);
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		// Проверка есть ли этот файл, и не папка ли он
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Wrong address inout");
			return;
		}

		try (PrintWriter pw = new PrintWriter("FolderInfo.txt")) {
			String res = String.format("%-20.20s\t%-6.6s\t%9.9s\t%-10.10s", "Name", "Type", "Size", "Date");
			pw.println(res);
			pw.println();
			String[] fileNames = folder.list();
			for (String fileName : fileNames) {
				File file = new File(folder, fileName);
				res = String.format("%-20.20s\t%-6.6s\t%-9.9s\t%-10.10s", fileName, (file.isFile() ? "File" : "Folder"),
						String.valueOf(file.length()), sdf.format(file.lastModified()).toString());
				pw.println(res);
				System.out.println(res);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	static void showMyCodeBufferedReader() {

		try (BufferedReader br = new BufferedReader(new FileReader("src/net/alango/main/Main.java"))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				System.out.println(text);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	static void showMyCodeScanner() {

		File file = new File("src/net/alango/main/Main.java");
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
