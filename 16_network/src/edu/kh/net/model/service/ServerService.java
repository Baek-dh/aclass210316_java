package edu.kh.net.model.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerService {
	
	/* TCP
	 * - ����, Ŭ���̾�Ʈ���� 1:1 ���� ���(���� ������ ��������)
	 * 
	 * Socket : ���μ������� �� ����
	 * == ���μ������� ����� ���.
	 * ���� - ���� - Ŭ���̾�Ʈ  -> ������ input/outputStream�� ����
	 * 					   -> �� Stream�� ���� ���μ������� ������ ����� �̷����
	 * 
	 * ServerSocket : ������ ����
	 * - ��Ʈ�� ����Ǿ� �ܺ� ��û�� ��ٸ��� ����
	 *   -> Ŭ���̾�Ʈ�� ��û�� �� ��� �̸� �����ϰ� 
	 *      Ŭ���̾�Ʈ�� ����� �� �ִ� ���� ��ü�� ����
	 *      --> ������ ���ϰ� Ŭ���̾�Ʈ�� ������ ����Ǿ� ����� �̷������.
	 * */
	
	
	public void serverStart() {
		// 1) ������ ��Ʈ��ȣ�� ����
		int port = 8500; // ���� ���α׷��� ��Ʈ ��ȣ
		// ��Ʈ�� 0 ~ 65535 ���� ���� ���� ����(��, 1023 ���ϴ� ��� ����)
		
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null; // InputStream�� ���� ��Ʈ��
		PrintWriter pw = null; // OutputStream�� ���� ��Ʈ��
		
		ServerSocket serverSocket = null; // ������ ����
		Socket clientSocket = null; // Ŭ���̾�Ʈ�� ����
		
		try {
			// 2) ������ ���� ��ü ����
			serverSocket = new ServerSocket(port);
			// 8500�� ��Ʈ�� ������ ��û�� ���� ������ ������ ������
			
			// 3) Ŭ���̾�Ʈ�� ��û�� ���� ��ٸ�
			System.out.println("[Server]");
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �� ...");
			
			// 4) ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			clientSocket = serverSocket.accept();
			
			// ��û�� Ŭ���̾�Ʈ�� ������ �ּ� ������
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��!");
			
			// 5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 6) ���� ��Ʈ���� ���� ���� ����
			// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ�ϴ� ��ü
			br = new BufferedReader( new InputStreamReader(is)  );
			pw = new PrintWriter(os);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		
		
	}
	
	
}
