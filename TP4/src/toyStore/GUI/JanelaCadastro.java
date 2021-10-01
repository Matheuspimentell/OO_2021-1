package toyStore.GUI;

import toyStore.srcCode.*;

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
    JTextField campo5Texto;
    JTextField campo6Texto;
    JTextField campo7Texto;
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
            
            //----------------Instrução------------------
            JOptionPane.showMessageDialog(null,
            "Para não alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

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
            //----------------Instrução------------------
            JOptionPane.showMessageDialog(null,
            "Para não alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

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

            //----------------Caso a loja já possua um telefone cadastrado-------------------
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

            //-----------------Adição do conteúdo---------------
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

        if(titulo.equals("Cliente - Novo Cadastro")){
            //----------------Instrução------------------
            JOptionPane.showMessageDialog(null,
            "Para não alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) - Dados obrigatórios");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(400, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do 1° campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 2° campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) CPF: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("Endereço: ");
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

            //-----------------Adição do conteúdo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
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

        if(titulo.equals("Brinquedo - Novo Cadastro")){
            //----------------Instrução------------------
            JOptionPane.showMessageDialog(null,
            "Para não alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) TODOS os dados são obrigatórios!");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(400, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do 1° campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 2° campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) Marca: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("(*) Categoria: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 4° campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("(*) Preço unitário: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 5° campo-------------
            JLabel campo5 = new JLabel();
            campo5.setText("(*) Idade Inidicada: ");
            campo5.setFont(new Font("Arial", Font.PLAIN, 12));
            campo5.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo5Texto = new JTextField();
            campo5Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 6° campo-------------
            JLabel campo6 = new JLabel();
            campo6.setText("(*) Quantidade: ");
            campo6.setFont(new Font("Arial", Font.PLAIN, 12));
            campo6.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo6Texto = new JTextField();
            campo6Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 7° campo-------------
            JLabel campo7 = new JLabel();
            campo7.setText("(*) ID: ");
            campo7.setFont(new Font("Arial", Font.PLAIN, 12));
            campo7.setPreferredSize(new Dimension(130,20));

            //--------Campo de texto------
            campo7Texto = new JTextField();
            campo7Texto.setPreferredSize(new Dimension(200,20));

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

            //-----------------Adição do conteúdo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
            conteudo.add(campo6);
            conteudo.add(campo6Texto);
            conteudo.add(campo7);
            conteudo.add(campo7Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        if(titulo.equals("Funcionário - Novo Cadastro")){
            //----------------Instrução------------------
            JOptionPane.showMessageDialog(null,
            "Para não alterar os dados, deixar em branco"
            ,"Informativo"
            ,JOptionPane.INFORMATION_MESSAGE);

            JLabel informacao = new JLabel();
            informacao.setText("(*) - Dados obrigatórios");
            informacao.setFont(new Font("Arial", Font.BOLD, 14));
            informacao.setPreferredSize(new Dimension(400, 20));
            informacao.setVisible(true);

            //--------------Texto indicativo do 1° campo-------------
            JLabel campo1 = new JLabel();
            campo1.setText("(*) Nome: ");
            campo1.setFont(new Font("Arial", Font.PLAIN, 12));
            campo1.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo1Texto = new JTextField();
            campo1Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 2° campo-------------
            JLabel campo2 = new JLabel();
            campo2.setText("(*) ID: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("(*) Cargo: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 4° campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("Endereco: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 5° campo-------------
            JLabel campo5 = new JLabel();
            campo5.setText("Telefone: ");
            campo5.setFont(new Font("Arial", Font.PLAIN, 12));
            campo5.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo5Texto = new JTextField();
            campo5Texto.setPreferredSize(new Dimension(200,20));

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

            //-----------------Adição do conteúdo---------------
            conteudo = new JPanel();
            conteudo.setLayout(new FlowLayout());
            conteudo.setVisible(true);
            conteudo.add(informacao);
            conteudo.add(campo1);
            conteudo.add(campo1Texto);
            conteudo.add(campo2);
            conteudo.add(campo2Texto);
            conteudo.add(campo3);
            conteudo.add(campo3Texto);
            conteudo.add(campo4);
            conteudo.add(campo4Texto);
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
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
        //-----------Caso seja selecionada a opção de cancelar-----------
        if(e.getSource() == cancela){
            dispose();
        }
        //--------Caso seja selecionada a opção de confirmar--------------
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
                     "Campo vazio! alterações descartadas",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                }
                //----------Fechar a janela---------
                dispose();
            }

            //--------------Janela de editar dados da loja------------------
            if(this.getTitle().equals("Loja - Editar dados")){
                String nome, endereco, cnpj, telefone;
                //---------Receber os dados digitados----------
                nome = campo1Texto.getText();
                endereco = campo2Texto.getText();
                cnpj = campo3Texto.getText();
                telefone = campo4Texto.getText();
                //----------------Verificação dos dados-----------------
                if (campo1Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                     "Campo nome vazio! Alterações descartadas",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                    nome = null;
                }
                if (campo2Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                     "Campo endereço vazio! Alterações descartadas",
                      "Atenção",
                       JOptionPane.WARNING_MESSAGE);
                    endereco = null;
                }
                if (campo3Texto.getText().equals("")){
                    JOptionPane.showMessageDialog(null,
                    "Campo CNPJ vazio! Alterações descartadas",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                    cnpj = null;
                }
                if (campo4Texto.getText().equals("")){
                    if(SYS.getLoja().getTelefone() != null){
                        JOptionPane.showMessageDialog(null,
                        "Campo telefone vazio! Alterações descartadas",
                        "Atenção",
                        JOptionPane.WARNING_MESSAGE);
                    }
                    telefone = null;
                }
                
                //--------------Chamada para a função de edição-------------
                SYS.getLoja().Editar(nome, endereco, cnpj, telefone);

                //----------Fechar a janela--------
                dispose();
            }

            if(this.getTitle().equals("Cliente - Novo Cadastro")){
                String nome, cpf, endereco, telefone;

                nome = campo1Texto.getText();
                cpf = campo2Texto.getText();
                endereco = campo3Texto.getText();
                telefone = campo4Texto.getText();

                //--------------Verificação dos dados recebidos-------------------
                if(campo1Texto.getText().equals("") || campo2Texto.getText().equals("")){
                    //--------Caso nome ou cpf não tenham sido preenchidos------
                    JOptionPane.showMessageDialog(null,
                     "Atenção, um ou mais campos obrigatórios não preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    if(campo3Texto.getText().equals("")){
                        endereco = null;
                    }
                    if(campo4Texto.getText().equals("")){
                        telefone = null;
                    }
                    Cliente cliente = new Cliente(nome, cpf);
                    SYS.setCliente(cliente, endereco, telefone);
                    JOptionPane.showMessageDialog(null,
                     "Cliente cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }

            if(this.getTitle().equals("Funcionário - Novo Cadastro")){
                String nome, cargo, endereco, telefone;
                int id;

                nome = campo1Texto.getText();
                if(campo2Texto.getText().equals("")){
                    id = -1;
                } else {
                    id = Integer.parseInt(campo2Texto.getText());
                }
                cargo = campo3Texto.getText();
                endereco = campo4Texto.getText();
                telefone = campo5Texto.getText();

                //--------------Verificação dos dados recebidos-------------------
                if(campo1Texto.getText().equals("") || campo2Texto.getText().equals("") || campo3Texto.getText().equals("")){
                    
                    //--------Caso nome ou id ou cargo não tenham sido preenchidos------
                    JOptionPane.showMessageDialog(null,
                     "Atenção, um ou mais campos obrigatórios não preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);

                } else {

                    if(campo4Texto.getText().equals("")){
                        endereco = null;
                    }

                    if(campo5Texto.getText().equals("")){
                        telefone = null;
                    }

                    Funcionario funcionario = new Funcionario(nome, id, cargo);
                    SYS.getLoja().setFuncionario(funcionario, endereco, telefone);
                    JOptionPane.showMessageDialog(null,
                     "Funcionário cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);

                    dispose();
                }
            }

            if(this.getTitle().equals("Brinquedo - Novo Cadastro")){
                String nome, marca, categoria;
                double precoUnitario;
                int idadeIndicada, quantidade, id;

                //-------Controle de área de texto não preenchida-------
                Boolean vazio1,vazio2,vazio3,vazio4,vazio5,vazio6,vazio7;
                vazio1 = true;
                vazio2 = true;
                vazio3 = true;
                vazio4 = true;
                vazio5 = true;
                vazio6 = true;
                vazio7 = true;

                //-------------Checagem de campos de texto-----------
                if(campo1Texto.getText().equals("")){
                    nome = "invalido";
                } else {
                    nome = campo1Texto.getText();
                    vazio1 = false;
                }
                if(campo2Texto.getText().equals("")){
                    marca = "invalido";
                } else {
                    marca = campo2Texto.getText();
                    vazio2 = false;
                }
                if(campo3Texto.getText().equals("")){
                    categoria = "invalido";
                } else {
                    categoria = campo3Texto.getText();
                    vazio3 = false;
                }
                if(campo4Texto.getText().equals("")){
                    precoUnitario = -1.0;
                } else {
                    precoUnitario = Double.parseDouble(campo4Texto.getText());
                    vazio4 = false;
                }
                if(campo5Texto.getText().equals("")){
                    idadeIndicada = -1;
                } else {
                    idadeIndicada = Integer.parseInt(campo5Texto.getText());
                    vazio5 = false;
                }
                if(campo6Texto.getText().equals("")){
                    quantidade = -1;
                } else {
                    quantidade = Integer.parseInt(campo6Texto.getText());
                    vazio6 = false;
                }
                if(campo7Texto.getText().equals("")){
                    id = -1;
                } else {
                    id = Integer.parseInt(campo7Texto.getText());
                    vazio7 = false;
                }

                //----------------Caso ao menos um campo de texto esteja vazio------------
                if(vazio1 || vazio2 || vazio3 || vazio4 || vazio5 || vazio6 || vazio7){

                    //--------Caso ao menos 1 opção não tenha sido preenchida------
                    JOptionPane.showMessageDialog(null,
                     "Atenção, um ou mais campos obrigatórios não preenchidos",
                      "ERRO", JOptionPane.ERROR_MESSAGE);

                } else {

                    //-------------Definição do brinquedo a ser adicionado-----------
                    Brinquedo brinquedo = new Brinquedo(nome,
                     marca,
                      categoria,
                       precoUnitario,
                        idadeIndicada,
                         quantidade, id);

                    //---------Adicionar o brinquedo ao estoque
                    SYS.getLoja().setBrinquedo(brinquedo);

                    //--------Mensagem de cadastro concluído----------
                    JOptionPane.showMessageDialog(null,
                     "Brinquedo cadastrado com sucesso",
                      "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    
                    dispose();
                }
            }
        }
    }
}
