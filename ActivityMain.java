/*
* @author Lucas Nascimento Tahan Sab
*
* @since 2020
*
* @version 1.0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ActivityMain {

    private static BufferedReader in;

    public static void initialize() {

        in = new BufferedReader(new InputStreamReader(System.in));

    }

    public static void header() {

        System.out.println("\n********************************");
        System.out.println("*       Testing Iterator       *");
        System.out.println("*        Design Pattern        *");
        System.out.println("********************************\n");
        System.out.println("\tBem-vindo!\n");
        System.out.println(
                "Esta eh uma implementacao teste\ndo padrao de projeto Iterator.\nFaca alteracoes na lista!\nSiga as instrucoes...");
        System.out.println("\n********************************");

    }

    public static void execute() throws IOException {

        System.out.print("\nEscolha um tamanho para a lista: ");
        int size = Integer.parseInt(in.readLine());
        Data data = new Data(size);

        while (true) {

            System.out.println("\nO que deseja fazer na lista?\n");
            System.out.println("    1) Inserir elemento");
            System.out.println("    2) Remover elemento");
            System.out.println("    3) Mostrar elementos");
            System.out.println("    4) Sair do programa\n");

            int option = Integer.parseInt(in.readLine());

            switch (option) {

                case 1: {
                    System.out.println("\nO que deseja inserir na lista?\n");
                    int value = Integer.parseInt(in.readLine());

                    if (data.insert((int) value))
                        System.out.println("\n" + value + " inserido com sucesso na lista!");

                    break;
                }
                case 2: {
                    System.out.print("\nRemovendo ultimo elemento da lista...");

                    Object result = data.remove();

                    if (result != null)
                        System.out.println(" " + data.remove());

                    break;
                }
                case 3: {
                    System.out.println("\nElementos...");
                    DataArray dataArray = new DataArray(data);

                    dataArray.display();

                    break;
                }
                case 4: {
                    System.exit(0);

                    break;
                }
                default: {
                }

            }

            System.out.println("\n********************************");
        }

    }

    public static void main(String[] args) throws IOException {

        initialize();
        header();
        execute();

    }
}