/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.parqueo;

import Interfaces.VentanaConfiguracion;
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
import progra.parqueo.*;
 

 public class ArchivosXml {
     private static ArchivosXml XmlInstance; 
     Factura prueba = new Factura(0, null, null, null, null, null, null);
     //Vehiculo  ca1= new Vehiculo(null, null, null, null, 0, 0);
     
     public static ArchivosXml getInstance(){
        if(XmlInstance == null)
            XmlInstance = new ArchivosXml();
        return XmlInstance;

    }
    
    public void CrearXml(Parqueo prueba) {
         try {
             //creo el objeto JespXML con el archivo que quiero crear
             JespXML archivo = new JespXML("Parqueo2014.xml");
             
             //declaro el Tag raiz, que en esta caso se llama bd
             Tag par = new Tag("Clientes");
             //le agrego un atributo a ese Tag (clientes="3")
             //par.addAtributo(new Atributo("Placa", "1"));
             
             //creo el Tag cliente, que va a tener un nombre y un apellido
             Tag parqueo = new Tag("Parqueo");
             Tag direccion;
             Tag nombre;
             Tag telefono;
             Tag slogan;
             //Tag montoMinimo;
             Tag contrasena;
             //Tag espaciosParqueo;
             Tag cedulaJuridica;
             
             //construyo los Tags nombre y apellido y le agrego contenido
             nombre= new Tag("Nombre_del_Parqueo");
             direccion = new Tag("Direccion");
             telefono= new Tag("Telefono_Fijo");
             slogan=new Tag("Slogan");
             //montoMinimo = new Tag("Monto minimo para abrir el parqueo");
             contrasena = new Tag("Contrasena");
             //espaciosParqueo = new Tag("Cantidad_de_espacios_de_parqueo");
             cedulaJuridica = new Tag("Cedula_jurudica");
             
             nombre.addContenido(prueba.factura.getTitulo());
             direccion.addContenido(prueba.factura.getDireccion());
             telefono.addContenido(prueba.factura.getNumTelefono());
             slogan.addContenido(prueba.factura.getSlogan());
             //String min=String.valueOf(prueba.userCaja.getMontoCobro());
             //montoMinimo.addContenido("holaaaaaaaaaaa");
             contrasena.addContenido(prueba.getContrasenaEncriptada());
             //String converCantidadEspacios = String.valueOf(prueba.getCantEspacios());
             //espaciosParqueo.addContenido(converCantidadEspacios);
             cedulaJuridica.addContenido(prueba.factura.getCedulaJuridica());
             
             
             //agrego el Tag nombre y apellido al Tag cliente
             parqueo.addTagHijo(nombre);
             parqueo.addTagHijo(direccion);
             parqueo.addTagHijo(telefono);
             parqueo.addTagHijo(slogan);
             //parqueo.addTagHijo(montoMinimo);
             parqueo.addTagHijo(contrasena);
             //parqueo.addTagHijo(espaciosParqueo);
             parqueo.addTagHijo(cedulaJuridica);
             
             //finalmente agrego al Tag bd, el tag cliente
             
             par.addTagHijo(parqueo);
             
             //y escribo el archivo XML

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
     
     
     /*public void AbrirXml(){
                  try {
             //Cargo el archivo
             JespXML archivo = new JespXML("Parqueo2014.xml");
             //leo el archivo y me retorna el tag raiz, que en este caso
             // es biblioteca
             Tag par = archivo.leerXML();
             //Obtengo los tags que necesito, por el nombre
             Tag carro = par.getTagHijoByName("Vehiculo");
             Tag placa = carro.getTagHijoByName("placa");
             //Tag parqueo = Parqueo.getTagHijoByName("Parqueo");
             //Tag direccion = parqueo.getTagHijoByName("Direccion");
             
             
             //puedo obtener los valores de los atributos de un tag específico
             String paginas = carro.getValorDeAtributo("paginas");
             
             //imprimo la información requerida
             JOptionPane.showInputDialog("placa"+placa.getContenido());
             //JOptionPane.showInputDialog("Placa: "+direccion.getContenido());
             /*System.out.println("Título: "+titulo.getContenido());
             System.out.println("Autor: "+autor.getContenido());
            } catch (AtributoNotFoundException ex) {
             //exception lanzada cuando no se encuentra el atributo
             Logger.getLogger(ArchivosXml.class.getName()).log(Level.SEVERE, null, ex);
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
     }*/
     
     

          