package mvc.service;

import java.io.IOException;

import mvc.dto.Profile;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;

public interface ProfileService {
	/**
	 * 이름, 몸무게, 비밀번호를 담은 Profile 객체를 전달받아
	 * 이름.txt 문서를 만들어 Profile 객체를 저장한다.
	 * @param profile
	 * @throws DuplicateUserException, IOException
	 */
    public void insert(Profile profile) throws DuplicateUserException, IOException;
    
    /**
     * 이름, 비밀번호를 담은 Profile 객체를 전달받아
     * 비밀번호 일치 여부를 확인하고, 일치할 경우 Profile 객체를 반환한다.
     * @param Profile
     * @return Profile
     * @throws UserNotFoundException, InvalidPasswordException, IOException, ClassNotFoundException
     */
    public Profile search(Profile profile) throws UserNotFoundException, InvalidPasswordException, IOException, ClassNotFoundException;
    
    /**
     * 이름, 몸무게, 비밀번호를 담은 Profile 객체를 전달받아
     * 이름.txt 문서의 내용을 수정한다.
     * @param profile
     * @throws IOException
     */
    public void update(Profile profile) throws IOException;
}