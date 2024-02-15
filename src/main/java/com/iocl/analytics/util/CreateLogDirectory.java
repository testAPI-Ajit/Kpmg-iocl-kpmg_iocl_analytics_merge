package com.iocl.analytics.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateLogDirectory {
	public String createFolderIfNotExists(String targetPath, String filename) {

		// Path root = Paths.get("");
		// String projectRoot = root.toAbsolutePath().toString();
		String directoryPath = System.getProperty("user.home") + File.separator;

//		String folderPath = targetPath; // Replace this with the desired folder path
		String folderPath = directoryPath + targetPath;
		System.out.println("Project Root: " + folderPath);
		String logFilePath = folderPath + File.separator + filename;
		System.out.println("log File Path: " + logFilePath);

		Path path = Paths.get(folderPath);
		// File file = new File(folderPath, fileName);
		try {
			if (!Files.exists(path)) {

				Path createdPath = Files.createDirectories(path);

				System.out.println("Folder created successfully! " + createdPath);

				Path filePath = Paths.get(logFilePath);
				if (!Files.exists(filePath)) {
					Files.createFile(filePath);
					System.out.println("Log file created successfully.");
				}
				return logFilePath;

			} else {

				System.out.println("Folder already exists!");
				Path filePath = Paths.get(logFilePath);
				if (!Files.exists(filePath)) {
					Files.createFile(filePath);
					System.out.println("Log file created successfully.");
				} else {

					System.out.println("Log file already exists!");
				}
				return logFilePath;
			}
		} catch (IOException e) {
			System.err.println("Failed to create the folder: " + e.getMessage());
			return null;
		}

	}

}
