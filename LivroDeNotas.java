public class LivroDeNotas{
    //variavel de instacia
    //instacia == objeto
    String nomeDisciplina; //variavel


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