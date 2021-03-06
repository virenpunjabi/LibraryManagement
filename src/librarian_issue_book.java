
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.coobird.thumbnailator.Thumbnails;
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
public class librarian_issue_book extends javax.swing.JFrame {

    /**
     * Creates new form librarian_issue_book
     */
    Connection conn=DBConnect.connectDB();
    private static final int BOOKDURATION=7;
    public librarian_issue_book() {
        initComponents();
        updateTable();
        
    }
    
    private void updateTable(){
            
        try {
            
        sql="SELECT * FROM bookIssueRequest,books,students WHERE book_id=bir_book_id AND student_id=bir_student_id AND bir_status='pending' ";  
        preparedStatement=conn.prepareStatement(sql);
        rs=preparedStatement.executeQuery();
        jtbData.setModel(DbUtils.resultSetToTableModel(rs));
       
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "Invalid in updateTable "+e.getMessage());
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

        lbl_student_image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_student_name = new javax.swing.JLabel();
        lbl_student_branch = new javax.swing.JLabel();
        lbl_student_email = new javax.swing.JLabel();
        lbl_book_image = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_book_name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_book_author = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_book_quantity = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_book_isbn_no = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        btn_grant_issue = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Name :-");

        jLabel3.setText("Branch :-");

        jLabel4.setText("Email :-");

        jLabel6.setText("Name");

        jLabel8.setText("Author");

        jLabel10.setText("Quantity");

        jLabel12.setText("ISBN No");

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

        btn_grant_issue.setText("Grant Issue");
        btn_grant_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grant_issueActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lbl_student_image, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_student_branch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_student_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addComponent(lbl_book_image, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_book_author, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(lbl_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_isbn_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btn_grant_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_book_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_book_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_book_isbn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(lbl_student_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_student_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addComponent(lbl_book_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_student_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_grant_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectedRowHandler(){
       
        int row=jtbData.getSelectedRow();
       selectedID= jtbData.getModel().getValueAt(row, 0).toString();
       
        try {
            // JOptionPane.showMessageDialog(null, "Hiii"+selectedID);
            sql="SELECT * FROM bookIssueRequest,books,students WHERE book_id=bir_book_id AND student_id=bir_student_id AND bir_id = "+selectedID;
            preparedStatement=conn.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            if(rs.next()){
            
            //book
            lbl_book_name.setText(rs.getString("book_name"));
            
            lbl_book_author.setText(rs.getString("book_author"));
            
            Integer isbn=rs.getInt("book_isbn_no");
            lbl_book_isbn_no.setText(isbn.toString());
            
            Integer quantity=rs.getInt("book_quantity");
            lbl_book_quantity.setText(quantity.toString());
            
            byteImage = rs.getBytes("book_image");
            
            BufferedImage img =Thumbnails.of(ImageIO.read(new ByteArrayInputStream(byteImage))).size(180, 220).asBufferedImage();
                ImageIcon i = new ImageIcon(img);
            lbl_book_image.setIcon(i);
            
            db_book_id=rs.getInt("book_id");
            
            //student
            
            lbl_student_name.setText(rs.getString("student_name"));
            
            lbl_student_branch.setText(rs.getString("student_branch"));
            
            lbl_student_email.setText(rs.getString("student_email"));
            
            
            byteImage = rs.getBytes("student_image");
            
             img =Thumbnails.of(ImageIO.read(new ByteArrayInputStream(byteImage))).size(180, 220).asBufferedImage();
               i = new ImageIcon(img);
            lbl_student_image.setIcon(i);
            
            db_student_id=rs.getInt("student_id");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SelectedRowHandler Exception "+e.getMessage());
        }
       
    }
    private void clearFields(){
    
         lbl_book_name.setText("");
         lbl_book_author.setText("");
         lbl_book_isbn_no.setText("");
         lbl_book_quantity.setText("");
         lbl_book_image.setIcon(null);
            
          //student
            
            lbl_student_name.setText("");
            lbl_student_branch.setText("");
            lbl_student_email.setText("");
            lbl_student_image.setIcon(null);
            
            
    }
    private void issueBook(){
        try {
            sql="INSERT INTO issueBook( ib_student_id, ib_book_id, ib_issue_date, ib_expected_return ) VALUES (?,?,?,?) ";
            preparedStatement=conn.prepareStatement(sql);

            preparedStatement.setInt(1, db_student_id);
            
            preparedStatement.setInt(2, db_book_id);
            
            Calendar cal=Calendar.getInstance();
            day=cal.get(Calendar.DAY_OF_MONTH);
            month=cal.get(Calendar.MONTH);
            year=cal.get(Calendar.YEAR);
            int newmonth=month+1;
            String dbDate = day+"/"+newmonth+"/"+year;
            preparedStatement.setString(3, dbDate);
             
            SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
            cal.setTime(sdf.parse(dbDate));
            cal.add(Calendar.DATE, BOOKDURATION);  // number of days to add
            String returnDate = sdf.format(cal.getTime());  // dt is now the new date
            preparedStatement.setString(4, returnDate);
            
            preparedStatement.execute();
            
            sql="UPDATE bookIssueRequest SET bir_status = 'approved' WHERE bir_id = "+selectedID;
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.execute();
            
            sql="SELECT * FROM books WHERE book_id = "+db_book_id;
            preparedStatement=conn.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            if(rs.next())
            {
                int issued_book_quantity = rs.getInt("book_quantity");
                int updated_book_quantity = issued_book_quantity - 1;
                sql="UPDATE books SET book_quantity = "+updated_book_quantity+" WHERE book_id = "+db_book_id;
                preparedStatement=conn.prepareStatement(sql);
                preparedStatement.execute();
                
            }
            else{
            JOptionPane.showMessageDialog(null, "Issued book not found in books db");
            }
            updateTable();
            clearFields();
            
            
            
            
            JOptionPane.showMessageDialog(null, "Student "+lbl_student_name.getText()+" has been granted "+lbl_book_name.getText()+" book");      
             
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Exception occured in issueBook :- "+e.getMessage());
        }
    
    }
    private void jtbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDataMouseClicked
        // TODO add your handling code here:
        selectedRowHandler();

    }//GEN-LAST:event_jtbDataMouseClicked

    private void btn_grant_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grant_issueActionPerformed
        // TODO add your handling code here:
        issueBook();
    }//GEN-LAST:event_btn_grant_issueActionPerformed

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
            java.util.logging.Logger.getLogger(librarian_issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(librarian_issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(librarian_issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(librarian_issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new librarian_issue_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_grant_issue;
    private javax.swing.JButton btn_home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbData;
    private javax.swing.JLabel lbl_book_author;
    private javax.swing.JLabel lbl_book_image;
    private javax.swing.JLabel lbl_book_isbn_no;
    private javax.swing.JLabel lbl_book_name;
    private javax.swing.JLabel lbl_book_quantity;
    private javax.swing.JLabel lbl_student_branch;
    private javax.swing.JLabel lbl_student_email;
    private javax.swing.JLabel lbl_student_image;
    private javax.swing.JLabel lbl_student_name;
    // End of variables declaration//GEN-END:variables
 private byte[] byteImage=null;
    private String selectedID="";
   
    private PreparedStatement preparedStatement;
    private String sql;
    private ResultSet rs;
    private int day,month,year;
    private String date;
    private int db_student_id,db_book_id;
   
}
