package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("ramdom.txt","rw"); // ���ϸ�, ���� ���
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
	}

}
