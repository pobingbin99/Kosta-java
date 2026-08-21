package mvc.service;

import mvc.dto.Profile;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;

public interface ProfileService {
	/**
	 * 이름, 몸무게, 비밀번호를 담은 Profile 객체를 전달받아
	 * 이름.txt 문서를 만들어 객체를 직렬화하여 저장한다.
	 * @param profile
	 * @throws DuplicateUserException
	 */
    public void insert(Profile profile) throws DuplicateUserException;
    
    /**
     * 이름, 비밀번호를 담은 Profile 객체를 전달받아
     * 비밀번호 일치 여부를 확인하고,
     * 일치할 경우 Profile 객체를 반환한다.
     * @param Profile
     * @return Profile
     * @throws UserNotFoundException
     * @throws InvalidPasswordException
     */
    public Profile search(Profile profile) throws UserNotFoundException, InvalidPasswordException;
    
    /**
     * 이름, 비밀번호를 담은 Profile 객체를 전달받아
     * 비밀번호 일치 여부를 확인하고,
     * 일치할 경우 사용자의 몸무게를 변경한다.
     * @param profile
     * @throws UserNotFoundException
     * @throws InvalidPasswordException
     */
    public void update(Profile profile) throws UserNotFoundException, InvalidPasswordException;
}