import java.io.IOException;
import java.util.Scanner;


public class test {


	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("输入平台的右上角坐标:");
		Scanner inScanner=new Scanner(System.in);
		String coord=inScanner.nextLine();
		String[] st=coord.split(" ");
		int xMax=Integer.parseInt(st[0]);
		int yMax=Integer.parseInt(st[1]);
		Car car=new Car();
		while (true){
			String scar=inScanner.nextLine();
			String[] str=scar.split(" ");
			car.setX(Integer.parseInt(str[0]));
			car.setY(Integer.parseInt(str[1]));
			car.setDirection(str[2].charAt(0));
			String order=inScanner.nextLine();
			car.operation(xMax, yMax,order);//调用方法处理操作指令
			System.out.println(car.toString());
		}
	}


}
