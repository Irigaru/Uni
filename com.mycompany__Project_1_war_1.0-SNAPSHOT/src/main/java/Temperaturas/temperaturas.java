/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temperaturas;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
/**
 *
 * @author qwert
 */
@WebService
public class temperaturas {
        /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Fahrenheit a Celcius")
    public String FahrneitaCelcius(@WebParam(name = "TemperaturaFahrenheit") Double grad) 
    {
        double celcius = ((grad - 32)* 5)/9;
        return "Celsius :" + celcius;
    }   
    @WebMethod(operationName = "Celsius2Fahrenheit")
    public String CelciusaFahrenheit (@WebParam(name = "TemperaturaCelcius") Double grad) 
    {
        double fahrenheit = (grad * 9/5) + 32;
        return "Fahrenheit :" + fahrenheit;
    }
}
