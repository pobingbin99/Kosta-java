package mvc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mvc.dto.Profile;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;

public class ProfileServiceImpl implements ProfileService {
	private static ProfileService instance = new ProfileServiceImpl();

	// 싱글톤 형태
	public static ProfileService getInstance() {
		return instance;
	}

	@Override
	public void insert(Profile profile) throws DuplicateUserException, IOException {
		File file = new File(profile.getName() + ".txt");

		// 이미 사용자가 존재하는 경우
		if (file.exists())
			throw new DuplicateUserException();

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(profile);
		}
	}

	@Override
	public Profile search(Profile profile)
			throws UserNotFoundException, InvalidPasswordException, IOException, ClassNotFoundException {
		File file = new File(profile.getName() + ".txt");

		// 사용자 파일이 존재하지 않는 경우
		if (!file.exists())
			throw new UserNotFoundException();

		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			Profile findProfile = (Profile) ois.readObject();

			// 비밀번호가 일치하지 않는 경우
			if (!findProfile.getPassword().equals(profile.getPassword()))
				throw new InvalidPasswordException();

			return findProfile;
		}
	}

	@Override
	public void update(Profile profile) throws IOException {
		File file = new File(profile.getName() + ".txt");

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(profile);
		}
	}
}