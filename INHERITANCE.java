import java.util.*;
class Employee {
	Scanner sc= new Scanner(System.in);//Scanner class Object
	String emp_name;//declaration of Employee name 
	String address;//declaration of address
	String mail_id;//declaration of mail id
	long mobile_no;//declaration of mobile no.
	int emp_id;//declaration of Employee ID
	double basic_pay;//declaration of basic pay
	static int id=10000;
	double net_salary,gross_salary;//declaration of net & gross Salary
	double hra,da,pf,staff_club_fund;//declaration of hra,da,pf,staff_club_fund
	
	 Employee(){//Constructor for Employee
		 id++;
	}
	 
	void input() {
	System.out.print("Enter the name of Employee: ");
	emp_name=sc.nextLine();//input Employee name
	System.out.print("Employee ID:  ");
	emp_id=sc.nextInt();//input Employee Employee ID
	emp_id=id;
	System.out.print("Enter Address:  ");
	address=sc.next();//input Employee address
	System.out.print("Enter Mobile No.:  ");
	mobile_no=sc.nextLong();//input Employee mobile no.
	}
	
	void display(){
		//display database for Employee
      	System.out.println("****************************************************************");
		System.out.println("EMP NAME\tID \tADDRESS\t\tMOBILE");
		System.out.println("****************************************************************");	     
System.out.println(emp_name+"\t\t"+emp_id+"\t"+address+"\t\t"+mobile_no +"\n");	
	}
	
	void salary(){
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		
		int k=0;
		while(k<3) {			//loop for bonus salary
			System.out.println("   DOES DO YO HAVE DONE ANY EXTRA WORK \n\t1. PATENT \n\t2. OTHER BENIFICIAL WORK \n\t3.NO  ");
			System.out.print("Choice::");
			k=sc.nextInt();
			if (k==1) //if input is 1
				gross_salary+=3000;
			else if(k==2)//if input is 2
				gross_salary+=2000;
			else if(k==3)//if input is 3
				break;
			else//if invaid choice
				System.out.println("INVALID CHOICE.");
		}
		
		net_salary=gross_salary-pf-staff_club_fund;
		//calculating net salary
		System.out.println("=================================================================================");
	}
	
	void salary_slip() {
		//printing salary slip of Employee
		System.out.println("****************************************************************");
		System.out.println(" BASIC   PAY 		:	"+basic_pay);
		System.out.println(" HRA 	    	       	:	"+hra);
		System.out.println(" PF   	    		       :	"+pf);
		System.out.println(" GROSS SALARY       	: 	"+gross_salary);
		System.out.println(" NET SALARY 	       	: 	"+ net_salary);
		System.out.println("****************************************************************");
	}
	

}


//************************ CLASS PROGRAMMER ************************//

class Programmer extends Employee{
//inheriting Employee class in Programmer class
		void read_programmer() {
			//input data from user for Programmer
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC PAY[30000-40000]: ");
			basic_pay=sc.nextDouble();
			if(basic_pay>40000 || basic_pay<30000) {
				//validation for basic_pay of Programmer
				System.out.println("SORRY!!!!!! BASIC  PAY FOR PROGRAMMER  MUST BETWEEN  [30000 - 40000]  \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}

			System.out.println("=================================================================================");
		}
		
		static void search(Programmer arr[],int key,int n) {
			//search for programmer in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Programmer found in database
					arr[i].display();//dispay database for programmer
					arr[i].salary_slip();//printing salary slip
				}
				else {
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  PROGRAMMERS  ");
				}		
			}
		}
	}


//************************ CLASS TEAMLEAD ************************//

class Teamlead extends Employee{
//inheriting Employee class in Teamlead class
		void read_teamlead() {
			//input data from user for Teamlead
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [40000 - 50000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>50000 || basic_pay<40000) {
				//validation for basic pay of Teamlead
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [40000 - 50000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Teamlead arr[],int key,int n) {
			//searching for teamlead in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if teamlead found in database
					arr[i].display();//dispay database for Teamlead
					arr[i].salary_slip();//printing salary slip
				}
				else {
					//if teamlead is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}
			}
		}
	}

//************************ CLASS aSST_PRO_MANAGER ************************//

class Asst_pro_manager extends Employee{
//inheriting Employee class in Asst_pro_manager class
		void read_Asst_pro_manager() {
			//input data from user for Asst_pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [50000 - 60000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>60000 || basic_pay<50000) {
				//validation for basic pay of Asst_pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [50000 - 60000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
		}
			System.out.println("=================================================================================");
	}
		
		static void search(Asst_pro_manager arr[],int key,int n) {
			//searching for Asst_pro_manager in database
			for(int i=0;i<n;i++) {
				if (arr[i].emp_id==key) {
					System.out.println("       EMPLOYEE  FOUND  ");
					//if Asst_pro_manager found in database
					arr[i].display();//dispay database for Asst_pro_manager
					arr[i].salary_slip();//printing salary slip	
				}
				else {
					//if Asst_pro_manager is not found in database
					System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
				}		
			}
		}
	}

//************************ CLASS PRO_MANAGER ************************//

class Pro_manager extends Employee{
	void read_Pro_manager() {
		//input data from user for Pro_manager
			input();
			boolean a=false;
			while(a==false) {
			System.out.print("BASIC   PAY  [60000 - 70000] : ");
			basic_pay=sc.nextDouble();
			if(basic_pay>70000 || basic_pay<60000) {
				//validation for basic pay of pro_manager
				System.out.println("SORRY!!!!!! BASIC  PAY FOR TEAMLEAD  MUST BETWEEN  [60000 - 70000] \nTRY AGAIN.....");
				a=false;
			}
			else
				a=true;
			}
			System.out.println("=================================================================================");
	}
		
