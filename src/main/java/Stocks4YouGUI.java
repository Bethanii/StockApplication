/********************************************************** 
Program Name: Stocks4You.java
Programmer's Name: Bethany Hampton
Program Description: This application will allow you to add and delete stocks, and see the profit or loss you would make.
***********************************************************/

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Stocks4YouGUI extends javax.swing.JFrame {

 private DefaultListModel<Stock> model;
    //
    public Stocks4YouGUI() {
        model = new DefaultListModel<Stock>();
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        CalculateTotalValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabMain = new javax.swing.JTabbedPane();
        pnlStockList = new javax.swing.JPanel();
        lstStocks = new javax.swing.JScrollPane();
        lstStock = new javax.swing.JList<>();
        lblProfitLoss = new javax.swing.JLabel();
        btnRemoveStock = new javax.swing.JButton();
        lblTotalValue = new javax.swing.JLabel();
        pnlAddStock = new javax.swing.JPanel();
        lblQuantity = new javax.swing.JLabel();
        lblStockName1 = new javax.swing.JLabel();
        lblCurrentPrice = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtCurrentPrice = new javax.swing.JTextField();
        txtStockName = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        mnbMainMenu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lstStocks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lstStock.setModel(model);
        lstStock.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStockValueChanged(evt);
            }
        });
        lstStocks.setViewportView(lstStock);
        lstStock.getAccessibleContext().setAccessibleParent(lstStock);

        lblProfitLoss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProfitLoss.setText("Profit / Loss");

        btnRemoveStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemoveStock.setText("Remove Stock");
        btnRemoveStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStockActionPerformed(evt);
            }
        });

        lblTotalValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalValue.setText("Total Value: ");

        javax.swing.GroupLayout pnlStockListLayout = new javax.swing.GroupLayout(pnlStockList);
        pnlStockList.setLayout(pnlStockListLayout);
        pnlStockListLayout.setHorizontalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lstStocks)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfitLoss)
                    .addGroup(pnlStockListLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnRemoveStock))
                    .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        pnlStockListLayout.setVerticalGroup(
            pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockListLayout.createSequentialGroup()
                .addComponent(lstStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlStockListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockListLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblProfitLoss)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalValue)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStockListLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveStock)
                        .addContainerGap())))
        );

        tabMain.addTab("List", pnlStockList);

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity");

        lblStockName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStockName1.setText("Stock Name: ");

        lblCurrentPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCurrentPrice.setText("Current Price: ");

        lblPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPurchasePrice.setText("Purchase Price: ");

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCurrentPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtStockName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddStockLayout = new javax.swing.GroupLayout(pnlAddStock);
        pnlAddStock.setLayout(pnlAddStockLayout);
        pnlAddStockLayout.setHorizontalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddStockLayout.createSequentialGroup()
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblCurrentPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblPurchasePrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddStockLayout.createSequentialGroup()
                        .addComponent(lblStockName1)
                        .addGap(58, 58, 58)
                        .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(pnlAddStockLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnAddStock)
                .addContainerGap())
        );
        pnlAddStockLayout.setVerticalGroup(
            pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddStockLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStockName1)
                    .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasePrice)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPrice)
                    .addComponent(txtCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddStock)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tabMain.addTab("Add Stock", pnlAddStock);

        mnuFile.setText("File");

        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnuFile.add(mniOpen);

        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mniSave);
        mnuFile.add(jSeparator1);

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        mnbMainMenu.add(mnuFile);

        setJMenuBar(mnbMainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        if(txtStockName.getText().equals("")){
            JOptionPane.showConfirmDialog(this, "Stock name is required", "Error, missing information", JOptionPane.ERROR_MESSAGE);
            txtStockName.requestFocus();
            return;
        }
        if(txtQuantity.getText().equals("")){
            JOptionPane.showConfirmDialog(this, "Quantity is required", "Error, missing information", JOptionPane.ERROR_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
       if(txtPurchasePrice.getText().equals("")){
            JOptionPane.showConfirmDialog(this, "Purchase Price is required", "Error, missing information", JOptionPane.ERROR_MESSAGE);
            txtPurchasePrice.requestFocus();
            return;
       }
       if(txtCurrentPrice.getText().equals("")){
            JOptionPane.showConfirmDialog(this, "Current Price is required", "Error, missing information", JOptionPane.ERROR_MESSAGE);
            txtCurrentPrice.requestFocus();
            return;
    }//GEN-LAST:event_btnAddStockActionPerformed
    double quantity = 0.0;
       try{
        Double.parseDouble(txtQuantity.getText());
        } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", 
                "Error. Invalid Data", JOptionPane.ERROR_MESSAGE);
        txtQuantity.requestFocus();
        return;
    }
       double purchasePrice = 0.0;
       try{
        Double.parseDouble(txtPurchasePrice.getText());
    } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", 
                "Error. Invalid Data", JOptionPane.ERROR_MESSAGE);
        txtPurchasePrice.requestFocus();
        return;
    }
    double currentPrice = 0.0;
       try{
        Double.parseDouble(txtCurrentPrice.getText());
    } catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Invalid input. Please use numbers only.", 
                "Error. Invalid Data", JOptionPane.ERROR_MESSAGE);
        txtCurrentPrice.requestFocus();
        return;
    }
    String stockName = txtStockName.getText();
    quantity = Double.parseDouble(txtQuantity.getText());
    purchasePrice = Double.parseDouble(txtPurchasePrice.getText());
    currentPrice = Double.parseDouble(txtCurrentPrice.getText());
    Stock stk = new Stock(stockName, quantity, purchasePrice, currentPrice);
    
    model.addElement(stk);
    
    CalculateTotalValue();
    
    txtStockName.setText("");
    txtQuantity.setText("");
    txtPurchasePrice.setText("");
    txtCurrentPrice.setText("");
    txtStockName.requestFocus();
    }
    private void lstStockValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStockValueChanged
        Stock stk = lstStock.getSelectedValue();
        
        if(stk != null){
          double profitLoss = stk.getProfitLoss();
          DecimalFormat fmt = new DecimalFormat("#, ##0.00");
          if(profitLoss > 0.0)
              lblProfitLoss.setText("Profit of "+ fmt.format(profitLoss));
          else if(profitLoss < 0.0)
              lblProfitLoss.setText("Loss of " + fmt.format(profitLoss));
          else
              lblProfitLoss.setText("Breakeven with zero profit/loss");
        }
    }//GEN-LAST:event_lstStockValueChanged

    private void btnRemoveStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStockActionPerformed
    int index = lstStock.getSelectedIndex();
    if(index >= 0){
    model.remove(index);
    lblProfitLoss.setText("Profit / Loss: ");
    
    CalculateTotalValue();
    }
    }//GEN-LAST:event_btnRemoveStockActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        String fileName = JOptionPane.showInputDialog("Enter filename: ");
        
        StockIO outToFile = new StockIO(fileName);
        
        ArrayList<Stock>data = new ArrayList<Stock>();
        
        for(int i = 0; i < model.size(); i++)
        {
            Stock stk = model.elementAt(i);
            data.add(stk);
        }
        outToFile.saveData(data);
        
        JOptionPane.showMessageDialog(this, "Data was saved to the file");
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        String fileName = JOptionPane.showInputDialog("Enter filename: ");
        
        StockIO inFromFile = new StockIO(fileName);
        
        ArrayList<Stock> data = inFromFile.getData();
        
        model.clear();
        
        for(int i = 0; i<data.size(); i++)
        {
            Stock stk = data.get(i);
            model.addElement(stk);
        }
        CalculateTotalValue();
    }//GEN-LAST:event_mniOpenActionPerformed

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
            java.util.logging.Logger.getLogger(Stocks4YouGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks4YouGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks4YouGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks4YouGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks4YouGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnRemoveStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStockName1;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JList<Stock> lstStock;
    private javax.swing.JScrollPane lstStocks;
    private javax.swing.JMenuBar mnbMainMenu;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JPanel pnlAddStock;
    private javax.swing.JPanel pnlStockList;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextField txtCurrentPrice;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables

    private void CalculateTotalValue() {
         double totalValue = 0.0;
         
         for(int i = 0; i < model.size(); i ++)
         {
             Stock stk = model.elementAt(i);
             totalValue += stk.getCurrentPrice()*stk.getNumberOfShares();
         }
         DecimalFormat fmt = new DecimalFormat("$#,##0.00");
         lblTotalValue.setText("Total Value: " +fmt.format(totalValue));      
    }
}
