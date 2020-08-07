/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
/**
 * FXML Controller class
 *
 * @author gabriela
 */
public class PrimaryController {


    @FXML
    private Button boton;
    @FXML
    private TextArea Area;
  
    
    @FXML
    private void ConsultaDB(ActionEvent event) {
        ArrayList<String> listadatos =new ArrayList<String>();
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://24.152.40.30:3306/examenits", "its", "12345678");
           System.out.println("Funciona uwu/");
           Statement stm= con.createStatement();
           ResultSet rs =stm.executeQuery("SELECT * FROM personas");
           while(rs.next()){
           Integer id =rs.getInt("idPersona");
           String nombre = rs.getString("nombres");
           String apellido = rs.getString("apellidos");
   
          
          listadatos.add(rs.getInt(1) + ""+ rs.getString(2) +" "+ rs.getString(3)+" \n");
       }
       }catch(Exception ex){
           System.out.println("Error al conectar :"+ex);
           
       }
       Area.setText(listadatos+"");
    }

  
  
    }
