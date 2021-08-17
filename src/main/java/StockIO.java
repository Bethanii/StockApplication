/********************************************************** 
Program Name: Stocks4You.java
Programmer's Name: Bethany Hampton
Program Description: This application will allow you to add and delete stocks, and see the profit or loss you would make.
***********************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author hambetn
 */
public class StockIO {
    private String fileName;
    
    public StockIO(){
        fileName = "Stocks.txt";
    }
    public StockIO(String fileName){
        setFileName(fileName);
    }
    public ArrayList<Stock> getData(){
        ArrayList<Stock>data = new ArrayList<Stock>();

        try{
            BufferedReader inFile = new BufferedReader(new FileReader(fileName));
            String inputLine = "";
            StringTokenizer tokens;
            
            inputLine = inFile.readLine();
            
            While(inputLine != null);
                    {
                        tokens = new StringTokenizer(inputLine, ",");
                        String company = tokens.nextToken();
                        double shares = Double.parseDouble(tokens.nextToken());
                        double pPrice = Double.parseDouble(tokens.nextToken());
                        double cPrice = Double.parseDouble(tokens.nextToken());
                        
                        Stock stk = new Stock(company, shares, pPrice, cPrice);
                        data.add(stk);
                        
                        inputLine = inFile.readLine();
                    }
                    inFile.close();
        }
   
        catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error unable to write to the file" 
                    + ex.getMessage(), fileName, JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }
    public void saveData(ArrayList<Stock> data){
        try{
        BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName));
    
        for(int i = 0; i<data.size(); i++){
            Stock stk = data.get(i);
            outFile.write(stk.getCompanyName()+',');
            outFile.write(""+stk.getNumberOfShares()+',');
            outFile.write(""+stk.getPurchasePrice()+',');
            outFile.write(""+stk.getCurrentPrice()+',');
            outFile.newLine();
        }
        outFile.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error unable to write to the file" 
                    + ex.getMessage(), fileName, JOptionPane.ERROR_MESSAGE);
        }
        }
    public String getFileName(){
        return fileName;
    }
    public void setFileName(String fileName){
        if(fileName.length()>0)
            this.fileName=fileName;
        else
            this.fileName="Stocks.txt";
    }

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
