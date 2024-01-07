import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFunctions {

    static	int totalRow = 20;
	static	int totalColumn = 8;
	static String Bank_Client[][]= new String[totalRow][totalColumn];
	static  int Client_ID = 1;
    static String Ac_No,Ac_Pin,Oldpw,Newpw,Renewpw;
	static boolean accountnumberfound = false;

    public static void databaseinitialization()throws Exception{

		File database = new File("bankclient.database");
		Scanner ScF = new Scanner(database);
		int i=0;
		while(ScF.hasNext()){
			String raws = ScF.nextLine();
			try (Scanner ScR = new Scanner(raws)) {
				ScR.useDelimiter("#");
				Bank_Client[i][0] = ScR.next();
				Bank_Client[i][1] = ScR.next();
				Bank_Client[i][2] = ScR.next();
				Bank_Client[i][3] = ScR.next();
				Bank_Client[i][4] = ScR.next();
				Bank_Client[i][5] = ScR.next();
				Bank_Client[i][6] = ScR.next();
				Bank_Client[i][7] = ScR.next();
			}
			i++;
		}
		totalRow = i;
		ScF.close();

	}
	public static boolean AccountisInvalid(){
		boolean accountnumberfound = true;
		for(int x=1;x<=totalRow;x++){
			if(Ac_No.equalsIgnoreCase(Bank_Client[x][1])){
			accountnumberfound = true;
			Client_ID = x;
			break;
			}else{
				accountnumberfound = false;	
				
			}
		}
		if(accountnumberfound){
			return false;
		}else{
			return true;
		}
	}
	public static boolean PinisInvalid(){
		if(Ac_Pin.equalsIgnoreCase(Bank_Client[Client_ID][4])){
			return false;
		}else{
			return true;
		}
	}
	public static boolean isLocalbank(){
		String AccountStats = "ture";
		if(AccountStats.equalsIgnoreCase(Bank_Client[Client_ID][7])){
			return true;
		}else{
			return false;
		}

	}
	public static boolean isSMSActivated(){
		String AccountStats = "Active";
		if(AccountStats.equalsIgnoreCase(Bank_Client[Client_ID][6])){
			return true;
		}else{
			return false;
		}

	}
	public static void databaseshow(){
		for(int x=0;x<10;x++){
			for(int i=0;i<8;i++){
				if(Bank_Client[x][i]==null){
					break;
				}
				System.out.printf("%20s \t",Bank_Client[x][i]);
			}
			if(Bank_Client[x][0]==null){
				break;
			}
			System.out.println("");
		}
	}
	public static void databasefinalizeing(){
		try (FileWriter writer = new FileWriter("bankclient.database")) {
			for(int x=0;x<10;x++){
				for(int i=0;i<8;i++){
					if(Bank_Client[x][i]==null){
						break;
					}
						writer.write(Bank_Client[x][i]+"#");
					
				}
				if(Bank_Client[x][0]==null){
					break;
				}
				writer.write("\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
    
}
