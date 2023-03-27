import java.util.Scanner;

public class atvAlistamento {
    public static void main(String[] args){
        try (Scanner dadosTeclado = new Scanner(System.in)) {
            String genero;
            System.out.println("Seu Gênero:");
            System.out.println("(0) - Masculino");
            System.out.println("(1) - Feminino");
            int valorRegistrado = dadosTeclado.nextInt();
            if(valorRegistrado == 0){
                genero = "Masculino";
            }else if(valorRegistrado == 1){
                genero = "Feminino";
            }else{
                throw new Error("Valor Não Encontrado!");
            }
            System.out.println("Sua Idade:");
            int idade = dadosTeclado.nextInt();
            switch (genero) {
                case "Masculino":
                    if(idade >= 18){
                        System.out.println("Alistamento Obrigatório!");
                        break;
                    }else{
                        System.out.println("Alistamento não Permitido!");
                        break;
                    }

                case "Feminino":
                    if(idade >= 18){
                        System.out.println("Alistamento Disponível!");
                        System.out.println("Deseja se alistar?");
                        System.out.println("(0) - Não");
                        System.out.println("(1) - Sim");
                        int respostaFemininoMaiorIdade = dadosTeclado.nextInt();
                        switch(respostaFemininoMaiorIdade){
                            case 1:
                                System.out.println("Seu Nome:");
                                String nomeFeminino = dadosTeclado.next();
                                System.out.println("Tudo certo "+nomeFeminino+", seu cadastro foi registado!");
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Valor não Encontrado!");
                        }
                    }else{
                        System.out.println("Alistamento não Permitido!");
                    }
            
                default:
                    break;
      
            } 
        }catch(Exception erro){
            System.out.println("Erro: "+ erro);
        }finally{
            System.out.println("Sistema Finalizado!");
        }
    }
}
