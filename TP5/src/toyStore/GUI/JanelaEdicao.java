package toyStore.GUI;

import toyStore.srcCode.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaEdicao extends JDialog implements ActionListener{
    
    Sistema SYS;
    Object oldCpf;
    int oldId;
    boolean temTelefone, temEndereco;
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

    JanelaEdicao(String titulo, Sistema sistema, Object dado_aProcurar){
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

            //----------------Caso a loja não possua um telefone cadastrado-------------------
            if(SYS.getLoja().getTelefone() == null){
                campo4.setVisible(false);
                campo4Texto.setVisible(false);
            }

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
        
        if(titulo.equals("Clientes - Editar dados")){
            oldCpf = dado_aProcurar;
            temTelefone = false;
            temEndereco = false;

            for(Cliente cliente : SYS.getClientes()){
                if(cliente.getCpf().equals(oldCpf)){
                    if(cliente.getEndereco() != null){
                        temEndereco = true;
                    }
                    if(cliente.getTelefone() != null){
                        temTelefone = true;
                    }
                }
            }

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
            campo3.setText("CPF: ");
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

            //----------------Caso o cliente não possua um endereço cadastrado-------------------
            if(temEndereco == false){
                campo2.setVisible(false);
                campo2Texto.setVisible(false);
            }

            //----------------Caso o cliente não possua um telefone cadastrado-------------------
            if(temTelefone == false){
                campo4.setVisible(false);
                campo4Texto.setVisible(false);
            }

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

        if(titulo.equals("Funcionários - Editar dados")){
            oldId = (int) dado_aProcurar;
            temTelefone = false;
            temEndereco = false;

            for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                if(funcionario.getId() == oldId){
                    if(funcionario.getEndereco() != null){
                        temEndereco = true;
                    }
                    if(funcionario.getTelefone() != null){
                        temTelefone = true;
                    }
                }
            }

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
            campo2.setText("ID: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));

            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("Cargo: ");
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

            //----------------Caso o funcionário não possua um endereço cadastrado-------------------
            if(temEndereco == false){
                campo4.setVisible(false);
                campo4Texto.setVisible(false);
            }

            //----------------Caso o funcionário não possua um telefone cadastrado-------------------
            if(temTelefone == false){
                campo5.setVisible(false);
                campo5Texto.setVisible(false);
            }

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
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
            conteudo.add(confirma);
            conteudo.add(cancela);
        }

        if(titulo.equals("Brinquedo - Editar dados")){
            oldId = (int) dado_aProcurar;

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
            campo2.setText("Marca: ");
            campo2.setFont(new Font("Arial", Font.PLAIN, 12));
            campo2.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo2Texto = new JTextField();
            campo2Texto.setPreferredSize(new Dimension(200,20));
 
            //--------------Texto indicativo do 3° campo-------------
            JLabel campo3 = new JLabel();
            campo3.setText("Categoria: ");
            campo3.setFont(new Font("Arial", Font.PLAIN, 12));
            campo3.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo3Texto = new JTextField();
            campo3Texto.setPreferredSize(new Dimension(200,20));
 
            //--------------Texto indicativo do 4° campo-------------
            JLabel campo4 = new JLabel();
            campo4.setText("Preço unitário: ");
            campo4.setFont(new Font("Arial", Font.PLAIN, 12));
            campo4.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo4Texto = new JTextField();
            campo4Texto.setPreferredSize(new Dimension(200,20));
 
            //--------------Texto indicativo do 5° campo-------------
            JLabel campo5 = new JLabel();
            campo5.setText("Idade indicada: ");
            campo5.setFont(new Font("Arial", Font.PLAIN, 12));
            campo5.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo5Texto = new JTextField();
            campo5Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 6° campo-------------
            JLabel campo6 = new JLabel();
            campo6.setText("quantidade: ");
            campo6.setFont(new Font("Arial", Font.PLAIN, 12));
            campo6.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo6Texto = new JTextField();
            campo6Texto.setPreferredSize(new Dimension(200,20));

            //--------------Texto indicativo do 7° campo-------------
            JLabel campo7 = new JLabel();
            campo7.setText("ID: ");
            campo7.setFont(new Font("Arial", Font.PLAIN, 12));
            campo7.setPreferredSize(new Dimension(95,20));
 
            //--------Campo de texto------
            campo7Texto = new JTextField();
            campo7Texto.setPreferredSize(new Dimension(200,20));

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
            conteudo.add(campo5);
            conteudo.add(campo5Texto);
            conteudo.add(campo6);
            conteudo.add(campo6Texto);
            conteudo.add(campo7);
            conteudo.add(campo7Texto);
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

                //Mensagem de confirmação
                JOptionPane.showMessageDialog(null,
                "Dados da loja editados com sucesso",
                "Informativo!",
                JOptionPane.INFORMATION_MESSAGE);

                //----------Fechar a janela--------
                dispose();
            }
            //--------------Janela de editar dados do cliente---------------
            if(this.getTitle().equals("Clientes - Editar dados")){
                String nome, endereco, cpf, telefone;

                //------------Tratamento dos dados-------------
                if(campo1Texto.getText().equals("")){
                    nome = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo nome vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    nome = campo1Texto.getText();
                }
                if(campo2Texto.getText().equals("") && temEndereco){
                    endereco = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo endereço vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    endereco = campo2Texto.getText();
                }
                if(campo3Texto.getText().equals("")){
                    cpf = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo CPF vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    cpf = campo3Texto.getText();
                }
                if(campo4Texto.getText().equals("") && temTelefone){
                    telefone = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo telefone vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    telefone = campo4Texto.getText();
                }

                //-------Cria um "novo cliente" com os novos dados para sobrescrever os antigos-------
                Cliente novosDados = new Cliente(nome, cpf);
                novosDados.setEndereco(endereco);
                novosDados.setTelefone(telefone);

                //-------Procura e edita o cliente------------
                for(Cliente cliente : SYS.getClientes()){
                    if(cliente.getCpf().equals(oldCpf)){
                        cliente.Editar(novosDados);
                        break;
                    }
                }

                //Mensagem de confirmação
                JOptionPane.showMessageDialog(null,
                "Dados do cliente editados com sucesso",
                "Informativo!",
                JOptionPane.INFORMATION_MESSAGE);
                
                //Fecha a janela
                dispose();
            }
            //--------------Janela de editar dado do funcionário------------
            if(this.getTitle().equals("Funcionários - Editar dados")){
                String nome, endereco, telefone, cargo;
                int id;

                //----------Tratamento dos dados----------
                if(campo1Texto.getText().equals("")){
                    nome = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo nome vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    nome = campo1Texto.getText();
                }
                if(campo2Texto.getText().equals("")){
                    id = -1;
                    JOptionPane.showMessageDialog(null,
                     "Campo ID vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else{
                    id = Integer.parseInt(campo2Texto.getText());
                }
                if(campo3Texto.getText().equals("")){
                    cargo = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo cargo vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    cargo = campo3Texto.getText();
                }
                if(campo4Texto.getText().equals("") && temEndereco){
                    endereco = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo endedreço vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    endereco = campo4Texto.getText();
                }
                if(campo5Texto.getText().equals("") && temTelefone){
                    telefone = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo endedreço vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    telefone = campo5Texto.getText();
                }
                //----------Cria um "novo funcionário" com os dados novos para sobrescrever os dados anteriores
                Funcionario novosDados = new Funcionario(nome, id, cargo);
                novosDados.setEndereco(endereco);
                novosDados.setTelefone(telefone);
                //-----------Procurar e editar o funcionário--------------
                for(Funcionario funcionario : SYS.getLoja().getFuncionarios()){
                    if(funcionario.getId() == oldId){
                        funcionario.Editar(novosDados);
                        break;
                    }
                }
                //Mensagem de confirmação
                JOptionPane.showMessageDialog(null,
                "Dados do funcionário editados com sucesso",
                "Informativo!",
                JOptionPane.INFORMATION_MESSAGE);

                //------------Fechar a janela---------------
                dispose();
            }
            //------Janela de editar dados de um brinquedo no estoque--------
            if(this.getTitle().equals("Brinquedo - Editar dados")){
                String nome, marca, categoria;
                Double precoUn;
                int idade, quantidade, id;

                //---------Tratamento dos dados--------
                if(campo1Texto.getText().equals("")){
                    nome = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo nome vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    nome = campo1Texto.getText();
                }
                if(campo2Texto.getText().equals("")){
                    marca = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo marca vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    marca = campo2Texto.getText();
                }
                if(campo3Texto.getText().equals("")){
                    categoria = null;
                    JOptionPane.showMessageDialog(null,
                     "Campo categoria vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    categoria = campo3Texto.getText();
                }
                if(campo4Texto.getText().equals("")){
                    precoUn = -1.0;
                    JOptionPane.showMessageDialog(null,
                     "Campo preço unitário vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    precoUn = Double.parseDouble(campo4Texto.getText());
                }
                if(campo5Texto.getText().equals("")){
                    idade = -1;
                    JOptionPane.showMessageDialog(null,
                     "Campo idade indicada vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    idade = Integer.parseInt(campo5Texto.getText());
                }
                if(campo6Texto.getText().equals("")){
                    quantidade = -1;
                    JOptionPane.showMessageDialog(null,
                     "Campo quantidade vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    quantidade = Integer.parseInt(campo6Texto.getText());
                }
                if(campo7Texto.getText().equals("")){
                    id = -1;
                    JOptionPane.showMessageDialog(null,
                     "Campo ID vazio! Alterações descartadas.",
                      "Atenção!",
                       JOptionPane.WARNING_MESSAGE);
                } else {
                    id = Integer.parseInt(campo7Texto.getText());
                }

                //Cria um "novo brinquedo" para sobrescrever os dados anteriores
                Brinquedo novosDados = new Brinquedo(nome,
                 marca,
                  categoria,
                   precoUn, idade, quantidade, id);

                //Procura e sobrescreve os dados
                for(Brinquedo brinquedo : SYS.getLoja().getEstoque()){
                    if(brinquedo.getId() == oldId){
                        brinquedo.Editar(novosDados);
                        break; 
                    }
                }
                //Mensagem de confirmação
                JOptionPane.showMessageDialog(null,
                "Dados do brinquedo editados com sucesso",
                "Informativo!",
                JOptionPane.INFORMATION_MESSAGE);

                //Fecha a janela
                dispose();
            }
        }
    }
}
