package ex0820;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProfileService {

    public void insert(Profile profile) throws IOException {
        File file = new File(profile.getName() + ".txt");

        if (!file.createNewFile()) throw new IOException("이미 존재하므로 다시 입력하세요.");

        String data = profile.getWeight() + ":" + profile.getPassword();
        
        FileOutputStream fos = null;
        
        try {
        	fos = new FileOutputStream(file);
            fos.write(data.getBytes());
        } catch(IOException e) {
        	e.printStackTrace();
        } finally {
        	try {
				if (fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
        }
    }

    public Profile search(String name) throws IOException {
        File file = new File(name + ".txt");

        if (!file.exists()) throw new IOException(name + "에 해당하는 정보는 없습니다.");

        FileInputStream fis = null;
        
        try {
        	fis = new FileInputStream(file);
        	
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            String str = new String(data);
            String[] arr = str.split(":");

            int weight = Integer.parseInt(arr[0]);
            int password = Integer.parseInt(arr[1]);

            return new Profile(name, weight, password);
        } catch(IOException e) {
        	e.printStackTrace();
        } finally {
        	try {
				if (fis != null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
        }
		return null;
    }
}