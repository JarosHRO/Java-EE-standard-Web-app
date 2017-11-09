/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearBlog;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jairo
 */
@XmlRootElement
public class crear {

        String name="nameblog";
        String menu1="menu1";
        String menu2="menu2";
        String menu3="menu3";
        String titulo="titlePost";
        String contenido="contenidopost";
        
        
        
   
    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    private String getClass(String nameblog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    

  
    
    
}
