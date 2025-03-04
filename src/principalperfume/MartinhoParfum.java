/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalperfume;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class MartinhoParfum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        PerfumeList perfumeList = new PerfumeList();
        
        int op = 8;

        while (op!= 0){
            System.out.println("Bem-vindo ao MARTINHO PARFUM seu gerenciador de Perfumes!");
            System.out.println("1 - Adicionar Perfume");
            System.out.println("2 - Alterar Perfume");
            System.out.println("3 - Remover Perfume");
            System.out.println("4 - Listar Perfumes");
            System.out.println("5 - Buscar Perfume");
            System.out.println("6 - Exibir Quantidade de Perfumes");
            System.out.println("7 - Ordenar Perfumes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = ler.nextInt();
            System.out.println("//--//--//--//--//--//--//--//");
        
            switch (op) {
                case 1:
                    System.out.print("Digite o nome do perfume para adicionar: ");
                    String nome = ler.next();
                    perfumeList.adicionarPerfume(nome);
                    break;

                case 2:
                    System.out.print("Digite o nome do perfume que você quer alterar: ");
                    String nomeAntigo = ler.next();
                    System.out.print("Digite o novo nome do perfume: ");
                    String novoNome = ler.next();
                    perfumeList.mudarPerfume(nomeAntigo, novoNome);
                    break;

                case 3:
                    System.out.print("Digite o nome do perfume a ser exluído: ");
                    String removerNome =ler.next();
                    perfumeList.removerPerfume(removerNome);
                    break;

                case 4:
                    perfumeList.listarPerfumes();
                    break;

                case 5:
                    System.out.print("Digite o nome do perfume a ser buscado: ");
                    String buscarNome = ler.next();
                    perfumeList.buscarPerfume(buscarNome);
                    break;

                case 6:
                    perfumeList.quantidadePerfumes();
                    break;

                case 7:
                    perfumeList.ordenarPerfumes();
                    perfumeList.listarPerfumes();  
                    break;

                case 0:
                    System.out.println("Saindo da plataforma, OBRIGADO POR USAR O MARTINHO PARFUM");
                    break;

                default:
                    System.out.println("Opção inválida, Tente novamente.");
                    break;
            }

        } 

    }
}

    

