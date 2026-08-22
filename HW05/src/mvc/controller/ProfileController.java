package mvc.controller;

import java.io.IOException;

import mvc.dto.Profile;
import mvc.dto.ResultType;
import mvc.dto.SearchResult;
import mvc.exception.DuplicateUserException;
import mvc.exception.InvalidPasswordException;
import mvc.exception.UserNotFoundException;
import mvc.service.ProfileService;
import mvc.service.ProfileServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;

/**
 * View 와 Model 사이에서 중간 역할 : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고, 호출한 결과를 받아서 결과값에 따라
 * 결과 뷰를 호출해준다.
 */
public class ProfileController {
	private ProfileService service = ProfileServiceImpl.getInstance();

	public void register(Profile profile) {
		try {
			service.insert(profile);
			SuccessView.printMessage("사용자 등록에 성공하였습니다.");
		} catch (DuplicateUserException | IOException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public SearchResult searchWeight(Profile profile) {
		try {
			Profile findProfile = service.search(profile);
			SuccessView.printWeight(findProfile);
			return new SearchResult(ResultType.SUCCESS, findProfile);
		} catch(InvalidPasswordException e) {
			FailView.errorMessage(e.getMessage());
			return new SearchResult(ResultType.INVALID_PASSWORD, null);
		} catch (UserNotFoundException | IOException | ClassNotFoundException e) {
			FailView.errorMessage(e.getMessage());
			return new SearchResult(ResultType.FAIL, null);
		}
	}

	public SearchResult searchPassword(Profile profile) {
		try {
			Profile findProfile = service.search(profile);
			SuccessView.printPassword(findProfile);
			return new SearchResult(ResultType.SUCCESS, findProfile);
		} catch(InvalidPasswordException e) {
			FailView.errorMessage(e.getMessage());
			return new SearchResult(ResultType.INVALID_PASSWORD, null);
		} catch (UserNotFoundException | IOException | ClassNotFoundException e) {
			FailView.errorMessage(e.getMessage());
			return new SearchResult(ResultType.FAIL, null);
		}
	}

	public void updateWeight(Profile profile) {
		try {
			service.update(profile);
			SuccessView.printMessage("몸무게 변경에 성공하였습니다.");
		} catch (IOException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	public void updatePassword(Profile profile) {
		try {
			service.update(profile);
			SuccessView.printMessage("비밀번호 변경에 성공하였습니다.");
		} catch (IOException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}