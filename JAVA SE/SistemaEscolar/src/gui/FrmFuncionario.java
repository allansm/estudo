package gui;

import persistencia.FuncionarioDao;
import entidade.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmFuncionario extends javax.swing.JFrame {

    
    public FrmFuncionario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataAdmissao = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        cbTurno = new javax.swing.JComboBox();

        jLabel1.setText("Id:");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 250, 250));

        jLabel2.setText("Nome:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("Turno:");

        jLabel5.setText("Salario:");

        jLabel6.setText("Data de admissao:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbTurno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDeletar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Funcionario f = new Funcionario();
        f.setNome(txtNome.getText());
        f.setCargo(txtCargo.getText());
        f.setDtadmissao(txtDataAdmissao.getText());
        f.setTurno(cbTurno.getSelectedItem().toString());
        f.setSalario(Double.parseDouble(txtSalario.getText()));
        try{
            new FuncionarioDao().add(f);
            JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario :"+f.getNome());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try{
            new FuncionarioDao().delete(Integer.parseInt(JOptionPane.showInputDialog("digite o id do funcionario que deseja deletar")));
            JOptionPane.showMessageDialog(null,"funcionario deletado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro ao deletar");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            Funcionario f = new Funcionario();
            f.setNome(txtNome.getText());
            f.setCargo(txtCargo.getText());
            f.setDtadmissao(txtDataAdmissao.getText());
            f.setTurno(cbTurno.getSelectedItem().toString());
            f.setSalario(Double.parseDouble(txtSalario.getText()));
            f.setId(Integer.parseInt(txtId.getText()));
            new FuncionarioDao().update(f.getId(), f);
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "é necessario efetuar uma busca antes de alterar os dados");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{
            switch(Integer.parseInt(JOptionPane.showInputDialog("1- exibir todos 2-exibir por id"))){
                case 1:
                    try{
                        String s = "";
                        List<Funcionario> lista = new FuncionarioDao().search();
                        for(Funcionario f:lista){
                            s+="id:"+f.getId()+"\nnome:"+f.getNome()+"\n\n";
                        }
                        s = (s.equals(""))?"nenhum registro encontrado":s;
                        JOptionPane.showMessageDialog(null, s);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "error!!!");
                    }
                    break;
                case 2:
                    try{
                        List<Funcionario> lista = new FuncionarioDao().search();
                        int id = Integer.parseInt(JOptionPane.showInputDialog("digite o id do funcionario"));
                        for(Funcionario f:lista){
                            if(f.getId() == id){
                                txtId.setText(""+f.getId());
                                txtNome.setText(f.getNome());
                                txtCargo.setText(f.getCargo());
                                txtDataAdmissao.setText(f.getDtadmissao());
                                txtSalario.setText(""+f.getSalario());
                                for(int i =0;i< cbTurno.getItemCount();i++){
                                    if(cbTurno.getItemAt(i).toString().equals(f.getTurno())){
                                        cbTurno.setSelectedIndex(i);
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "registro encontrado");
                            }
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "error!!!");
                    }
                    break;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"a opção deve ser um numero");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox cbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDataAdmissao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
