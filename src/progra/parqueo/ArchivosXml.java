/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

import java.io.FileNotFoundException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.xml.parsers.ParserConfigurationException;
 import javax.xml.transform.TransformerConfigurationException;
 import javax.xml.transform.TransformerException;
 import org.jespxml.JespXML;
 import org.jespxml.modelo.Atributo;
 import org.jespxml.modelo.Tag;
import sun.security.jca.GetInstance;
 

 public class ArchivosXml {
     private static ArchivosXml XmlInstance; 
     Vehiculo  carro1= new Vehiculo(null, null, null, null, 0, 0);
     
     public static ArchivosXml getInstance(){
        if(XmlInstance == null)
            XmlInstance = new ArchivosXml();
        return XmlInstance;

    }
     public void CrearXml(String pPlaca) {
         try {
             //creo el objeto JespXML con el archivo que quiero crear
             JespXML archivo = new JespXML("Parqueo.xml");
             
             //declaro el Tag raiz, que en esta caso se llama bd
             Tag par = new Tag("Clientes");
             //le agrego un atributo a ese Tag (clientes="3")
             par.addAtributo(new Atributo("Placa", "1"));
             
             //creo el Tag cliente, que va a tener un nombre y un apellido
             Tag vehiculo = new Tag("Vehiculo");
             Tag placa;
             //Tag montoApagar;
             
             //construyo los Tags nombre y apellido y le agrego contenido
             placa = new Tag("Placa");
             //montoApagar = new Tag();
             
             placa.addContenido(pPlaca);
             
             //agrego el Tag nombre y apellido al Tag cliente
             vehiculo.addTagHijo(placa);
             //vehiculo.addTagHijo(montoApagar);
             
             //finalmente agrego al Tag bd, el tag cliente
             par.addTagHijo(vehiculo);
             //y escribo el archivo XML
             archivo.escribirXML(par);
         } catch (ParserConfigurationException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         } catch (TransformerConfigurationException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         } catch (TransformerException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 }
         
 
