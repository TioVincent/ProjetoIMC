package projetoimc;

/**
 *
 * @author aluno
 */
public class ProjetoIMC {

    public static final int ABAIXO_DO_PESO = 0;
    public static final int PESO_IDEAL = 1;
    public static final int ACIMA_DO_PESO = 2;

    private String sexo;
    private double estatura;
    private double peso;

    public ProjetoIMC(String sexo, double estatura, double peso) {
        this.sexo = sexo;
        this.estatura = estatura;
        this.peso = peso;
    }

    public int calcular() {
        double imcGeral = calcularImcGeral();

        if (sexo.equals("M")) {
            return calcularImcHomem(imcGeral);
        } else {
            return calcularImcMulher(imcGeral);
        }
    }

    private double calcularImcGeral() {
        return peso / Math.pow(estatura, 2);
    }

    private int calcularImcHomem(double imcGeral) {
        int imc = PESO_IDEAL;

        if (imcGeral < 20.7) {
            imc = ABAIXO_DO_PESO;
        } else if (imcGeral > 26.4) {
            imc = ACIMA_DO_PESO;
        }
        return imc;
    }

    private int calcularImcMulher(double imcGeral) {
        int imc = PESO_IDEAL;

        if (imcGeral < 19.1) {
            imc = ABAIXO_DO_PESO;
        } else if (imcGeral > 25.8) {
            imc = ACIMA_DO_PESO;
        }
        return imc;
    }
}
