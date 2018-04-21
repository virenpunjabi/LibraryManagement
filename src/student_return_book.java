
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.Date;
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
public class student_return_book extends javax.swing.JFrame {

    /**
     * Creates new form student_return_book
     */
    public static final int PER_DAY_CHARGE = 2;
    Connection conn = DBConnect.connectDB();
     int loginID=MainLogin.getLoginID();
    public student_return_book() {
        initComponents();
         updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_book_image = new javax.swing.JLabel();
        lbl_book_name = new javax.swing.JLabel();
        lbl_book_author = new javax.swing.JLabel();
        lbl_book_edition = new javax.swing.JLabel();
        lbl_book_issue_date = new javax.swing.JLabel();
        lbl_book_return_date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_pay_fine = new javax.swing.JLabel();
        btn_return_book = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Book Name");

        jLabel2.setText("Book Author");

        jLabel3.setText("Book Edition");

        jLabel4.setText("Book Issue Date");

        jLabel5.setText("Book Return Date");

        jLabel6.setText("Fine To Be Paid");

        btn_return_book.setText("Return Book");
        btn_return_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return_bookActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_edition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_issue_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_book_return_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_pay_fine, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btn_return_book, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_book_image, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_home)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_book_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_book_edition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_book_issue_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(lbl_book_return_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_book_image, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(lbl_pay_fine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_return_book, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTable(){
    
        try {
         
          sql="SELECT * FROM issueBook,books WHERE ib_book_id=book_id AND ib_student_id = "+loginID; 
        preparedStatement=conn.prepareStatement(sql);
        rs=preparedStatement.executeQuery();
        jtbData.setModel(DbUtils.resultSetToTableModel(rs));
       
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "Invalid in updateTable "+e.getMessage());
    }
    }
    
    private void selectedRowHandler(){
       
        int row=jtbData.getSelectedRow();
       selected_ib_id= jtbData.getModel().getValueAt(row, 0).toString();
       
        try {
            // JOptionPane.showMessageDialog(null, "Hiii"+selectedID);
            sql="SELECT * FROM issueBook,books WHERE ib_book_id=book_id AND ib_student_id = "+loginID; 
            preparedStatement=conn.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            
            if(rs.next()){
            
            lbl_book_name.setText(rs.getString("book_name"));
            lbl_book_author.setText(rs.getString("book_author"));
            lbl_book_edition.setText(rs.getString("book_edition"));
            lbl_book_issue_date.setText(rs.getString("ib_issue_date"));
            lbl_book_return_date.setText(rs.getString("ib_expected_return"));
            selected_student_id=rs.getInt("ib_student_id");
            selected_book_id=rs.getInt("ib_book_id");
            String return_date=rs.getString("ib_expected_return");
            
            Calendar cal = Calendar.getInstance();
            int current_day = cal.get(Calendar.DAY_OF_MONTH);
            int current_month=cal.get(Calendar.MONTH);
            int current_year=cal.get(Calendar.YEAR);
            String logical_current_date = current_day+"/"+current_month+"/"+current_year;
            int new_month=current_month+1;
            actual_current_date = current_day+"/"+new_month+"/"+current_year;
           // System.out.println("Current Date = "+logical_current_date);
            String return_day=return_date.substring(0, 2);
            Integer temp_return_month=Integer.parseInt(return_date.substring(3, 5));
            temp_return_month--;
            String return_month = temp_return_month.toString();
            String return_year=return_date.substring(6);
            String logical_return_date=return_day+"/"+return_month+"/"+return_year;
           // System.out.println("Return Date = "+logical_return_date);
            
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date d1 = null;
                java.util.Date d2= null;
                
                d1= sdf.parse(logical_current_date);
                d2= sdf.parse(logical_return_date);
                
                long diffOfDates, diffDays;
                if(d1.getTime() > d2.getTime()){
                diffOfDates=d1.getTime()-d2.getTime();
                diffDays = diffOfDates / (24 * 60 * 60 * 1000);
                
                }else{
                diffDays = 0L;
                }
                
                int extra_days=(int)diffDays;
             //   lbl_extra_days.setText(Integer.toString(extra_days));
                pay_fine=extra_days*PER_DAY_CHARGE;
                lbl_pay_fine.setText(pay_fine.toString());
                
                
           // Integer isbn=rs.getInt("book_isbn_no");
           // lbl_book_isbn_no.setText(isbn.toString());
            
            
            byteImage = rs.getBytes("book_image");
            
            BufferedImage img =Thumbnails.of(ImageIO.read(new ByteArrayInputStream(byteImage))).size(180, 220).asBufferedImage();
                ImageIcon i = new ImageIcon(img);
            lbl_book_image.setIcon(i);
            
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SelectedRowHandler Exception "+e.getMessage());
        }
       
    }
    
    private void clearFields(){
    lbl_book_name.setText("");
    lbl_book_author.setText("");
    lbl_book_edition.setText("");
    lbl_book_issue_date.setText("");
    lbl_book_return_date.setText("");
    lbl_pay_fine.setText("");
    lbl_book_image.setIcon(null);
    
    }
    private void returnBook(){
    
    try{    
    sql="UPDATE students SET student_late_fine = student_late_fine + "+pay_fine+" WHERE student_id = "+selected_student_id;
    preparedStatement=conn.prepareStatement(sql);
    preparedStatement.execute();
    
    System.out.println("Updated");
    
    sql="INSERT INTO returnBook(return_student_id, return_book_id, return_issue_date, return_expected_return_date, return_actual_return_date) VALUES (?,?,?,?,?)";
    preparedStatement=conn.prepareStatement(sql);
    preparedStatement.setInt(1,(Integer)selected_student_id);
        System.out.println("1");
    preparedStatement.setInt(2, (Integer)selected_book_id);
    System.out.println("2");
    preparedStatement.setString(3, lbl_book_issue_date.getText());
    System.out.println("3");
    preparedStatement.setString(4, lbl_book_return_date.getText());
    System.out.println("4");
    preparedStatement.setString(5, actual_current_date);
    System.out.println("5");
    preparedStatement.execute();
    
        System.out.println("Inserted");
    
    sql="DELETE FROM issueBook WHERE ib_id = "+selected_ib_id;
    preparedStatement=conn.prepareStatement(sql);
    preparedStatement.execute();
    
    sql="UPDATE books SET book_quantity = book_quantity + 1 WHERE book_id = "+selected_book_id;
    preparedStatement=conn.prepareStatement(sql);
    preparedStatement.execute();
    
    JOptionPane.showMessageDialog(null, "Book successfully returned");
    updateTable();
    clearFields();
    
    }
    catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Exception in returnBook "+e.getMessage());
    }
    
    } 
    private void jtbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDataMouseClicked
        // TODO add your handling code here:
       selectedRowHandler();
    }//GEN-LAST:event_jtbDataMouseClicked

    private void btn_return_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return_bookActionPerformed
        // TODO add your handling code here:
        returnBook();
    }//GEN-LAST:event_btn_return_bookActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        new student_home_page().setVisible(true);
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
            java.util.logging.Logger.getLogger(student_return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_return_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbData;
    private javax.swing.JLabel lbl_book_author;
    private javax.swing.JLabel lbl_book_edition;
    private javax.swing.JLabel lbl_book_image;
    private javax.swing.JLabel lbl_book_issue_date;
    private javax.swing.JLabel lbl_book_name;
    private javax.swing.JLabel lbl_book_return_date;
    private javax.swing.JLabel lbl_pay_fine;
    // End of variables declaration//GEN-END:variables
    private byte[] byteImage=null;
    private String selected_ib_id="";
    private int selected_book_id;
    private String actual_current_date;
    private PreparedStatement preparedStatement;
    private String sql;
    private ResultSet rs;
    private int day,month,year;
    private String date;
    private Integer pay_fine;
    private int selected_student_id;
    
}
