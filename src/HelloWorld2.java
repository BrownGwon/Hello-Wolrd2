import java.util.Scanner;

public class HelloWorld2 {
	public static void main(String[] args){
	
		
			    System.out.println("구구단 중 출력할 단은? : ");
				Scanner scanner = new Scanner(System.in); //문자 입력을 명령을 쓴다고 컴퓨터에게 알려줌
				
				
				int number = scanner.nextInt(); //scanner.nextInt(); <- 변수를 입력값으로 할당시켜주는것
				
				
				System.out.println("사용자가 입력한 값 : " + number);
		
				
				if (number < 2){
					System.out.println("입력값은 2~9까지 입력을 하셔야 됩니다.");
					System.out.println("구구단 중 출력할 단은? : ");
				
					System.out.println("사용자가 입력한 값 : " + number);
				}else if (number > 9){
					System.out.println("입력값은 2~9까지 입력을 하셔야 됩니다.");
					System.out.println("구구단 중 출력할 단은? : ");
				
					System.out.println("사용자가 입력한 값 : " + number);
					
					
				}else if (number < 9){
				
						
					for(int i = 1; i < 11;  i++){
						System.out.println(number * i);
				
						if(i == 9) {
							i = 0;
							number ++;
							if(number == 10)
								break;
							System.out.println("================ 새로운단수가 추가 되었습니다. " + number);	
						}

							
				}
								
				}
	}
}

							
				
				

		
		
		

		
		
		
		
		
	
//		System.out.println("만나서 반가워");
//		System.out.println("만나서 반가워");
//		
		
		
	
	

	
	
	





