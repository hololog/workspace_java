package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex2 {
	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("C:\\temp\\data.txt"))){
			
			dos.writeInt(10);
			dos.writeDouble(3.14);
			dos.writeUTF("홍길동");
			
		} catch(FileNotFoundException e) {
			// FileOutputStream 에서 지정한 경로가 존재하지 않을 경우 예외 발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\temp\\data.txt"))){
			int num = dis.readInt();
			double dNum = dis.readDouble();
			String str = dis.readUTF();
			
			System.out.println(num);
			System.out.println(dNum);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
	
	
}
