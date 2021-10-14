package com.java.Day10;

import java.io.FileWriter;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVWriter;

public class C_CSVWriteFile {
    public static void main(String[] args) throws IOException {
        CSVWriter writeCSV = new CSVWriter(new FileWriter("./FileHandlingFiles1/testResults.csv"));
        
        String[] testHeader="TestCase,ExpectedResult,ActualResult".split(",");
        String[] testResult1 = "TestCase1,Pass,Fail".split(",");
        String[] testResult2 = "TestCase2,Pass,Pass".split(",");
        
        writeCSV.writeNext(testHeader);
        writeCSV.writeNext(testResult1);
        writeCSV.writeNext(testResult2);
        writeCSV.close();
        System.out.println("CSV file written successfully");
        
    }
}