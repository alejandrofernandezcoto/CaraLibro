/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibrobd;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author a22alejandrofc
 */
public class XeradorMenus {
    
   private void crearPerfil() {

        String nome;
        String contrasinal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un nombre de usuario\n");
        nome = entrada.nextLine();
        System.out.println("Introduzca una contraseña válida\n");
        contrasinal = entrada.nextLine();
        Perfil novoPerfil = new Perfil(nome, contrasinal);
        CaraLibroBD.engadirPerfil(novoPerfil);

    }

    private void iniciarSesion() {

        String nome;
        String contrasinal;
        Perfil actual;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduzca su nombre de usuario\n");
            nome = entrada.nextLine();
            System.out.println("Introduzca su contrasinal\n");
            contrasinal = entrada.nextLine();
            actual = CaraLibroBD.obterPerfil(nome, contrasinal);
        } while (actual == null);

    }

    private void cambiarEstado(Perfil p) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elixe opción");
            System.out.println("(0) Volver al menú principal");
            System.out.println("(1) Cambiar estado");
            opcion = entrada.nextInt();
            System.out.println();
        } while (!(opcion == 1 || opcion == 0));

        switch (opcion) {
            case 1:
                System.out.println("Escriba el nuevo estado\n");
                p.estado = entrada.nextLine();
                break;

            case 0:
            default:
                break;
        }

        mostrarMenuPrincipal(p);

    }

    private void escribirComentario(Publicación pub, Perfil p) {

        String m;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza un comentario");
        m = entrada.nextLine();
        Comentario comentario = new Comentario(m, p);
        pub.engadirComentario(comentario);

    }

    private void facerMeGusta(Publicación pub , Perfil autor) {

        pub.engadirMeGusta(autor);

    }

    private void escribirMensaxe(Perfil remitente, Perfil destinatario) {

        String texto;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba o contido da mensaxe");
        texto = entrada.nextLine();
        System.out.println("Cal é o destinatario da mensaxe");
        nome = entrada.nextLine();
        Mensaxe mensaxe = new Mensaxe(texto, CaraLibroBD.buscarPerfil(nome));
        remitente.engadirMensaxePrivada(mensaxe);

    }

    private void marcarMensaxeComoLida(Mensaxe m) {

        m.lido = true;

    }

    private void eliminarMensaxe(Perfil p, Mensaxe m) {

        p.eliminarMensaxe(m);

    }
    
}
