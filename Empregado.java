public class Empregado{

private String nome;
private int idade;
private int tipo;
private double salario;
private double comissao;
private double bonus;
public double calcular salario (){

    if (tipo == 1){
        return salaraio;
    }
    else if (tipo == 2){
        return salario + salario * comissao;
    }
    else if (tipo == 3){
        return salario + bonus;
    }
    else{
        return 0;
    }
}
    public String getNome (){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getIdade (){
        return this.idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
}