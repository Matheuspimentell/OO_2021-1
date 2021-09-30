package Sistema;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class JanelaCadastro extends JDialog implements ActionListener{
    Sistema SYS;
    JPanel conteudo;
    JTextField campo1Texto;
    JTextField campo2Texto;
    JTextField campo3Texto;
    JTextField campo4Texto;
    JButton confirma;
    JButton cancela;

    JanelaCadastro(String titulo, Sistema sistema){
        SYS = sistema;

        //----------------Bordas de formatação----------------
        JPanel bordaSuperior = new JPanel();
        bordaSuperior.setPreferredSize(new Dimension(50, 50));
        bordaSuperior.setBackground(Color.GRAY);
        bordaSuperior.setOpaque(false);
        JPanel bordaInferior = new JPanel();
        bordaInferior.setPreferredSize(new Dimension(50, 50));
        bordaInferior.setBackground(Color.DARK_GRAY);
        bordaInferior.setOpaque(false);
        JPanel bordaEsquerda = new JPanel();
        bordaEsquerda.setPreferredSize(new Dimension(50, 50));
        bordaEsquerda.setBackground(Color.LIGHT_GRAY);
        bordaEsquerda.setOpaque(false);
        JPanel bordaDireita = new JPanel();
        bordaDireita.setPreferredSize(new Dimension(50, 50));
        bordaDireita.setBackground(Color.BLACK);
        bordaDireita.setOpaque(false);

        //-------------------Painel de conteudo---------------------
        if(titulo.equals("Loja - Completar cadastro")){
            //----------Texto indicativo do 1° campo---------
            JLabel campo1 = new JLabel();
            campo1.setText("Telefone: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(65,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //----------Botões-------------
            confirma = new JButton();
            confirma.setFocusable(false);
            confirma.setPreferredSize(new Dimension(170,35));
            confirma.setText("Cadastrar dados");
            confirma.addActionListener(this);

            cancela = new JButton();
            cancela.setFocusable(false);
            cancela.setPreferredSize(new Dimension(170,35));
            cancela.setText("Cancelar");
            cancela.addActionListener(this);

            
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        if(titulo.equals("Loja - Editar dados")){
            //--------------Texto indicativo do 1° campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 2° campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("Endereço: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("CNPJ: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 4° campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("Telefone: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            if(SYS.getLoja().getTelefone() == null){
                campo4.setVisible(false);
                campo4Texto.setVisible(false);
            }

            //----------Botões-------------
            confirma = new JButton();
            confirma.setFocusable(false);
            confirma.setPreferredSize(new Dimension(170,35));
            confirma.setText("Cadastrar dados");
            confirma.addActionListener(this);

            cancela = new JButton();
            cancela.setFocusable(false);
            cancela.setPreferredSize(new Dimension(170,35));
            cancela.setText("Cancelar");
            cancela.addActionListener(this);

            
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        //------------Configurações da tela------------
        this.setModal(true);
        this.setTitle(titulo);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(500,500));
        this.setResizable(false);
        this.add(bordaSuperior, BorderLayout.NORTH);
        this.add(bordaInferior, BorderLayout.SOUTH);
        this.add(conteudo, BorderLayout.CENTER);
        this.add(bordaEsquerda, BorderLayout.WEST);
        this.add(bordaDireita, BorderLayout.EAST);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancela){
            dispose();
        }
        if(e.getSource() == confirma){

            //----------Janela de Completar cadastro da loja---------------
            if(this.getTitle().equals("Loja - Completar cadastro")){
                //Caso o usuário tenha digitado algo:
                if (!campo1Texto.getText().equals("")){
                    //Completar o cadastro com o dado passado
                    SYS.getLoja().CompletaCadastro(campo1Texto.getText());
                } else {
                    //Caso contrário mostrar um painel com um warning
                    JOptionPane.showMessageDialog(null,
                     "Campo vazio!",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                }
                dispose();
            }

            //--------------Janela de editar dados da loja------------------
            if(this.getTitle().equals("Loja - Editar dados")){
                String nome, endereco, cnpj, telefone;
                nome = campo1Texto.getText();
                endereco = campo2Texto.getText();
                cnpj = campo3Texto.getText();
                telefone = campo4Texto.getText();

                if (campo1Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                     "Campo nome vazio!",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                    nome = null;
                }
                if (campo2Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                     "Campo endereço vazio!",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                    endereco = null;
                }
                if (campo3Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                    "Campo CNPJ vazio!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                    cnpj = null;
                }
                if (campo4Texto.getText().equals("")){
                    if(SYS.getLoja().getTelefone() != null){
                        JOptionPane.showMessageDialog(null,
                        "Campo telefone vazio!",
                        "Atenção",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    telefone = null;
                }
                SYS.getLoja().Editar(nome, endereco, cnpj, telefone);
                dispose();
            }
        }
    }
}