		static void search(Pro_manager arr,int key) {
			//searching for pro_manager in database
			if (arr.emp_id==key) {
				System.out.println("       EMPLOYEE  FOUND  ");
				//if pro_manager found in database
				arr.display();//dispay database for Pro_manager
				arr.salary_slip();//printing salary slip
			}
			else {
				//if pro_manager is not found in database
				System.out.println("  EMPLOYEEE   WITH  ID  "+ key +"  NOT FOUND IN  TEAMLEAD  ");
			}
		}
	}

//************************ CLASS MAIN ************************//

public class Main {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Programmer p[]=new Programmer[3];			 
			//array of obj for Programmer
			Teamlead t[]=new Teamlead[3];                
			//array of obj for Teamlead
			Asst_pro_manager a[]=new Asst_pro_manager[2];
			//array of obj for Asst_pro_manager
			Pro_manager m=new Pro_manager();			 
			//array of obj for Pro_manager
			aa:
			do {
				//menu driven program
				System.out.println("=================================================================================");
				System.out.println(" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EMPLOYEE SEARCH \n6.EXIT");
				System.out.print("Choice::");
				int k=sc.nextInt();//input choice from user
				System.out.println("=================================================================================");
				int op;
				int assign1=0,assign2=0,assign3=0,assign4=0;		
				//variable to check memory is allocated or not for each class 
				switch(k) {
				
				case 1://if input from user is 1
					do {
						System.out.print("\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
						op=sc.nextInt();
						//input choice from user
						System.out.println("=================================================================================");
						if(op==1)//if input from user is 1
						{
							assign1=6;
							for (int i=0;i<3;i++) {
								p[i]=new Programmer();
								//creating object of Programmer
								p[i].read_programmer();
								//taking input for Programmer
								p[i].salary();
								//printing salary of Programmer
							}
						}
						else if(op==2  && assign1==6)
						{
							for (int i=0;i<3;i++) {
								p[i].display();
							//display database for programmer
								p[i].salary_slip();
							//printing salary slip of Programmer
							}
						}
						else if(op==2 && assign1!=6)
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
				
				case 2://if input from user is 2
					do {
						System.out.print("\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign2=4;
							for (int i=0;i<3;i++) {
								t[i]=new Teamlead();
								//creating object of teamlead
								t[i].read_teamlead();
								//taking input for teamlead
								t[i].salary();
								//printing salary of teamlead
							}
						}
						else if(op==2 && assign2==4)
						{
							for (int i=0;i<3;i++) {
								t[i].display();
								//display database for teamlead
								t[i].salary_slip();
							//printing salary slip of teamlead
						}
					}
						else if(op==2 && assign1!=6) 
							System.out.println("  MEMORY  NOT  ALLOCATED  TO  TEAMLEADS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 3://if input from user is 3
					do {
						System.out.print("\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
							assign3=2;
							for (int i=0;i<2;i++) {
								a[i]=new Asst_pro_manager();
							//creating object of Assistant_Manager
								a[i].read_Asst_pro_manager();
							//taking input for Assistant_Manager
								a[i].salary();
							//printing salary of Assistant_Manager
							}
						}
						else if(op==2 && assign3==2)
						{
							for (int i=0;i<2;i++) {
								a[i].display();
						//display database for Assistant_Manager
								a[i].salary_slip();
						//printing salary slip of Assistant_Manager
						}
					}
						else if(op==2 && assign1!=6) 										System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 4://if input from user is 4
					do {
						System.out.print("\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
						op=sc.nextInt();
						System.out.println("===================================================================================================");
						if(op==1)
						{
								assign4=1;
								m.read_Pro_manager();
							//taking input for Project_Manager
								m.salary();
							//printing salary of Project_Manager
						}
						else if(op==2 && assign4==1)
						{
								m.display();
							//display database for Project_Manager
								m.salary_slip();
						//printing salary slip of Project_Manager
						}
						else if(op==2 && assign1!=6) System.out.println("  MEMORY  NOT  ALLOCATED  TO  PROGRAMMERS  DETAIL  YET...  ");
						System.out.println("===================================================================================================");
					}while(op!=3);
					break;
					
				case 5://if input from user is 5
					String des;
					int key;
					System.out.print("ENTER  THE  DISIGNATION  OF  EMPLOYEE  YOU  WANT  TO  SEARCH : ");
					des=sc.next();
					//taking input from user
					System.out.print("Enter Emplyee ID:");
					key=sc.nextInt();
					//taking Emplyee ID from user
					if(des.toLowerCase().equals("programmer"))
					{
						//searching for programmer in database
						Programmer.search(p,key,6);
					}
					else if(des.toLowerCase().equals("teamlead"))
					{
						//searching for teamlead in database
						Teamlead.search(t, key, 4);
					}
					else if(des.toLowerCase().equals("assistant"))
					{
						//searching for assistant in database
						Asst_pro_manager.search(a, key, 2);
					}
					else if(des.toLowerCase().equals("manager"))
					{
						//searching for manager in database
						Pro_manager.search(m, key);
					
					}
					else {
						//if invalid input
						System.out.println("INVALID INPUT");
					}
					System.out.println("===================================================================================================");
					break;
					
				case 6://if input from user is 6
					System.out.print("Would you like to Exit\n\t1.YES\n\t2.No\n\tChoice::");
					int temp=sc.nextInt();
					if(temp==1)//checking for breaking loop
						break aa;//breaking menu bar
					
				default://default 
					System.out.println("   INVALID   ");
				}
				
			}while(true);
			sc.close();//closing scanner class object
		}
}