public class LivroDeNotas{
    //variavel de instacia
    //instacia == objeto
    private String nomeDisciplina; //variavel
    //private = modificador de acesso 
        //encapsulamento

    //metodo getters/setters 
    //principio do menor privilégio
    public String getNomeDisciplina(){
        return nomeDisciplina; 
    }
    //setter
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }


    public void exibirMensagem(){ //metodo
        System.out.printf("Bem Vindo ao livro de %s\n", nomeDisciplina); 
        //printl("Bem Vindo ao livro de %s", nomeDisciplina); 

    }
    //construtor padrão (aquele cuja a lista de paramentros é vazia)
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina; 
        //this.nomeDisciplina = nomeDisciplina
    }
}