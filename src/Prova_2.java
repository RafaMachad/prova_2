import java.util.Scanner;


public class Prova_2 {
    
    public static void main(String[] args)  {
        
        //programa simulador de carro
        //switch liga carro ou fecha programa
        // if carro ligado && parado switch: pode desligar, andar ou engatar ré
        //if boolean andando = true switch: parar carro, subir marcha, descer marcha. if marcha >0 = andandoTrue.
        // if marcha == 0 andando =false
        
        Scanner sc = new Scanner (System.in);
        int escolha_LD = 0;
        boolean Carro = false;
        boolean loop = true;
        String[] Status = {"ligado", "desligado"};
        int[] marcha = {0,1,2,3,4,5,6,7,8};
        String[] andale = {"Andando", "Parado"};
        boolean parado = false;
        boolean andando = false;

        while(loop == true){

            System.out.println("--------------------------------------------------");
            if (Carro == false){
                 System.out.println("Estado atual do carro: "+Status[1]);
            }else if(Carro == true){
                System.out.println("Estado atual do carro: "+Status[0]);
            }
        
        System.out.println("--------------------------------------------------");
        System.out.println("1) Ligar Carro.\n2) Encerrar programa. ");
        System.out.println("--------------------------------------------------");
        escolha_LD = sc.nextInt();
        switch(escolha_LD){

            case 1:
            Carro = true;
                break;
            case 2:
            loop = false;

                break;
            default:
            System.out.println("Escolha uma opção valida!");
                break;
        }

        if (Carro == true){
            Prova_2.limpatela();
            System.out.println("---------------------");
            System.out.print("Estado atual do carro: ");
            if (Carro == false){
                System.out.print(Status[1]);
           }else if(Carro == true){
               System.out.print(Status[0]);
           }
        
        System.out.println();
        System.out.println("-------------------------");   
        System.out.println("O carro esta: "+ andale[1]);        
        System.out.println("-------------------------");
        System.out.println("1) Desligar o carro.\n2) Acelerar.\n3) Engatar a ré.");

        int escolha_duraive =0;
        escolha_duraive = sc.nextInt();
                switch(escolha_duraive){
                    case 1:
                    Carro = false;
                    andando = false;
                    parado = true;
                        break;
                    case 2:
                    parado = false;
                    andando = true;
                    limpatela();
                    boolean loop2 = true;
                    int marcia = 0;
                    int sobemarcha = 0;
                    boolean lup = true;
                            if (parado == false && andando == true){
                                int cont =1;
                                
                                do{
                                    limpatela();
                                if (Carro == false){
                                    System.out.println("Estado atual do carro: "+Status[1]);
                               }else if(Carro == true){
                                   System.out.println("Estado atual do carro: "+Status[0]);
                               }
                               
                                System.out.println("-------------------------");   
                                System.out.println("O carro esta: "+ andale[1]+" na marcha: "+marcha[cont]);        
                                System.out.println("-------------------------"); 
                                    if(cont < 8){
                                        System.out.println("1)Parar p carro.\n2) Subir marcha.\n3)Descer Marcha.");
                                    }else if(cont == 8){
                                        System.out.println("1)Parar p carro.\n3)Descer Marcha.");
                                    }
                               sobemarcha = sc.nextInt();

                               switch (sobemarcha) {
                                case 1:
                                    Carro = false;
                                    lup = false;
                                    parado = true;
                                    andando = false;
                                    break;
                               case 2:
                               if(cont < 8){
                               cont++;}
                               if(cont == 8){
                                System.out.println("Voce atingiu o maior numero de marchas.");
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    
                                    e.printStackTrace();
                                }
                               }
                               break;
                                case 3:
                                    cont--;
                                    break;
                                default:
                                    System.out.println("insisra opcao valida");
                                    break;
                               }
                            }while(lup == true);
                            }   
                        break;
                    case 3: 
                    //meia noite eu te conto
                        break;
                    default:
                    System.out.println("INSIRA UMA OPÇÃO VALIDA!");
                        break;
                    }
 ////////////////////////////////////////////////////////////////////////////////////////
       
        }
        
        
        
   }







    }

    


    public static void limpatela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
 
}
