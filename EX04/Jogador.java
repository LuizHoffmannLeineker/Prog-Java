public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;



    Jogador(String nome_main, int pontuacao_main, int nivel_main){
        nome = nome_main;
        pontuacao = pontuacao_main;
        nivel = nivel_main;

    }

    boolean Verificar(String nome_verificar){
        if(nome.equals(nome_verificar)){
            return true;
        }
        else{
            return false;
        }

    }

    public void setNivel(int nivel_atual) {
        nivel = nivel_atual;
    }

    public void setPontuacao(int pontuacao_atual) {
        pontuacao = pontuacao_atual;
    }

    public int getNivel(){
        return nivel;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

}
