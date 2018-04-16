package Excelsheet;

public class DATA extends Library{

	public DATA(String filename) {
		super(filename);
	}

	public static void main(String[] args) {

		Library object=new Library("C:\\Users\\ACER\\Desktop\\mydata.xlsx");
		System.out.println(getData(0,0,0));
		
		
	}

}
