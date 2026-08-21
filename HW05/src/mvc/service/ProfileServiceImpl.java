package mvc.service;

import mvc.dto.Profile;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;

public class ProfileServiceImpl implements ProfileService {
	@Override
	public Profile search(Profile profile) throws UserNotFoundException, InvalidPasswordException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Profile profile) throws UserNotFoundException, InvalidPasswordException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Profile profile) throws DuplicateUserException {
		// TODO Auto-generated method stub
		
	}
}