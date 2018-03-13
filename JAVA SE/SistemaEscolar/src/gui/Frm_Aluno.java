package gui;

import persistencia.AlunoDao;
import entidade.Aluno;
import java.util.List;
import javax.swing.JOptionPane;


public class Frm_Aluno extends javax.swing.JFrame {

    
    public Frm_Aluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMensalidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMae = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        cbTurno = new javax.swing.JComboBox();
        btnLimpar = new javax.swing.JButton();

        setTitle("Cadastro de alunos");
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Id:");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Matricula:");

        jLabel3.setText("Aluno:");

        jLabel4.setText("Turma:");

        jLabel5.setText("Turno:");

        jLabel6.setText("Mensalidade:");

        jLabel7.setText("Pai:");

        jLabel8.setText("Mae:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Email:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        cbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manha", "Tarde", "Noite" }));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar))
                    .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDeletar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Aluno a = new Aluno();
        a.setMatricula(txtMatricula.getText());
        a.setAluno(txtAluno.getText());
        a.setEmail(txtEmail.getText());
        a.setPai(txtPai.getText());
        a.setMae(txtMae.getText());
        a.setMensalidade(Double.parseDouble(txtMensalidade.getText()));
        a.setTelefone(txtTelefone.getText());
        a.setTurno(cbTurno.getSelectedItem().toString());
        a.setTurma(txtTurma.getText());
        try{
            new AlunoDao().add(a);
            JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar o aluno:"+a.getAluno());
        }
        limpar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String s = "";
        try{
            switch(Integer.parseInt(JOptionPane.showInputDialog(null,"1-Exibir todos 2-Exibir por matricula"))){
                case 1:
                    try{

                        List<Aluno> lista = new AlunoDao().search();

                        for(Aluno a:lista){
                            s += "id:"+a.getId()+"\naluno:"+a.getAluno()+"\nmatricula:"+a.getMatricula()+"\n\n";
                        }
                        JOptionPane.showMessageDialog(null, s);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "error");
                    }
                    break;
                case 2:
                   try{

                        List<Aluno> lista = new AlunoDao().search();
                        String matricula = JOptionPane.showInputDialog(null,"digite a matricula do aluno");
                        for(Aluno a:lista){
                            if(a.getMatricula().equals(matricula)){
                                txtId.setText(""+a.getId());
                                txtMatricula.setText(a.getMatricula());
                                txtAluno.setText(a.getAluno());
                                txtPai.setText(a.getPai());
                                txtMae.setText(a.getMae());
                                txtEmail.setText(a.getEmail());
                                txtTurma.setText(a.getTurma());
                                txtTelefone.setText(a.getTelefone());
                                txtMensalidade.setText(""+a.getMensalidade());
                                for(int i =0;i< cbTurno.getItemCount();i++){
                                    if(cbTurno.getItemAt(i).toString().equals(a.getTurno())){
                                        cbTurno.setSelectedIndex(i);
                                    }
                                }
                            }
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "error");
                    }
                    break;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Deve ser digitado um numero valido");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    public void limpar(){
        txtId.setText("");
        txtMatricula.setText("");
        txtAluno.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtEmail.setText("");
        txtTurma.setText("");
        txtTelefone.setText("");
        txtMensalidade.setText("");
    }
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try{
            new AlunoDao().delete(JOptionPane.showInputDialog("digite a matricula do aluno que deseja deletar"));
            JOptionPane.showMessageDialog(null, "aluno deletado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao deletar aluno");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Aluno a = new Aluno();
        try{
            a.setMatricula(txtMatricula.getText());
            a.setAluno(txtAluno.getText());
            a.setEmail(txtEmail.getText());
            a.setPai(txtPai.getText());
            a.setMae(txtMae.getText());
            a.setMensalidade(Double.parseDouble(txtMensalidade.getText()));
            a.setTelefone(txtTelefone.getText());
            a.setTurno(cbTurno.getSelectedItem().toString());
            a.setTurma(txtTurma.getText());
            try{
                new AlunoDao().update(a, txtMatricula.getText());
                JOptionPane.showMessageDialog(null, "dados alterados com sucesso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getStackTrace());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"é necessario uma busca para efetuar alteração");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMensalidade;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
