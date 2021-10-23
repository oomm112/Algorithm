package backjoon;

/*사진을 관리하는 서비스에 대한 API를 설계해주세요.
각 사용자를 등록/수정/삭제/조회하고 각 사용자별 사진을 등록/수정/삭제/조회하는 각 API를 설계해주세요.

답안은 리눅스 콘솔에서 curl 커맨드로 실행 하였을 때 나오는 결과에 대한 예제로 만들어주세요.

다음은 사용자 리스트를 조회하는 API를 리눅스 콘솔에서 curl 커맨드로 실행 하였을 때 나오는 결과에 대한 샘플입니다.

curl -X GET https://app.com/users
{
  "users": [
    {
      "user_no": 1,
      "user_id": "user1",
      "user_name": "user1"
    },
    {
      "user_no": 2,
      "user_id": "user2",
      "user_name": "user2"
    }
  ]
}

답안 입력 (공백제외 0자 / 공백포함 0자)
마지막 저장 시간 (2021-10-23 11:19:53)
→ 이곳에 답안을 입력하세요
*/
public class Cafe24Backend_m1 {
	class user{
		private String user_name;
		private String user_id;
		private int user_no;
		
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public int getUser_no() {
			return user_no;
		}
		public void setUser_no(int user_no) {
			this.user_no = user_no;
		}	
	}
}
