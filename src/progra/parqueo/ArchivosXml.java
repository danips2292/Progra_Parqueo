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
import java.io.IOException;
import javax.swing.JOptionPane;
 import javax.xml.parsers.ParserConfigurationException;
 import org.jespxml.excepciones.AtributoNotFoundException;
 import org.jespxml.excepciones.TagHijoNotFoundException;
 import org.xml.sax.SAXException;
 

 public class ArchivosXml {
     private static ArchivosXml XmlInstance; 
     Vehiculo  carro1= new Vehiculo(null, null, null, null, 0, 0);
     
     public static ArchivosXml getInstance(){
        if(XmlInstance == null)
            XmlInstance = new ArchivosXml();
        return XmlInstance;

    }
     public void CrearXml(String pPlaca) throws IOException {
         try {
           
             JespXML archivo = new JespXML("Parqueo.xml");
             Tag parqueo = archivo.leerXML();
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
             
             //placa.getContenido();
             placa.addContenido(pPlaca);
             placa.actualizarValorAtributo(pPlaca,pPlaca);
             
             
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
         } catch (SAXException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         } catch (TransformerException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
     
     
     public void AbrirXml(){
                  try {
             //Cargo el archivo
             JespXML archivo = new JespXML("Parqueo.xml");
             //leo el archivo y me retorna el tag raiz, que en este caso
             // es biblioteca
             Tag par = archivo.leerXML();
             //Obtengo los tags que necesito, por el nombre
             Tag vehiculo = par.getTagHijoByName("Vehiculo");
             Tag placa = vehiculo.getTagHijoByName("placa");
             
             
             //puedo obtener los valores de los atributos de un tag específico
             //String paginas = vehiculo.getValorDeAtributo("paginas");
             
             //imprimo la información requerida
            JOptionPane.showInputDialog("Placa: "+placa.getContenido());
             /*System.out.println("Título: "+titulo.getContenido());
             System.out.println("Autor: "+autor.getContenido());*/
            /*} catch (AtributoNotFoundException ex) {
             //exception lanzada cuando no se encuentra el atributo
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);*/
            } catch (TagHijoNotFoundException ex) {
             //exception lanzada cuando no se encuentra el tag hijo
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     }
 
         
 
