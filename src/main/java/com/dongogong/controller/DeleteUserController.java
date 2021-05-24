package com.dongogong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dongogong.domain.UserInfo;

//회원삭제 컨트롤러
public class DeleteUserController {
/*	
	private static final Logger log = LoggerFactory.getLogger(DeleteUserController.class);

	public String execute(HttpServletRequest request, HttpServletResponse response)   throws Exception {
      String deleteId = request.getParameter("userId");
      log.debug("Delete User : {}", deleteId);

      UserService manager = UserService.getInstance();      
      HttpSession session = request.getSession();   
   
      if ((UserSession.isLoginUser("admin", session) &&    // 로그인한 사용자가 관리자이고    
          !deleteId.equals("admin"))                     // 삭제 대상이 일반 사용자인 경우, 
            ||                                     // 또는 
         (!UserSession.isLoginUser("admin", session) &&  // 로그인한 사용자가 관리자가 아니고 
        		 UserSession.isLoginUser(deleteId, session))) { // 로그인한 사용자가 삭제 대상인 경우 (자기 자신을 삭제)
            
         manager.deleteUser(deleteId);
      }
      else {
         // 삭제가 불가능한 경우 
         UserInfo user = manager.findUser(deleteId);   // 사용자 정보 검색
         request.setAttribute("userInfo", user);                  
         request.setAttribute("deleteFailed", true);
         
         String msg = (UserSession.isLoginUser("admin", session)) 
                  ? "시스템 관리자 정보는 삭제할 수 없습니다."      
                  : "타인의 정보는 삭제할 수 없습니다.";   
         request.setAttribute("exception", new IllegalStateException(msg)); 
      }
      return "/user/loginForm.jsp";   
   }
	
	
	public ModelAndView handleRequest(
			@RequestParam("user_id") String userId,
			@ModelAttribute("user") UserInfo user
			) throws Exception {
			
	}
*/
}