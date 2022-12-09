package com.example.juego_del_uno;

import java.util.Scanner;

public class btalla_naval {
    static Scanner sc=new Scanner(System.in);
    static int tablero1[][];
    static int tablero2[][];
    static int eje_x,eje_y;
    static String ejey,ejex;
    static String comienzo, comienzoj1,comienzoj2;
    static String comienzobarcos,comienzodisparos;
    static int fila,columna;
    static String nom_j,nom_2;
    static int intentosj1,intentosj2=4;

    public static void main(String[]args){
        System.out.println("Bienvenido a Batlla Naval");
        System.out.println("A continuacion se te pedira el tamaño del tablero");
        System.out.println("Ingresa el tamaño de forma Horizontal");
        eje_x= sc.nextInt();
        System.out.println("ingresa el tamaño de forma vertical");
        eje_y=sc.nextInt();
        tablero1=new int[eje_x][eje_y];
        tablero2=new int[eje_x][eje_y];
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero1[i][j]=0;
            }
        }
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                tablero2[i][j]=0;
            }
        }
        System.out.println("Tablero listo");
        for (int i=0; i<eje_x; i++){
            for (int j=0; j<eje_y;j++){
                System.out.print(tablero1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("A continuacion ingresa el nombre de los jugadores");
        System.out.println("Jugador 1: ");
        nom_j=sc.next();
        System.out.println("Jugador 2: ");
        nom_2=sc.next();
        System.out.println("Desea comenzar el juego (si/no)");
        comienzo=sc.next();
        if (comienzo.equalsIgnoreCase("si")) {
            System.out.println("La partida comenzara despues de los siguientes pasos");
            System.out.println("A continuacion ingresaran sus barcos en el tablero");
            System.out.println("Estas listo para ingresar tus barcos Jugador "+ nom_j+" (si/no)");
            comienzoj1=sc.next();
            if (comienzoj1.equalsIgnoreCase("si")){
                tablero1partidacominezo();
            }
            System.out.println("Jugador "+nom_2+" estas listo para ingresar tus barcos(si/no)");
            comienzoj2=sc.next();
            if (comienzoj2.equalsIgnoreCase("si")){
                tablero2partidacomienzo();
            }
            ataquesjugadores();
        }
    }
    public static void tablero1partidacominezo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
             int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-4) {
                for (int i=0; i<4; i++){
                    tablero1[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-4 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<4; i++){
                    tablero1[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-3) {
                for (int i=0; i<3; i++){
                    tablero1[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-3 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<3; i++){
                    tablero1[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
           int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-2) {
                for (int i=0; i<2; i++){
                    tablero1[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-2 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<2; i++){
                    tablero1[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_j+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-1) {
                for (int i=0; i<1; i++){
                    tablero1[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-1 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<1; i++){
                    tablero1[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero1[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

    }
    public static void tablero2partidacomienzo(){
        System.out.println("En que posicion debesea ingresar su primer barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-4) {
                for (int i=0; i<4; i++){
                    tablero2[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-4 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<4; i++){
                    tablero2[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }

        System.out.println("De que manera desea poner su 2do barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-3) {
                for (int i=0; i<3; i++){
                    tablero2[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-3 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<3; i++){
                    tablero2[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 3er barco "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-2) {
                for (int i=0; i<2; i++){
                    tablero2[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-2 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<2; i++){
                    tablero2[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
        System.out.println("De que manera desea poner su 4to barco Jugador "+ nom_2+" (Horizontal/Vertical)");
        comienzobarcos=sc.next();
        if (comienzobarcos.equalsIgnoreCase("Horizontal")){
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x && voy >= 0 && voy <=eje_y-1) {
                for (int i=0; i<1; i++){
                    tablero2[hox][voy+1]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[i][j]+" ");
                }
                System.out.println("");
            }
        } else if (comienzobarcos.equalsIgnoreCase("Vertical")) {
            System.out.println("Se ingresa las coordadas de acuerdo a un plano cartesiano");
            System.out.println("Ingresa la coordnada horizontal o el eje x");
            int hox=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmente o el eje y");
            int voy=sc.nextInt();
            if (hox >= 0 && hox <= eje_x-1 && voy >= 0 && voy <=eje_y) {
                for (int i=0; i<1; i++){
                    tablero2[hox][voy+i]=1;
                }
            }
            for (int i=0; i<eje_x; i++){
                for (int j=0; j<eje_y; j++){
                    System.out.print(tablero2[j][i]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La coordenada ingresada no es valida favor de hacerlo de nuevo");
        }
    }
    public static void ataquesjugadores(){
        System.out.println("Jugador 1 "+nom_j+" En esta parte se van a atacar a los barcos del jugador 2");
        System.out.println("Deberas ingresar los datos como anteriormente en forma de plano cartesiano");
        for(int i=0;i<tablero1.length;i++)
            for(int j=0;j<tablero1.length-1;j++)

                for(int k=0;k<tablero2.length;k++)
                    for(int l=0;l<tablero2.length-1;l++)
        while (tablero1[i][j]==1 && tablero2[k][l]==1){
            System.out.println("Comienzo el turno adelante "+ nom_j+" es hora de luchar");
            System.out.println("Ingresa la coordenada del eje x/horizontalmente");
            fila=sc.nextInt();
            System.out.println("Ingresa de manera verticalmente o el eje y");
            columna=sc.nextInt();
            if (fila >= 0 && fila < eje_x && columna >= 0 && columna<eje_y){
                    if (tablero2[fila][columna]==1){
                        System.out.println("Eso es le diste segue asi");
                        for (int o=0; o<eje_x; o++){
                            for (int p=0; p<eje_y; p++){
                                tablero2[i][j]=4;
                            }
                        }
                    } else if (tablero2[fila][columna]==0) {
                        System.out.println("F de Fallaste ");
                        for (int f=0; f<eje_x; f++){
                            for (int a=0; a<eje_y; a++){
                                tablero2[f][a]=4;
                            }
                        }

                    } else if (tablero2[fila][columna]==4) {
                        System.out.println("Ya le diste un tiro antes");
                    }
                for (int m=0; m<eje_x; m++){
                        for( int n=0; n<eje_y; j++){
                            System.out.print(tablero2[m][n]+" ");
                        }
                        System.out.println("");
                    }
            }

        }
        System.out.println("Turno del Jugador 2 " + nom_2 + " Buena suerte");

            System.out.println("Comienza turno "+nom_2+" SUERTE");
            System.out.println("Ingresa la coordenada horizontalmnete/ eje x");
            fila=sc.nextInt();
            System.out.println("Ingresa la coordenada verticalmenete/ eje y");
            columna=sc.nextInt();
            if (fila>=0 && fila<eje_x&& columna>=0&& columna<eje_y){
                if (tablero1[fila][columna]==1){
                    System.out.println("Felicidades has acertado sigue asi");
                    for (int i=0; i<eje_x; i++){
                        for (int j=0; j<eje_y; j++){
                            tablero1[i][j]=4;
                        }
                    }
                } else if (tablero1[fila][columna]==1) {
                    System.out.println("Fallaste mejor suerte en el proximo tiro");
                    for (int i=0; i<eje_x; i++){
                        for(int j=0; j<eje_y;j++){
                            tablero1[i][j]=4;
                        }
                    }

                }else if (tablero1[fila][columna]==4){
                    System.out.println("ya habias tirado aqui");
                }
            }
            int f=1;
            for (int i=0; i< tablero1.length; i++)
                for (int j =0; j< tablero1.length-f; j++)

                    if (tablero2[i][j]==1){
                        System.out.println("HAS PERDIDO "+ nom_2);
                        for (int k=0; k<eje_x; k++){
                            for (int l=0; l<eje_y; l++){

                                System.out.print(tablero2[k][l]+ " ");
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("GG Has Ganado");
                        for (int r=0; r<eje_x; r++){
                            for (int e=0; e<eje_y; e++){
                                System.out.print(tablero2[r][e]+ " ");
                            }
                            System.out.println("");
                        }
                    }
            for (int w=0; w< tablero2.length; w++)
            for (int q=0; q< tablero2.length-f; q++ )
                    if (tablero1[w][q]==1){
                        System.out.println("PERDISTE QUE TRISTE");
                        for (int r=0; q<eje_x; q++){
                            for (int s=0; w<eje_y; w++){
                                System.out.print(tablero1[q][w]);
                            }
                            System.out.println("");
                        }
                    }else {
                        System.out.println("Has Ganado tuviste suerte esta ves la proxima sera diferente");
                        for (int r=0; r<eje_x; r++){
                            for (int e=0; e<eje_y; e++){
                                System.out.print(tablero2[r][e]+ " ");
                            }
                            System.out.println("");
                        }
                    }

    }
}
