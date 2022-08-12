/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmetica;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
/**
 *
 * @author qwert
 */
@WebService
public class aritmetica {
    @WebMethod(operationName ="Sumas")
      public String suma (@WebParam(name="valor1")double valor1, @WebParam(name ="valor2")double valor2)
      {
          double resultado = valor1 + valor2;
          return "Respuesta: " + resultado;
      }     
    @WebMethod(operationName ="Restas")
      public String resta (@WebParam(name="valor1")double valor1, @WebParam(name ="val2")double valor2)
      {
          double resultado = valor1 - valor2;
          return "Respuesta: " + resultado;
      }     
      @WebMethod(operationName ="Multiplicaciones")
      public String Multiplicaciones (@WebParam(name="valor1")double valor1, @WebParam(name ="val2")double valor2)
      {
          double resultado = valor1 * valor2;
          return "Respuesta: " + resultado;
      }      
      @WebMethod(operationName ="Divisiones")
      public String Divisiones (@WebParam(name="valor1")double valor1, @WebParam(name ="val2")double valor2)
      {
          if(valor2 == 0)
          {
              return "la division entre 0 no existe.";
          }
          double resultado = valor1 / valor2;
          return "Respuesta: " + resultado;
      }
}
