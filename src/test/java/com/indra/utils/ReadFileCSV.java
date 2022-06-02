/*
 * Decompiled with CFR 0.150.
 */
package com.indra.utils;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFileCSV {
    private BufferedReader reader;
    private String line;
    private String[] parts = null;
    public ArrayList<ArrayList<String>> data = new ArrayList();

    public ArrayList<ArrayList<String>> readFile(String rutaArchivo) {
        try {
            this.reader = new BufferedReader(new FileReader(rutaArchivo));
            while ((this.line = this.reader.readLine()) != null) {
                this.parts = this.line.split(";");
                ArrayList<String> temporaryData = new ArrayList<String>();
                for (String d : this.parts) {
                    temporaryData.add(d.replace(",","."));
                }
                this.data.add(temporaryData);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return this.data;
    }

    public ArrayList<ArrayList<String>> readFileWhitOutReplace(String rutaArchivo) {
        try {
            this.reader = new BufferedReader(new FileReader(rutaArchivo));
            while ((this.line = this.reader.readLine()) != null) {
                this.parts = this.line.split(";");
                ArrayList<String> temporaryData = new ArrayList<String>();
                for (String d : this.parts) {
                    temporaryData.add(d);
                }
                this.data.add(temporaryData);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return this.data;
    }



    public String extractResponseInformation(String response) {
        String buscarLlaveInicio = "ah_id:";
        int posicion1 = response.trim().indexOf(buscarLlaveInicio) + buscarLlaveInicio.length();
        int posicion2 = posicion1 + 5;
        String token = response.substring(posicion1, posicion2).trim();
        return token;
    }

    public String getToken() {
        String response = this.readFile("C:\\SanitySemilla8\\src\\test\\resources\\config_data\\ShoppingBag.log").toString();
        System.out.println(this.countTokens(response));
        return this.countTokens(response);
    }

    public String countTokens(String response) {
        int posicion = 0;
        int contadorPalabras = 0;
        String token = "";
        String palabra = "ah_id:";
        posicion = response.indexOf(palabra);
        while (posicion != -1) {
            ++contadorPalabras;
            token = response.substring(posicion + 6, posicion + 11).trim();
            posicion = response.indexOf(palabra, posicion + 1);
        }
        return token;
    }
}

