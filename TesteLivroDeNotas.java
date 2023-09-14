public class TesteLivroDeNotas{
    static public void main(String args []){

        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da disciplina: ");
        //atribuição 
        //declara varaivel (variavel de referencia)
        //contrução de um objeto 
        //inferencia de tipo
        var livroDeNotas = new LivroDeNotas(nomeDisciplina); //declaraçao de uma variavel   var a = 2 (tipo int)
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        //enviando 
        livroDeNotas.exibirMensagem(); 
        System.out.println("Ate logo"); 
        //. --> operador de acesso a membro 
        //new cria um objeto (heap)
    }
}

//autoco