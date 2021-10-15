
public class Principal {

 
    public static void main(String[] args) {
        Funcionario f1, f2;
        
        f1 = new Funcionario("123", "Maria", 1000);
        f1.receberAumento(0);
        System.out.println("Ganho bruto anual: " + f1.calcularGanhoBrutoAnual());
        System.out.println("Ganho liquido anual: " + f1.calcularGanhoLiquidoAnual());
        System.out.println("Imposto anual: " + f1.calcularImposto());
        System.out.println("Ganho liquido mensal: " + f1.calcularGanhoLiquidoMensal());
        
        
//ou
        //Funcionario f = new Funcionario();
                
        f2 = new Funcionario();
        
        f2.setMatricula("1234");
        f2.setNome("Carlos");
        f2.setSalario(3000);
        f1.receberAumento(0);
        System.out.println("Ganho bruto anual: " + f2.calcularGanhoBrutoAnual());
        System.out.println("Ganho liquido anual: " + f2.calcularGanhoLiquidoAnual());
        System.out.println("Imposto anual: " + f2.calcularImposto());
        System.out.println("Ganho liquido mensal: " + f2.calcularGanhoLiquidoMensal());
    }
    
}
