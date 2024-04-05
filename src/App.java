
        public class App {
            public static void main(String[] args) throws Exception {
                System.out.print("Texto que não quebra linha");
                System.out.println("Texto que quebra linha");
         
                // %s substitui no texto um valor String
                System.out.printf("Vai imprimir %s. %s %s", "Um texto", "Qualquer", "Pessoal\n");
                // System.out.printf("%s\n %s\n", "Marcela", "Silva");
         
                // %d - substitui o coringa %d por um número inteiro no texto
                System.out.printf("Minha idade é: %d\n", 33);
         
                // %f - substitui o coring %f por um número flutuante
                System.out.printf("O valor de PI é: %f\n", 3.1415f);
         
                // %2f - substitui o coringa %.2f por um número flutuante com duas casas
                System.out.printf("O valor de PI é: %.2f\n", 3.1415);
         
                // %b - substitui o coringa %b por um valor booleano
                System.out.printf("Esse valor é %b\n", true);
                System.out.printf("Esse valor é %b\n", false);
         
                // %c - substitui o coringa %c por um caractere
                System.out.printf("O caractere é: %c\n", 'A');
                System.out.printf("O caractere é: %c\n", '5');
                System.out.printf("O caractere é: %c\n", '*');
                System.out.printf("O caractere é: %c\n", '\\');
                System.out.printf("O caractere é: %c\n", '\"');
         
                // printf com todos os tipos usando variáveis
                String texto = "Alguma coisa";
                int numeroInteiro = 1;
                float numeroQuebrado = 123.232f;
                boolean valorVerdadeiro = true;
                char umCaractere = '°';
         
                System.out.printf("%s, %d, %.2f, %b, %c",
                    texto,
                    numeroInteiro,
                    numeroQuebrado,
                    valorVerdadeiro,
                    umCaractere);
            }
        }
         



