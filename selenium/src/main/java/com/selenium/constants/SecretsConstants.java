package com.selenium.constants;

import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class SecretsConstants {

    private static String INPUT_JSON_FILE_PATH = "src/main/resources/secrets.json";
    private static Map<String, Object> inputMap;

    public String USERNAME;
    public String PASSWORD;

    public SecretsConstants() {
        String json = null;

        try {
            json = getResource(INPUT_JSON_FILE_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("*****************************************");
        Gson gson = new Gson();
        inputMap = gson.fromJson(json, Map.class);
        System.out.println("*****************************************");

        USERNAME = (String) inputMap.get("USERNAME");
        PASSWORD = (String) inputMap.get("PASSWORD");
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public static String getFileGivenCompletePath(String filename) throws Exception {
        StringBuilder builder = new StringBuilder();
        URL url = Thread.currentThread().getContextClassLoader().getResource(filename);
        File file = new File(url.getPath());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                builder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception();
        }
        return builder.toString();
    }


    public String getResource(String resource) {
        StringBuilder json = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(resource)),
                            StandardCharsets.UTF_8));
            String str;
            while ((str = in.readLine()) != null)
                json.append(str);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException("Caught exception reading resource " + resource, e);
        }
        return json.toString();
    }

    public static void writeToFile(String filename, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write(data);
    }
}
