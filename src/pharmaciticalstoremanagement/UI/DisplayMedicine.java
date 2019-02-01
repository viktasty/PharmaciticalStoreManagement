/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmaciticalstoremanagement.UI;

/**
 *
 * @author MAJEED
 */
import BusinessLogic.medicine;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DisplayMedicine extends javax.swing.JPanel {

    ResultSet rs;
    DefaultTableModel dtm;

    /**
     * Creates new form DisplayMedicine
     */
    public DisplayMedicine() {

        initComponents();
        displayMedicine();
        deletejButton.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineInStoreTableScrollPane = new javax.swing.JScrollPane();
        medicineInStoreTable = new javax.swing.JTable();
        medInfojPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        medName = new javax.swing.JLabel();
        medManuf = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        medQuantity = new javax.swing.JLabel();
        refreshjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        medicineInStoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Medicine Name", "Quantity", "Sale Price", "Interest Rate", "Manufacturer", "Category", "Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        medicineInStoreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineInStoreTableMouseClicked(evt);
            }
        });
        medicineInStoreTableScrollPane.setViewportView(medicineInStoreTable);
        if (medicineInStoreTable.getColumnModel().getColumnCount() > 0) {
            medicineInStoreTable.getColumnModel().getColumn(0).setResizable(false);
        }

        medInfojPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine.png"))); // NOI18N
        jLabel1.setText("Medicine Name:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.jpg"))); // NOI18N
        jLabel4.setText("Manufaturer:");

        medName.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        medName.setForeground(new java.awt.Color(0, 0, 153));
        medName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medName.setText("medicine name ");

        medManuf.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        medManuf.setForeground(new java.awt.Color(0, 0, 204));
        medManuf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medManuf.setText("manufacture");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/price22.png"))); // NOI18N
        jLabel6.setText("Price:");

        medPrice.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        medPrice.setForeground(new java.awt.Color(0, 51, 153));
        medPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medPrice.setText("Price");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/quantity.png"))); // NOI18N
        jLabel3.setText("Quantity:");

        medQuantity.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        medQuantity.setForeground(new java.awt.Color(0, 0, 153));
        medQuantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medQuantity.setText("quantity");

        javax.swing.GroupLayout medInfojPanel1Layout = new javax.swing.GroupLayout(medInfojPanel1);
        medInfojPanel1.setLayout(medInfojPanel1Layout);
        medInfojPanel1Layout.setHorizontalGroup(
            medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medInfojPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(medInfojPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medManuf, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(medQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(medInfojPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medInfojPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(medInfojPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(91, 91, 91)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        medInfojPanel1Layout.setVerticalGroup(
            medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medInfojPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(medPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(medManuf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(medQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
            .addComponent(medicineInStoreTableScrollPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medInfojPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(refreshjButton)
                .addGap(61, 61, 61)
                .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(medicineInStoreTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medInfojPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshjButton)
                            .addComponent(deletejButton))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayMedicine() {
        medicineInStoreTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        medicineInStoreTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        medicineInStoreTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        medicineInStoreTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        medicineInStoreTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        medicineInStoreTable.getColumnModel().getColumn(5).setPreferredWidth(180);
        medicineInStoreTable.getColumnModel().getColumn(6).setPreferredWidth(200);
        medicineInStoreTable.getColumnModel().getColumn(7).setPreferredWidth(200);
        dtm = (DefaultTableModel) medicineInStoreTable.getModel();
        rs = medicine.getAllMedicine();
        dtm.setRowCount(0);
        try {
            while (rs.next()) {

                int id = rs.getInt("idMedicine");
                String name = rs.getString("MedicineName");
                String quantity = rs.getString("QuantityInStore");
                String sales_price = rs.getString("SalePrice");
                String rate = rs.getString("InterestRate");
                String manu = rs.getString("Manufacturer");
                String category = rs.getString("Category");
                String group = rs.getString("medGroup");

                dtm.addRow(new Object[]{id, name, quantity, sales_price, rate, manu, category, group});

                medName.setText(name);
                medQuantity.setText(quantity);
                medPrice.setText(sales_price);
                medManuf.setText(manu);

            }
            medicineInStoreTable.setDefaultRenderer(Object.class, setOutOfStockAlert());
         

            System.out.println("medicines loaded sucessfully");

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public DefaultTableCellRenderer setOutOfStockAlert() {
        return new DefaultTableCellRenderer() {
            int column = 2;
            int stockLimit = 20;

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(medicineInStoreTable, value, isSelected, hasFocus, row, column);
                String Quantity = (String) medicineInStoreTable.getValueAt(row, column);
                int qty = Integer.valueOf(Quantity);
                if (qty <= stockLimit) {
                    setBackground(Color.RED);
                    //setForeground(Color.WHITE);
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }
                return this;
            }
        };
    }

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int rowToRemove = medicineInStoreTable.getSelectedRow();
        int med_ID = (int) medicineInStoreTable.getValueAt(rowToRemove, 0);
        if (rowToRemove == -1){
           JOptionPane.showMessageDialog(null, "Select Medicine to delete", "nothing to delete",
                JOptionPane.INFORMATION_MESSAGE);
        }else{
             medicine.deleteMedicine(med_ID);
             ((DefaultTableModel)medicineInStoreTable.getModel()).removeRow(rowToRemove);
             ((DefaultTableModel)medicineInStoreTable.getModel()).fireTableDataChanged();
        }
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
      displayMedicine();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void medicineInStoreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineInStoreTableMouseClicked
        // TODO add your handling code here:
        int rowNum = medicineInStoreTable.getSelectedRow();
        Object med_name = medicineInStoreTable.getValueAt(rowNum, 1);
        Object med_quantity = medicineInStoreTable.getValueAt(rowNum, 2);
        Object med_price = medicineInStoreTable.getValueAt(rowNum, 3);
        Object med_manufacturer = medicineInStoreTable.getValueAt(rowNum, 5);

        medName.setText((String) med_name);
        medQuantity.setText((String) med_quantity);
        medPrice.setText((String) med_price);
        medManuf.setText((String) med_manufacturer);

    }//GEN-LAST:event_medicineInStoreTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton deletejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel medInfojPanel1;
    private javax.swing.JLabel medManuf;
    private javax.swing.JLabel medName;
    private javax.swing.JLabel medPrice;
    private javax.swing.JLabel medQuantity;
    private javax.swing.JTable medicineInStoreTable;
    private javax.swing.JScrollPane medicineInStoreTableScrollPane;
    private javax.swing.JButton refreshjButton;
    // End of variables declaration//GEN-END:variables
}
