/*
 * To ch
 */
package principalperfume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author 7
 */
public class PerfumeList {
    private  ArrayList <String> perfume;
    public PerfumeList(){
        perfume = new ArrayList();
    }
    public void adicionarPerfume(String nome){
        this.perfume.add(nome);
        System.out.println("Perfume adicionado com sucesso!");
    }
    public void mudarPerfume(String nomeAntigo, String novoNome){
        if (perfume.contains(nomeAntigo)) {
            int index = perfume.indexOf(nomeAntigo);
            perfume.set(index, novoNome);
            System.out.println("Perfume " + nomeAntigo + " alterado para " + novoNome + ".");
        } else {
            System.out.println("Perfume não encontrado!");
        }
    }
        public void removerPerfume(String nome){
            if (perfume.contains(nome)) {
            perfume.remove(nome);
            System.out.println("Perfume " + nome + " removido com sucesso.");
        } else {
            System.out.println("Perfume não encontrado!");
        }
        }
        public void listarPerfumes(){
            if (perfume.isEmpty()) {
            System.out.println("Não há perfumes cadastrados no nosso gerenciador.");
        } else {
            System.out.println("Perfumes cadastrados:");
            for (String perfume : perfume) {
                System.out.println("- " + perfume);
            }
        }
    }
        
        public void buscarPerfume(String nome) {
        if (perfume.contains(nome)) {
            System.out.println("Perfume " + nome + " encontrado.");
        } else {
            System.out.println("Perfume não encontrado!");
        }
    }
         public void quantidadePerfumes() {
        System.out.println("Quantidade de perfumes cadastrados no MARTINHO PARFUM: " + perfume.size());
    }
         
// criar vetor para voltar a primeira lista neste espaço com for
         
         public void ordenarPerfumes() {
         Collections.sort(perfume);
        System.out.println("Perfumes ordenados com sucesso!!!");
    }
}
