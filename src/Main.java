import java.io.*; 
public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		String file_name = "src/taxi.csv";
		caliculator cal = new caliculator();
		int readingLine = 1;
		
		try {
			File file = new File(file_name);
			br = new BufferedReader(new FileReader(file));

			
			String line;
			String[] data;
			line = br.readLine();
			
			
			while ((line = br.readLine()) != null) {
				readingLine += 1;
				data = line.split(",");
				System.out.println(data[1]);
				
				if (data[1] == "����") {
					int x = cal.fare_OrdinaryCar(Integer.parseInt(data[2]),Integer.parseInt(data[3]));
					System.out.println(data[0] + ":" + x + "�~");
				}
				else if (data[1] == "��^") {
					int x = cal.fare_LargeCar(Integer.parseInt(data[2]), Integer.parseInt(data[3]));
					System.out.println(data[0] + ":" + x + "�~");
				}
				else {
					System.out.println( readingLine + "�s2��ڂ̃f�[�^�ɖ�肪�������Ă��܂�");
				}
				
			}
		}catch (NumberFormatException e) {
			System.out.println( readingLine + "�s3�`4��ڂ̃f�[�^�ɖ�肪�������Ă��܂�");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				br.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
