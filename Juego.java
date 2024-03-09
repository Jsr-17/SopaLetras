import java.util.Scanner;

public class Juego extends Tablero {

Scanner scanner = new Scanner(System.in);

char abecedario[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

@Override
public void asignaValores(int dificultad) {
 if (dificultad==0) {
    this.tableroJuego= new char[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if (i==0 && j==0 || i==0 && j==4 ||i==2 && j==1 ||i==3 && j==0 ) {
                    tableroJuego[i][j]='A';
                }else if(i==0 && j==2||i==2 && j==2||i==2 && j==3||i==3 && j==0){
                    tableroJuego[i][j]='O';
                }else if (i==0 && j==1) {
                    tableroJuego[i][j]='H';
                }else if (i==0 && j==3||i==3 && j==3|| i==3 && j==4) {
                    tableroJuego[i][j]='L';                
                }else if(i==1 && j==0 || i==1 && j==4){
                    tableroJuego[i][j]='Z';
                }else if(i==1 && j==1 || i==1 && j==3){
                    tableroJuego[i][j]='S';
                }else if (i==2 && j==0) {
                    tableroJuego[i][j]='P';
                }else if (i==3 && j==2 ) {
                    tableroJuego[i][j]='C';
                }else if (i==1 && j==2) {
                    tableroJuego[i][j]='J';
                }else if (i==3 && j==1) {
                    tableroJuego[i][j]='R';
                }else if (i==2 && j==4){
                    tableroJuego[i][j]='U';
                }

            }
        }
    
 }else{

 }
    
}
    
public void estableceDificultad(int dificultad){

    switch (dificultad) {
        case 0:
        asignaValores(0);

        break;
       
        case 1:
            asignaValores(1);

            break;
        default:
            break;
    }
}
    @Override
    public void iniciaTablero() {

        System.out.println("Elija el nivel de dificultad: \n 0=Normal  \n 1=Dificil ");

        int dificultad=scanner.nextInt();

        estableceDificultad(dificultad);

        if (dificultad==0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(tableroJuego[i][j]+"  ");
                }
                System.out.println("");
        }
        }else{
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tableroJuego[i][j]+"  ");
                }
                System.out.println("");
        }
        }

       
        
    }
    
}