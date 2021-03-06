
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */
public class manage_librarian_home extends javax.swing.JFrame {

    /**
     * Creates new form manage_librarian_home
     */
    public manage_librarian_home() {
        initComponents();
        conn=DBConnect.connectDB();
        
        updateTable(noPasswordSql);
    }
    
    private void updateTable(String sql){
    try{
//       sql="SELECT * [except 'user_password'] FROM users";
        preparedStatement=conn.prepareStatement(sql);
        rs=preparedStatement.executeQuery();
        jtbData.setModel(DbUtils.resultSetToTableModel(rs));
       
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "Invalid"+e.getMessage());
    }finally{
            try {
                rs.close();
                preparedStatement.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problem in closing rs or preparedstatement "+e.getMessage());
            }
        }
    
    }
    private void addLibrarian(){
        try {
            String pass=txt_user_password.getText();
            String confirmpass=txt_user_confirm_password.getText();
            String username=txt_user_name.getText();
            if(pass.equals(confirmpass)){
            sql="SELECT * FROM users WHERE user_name = ?";
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,txt_user_name.getText());
            rs=preparedStatement.executeQuery();
            if(rs.next()){
             JOptionPane.showMessageDialog(null,"Username already exists");
            }
            
            else{
            sql="INSERT INTO users(user_firstname,user_lastname,user_name,user_password,user_contact,user_email) VALUES (?,?,?,?,?,?)";
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,txt_firstname.getText());
            preparedStatement.setString(2,txt_lastname.getText());
            preparedStatement.setString(3,txt_user_name.getText());
            preparedStatement.setString(4,txt_user_password.getText());
            preparedStatement.setString(5,txt_user_contact.getText());
            preparedStatement.setString(6,txt_user_email.getText());
            preparedStatement.execute();
            
             JOptionPane.showMessageDialog(null,"Added Successfully");
             updateTable(noPasswordSql);
            }
            
            }else{
                JOptionPane.showMessageDialog(null," Passwords don't match");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Some Exception "+e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_user_name = new javax.swing.JTextField();
        txt_user_password = new javax.swing.JPasswordField();
        txt_user_confirm_password = new javax.swing.JPasswordField();
        txt_user_contact = new javax.swing.JTextField();
        txt_user_email = new javax.swing.JTextField();
        btn_add_Librarian = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_edit_firstname = new javax.swing.JTextField();
        txt_edit_lastname = new javax.swing.JTextField();
        txt_edit_contact = new javax.swing.JTextField();
        txt_edit_email = new javax.swing.JTextField();
        txt_edit_username = new javax.swing.JTextField();
        txt_edit_newPassword = new javax.swing.JPasswordField();
        txt_edit_confirmPassword = new javax.swing.JPasswordField();
        txt_edit_oldPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("User Name");

        jLabel4.setText("Password");

        jLabel5.setText("Confirm Password");

        jLabel6.setText("Contact");

        jLabel7.setText("Email");

        btn_add_Librarian.setText("Add Librarian");
        btn_add_Librarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_LibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_firstname)
                        .addComponent(txt_lastname)
                        .addComponent(txt_user_name)
                        .addComponent(txt_user_password)
                        .addComponent(txt_user_confirm_password)
                        .addComponent(txt_user_contact)
                        .addComponent(txt_user_email, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(btn_add_Librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user_email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_add_Librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Librarian", jPanel1);

        jtbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbData);

        jLabel8.setText("First Name");

        jLabel9.setText("Last Name");

        jLabel10.setText("Contact");

        jLabel11.setText("Email");

        jLabel12.setText("User Name");

        jLabel13.setText("Password");

        jLabel14.setText("Confirm Password");

        jLabel15.setText("Old Password");

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edit_firstname)
                            .addComponent(txt_edit_lastname)
                            .addComponent(txt_edit_contact)
                            .addComponent(txt_edit_email, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(127, 127, 127))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edit_oldPassword)
                            .addComponent(txt_edit_username)
                            .addComponent(txt_edit_newPassword)
                            .addComponent(txt_edit_confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_edit_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_edit_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_edit_oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_edit_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_edit_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_edit_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_edit_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_edit_confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Update)
                    .addComponent(btn_Delete)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit Librarian", jPanel2);

        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btn_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_LibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_LibrarianActionPerformed
        // TODO add your handling code here:
        addLibrarian();
    }//GEN-LAST:event_btn_add_LibrarianActionPerformed

    private void jtbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDataMouseClicked
        // TODO add your handling code here:
        int selectedrow=jtbData.getSelectedRow();
        selectedID=jtbData.getModel().getValueAt(selectedrow, 0).toString();
        try {
            sql="SELECT * FROM users WHERE user_id  = "+selectedID;
            preparedStatement=conn.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            if(rs.next()){
            txt_edit_firstname.setText(rs.getString("user_firstname"));
            txt_edit_lastname.setText(rs.getString("user_lastname"));
            txt_edit_contact.setText(rs.getString("user_contact"));
            txt_edit_email.setText(rs.getString("user_email"));
            txt_edit_username.setText(rs.getString("user_name"));
            
            db_username=rs.getString("user_name");
            db_password=rs.getString("user_password");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtbDataMouseClicked

    private void updateUser(){
    String oldPassword=txt_edit_oldPassword.getText();
    String newPassword=txt_edit_newPassword.getText();
    String confirmPassword=txt_edit_confirmPassword.getText();
    String txt_new_username=txt_edit_username.getText();
    if(!db_username.equals(txt_new_username)){
    try{
    
    sql="SELECT * FROM users WHERE user_name = "+txt_new_username;
    preparedStatement=conn.prepareStatement(sql);
    rs=preparedStatement.executeQuery();
    if(rs.next()){
            JOptionPane.showMessageDialog(null, "Username Already Exists");
            return;
    }
    
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception in updateUser "+e.getMessage());
    }
    
    }
        
    
    
    if(oldPassword.equals("") && newPassword.equals("") && confirmPassword.equals("")){
        sql="UPDATE users SET user_firstname=?,user_lastname=?,user_contact=?,user_email=?,user_name=? WHERE user_id="+selectedID;
                    try{
                    preparedStatement=conn.prepareStatement(sql);
                    preparedStatement.setString(1,txt_edit_firstname.getText());
                    preparedStatement.setString(2,txt_edit_lastname.getText());
                    preparedStatement.setString(3,txt_edit_contact.getText());
                    preparedStatement.setString(4,txt_edit_email.getText());
                    preparedStatement.setString(5,txt_edit_username.getText());
                    preparedStatement.execute();
                    //sql="SELECT * FROM users";
                        updateTable(noPasswordSql);
                    
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Exception occured "+e.getMessage());
                    }
        }
        else if(!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("")){
            try{
            
                    if(db_password.equals(oldPassword)){
                    sql="UPDATE users SET user_firstname=?,user_lastname=?,user_contact=?,user_email=?,user_name=?,user_password=? WHERE user_id="+selectedID;
                    preparedStatement=conn.prepareStatement(sql);
                    preparedStatement.setString(1,txt_edit_firstname.getText());
                    preparedStatement.setString(2,txt_edit_lastname.getText());
                    preparedStatement.setString(3,txt_edit_contact.getText());
                    preparedStatement.setString(4,txt_edit_email.getText());
                    preparedStatement.setString(5,txt_edit_username.getText());
                    preparedStatement.setString(6,txt_edit_newPassword.getText());
                    preparedStatement.execute();
                   // sql="SELECT * FROM users";
                        updateTable(noPasswordSql);
                 }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Old Password ");
                    }
            
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception occured "+e.getMessage());
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter password field properly");
        }
                        
    }
    private void deleteUser(){
        try{
    sql="DELETE FROM users WHERE user_id = "+selectedID;
    preparedStatement=conn.prepareStatement(sql);
        preparedStatement.execute();
            updateTable(noPasswordSql);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Exception occured in deleteUser() "+e.getMessage());
        }
    } 
    
    private void searchUser(){
     key = txt_search.getText();
        String updateTableQuery;
        if(!key.equals(""))
            updateTableQuery = "SELECT user_id,user_name,user_firstname,user_lastname,user_email,user_contact FROM users WHERE user_name like '%" + key + "%'";
        else
            updateTableQuery = "SELECT user_id,user_name,user_firstname,user_lastname,user_email,user_contact FROM users";
        updateTable(updateTableQuery);
    }
    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        updateUser();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        deleteUser();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        new librarian_home_page().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_homeActionPerformed

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
            java.util.logging.Logger.getLogger(manage_librarian_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_librarian_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_librarian_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_librarian_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_librarian_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_add_Librarian;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtbData;
    private javax.swing.JPasswordField txt_edit_confirmPassword;
    private javax.swing.JTextField txt_edit_contact;
    private javax.swing.JTextField txt_edit_email;
    private javax.swing.JTextField txt_edit_firstname;
    private javax.swing.JTextField txt_edit_lastname;
    private javax.swing.JPasswordField txt_edit_newPassword;
    private javax.swing.JPasswordField txt_edit_oldPassword;
    private javax.swing.JTextField txt_edit_username;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JPasswordField txt_user_confirm_password;
    private javax.swing.JTextField txt_user_contact;
    private javax.swing.JTextField txt_user_email;
    private javax.swing.JTextField txt_user_name;
    private javax.swing.JPasswordField txt_user_password;
    // End of variables declaration//GEN-END:variables
    private Connection conn;
    private PreparedStatement preparedStatement;
    private String sql;
    private ResultSet rs;
    private String selectedID;
    private String db_username="",db_password="";
    private String noPasswordSql = "SELECT user_id,user_name,user_firstname,user_lastname,user_email,user_contact FROM users";
    private String key="";
}
