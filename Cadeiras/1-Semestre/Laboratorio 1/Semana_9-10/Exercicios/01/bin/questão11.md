- Insira as seguintes linhas NAS PRIMEIRAS LINHAS da classe Principal:  
  import javax.swing.\*;  
  import java.awt.Color;

- Peça para o Usuário digitar o nome de um aluno para procurar na sala. Em seguida, utilize
  o código abaixo (no final do seu método main) para abrir uma janela contendo a cor da
  cadeira que este aluno está sentado (caso o aluno seja encontrado em alguma das
  cadeiras da sala):  
  JFrame a = new JFrame();  
  a.setSize(200, 200);  
  a.setBackground(new Color(R, G, B));  
  a.setVisible(true);

- Atente para o fato de que no trecho de código “a.setBackground(new Color(R,
  G, B));”, as letras R, G e B devem ser substituídas pelo conteúdo respectivo da cor da
  cadeira que o aluno está sentado. Se tudo der certo, uma janela com a cor da cadeira vai
  ser aberta.
