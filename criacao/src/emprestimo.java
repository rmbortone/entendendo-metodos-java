public class emprestimo{

    double parcelas;

    public static double montante(double montante){
        return montante;
    }
    
    public static double parcelar(double parcelas) {
        return parcelas;
    }
    
    public static double taxar (double montante, double juros, double parcelas) {
        return   ((montante * juros * parcelas) + montante)/parcelas;
    }
    public static double calcularTotal (double montante, double juros, double parcelas){
        return ( montante * juros * parcelas) + montante;
    }
}