/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dcit13.library;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 *
 * @author mjeno
 */
public class MainFrameAdmin extends javax.swing.JFrame {
    
    
    private List<Book> borrowedBooks; // List to track borrowed books
    private List<Book> books; // List to store all books in the library
    private DefaultTableModel tableModel;
    private int selectedRow = -1;  // To keep track of the selected row
    /**
     * Creates new form MainFrameAdmin
     */
    public MainFrameAdmin() {
        initComponents();
        
        // Initialize the table model
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        // Add panels to mainPanel with correct card names
        mainPanel.add(panelRemoveBook, "card7");
        mainPanel.add(panelAddBook, "card6");
        mainPanel.add(panelListBooks, "card8");

        // Add MouseListener to jTable1
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = jTable1.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    selectedRow = row;
                }
            }
        });
        
        // Populate initial table data
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnAddBook = new javax.swing.JButton();
        btnRemoveBook = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnListOfBooks = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        panelRemoveBook = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnRemoveBook1 = new javax.swing.JButton();
        panelAddBook = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBookISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBookTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BookCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBookAuthor = new javax.swing.JTextField();
        btnAddBook1 = new javax.swing.JButton();
        panelListBooks = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 211, 218));

        btnAddBook.setBackground(new java.awt.Color(229, 116, 143));
        btnAddBook.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnAddBook.setText("Add Book");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnRemoveBook.setBackground(new java.awt.Color(229, 116, 143));
        btnRemoveBook.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnRemoveBook.setText("Remove Book");
        btnRemoveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBookActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(229, 116, 143));
        btnLogOut.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnListOfBooks.setBackground(new java.awt.Color(229, 116, 143));
        btnListOfBooks.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnListOfBooks.setText("List of Books");
        btnListOfBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListOfBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListOfBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        mainPanel.setLayout(new java.awt.CardLayout());

        panelRemoveBook.setBackground(new java.awt.Color(242, 174, 190));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Genre", "Author", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel7.setText("Remove Book");

        btnRemoveBook1.setBackground(new java.awt.Color(229, 116, 143));
        btnRemoveBook1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnRemoveBook1.setText("Remove Book");
        btnRemoveBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBook1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRemoveBookLayout = new javax.swing.GroupLayout(panelRemoveBook);
        panelRemoveBook.setLayout(panelRemoveBookLayout);
        panelRemoveBookLayout.setHorizontalGroup(
            panelRemoveBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemoveBookLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(panelRemoveBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRemoveBookLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(605, 605, 605))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRemoveBookLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRemoveBookLayout.createSequentialGroup()
                        .addComponent(btnRemoveBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(648, 648, 648))))
        );
        panelRemoveBookLayout.setVerticalGroup(
            panelRemoveBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRemoveBookLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRemoveBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        mainPanel.add(panelRemoveBook, "card7");

        panelAddBook.setBackground(new java.awt.Color(242, 174, 190));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel6.setText("Add Book");

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("Book ISBN");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel2.setText("Book Title");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel3.setText("Book Category");

        BookCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Genre", "Fiction", "Fantasy", "Action", "Comedy", "Warewolf", "Romance", "Thriller" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel4.setText("Book Author");

        btnAddBook1.setBackground(new java.awt.Color(229, 116, 143));
        btnAddBook1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnAddBook1.setText("Add Book");
        btnAddBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBook1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddBookLayout = new javax.swing.GroupLayout(panelAddBook);
        panelAddBook.setLayout(panelAddBookLayout);
        panelAddBookLayout.setHorizontalGroup(
            panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBookLayout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBookLayout.createSequentialGroup()
                        .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookISBN)
                            .addComponent(txtBookTitle)
                            .addComponent(BookCategory, 0, 322, Short.MAX_VALUE)
                            .addComponent(txtBookAuthor))
                        .addGap(511, 511, 511))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBookLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(644, 644, 644))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBookLayout.createSequentialGroup()
                        .addComponent(btnAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(597, 597, 597))))
        );
        panelAddBookLayout.setVerticalGroup(
            panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBookLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBookISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addComponent(btnAddBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        mainPanel.add(panelAddBook, "card6");

        panelListBooks.setBackground(new java.awt.Color(242, 174, 190));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Genre", "Author", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel8.setText("List of all Books");

        javax.swing.GroupLayout panelListBooksLayout = new javax.swing.GroupLayout(panelListBooks);
        panelListBooks.setLayout(panelListBooksLayout);
        panelListBooksLayout.setHorizontalGroup(
            panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListBooksLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListBooksLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(567, 567, 567))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListBooksLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        panelListBooksLayout.setVerticalGroup(
            panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListBooksLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        mainPanel.add(panelListBooks, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // NAVBAR - Add Book
    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        System.out.println("Showing panelAddBook");
        card.show(mainPanel, "card6");
    }//GEN-LAST:event_btnAddBookActionPerformed
    
    // CLICK BUTTON - Add Book
    private void btnAddBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBook1ActionPerformed
        // Get values from input fields
        String isbn = txtBookISBN.getText().trim();
        String title = txtBookTitle.getText().trim();
        String author = txtBookAuthor.getText().trim();
        String category = (String) BookCategory.getSelectedItem();

        // Validate input
        if (isbn.isEmpty() || title.isEmpty() || author.isEmpty() || category.isEmpty()) {
            // Show error message if any required field is empty
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method without adding the book
        }

        // Add new book to LibraryData singleton
        LibraryData.getInstance().addBook(new Book(isbn, title, author, category, 1));

        // Clear the input fields after adding the book
        txtBookISBN.setText("");
        txtBookTitle.setText("");
        txtBookAuthor.setText("");
        BookCategory.setSelectedIndex(0); // Reset ComboBox selection to default

        // Notify the user that the book was added successfully
        JOptionPane.showMessageDialog(this, "Book added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Refresh the table with the current books
        refreshTable();
    }//GEN-LAST:event_btnAddBook1ActionPerformed

    // NAVBAR - Remove Book
    private void btnRemoveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBookActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        System.out.println("Showing panelRemoveBook");
        card.show(mainPanel, "card7");
        
        // Refresh the table with the current books
        refreshTable();
    }//GEN-LAST:event_btnRemoveBookActionPerformed

    // CLICK BUTTON - Remove Book
    private void btnRemoveBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBook1ActionPerformed
        if (selectedRow >= 0) {
            // Remove the selected book using LibraryData singleton
            LibraryData.getInstance().removeBook(selectedRow);

            JOptionPane.showMessageDialog(this, "Book removed successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a book to remove.");
        }

        // Reset selectedRow
        selectedRow = -1;

        // Refresh the table with the current books
        refreshTable();
    }//GEN-LAST:event_btnRemoveBook1ActionPerformed

    // NAVBAR - List of Books
    private void btnListOfBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfBooksActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        System.out.println("Showing panelListBooks");
        card.show(mainPanel, "card8");
        
        refreshListTable();
    }//GEN-LAST:event_btnListOfBooksActionPerformed

    // NAVBAR - Log Out
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login(); 
        login.setVisible(true);
        this.dispose(); // Close the current login frame
    }//GEN-LAST:event_btnLogOutActionPerformed
    
    // Method to refresh jTable1 with the available books
    private void refreshTable() {
        // Clear the existing rows
        tableModel.setRowCount(0);

        // Get the list of books from LibraryData singleton
        ArrayList<Book> books = LibraryData.getInstance().getBooks();

        // Add all books to the table
        for (Book book : books) {
            tableModel.addRow(new Object[]{book.getIsbn(), book.getTitle(), book.getGenre(), book.getAuthor(), book.getQuantity()});
        }
    }
    
    // Method to refresh jTable1 with the available books
    private void refreshListTable() {
        DefaultTableModel listTableModel = (DefaultTableModel) jTable2.getModel();

        // Clear the existing rows
        listTableModel.setRowCount(0);

        // Get the list of books from LibraryData singleton
        ArrayList<Book> books = LibraryData.getInstance().getBooks();

        // Add all books to the table
        for (Book book : books) {
            listTableModel.addRow(new Object[]{book.getIsbn(), book.getTitle(), book.getGenre(), book.getAuthor(), book.getQuantity()});
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BookCategory;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddBook1;
    private javax.swing.JButton btnListOfBooks;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRemoveBook;
    private javax.swing.JButton btnRemoveBook1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAddBook;
    private javax.swing.JPanel panelListBooks;
    private javax.swing.JPanel panelRemoveBook;
    private javax.swing.JTextField txtBookAuthor;
    private javax.swing.JTextField txtBookISBN;
    private javax.swing.JTextField txtBookTitle;
    // End of variables declaration//GEN-END:variables
}