
public class Car {

	private int x;
	private int y;
	private char direction;
	public int getX() {
		return x;
	}
	public Car() {
		super();
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public char getDirection() {
		return direction;
	}
	public void setDirection(char direction) {
		this.direction = direction;
	}
	public void turn(char order){//转向
		/**
		 * 判断当前车的朝向，如果朝向为'N',则左转为'W'，右转为'E',其他方向以此类推
		 */
		if(this.direction=='N'){
			if(order=='L'){
				this.direction='W';
			}else if(order=='R'){
				this.direction='E';
			}else{}//防止错误输入，不做处理。
		}else if(this.direction=='E'){
			if(order=='L'){
				this.direction='N';
			}else if(order=='R'){
				this.direction='S';
			}else{}
		}else if(this.direction=='S'){
			if(order=='L'){
				this.direction='E';
			}else if(order=='R'){
				this.direction='W';
			}else{}
		}else{
			if(order=='L'){
				this.direction='S';
			}else if(order=='R'){
				this.direction='N';
			}else{}
		}
	}
	
	public void move(int xMax,int yMax){//移动
		if(this.direction=='N'){
			if(y+1<=yMax)y++;//超限处理
		}else if(this.direction=='S'){
			if(y-1>=0)y--;
		}else if(this.direction=='E'){
			if(x+1<=xMax)x++;
		}else if(this.direction=='W'){
			if(x-1>=0)x--;
		}else{}
	}
	@Override
	public String toString(){
		return x + " " + y + " " + direction;
	}
	public void operation(int xMax,int yMax,String order){//处理指令，传入最大的坐标和指令
		for(int i=0;i<order.length();i++){
			if(order.charAt(i)=='M'){
				move(xMax, yMax);
			}else if(order.charAt(i)=='L' || order.charAt(i)=='R'){
				turn(order.charAt(i));
			}else{}//错输入做处理
				
			}
			
		}
	
}
