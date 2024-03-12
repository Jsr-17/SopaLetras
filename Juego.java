import java.util.Scanner;

public class Juego extends Tablero {
    boolean ganado=false;
    String letra="";
    boolean dificil;

    Scanner scanner = new Scanner(System.in);

    char abecedario[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z' };

    String sopaLetrasNormal[]={"HOLA","AZUL","COJO","OLA","SOL","ROSA"};
    String sopaLetrasDificil[]={"ROJO","POLLO","ROMERO","ALOE","ARMA","CHATEAR","PATRON","SAL","OSO","DADO","COMIDA","MES","CERDO","OJO","AMOR","TACHO","LAS","OTRO"};

    
    public void compruebaLetra(){
        if (dificil) {            
            for (int i = 0; i < sopaLetrasDificil.length; i++) {
                if (letra.equals(sopaLetrasDificil[i])) {
                    System.out.println("\n\n\nHas encontrado la letra "+letra+"\n\n\n");
                }
            }
        }else{

            for (int i = 0; i < sopaLetrasNormal.length; i++) {
                if (letra.equals(sopaLetrasNormal[i])) {
                    System.out.println("\n \n\nHas encontrado la letra "+letra+"\n\n\n");
                }
            }
        }
    }


    public void pedirLetra(){            
        
        System.out.println("Para escoger la palabra que has reconocido elige las posiciones x e y respectivamente de cada letra saldrá la palabra que se va formando segun vas escribiendolo por ejemplo 1,2\nEn el caso de querer borrar la palabra escribe Borrar");
        String texto=scanner.nextLine();
        if (texto.equalsIgnoreCase("borrar")||texto.equalsIgnoreCase("borar")||texto.equalsIgnoreCase("borra")||texto.equalsIgnoreCase("vorrar")||texto.equalsIgnoreCase("vora")) {
            this.letra="";
            return;
        }
        
       int n1= Character.getNumericValue(texto.charAt(0));
       int n2=Character.getNumericValue(texto.charAt(2));

        letra+=this.tableroJuego[n1][n2];
        System.out.println("La palabra que estas formando es: "+this.letra);
        
        compruebaLetra();

    }


    @Override
    public void asignaValores(int dificultad) {
        if (dificultad == 0) {
            this.tableroJuego = new char[4][5];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0 && j == 0 || i == 0 && j == 4 || i == 2 && j == 1 || i == 3 && j == 0) {
                        tableroJuego[i][j] = 'A';
                    } else if (i == 0 && j == 2 || i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 0) {
                        tableroJuego[i][j] = 'O';
                    } else if (i == 0 && j == 1) {
                        tableroJuego[i][j] = 'H';
                    } else if (i == 0 && j == 3 || i == 3 && j == 3 || i == 3 && j == 4) {
                        tableroJuego[i][j] = 'L';
                    } else if (i == 1 && j == 0 || i == 1 && j == 4) {
                        tableroJuego[i][j] = 'Z';
                    } else if (i == 1 && j == 1 || i == 1 && j == 3) {
                        tableroJuego[i][j] = 'S';
                    } else if (i == 2 && j == 0) {
                        tableroJuego[i][j] = 'P';
                    } else if (i == 3 && j == 2) {
                        tableroJuego[i][j] = 'C';
                    } else if (i == 1 && j == 2) {
                        tableroJuego[i][j] = 'J';
                    } else if (i == 3 && j == 1) {
                        tableroJuego[i][j] = 'R';
                    } else if (i == 2 && j == 4) {
                        tableroJuego[i][j] = 'U';
                    }

                }
            }

        } else {
            this.tableroJuego= new char[8][10];
            for(int i =0;i<8;i++){
                for(int j=0;j<10;j++){
                    if (
                        i==0 && j==0 || i==0 && j==6 || i==0 && j==8 || i==1 && j==4 ||
                        i==1 && j==7 || i==1 && j==9 || i==2 && j==0 || i==2 && j==3 ||
                        i==2 && j==7 || i==3 && j==1 || i==3 && j==2 || i==3 && j==3 ||
                        i==3 && j==7 || i==4 && j==9 || i==5 && j==3 || i==6 && j==0 ||
                        i==7 && j==4
                    ) {
                        tableroJuego[i][j]='O';
                    }else if (
                        i==0 && j==3 || i==2 && j==5 || i==4 && j==1 || i==6 && j==5|| i==3 && j==8
                    ) {
                        tableroJuego[i][j]='E';
                    }else if (
                        i==0 && j==1 || i==2 && j==1 || i==4 && j==4
                    ) {
                        tableroJuego[i][j]='D';
                    }else if (
                        i==0 && j==2 || i==0 && j==5 || i==2 && j==2 || i==2 && j==6 ||
                        i==4 && j==2 || i==4 && j==3 || i==5 && j==7 || i==6 && j==7 ||
                        i==7 && j==3 || i==6 && j==8
                    ) {
                        tableroJuego[i][j]='R';
                    }else if (
                        i==0 && j==4 || i==6 && j==1 
                    ) {
                        tableroJuego[i][j]='C';
                    }else if (
                        i==0 && j==9 || i==3 && j==0 || i==4 && j==5 || i==4 && j==6 ||
                        i==5 && j==2 || i==6 && j==7 
                    ) {
                        tableroJuego[i][j]='X';
                    }else if (
                        i==0 && j==7 
                    ) {
                        tableroJuego[i][j]='J';
                    }else if (
                        i==0 && j==9 || i==3 && j==0 || i==4 && j==6 || i==4 && j==7 ||
                        i==5 && j==2 || i==6 && j==8 
                    ) {
                        tableroJuego[i][j]='X';
                    }else if (
                        i==1 && j==0 || i==3 && j==9 || i==4 && j==8 ||i==7 && j==6
                    ) {
                        tableroJuego[i][j]='S';
                    }else if (
                        i==1 && j==3 || i==4 && j==0 || i==7 && j==0 
                    ) {
                        tableroJuego[i][j]='P';
                    }else if (
                        i==1 && j==1 || i==1 && j==2 || i==2 && j==9 || i==3 && j==5 ||
                        i==5 && j==4 || i==5 && j==6 || i==5 && j==9 || i==6 && j==3 ||
                        i==6 && j==9 || i==7 && j==7 || i==7 && j==1 || i==6 && j==6
                    ) {
                        tableroJuego[i][j]='A';
                    }else if(
                        i==1 && j==5 || i==1 && j==6 || i==3 && j==6 || i==3 && j==9 ||
                        i==5 && j==0 || i==7 && j==8 || i==7 && j==9 
                    ){
                        tableroJuego[i][j]='L';
                    }else if (
                        i==1 && j==8 || i==5 && j==1 || i==5 && j==1 || i==6 && j==4 ||
                        i==7 && j==2 
                    ) {
                        tableroJuego[i][j]='T';

                    }else if (
                        i==0 && j==4 || i==2 && j==8 || i==5 && j==8 || i==2 && j==4
                    ) {
                        tableroJuego[i][j]='M';
                    }else if (
                        i==7 && j==5 
                    ) {
                        tableroJuego[i][j]='N';
                    }else if (
                        i==6 && j==2 
                    ) {
                        tableroJuego[i][j]='H';
                    }else if (  
                        i==3 && j==4 || i==5 && j==5
                    ) {
                        tableroJuego[i][j]='I';
                    }
                      
                }
            }
        }

    }

    public void estableceDificultad(int dificultad) {

        switch (dificultad) {
            case 0:
            dificil=false;
                asignaValores(0);

                break;

            case 1:
            dificil=true;
                asignaValores(1);
                break;
            default:
                break;
        }
    }

    @Override
    public void iniciaTablero() {

        System.out.println("Elija el nivel de dificultad: \n -0=Normal  \n -1=Dificil ");

        int dificultad = scanner.nextInt();
        scanner.nextLine();

        estableceDificultad(dificultad);

        if (dificultad == 0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(tableroJuego[i][j] + "  ");
                }
                System.out.println("");
            }
        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tableroJuego[i][j] + "  ");
                }
                System.out.println("");
            }
        }

        while (!ganado) {
            pedirLetra();
        }
    }

}
