/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;
import java.text.DecimalFormat;
import java.util.HashSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafael Assis
 */
public class Frm_Calc_Espec extends javax.swing.JFrame {
    DecimalFormat decimal = new DecimalFormat("#0.00");

    /**
     * Creates new form Frm_Calc_Espec
     */
    public Frm_Calc_Espec() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MDC_Painel = new javax.swing.JPanel();
        MDC1_Label = new javax.swing.JLabel();
        MDC2_Label = new javax.swing.JLabel();
        MDC_Res = new javax.swing.JLabel();
        MDC_Num1 = new javax.swing.JTextField();
        MDC_Num2 = new javax.swing.JTextField();
        Clear_MDC = new javax.swing.JButton();
        Calc_MDC = new javax.swing.JButton();
        Prim_Painel = new javax.swing.JPanel();
        Num_Prin_Label = new javax.swing.JLabel();
        Num_Prim = new javax.swing.JTextField();
        Calc_Prim = new javax.swing.JButton();
        Clear_Prim = new javax.swing.JButton();
        Prim_Res = new javax.swing.JLabel();
        MMC_Painel = new javax.swing.JPanel();
        MMC_N1_Label = new javax.swing.JLabel();
        MMC_N2_Label = new javax.swing.JLabel();
        MMC_N1 = new javax.swing.JTextField();
        MMC_N2 = new javax.swing.JTextField();
        Calc_MMC = new javax.swing.JButton();
        Clear_MMC = new javax.swing.JButton();
        MMC_Res = new javax.swing.JLabel();
        Par_Impar_Painel = new javax.swing.JPanel();
        Impar_Par_Label = new javax.swing.JLabel();
        Im_Par_Num = new javax.swing.JTextField();
        Im_Par_Calc = new javax.swing.JButton();
        Clear_Im_Par = new javax.swing.JButton();
        Im_Par_Res = new javax.swing.JLabel();
        Bhas_Painel = new javax.swing.JPanel();
        N1_Bhas_Label = new javax.swing.JLabel();
        N1_Bhas = new javax.swing.JTextField();
        N2_Bhas_Label = new javax.swing.JLabel();
        N2_Bhas = new javax.swing.JTextField();
        N3_Bhas_Label = new javax.swing.JLabel();
        N3_Bhas = new javax.swing.JTextField();
        Calc_Bhas = new javax.swing.JButton();
        Clear_Bhas = new javax.swing.JButton();
        Res_Label = new javax.swing.JLabel();
        Delt_Label = new javax.swing.JLabel();
        X1_Label = new javax.swing.JLabel();
        X2_Label = new javax.swing.JLabel();
        Delt_Res = new javax.swing.JLabel();
        X1_Res = new javax.swing.JLabel();
        X2_Res = new javax.swing.JLabel();
        Clear_All = new javax.swing.JButton();
        Button_Quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MDC_Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("MDC (Maior Divisor Comum):"));

        MDC1_Label.setText("Número 1:");

        MDC2_Label.setText("Número 2:");

        MDC_Res.setText("Exibir Resultado do MDC");

        MDC_Num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        MDC_Num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        Clear_MDC.setText("Limpar");
        Clear_MDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_MDCActionPerformed(evt);
            }
        });

        Calc_MDC.setText("Verificar");
        Calc_MDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_MDCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MDC_PainelLayout = new javax.swing.GroupLayout(MDC_Painel);
        MDC_Painel.setLayout(MDC_PainelLayout);
        MDC_PainelLayout.setHorizontalGroup(
            MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MDC_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MDC_PainelLayout.createSequentialGroup()
                        .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MDC_PainelLayout.createSequentialGroup()
                                .addComponent(MDC1_Label)
                                .addGap(18, 18, 18)
                                .addComponent(MDC_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MDC_PainelLayout.createSequentialGroup()
                                .addComponent(MDC2_Label)
                                .addGap(18, 18, 18)
                                .addComponent(MDC_Num2)))
                        .addGap(60, 60, 60)
                        .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clear_MDC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calc_MDC)))
                    .addGroup(MDC_PainelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(MDC_Res)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MDC_PainelLayout.setVerticalGroup(
            MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MDC_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MDC1_Label)
                        .addComponent(MDC_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Calc_MDC))
                .addGap(18, 18, 18)
                .addGroup(MDC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MDC2_Label)
                    .addComponent(MDC_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_MDC))
                .addGap(18, 18, 18)
                .addComponent(MDC_Res)
                .addContainerGap())
        );

        Prim_Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Primo:"));

        Num_Prin_Label.setText("Número:");

        Num_Prim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        Calc_Prim.setText("Verificar");
        Calc_Prim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_PrimActionPerformed(evt);
            }
        });

        Clear_Prim.setText("Limpar");
        Clear_Prim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_PrimActionPerformed(evt);
            }
        });

        Prim_Res.setText("Verificação número primo");

        javax.swing.GroupLayout Prim_PainelLayout = new javax.swing.GroupLayout(Prim_Painel);
        Prim_Painel.setLayout(Prim_PainelLayout);
        Prim_PainelLayout.setHorizontalGroup(
            Prim_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prim_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_Prin_Label)
                .addGap(18, 18, 18)
                .addComponent(Num_Prim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(Prim_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear_Prim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Calc_Prim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(Prim_PainelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Prim_Res)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Prim_PainelLayout.setVerticalGroup(
            Prim_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prim_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Prim_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num_Prin_Label)
                    .addComponent(Num_Prim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc_Prim))
                .addGap(18, 18, 18)
                .addComponent(Clear_Prim)
                .addGap(18, 18, 18)
                .addComponent(Prim_Res)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MMC_Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("MMC (Menor Múltiplo Comum):"));

        MMC_N1_Label.setText("Número 1:");

        MMC_N2_Label.setText("Número 2;");

        MMC_N1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        MMC_N2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        Calc_MMC.setText("Verificar");
        Calc_MMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_MMCActionPerformed(evt);
            }
        });

        Clear_MMC.setText("Limpar");
        Clear_MMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_MMCActionPerformed(evt);
            }
        });

        MMC_Res.setText("Exibir Resultado MMC");

        javax.swing.GroupLayout MMC_PainelLayout = new javax.swing.GroupLayout(MMC_Painel);
        MMC_Painel.setLayout(MMC_PainelLayout);
        MMC_PainelLayout.setHorizontalGroup(
            MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MMC_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MMC_PainelLayout.createSequentialGroup()
                        .addGroup(MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MMC_PainelLayout.createSequentialGroup()
                                .addComponent(MMC_N2_Label)
                                .addGap(18, 18, 18)
                                .addComponent(MMC_N2))
                            .addGroup(MMC_PainelLayout.createSequentialGroup()
                                .addComponent(MMC_N1_Label)
                                .addGap(18, 18, 18)
                                .addComponent(MMC_N1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calc_MMC)
                            .addComponent(Clear_MMC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(MMC_PainelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(MMC_Res)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        MMC_PainelLayout.setVerticalGroup(
            MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MMC_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMC_N1_Label)
                    .addComponent(MMC_N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc_MMC))
                .addGap(18, 18, 18)
                .addGroup(MMC_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMC_N2_Label)
                    .addComponent(MMC_N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_MMC))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(MMC_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        Par_Impar_Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Par / Ímpar:"));

        Impar_Par_Label.setText("Número:");

        Im_Par_Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        Im_Par_Calc.setText("Verificar");
        Im_Par_Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Im_Par_CalcActionPerformed(evt);
            }
        });

        Clear_Im_Par.setText("Limpar");
        Clear_Im_Par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Im_ParActionPerformed(evt);
            }
        });

        Im_Par_Res.setText("Verificação par ou ímpar");

        javax.swing.GroupLayout Par_Impar_PainelLayout = new javax.swing.GroupLayout(Par_Impar_Painel);
        Par_Impar_Painel.setLayout(Par_Impar_PainelLayout);
        Par_Impar_PainelLayout.setHorizontalGroup(
            Par_Impar_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Par_Impar_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Impar_Par_Label)
                .addGap(18, 18, 18)
                .addComponent(Im_Par_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(Par_Impar_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear_Im_Par, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Im_Par_Calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(Par_Impar_PainelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Im_Par_Res)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Par_Impar_PainelLayout.setVerticalGroup(
            Par_Impar_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Par_Impar_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Par_Impar_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Impar_Par_Label)
                    .addComponent(Im_Par_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Im_Par_Calc))
                .addGap(18, 18, 18)
                .addComponent(Clear_Im_Par)
                .addGap(18, 18, 18)
                .addComponent(Im_Par_Res)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Bhas_Painel.setBorder(javax.swing.BorderFactory.createTitledBorder("Bhaskara:"));
        Bhas_Painel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        N1_Bhas_Label.setText("Número 1:");

        N1_Bhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        N2_Bhas_Label.setText("Número 2:");

        N2_Bhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        N3_Bhas_Label.setText("Número 3:");

        N3_Bhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Caracteres(evt);
            }
        });

        Calc_Bhas.setText("Verificar");
        Calc_Bhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_BhasActionPerformed(evt);
            }
        });

        Clear_Bhas.setText("Limpar");
        Clear_Bhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_BhasActionPerformed(evt);
            }
        });

        Res_Label.setText("Resultados:");

        Delt_Label.setText("Delta:");

        X1_Label.setText("X1:");

        X2_Label.setText("X2:");

        Delt_Res.setText("0");

        X1_Res.setText("0");

        X2_Res.setText("0");

        javax.swing.GroupLayout Bhas_PainelLayout = new javax.swing.GroupLayout(Bhas_Painel);
        Bhas_Painel.setLayout(Bhas_PainelLayout);
        Bhas_PainelLayout.setHorizontalGroup(
            Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bhas_PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bhas_PainelLayout.createSequentialGroup()
                        .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Bhas_PainelLayout.createSequentialGroup()
                                .addComponent(N1_Bhas_Label)
                                .addGap(18, 18, 18)
                                .addComponent(N1_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Bhas_PainelLayout.createSequentialGroup()
                                .addComponent(N2_Bhas_Label)
                                .addGap(18, 18, 18)
                                .addComponent(N2_Bhas))
                            .addGroup(Bhas_PainelLayout.createSequentialGroup()
                                .addComponent(N3_Bhas_Label)
                                .addGap(18, 18, 18)
                                .addComponent(N3_Bhas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Calc_Bhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear_Bhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(Bhas_PainelLayout.createSequentialGroup()
                        .addComponent(Res_Label)
                        .addGap(18, 18, 18)
                        .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(X2_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(X1_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delt_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Delt_Res, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(X1_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(X2_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Bhas_PainelLayout.setVerticalGroup(
            Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bhas_PainelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N1_Bhas_Label)
                    .addComponent(N1_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc_Bhas))
                .addGap(18, 18, 18)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N2_Bhas_Label)
                    .addComponent(N2_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_Bhas))
                .addGap(18, 18, 18)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N3_Bhas_Label)
                    .addComponent(N3_Bhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res_Label)
                    .addComponent(Delt_Label)
                    .addComponent(Delt_Res))
                .addGap(18, 18, 18)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X1_Label)
                    .addComponent(X1_Res))
                .addGap(18, 18, 18)
                .addGroup(Bhas_PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X2_Label)
                    .addComponent(X2_Res))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Clear_All.setText("Limpar Todos");
        Clear_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_AllActionPerformed(evt);
            }
        });

        Button_Quit.setText("Fechar Formulário");
        Button_Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_QuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Prim_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MDC_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MMC_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Par_Impar_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bhas_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Clear_All, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button_Quit, Clear_All});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bhas_Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear_All)
                            .addComponent(Button_Quit))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MMC_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MDC_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Prim_Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Par_Impar_Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button_Quit, Clear_All});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_QuitActionPerformed
       dispose();
    }//GEN-LAST:event_Button_QuitActionPerformed

    private void Calc_MDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_MDCActionPerformed
        int a = Integer.parseInt(MDC_Num1.getText());
        int b = Integer.parseInt(MDC_Num2.getText());
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        MDC_Res.setText(Integer.toString(a));
    }//GEN-LAST:event_Calc_MDCActionPerformed

    private void Calc_PrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_PrimActionPerformed
        double num = Double.parseDouble(Num_Prim.getText());
        int valor = 0;
        if(num == 0 || num == 1){
            Prim_Res.setText("O número é inválido");
        }
        else{
            for(int i = 1; i<=num; i++){
                if(num % i == 0){
                    valor++;
                }
                if(valor == 2){
                    Prim_Res.setText("O número informado é primo");
                }
                else{
                    Prim_Res.setText("O número informado não é primo");
                }
            }
        }
    }//GEN-LAST:event_Calc_PrimActionPerformed

    private void Caracteres(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Caracteres
        // TODO add your handling code here:
       String caracter = "0987654321-";
       if(!caracter.contains(evt.getKeyChar()+"")){
           evt.consume();
       }
    }//GEN-LAST:event_Caracteres

    private void Calc_BhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_BhasActionPerformed
        double a = Double.parseDouble(N1_Bhas.getText());
        double b = Double.parseDouble(N2_Bhas.getText());
        double c = Double.parseDouble(N3_Bhas.getText());
        double delta = (Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        Delt_Res.setText(Double.toString(delta));
        X1_Res.setText(Double.toString(x1));
        X2_Res.setText(Double.toString(x2));
    }//GEN-LAST:event_Calc_BhasActionPerformed

    private void Im_Par_CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Im_Par_CalcActionPerformed
        double num = Double.parseDouble(Im_Par_Num.getText());
        if(num % 2 == 0){
            Im_Par_Res.setText("O número informado é par");
        }
        else{
            Im_Par_Res.setText("O número informado é ímpar");
        }
    }//GEN-LAST:event_Im_Par_CalcActionPerformed

    private void Calc_MMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_MMCActionPerformed
        int num1 = Integer.parseInt(MMC_N1.getText());
        int num2 = Integer.parseInt(MMC_N2.getText());
        int a = num1;
        int b = num2;
        int r = 1;
        while(r != 0){
            r = a % b;
            a = b;
            b = r;
        }
        int mmc = (num1 * num2) / a;
        MMC_Res.setText(Integer.toString(mmc));
    }//GEN-LAST:event_Calc_MMCActionPerformed

    private void Clear_MDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_MDCActionPerformed
        MDC_Num1.setText("");
        MDC_Num2.setText("");
        MDC_Res.setText("Exibir Resultado do MDC");
    }//GEN-LAST:event_Clear_MDCActionPerformed

    private void Clear_MMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_MMCActionPerformed
        MMC_N1.setText("");
        MMC_N2.setText("");
        MMC_Res.setText("Exibir Resultado do MMC");
    }//GEN-LAST:event_Clear_MMCActionPerformed

    private void Clear_PrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_PrimActionPerformed
        Num_Prim.setText("");
        Prim_Res.setText("Verificação número primo");
    }//GEN-LAST:event_Clear_PrimActionPerformed

    private void Clear_Im_ParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Im_ParActionPerformed
        Im_Par_Num.setText("");
        Im_Par_Res.setText("Verificação par ou ímpar");
    }//GEN-LAST:event_Clear_Im_ParActionPerformed

    private void Clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_AllActionPerformed
        MMC_N1.setText("");
        MMC_N2.setText("");
        MMC_Res.setText("Exibir resultado do MMC");
        MDC_Num1.setText("");
        MDC_Num2.setText("");
        MDC_Res.setText("Exibir resultado do MDC");
        Num_Prim.setText("");
        Prim_Res.setText("Verificação número primo");
        Im_Par_Num.setText("");
        Im_Par_Res.setText("Verificação par ou ímpar");
        N1_Bhas.setText("");
        N2_Bhas.setText("");
        N3_Bhas.setText("");
        Delt_Res.setText("0");
        X1_Res.setText("0");
        X2_Res.setText("0");
    }//GEN-LAST:event_Clear_AllActionPerformed

    private void Clear_BhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_BhasActionPerformed
       N1_Bhas.setText("");
       N2_Bhas.setText("");
       N3_Bhas.setText("");
       Delt_Res.setText("0");
       X1_Res.setText("0");
       X2_Res.setText("0");
    }//GEN-LAST:event_Clear_BhasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Calc_Espec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Calc_Espec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Calc_Espec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Calc_Espec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Calc_Espec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bhas_Painel;
    private javax.swing.JButton Button_Quit;
    private javax.swing.JButton Calc_Bhas;
    private javax.swing.JButton Calc_MDC;
    private javax.swing.JButton Calc_MMC;
    private javax.swing.JButton Calc_Prim;
    private javax.swing.JButton Clear_All;
    private javax.swing.JButton Clear_Bhas;
    private javax.swing.JButton Clear_Im_Par;
    private javax.swing.JButton Clear_MDC;
    private javax.swing.JButton Clear_MMC;
    private javax.swing.JButton Clear_Prim;
    private javax.swing.JLabel Delt_Label;
    private javax.swing.JLabel Delt_Res;
    private javax.swing.JButton Im_Par_Calc;
    private javax.swing.JTextField Im_Par_Num;
    private javax.swing.JLabel Im_Par_Res;
    private javax.swing.JLabel Impar_Par_Label;
    private javax.swing.JLabel MDC1_Label;
    private javax.swing.JLabel MDC2_Label;
    private javax.swing.JTextField MDC_Num1;
    private javax.swing.JTextField MDC_Num2;
    private javax.swing.JPanel MDC_Painel;
    private javax.swing.JLabel MDC_Res;
    private javax.swing.JTextField MMC_N1;
    private javax.swing.JLabel MMC_N1_Label;
    private javax.swing.JTextField MMC_N2;
    private javax.swing.JLabel MMC_N2_Label;
    private javax.swing.JPanel MMC_Painel;
    private javax.swing.JLabel MMC_Res;
    private javax.swing.JTextField N1_Bhas;
    private javax.swing.JLabel N1_Bhas_Label;
    private javax.swing.JTextField N2_Bhas;
    private javax.swing.JLabel N2_Bhas_Label;
    private javax.swing.JTextField N3_Bhas;
    private javax.swing.JLabel N3_Bhas_Label;
    private javax.swing.JTextField Num_Prim;
    private javax.swing.JLabel Num_Prin_Label;
    private javax.swing.JPanel Par_Impar_Painel;
    private javax.swing.JPanel Prim_Painel;
    private javax.swing.JLabel Prim_Res;
    private javax.swing.JLabel Res_Label;
    private javax.swing.JLabel X1_Label;
    private javax.swing.JLabel X1_Res;
    private javax.swing.JLabel X2_Label;
    private javax.swing.JLabel X2_Res;
    // End of variables declaration//GEN-END:variables
}
