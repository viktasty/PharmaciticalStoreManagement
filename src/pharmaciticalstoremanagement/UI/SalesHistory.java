/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmaciticalstoremanagement.UI;

import BusinessLogic.medicine;
import BusinessLogic.sales;
import BusinessLogic.transactions;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAJEED
 */
public class SalesHistory extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ResultSet rs;

    /**
     * Creates new form SalesHistory
     *
     */
    public SalesHistory() {
        initComponents();
        displayTransactionHistory();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionHistoryjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionHistoryTablejTable = new javax.swing.JTable();
        saelesHistoryDetailsjPanel = new javax.swing.JPanel();
        transactionDetailsjScrollPane = new javax.swing.JScrollPane();
        transactionDetailsjTable = new javax.swing.JTable();
        printRecieptjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();

        transactionHistoryjPanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionHistoryjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TransactionHistoryTablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TransactionID", "Sales Transactions Refrence Number", "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TransactionHistoryTablejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransactionHistoryTablejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TransactionHistoryTablejTable);

        javax.swing.GroupLayout transactionHistoryjPanelLayout = new javax.swing.GroupLayout(transactionHistoryjPanel);
        transactionHistoryjPanel.setLayout(transactionHistoryjPanelLayout);
        transactionHistoryjPanelLayout.setHorizontalGroup(
            transactionHistoryjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryjPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        transactionHistoryjPanelLayout.setVerticalGroup(
            transactionHistoryjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        saelesHistoryDetailsjPanel.setBackground(new java.awt.Color(255, 255, 255));
        saelesHistoryDetailsjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        transactionDetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Quantity", "Sales Price", "Discount", "Sales DateAndTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        transactionDetailsjScrollPane.setViewportView(transactionDetailsjTable);

        printRecieptjButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        printRecieptjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/print.png"))); // NOI18N
        printRecieptjButton.setText("Print Reciept");
        printRecieptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRecieptjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saelesHistoryDetailsjPanelLayout = new javax.swing.GroupLayout(saelesHistoryDetailsjPanel);
        saelesHistoryDetailsjPanel.setLayout(saelesHistoryDetailsjPanelLayout);
        saelesHistoryDetailsjPanelLayout.setHorizontalGroup(
            saelesHistoryDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saelesHistoryDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionDetailsjScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saelesHistoryDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printRecieptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        saelesHistoryDetailsjPanelLayout.setVerticalGroup(
            saelesHistoryDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saelesHistoryDetailsjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionDetailsjScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(printRecieptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Details ");

        refreshjButton.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        refreshjButton.setForeground(new java.awt.Color(0, 102, 0));
        refreshjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reset.png"))); // NOI18N
        refreshjButton.setText("Refreshed");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        deletejButton.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(204, 0, 0));
        deletejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.jpg"))); // NOI18N
        deletejButton.setText("Delete ");
        deletejButton.setToolTipText("");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionHistoryjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saelesHistoryDetailsjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(refreshjButton)
                        .addGap(74, 74, 74)
                        .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transactionHistoryjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(saelesHistoryDetailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshjButton)
                            .addComponent(deletejButton))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    public  void displayTransactionHistory(){
        transactionDetailsjScrollPane.hide();
        printRecieptjButton.hide();
        
        TransactionHistoryTablejTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        TransactionHistoryTablejTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        dtm = (DefaultTableModel) TransactionHistoryTablejTable.getModel();
        dtm.setRowCount(0);
        rs = transactions.getTransactions();
        try {
              rs.afterLast(); //Moves the curser to the end of the ResultSet object
              while(rs.previous()){
            //while (rs.next()) {
                String transactionID = rs.getString("TransactionID");
                String transactionRefrenceNumber = rs.getString("TransactionsRefNumber");
                String dateAndTimeOfTransaction = rs.getString("DateTime");

                dtm.addRow(new Object[]{transactionID, transactionRefrenceNumber, dateAndTimeOfTransaction});

            }

            System.out.println("transaction loaded sucessfully");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    
    private void TransactionHistoryTablejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransactionHistoryTablejTableMouseClicked
        // TODO add your handling code here:
      
        ResultSet transactionDetailsResultSet;
        int rowNum = TransactionHistoryTablejTable.getSelectedRow();
        String transactionID = (String) TransactionHistoryTablejTable.getValueAt(rowNum, 0);
        transactionDetailsResultSet = sales.getTransactionDetails(transactionID);
        
        this.transactionDetailsjScrollPane.setVisible(true);
        this.printRecieptjButton.setVisible(true);
        
        
        transactionDetailsjTable.setShowGrid(false);
        transactionDetailsjTable.setBackground(Color.green);
        //transactionDetailsjTable.setShowHorizontalLines(false);
        //transactionDetailsjTable.setShowVerticalLines(false);
        transactionDetailsjTable.getColumnModel().getColumn(0).setPreferredWidth(220);
        transactionDetailsjTable.getColumnModel().getColumn(4).setPreferredWidth(160);
        DefaultTableModel transactionDetails_dtm = (DefaultTableModel) transactionDetailsjTable.getModel();
        transactionDetails_dtm.setRowCount(0);

        try {
            while (transactionDetailsResultSet.next()) {
                String medName = transactionDetailsResultSet.getString("MedicineName");
                String Quantity = transactionDetailsResultSet.getString("Quantity");
                String salesPrice = transactionDetailsResultSet.getString("SalesPrice");
                String Discount = transactionDetailsResultSet.getString("Discount");
                String SalesDate = transactionDetailsResultSet.getString("SalesDate");

                transactionDetails_dtm.addRow(new Object[]{medName, Quantity, salesPrice, Discount, SalesDate});

            }

            System.out.println("transaction loaded sucessfully");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_TransactionHistoryTablejTableMouseClicked

    private void printRecieptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRecieptjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printRecieptjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
                displayTransactionHistory();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int rowToRemove = TransactionHistoryTablejTable.getSelectedRow();
        String transaction_ID = (String) TransactionHistoryTablejTable.getValueAt(rowToRemove, 0);
        if (rowToRemove == -1){
           JOptionPane.showMessageDialog(null, "Select Transaction to delete", "nothing to delete",
                JOptionPane.INFORMATION_MESSAGE);
        }else{
             transactions.deleteTransaction(transaction_ID);
             ((DefaultTableModel)TransactionHistoryTablejTable.getModel()).removeRow(rowToRemove);
             ((DefaultTableModel)TransactionHistoryTablejTable.getModel()).fireTableDataChanged();
           
        }
    }//GEN-LAST:event_deletejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TransactionHistoryTablejTable;
    public javax.swing.JButton deletejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printRecieptjButton;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JPanel saelesHistoryDetailsjPanel;
    private javax.swing.JScrollPane transactionDetailsjScrollPane;
    private javax.swing.JTable transactionDetailsjTable;
    private javax.swing.JPanel transactionHistoryjPanel;
    // End of variables declaration//GEN-END:variables
}