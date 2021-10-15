



public class Funcionario {

    private String matricula;
    private String nome;
    private double salario;
    private String dataAdmissao;
    private String cpf;
    private double ir;
    private double inss;
    
    
    public Funcionario(double ir, double inss) {
        this.ir = ir;
        this.inss = inss;
    }

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome      = nome;
        this.salario   = salario;
    }

    public Funcionario() {
        this.matricula = "";
        this.nome = "";
        this.salario = 0.00;
        this.dataAdmissao = "";
        this.cpf = "";
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }
    
         
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
        //metodos
    public void receberAumento(double perc){
        double valorReajuste;
        valorReajuste = this.salario * perc / 100;
        this.salario = this.salario + valorReajuste;
    }
    
    
    public double calcularGanhoBrutoAnual(){
        double brutoAnual;
        brutoAnual = this.salario * 13;
        return brutoAnual;
        //ou return this.salario *13
    }
    
   
    
    public double calcularGanhoLiquidoMensal(){
        double valorInss, valorIr, baseIr, salarioLiquido;
       
        valorInss = this.salario * 11 / 100;
        
        if (this.salario >2500){
            baseIr = this.salario - 2500;
            valorIr = baseIr * 17.5 / 100;
        }

        else{
            valorIr = 0.00;
        }
         valorInss = this.salario * 11 / 100;
         salarioLiquido = this.salario - valorIr - valorInss;
         this.ir = valorIr;
         this.inss = valorInss;
         
         return salarioLiquido;
    
    }
    
    
    
     public double calcularImposto(){
          double valorInss, valorIr;
        return (this.ir + this.inss) * 13;
    }
    
    
  public double calcularGanhoLiquidoAnual(){
      double liquidoAnual;
      
      liquidoAnual = calcularGanhoBrutoAnual() - calcularImposto();
      
      return liquidoAnual;
  }
  
}
