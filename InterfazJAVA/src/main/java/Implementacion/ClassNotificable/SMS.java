/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassNotificable;

import Interfaces.NotificableInterfaz;

/**
 *
 * @author HP
 */
public class SMS implements NotificableInterfaz <String>{

    @Override
    public String enviarNotificacion() {
       return "Tipo de mensaje: SMS\nDestinatario: Leo Messi\nMensaje:Te amo";
    }
       
}
