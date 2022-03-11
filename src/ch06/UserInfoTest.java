package ch06;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "Seoul";
		System.out.println(userLee.showUserInfo());
		
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		System.out.println(userKim.showUserInfo());
	}
}
