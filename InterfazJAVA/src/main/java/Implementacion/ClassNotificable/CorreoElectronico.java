
package Implementacion.ClassNotificable;

import Interfaces.NotificableInterfaz;


public class CorreoElectronico implements NotificableInterfaz <String>{

    @Override
    public String enviarNotificacion() {
        return "Tipo de mensaje: Correo ELectronico\nDestinatario: Cristiano Ronaldo\nMensaje:Te odio, Messi es mejor.";

    } 
    
}
