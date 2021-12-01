package br.com.etecia.coraline;

public class Personagens {
    private int img;
    private String nome;
    private String idade;

    public Personagens(int img, String nome, String idade){
        this.img = img;
        this.nome = nome;
        this.idade = idade;
    }
    public int getImg(){
        return img;
    }
    public void setImg(int img){
        this.img = img;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getIdade(){
        return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
}
