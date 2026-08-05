public class Sala {
    private String nome;
    private Cadeira cadeira01;
    private Cadeira cadeira02;
    private Cadeira cadeira03;
    private Cadeira cadeira04;
    protected Cadeira[] cadeiras;
    protected int contador;

    public Sala(String nome, Cadeira cadeira01, Cadeira cadeira02, Cadeira cadeira03, Cadeira cadeira04) {
        this.nome = nome;
        this.cadeira01 = cadeira01;
        this.cadeira02 = cadeira02;
        this.cadeira03 = cadeira03;
        this.cadeira04 = cadeira04;
        this.cadeiras = new Cadeira[] { cadeira01, cadeira02, cadeira03 };
    }

    // ------ Métodos de acesso ------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira getCadeira01() {
        return cadeira01;
    }

    public Cadeira getCadeira02() {
        return cadeira02;
    }

    public Cadeira getCadeira03() {
        return cadeira03;
    }

    public Cadeira getCadeira04() {
        return cadeira04;
    }

    // ou
    // public void setCadeira01(Cadeira cadeira01) {
    // this.cadeiras[0] = cadeira01;
    // }
    // ...

    //
    // Seta dinamicamente a cadeira pelo índice (0 a 3) e sincroniza campo + array
    public void setCadeira(int index, Cadeira cadeira) {
        if (index < 0 || index >= cadeiras.length) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }
        cadeiras[index] = cadeira;
        switch (index) {
            case 0 -> this.cadeira01 = cadeira;
            case 1 -> this.cadeira02 = cadeira;
            case 2 -> this.cadeira03 = cadeira;
            case 3 -> this.cadeira04 = cadeira;
        }
    }

    // ------ Métodos exclusivos ------
    public int cadeirasComMesaDisponiveis() {
        contador = 0;

        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null) {
                contador++;
            }
        }
        System.out.println("Número de cadeiras-tipo Mesa disponíveis: " + contador);
        return contador;
    }

    // com 'for' tradicional
    public void cadeirasComMesaDisponiveis2() {
        contador = 0;

        for (int i = 0; i < cadeiras.length; i++) {
            if (cadeiras[i] instanceof CadeiraComMesa && cadeiras[i].getAluno() == null) {
                contador++;
            }
        }
        System.out.println("Número de cadeiras-tipo Mesa disponíveis: " + contador);
    }

    public int cadeirasComRodinhasDisponiveis() {
        contador = 0;

        for (Cadeira cadeira : cadeiras) {
            if (cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null) {
                contador++;
            }
        }
        System.out.println("Número de cadeiras-tipo Rodinha disponíveis: " + contador);
        return contador;
    }

    public Cadeira entraAluno(Aluno aluno, String tipoCadeira) {
        for (Cadeira cadeira : cadeiras) {
            if (tipoCadeira.equals("mesa") && cadeira instanceof CadeiraComMesa && cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            }

            if (tipoCadeira.equals("rodinha") && cadeira instanceof CadeiraComRodinhas && cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            }
        }

        for (Cadeira cadeira : cadeiras) {
            if (cadeira != null && cadeira.getAluno() == null) {
                cadeira.setAluno(aluno);
                return cadeira;
            }
        }
        return null;
    }

    public String procuraAluno(String aluno) {

        for (Cadeira cadeira : cadeiras) {
            String alunoProcurado = cadeira.getAluno().getNome();
            if (cadeira != null && cadeira.getAluno() != null && alunoProcurado.equals(aluno)) {
                System.out.println("Aluno encontrado :" + alunoProcurado);
                return alunoProcurado;
            }
        }

        System.out.println("Nenhum aluno encontrado");
        return null;
    }

    public Cadeira procuraCadeira(String aluno) {
        for (Cadeira cadeira : cadeiras) {
            if (cadeira != null && cadeira.getAluno() != null && cadeira.getAluno().getNome().equals(aluno)) {
                return cadeira;
            }
            ;
        }
        return null;
    }

    // erro no métodoentraAluno2:
    // ----------------------------
    // public Cadeira entraAluno2(Aluno aluno, String tipoCadeira) {
    // Cadeira novaCadeira = null;
    // boolean mesaDisponiveis = (this.cadeirasComMesaDisponiveis() <=
    // cadeiras.length
    // && this.cadeirasComMesaDisponiveis() > 0);
    // boolean rodinhaDisponiveis = (this.cadeirasComRodinhasDisponiveis() <=
    // cadeiras.length
    // && this.cadeirasComRodinhasDisponiveis() > 0);

    // switch (tipoCadeira) {
    // case "mesa":
    // if (mesaDisponiveis && cadeiras != null) {
    // return novaCadeira = new CadeiraComMesa(aluno, null);
    // } else if (this.cadeirasComMesaDisponiveis() == 0 && rodinhaDisponiveis) {
    // return novaCadeira = new CadeiraComRodinhas(aluno, null);
    // } else {
    // return novaCadeira;
    // }
    // case "rodinha":
    // if (rodinhaDisponiveis && cadeiras != null) {
    // return novaCadeira = new CadeiraComRodinhas(aluno, null);
    // } else if (this.cadeirasComRodinhasDisponiveis() == 0 && mesaDisponiveis) {
    // return novaCadeira = new CadeiraComMesa(aluno, null);
    // } else {
    // return novaCadeira;
    // }
    // default:
    // break;
    // }

    // return novaCadeira;
    // }

    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder("Sala: " + nome);
        for (int i = 0; i < cadeiras.length; i++) {
            newString.append("\ncadeira0").append(i + 1).append("= ").append(cadeiras[i]);
        }
        return newString.toString();

        // return "Sala: " + nome + "\ncadeira01= " + cadeira01 + ", \ncadeira02= " +
        // cadeira02 + ", \ncadeira03= " + cadeira03 + ", \ncadeira04= " + cadeira04;
    }

}
