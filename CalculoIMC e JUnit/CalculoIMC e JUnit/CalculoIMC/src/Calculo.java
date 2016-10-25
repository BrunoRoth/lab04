
public class Calculo {

    public void calcularIMC(double peso, double altura, String nome, char sexo) {

        double imc = peso / (altura * altura);

        if (sexo == 'm' || sexo == 'M') {

            if (imc <= 18.9) {
                mensagemRiscoBaixo();
            } else if (19 <= imc && imc < 24.9) {
                mensagemIdeal();
            } else if (25.0 <= imc && imc < 27.7) {
                mensagemRiscoModerado();
            } else if (imc >= 27.8) {
                mensagemRiscoElevado();
            }
        } else if (sexo == 'f' || sexo == 'F') {

            if (imc <= 17.9) {
                mensagemRiscoBaixo();
            } else if (18 <= imc && imc < 24.4) {
                mensagemIdeal();
            } else if (24.5 <= imc && imc < 27.2) {
                mensagemRiscoModerado();
            } else if (imc >= 27.3) {
                mensagemRiscoElevado();

            } else {
                System.out.println("Caractere inválido! Insira apenas 'm' ou 'f'");
            }

        }
    }

    public void mensagemRiscoBaixo() {
        System.out.println("Você está abaixo do peso recomendado");
    }

    public void mensagemIdeal() {
        System.out.println("Você está muito bem! Continue assim!");
    }

    public void mensagemRiscoModerado() {
        System.out.println("Você está acima do peso recomendado. Cuidado!");
    }

    public void mensagemRiscoElevado() {
        System.out.println("Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
    }
}
