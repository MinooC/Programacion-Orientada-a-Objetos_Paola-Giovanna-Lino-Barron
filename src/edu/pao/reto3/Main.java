package edu.pao.reto3;

import edu.pao.reto3.process.Diccionario;
import edu.pao.reto3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {
                "Computadora", "Bosque", "Felicidad", "Investigación", "Sinceridad",
                "Aventura", "Libertad", "Ecosistema", "Innovación", "Solidaridad"
        };

        String[] significados = {
                "Dispositivo electrónico que procesa datos y realiza cálculos según un conjunto de instrucciones.",
                "Extensión grande de terreno cubierto de árboles y vegetación.",
                "Estado emocional de bienestar y satisfacción.",
                "Proceso de búsqueda sistemática de información con el fin de descubrir nuevos conocimientos.",
                "Calidad de ser honesto, genuino y sin engaños.",
                "Experiencia emocionante y arriesgada.",
                "Estado de no estar bajo el control o la restricción de otros.",
                "Comunidad de organismos vivos y su entorno físico en interacción.",
                "Introducción de algo nuevo o mejorado.",
                "Apoyo y cooperación mutua entre individuos en tiempos de necesidad o dificultad."
        };

        Diccionario diccionario = new Diccionario(palabras, significados);
        CLI cli = new CLI(diccionario);
        cli.launchApp();
    }
}

