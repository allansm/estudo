

package gui;

import persistencia.ProfessorDao;
import entidade.Professor;
import java.util.List;
import javax.swing.JOptionPane;


public class FrmProfessor extends javax.swing.JFrame {

    
    public FrmProfessor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraAula = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        cbDisponibilidade = new javax.swing.JComboBox();

        jLabel1.setText("Id:");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Professor:");

        jLabel3.setText("Disciplina:");

        jLabel4.setText("Disponibilidade:");

        jLabel5.setText("Hora-Aula:");

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

        cbDisponibilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manha", "Tarde", "Noite" }));

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
                    .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraAula, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar))
                    .addComponent(cbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(txtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDeletar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Professor p = new Professor();
        p.setProfessor(txtProfessor.getText());
        p.setDisciplina(txtDisciplina.getText());
        p.setDisponibilidade(cbDisponibilidade.getSelectedItem().toString());
        p.setHora_aula(Double.parseDouble(txtHoraAula.getText()));
        try{
            new ProfessorDao().add(p);
            JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar professor:"+p.getProfessor());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        switch(Integer.parseInt(JOptionPane.showInputDialog("1-exibir todos 2-procurar por id"))){
            case 1:
                String s = "";
                try{
                    List<Professor> lista = new ProfessorDao().search();
                    for(Professor p:lista){
                        s+= "id:"+p.getId()+"\nprofessor:"+p.getProfessor()+"\n\n";
                    }
                    if(s.equals("")){
                        s="nenhum registro encontrado";
                    }
                    JOptionPane.showMessageDialog(null, s);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error!!!");
                }
                break;
            case 2:
                try{
                    String msg = "";
                    int id= Integer.parseInt(JOptionPane.showInputDialog("digite o id do professor"));
                    List<Professor> lista = new ProfessorDao().search();
                    for(Professor p : lista){
                        if(p.getId() == id){
                            txtId.setText(""+p.getId());
                            txtProfessor.setText(p.getProfessor());
                            txtDisciplina.setText(p.getDisciplina());
                            txtHoraAula.setText(""+p.getHora_aula());
                            for(int i =0;i< cbDisponibilidade.getItemCount();i++){
                                    if(cbDisponibilidade.getItemAt(i).toString().equals(p.getDisponibilidade())){
                                        cbDisponibilidade.setSelectedIndex(i);
                                    }
                                }
                            msg = "registro encontrado";
                        }
                    }
                    msg = (msg.equals(""))?"registro não existe":msg;
                    JOptionPane.showMessageDialog(null, msg);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error!!!");
                }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try{
            new ProfessorDao().delete(Integer.parseInt(JOptionPane.showInputDialog("digite o id do professor que deseja deletar")));
            JOptionPane.showMessageDialog(null,"professor deletado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error!!!");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            Professor p = new Professor();
            p.setProfessor(txtProfessor.getText());
            p.setDisciplina(txtDisciplina.getText());
            p.setDisponibilidade(cbDisponibilidade.getSelectedItem().toString());
            p.setHora_aula(Double.parseDouble(txtHoraAula.getText()));
            int id;
            if(txtId.getText().equals("")) id = Integer.parseInt(JOptionPane.showInputDialog("digite o id do professor"));
            else id= Integer.parseInt(txtId.getText());
            new ProfessorDao().update(id, p);
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"é necessario efetuar uma busca antes de alterar os dados");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox cbDisponibilidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtHoraAula;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProfessor;
    // End of variables declaration//GEN-END:variables
}
