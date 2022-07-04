package com.tcdt.qlnvluukho.service;

import com.tcdt.qlnvluukho.repository.QlnvDmDonviRepository;
import com.tcdt.qlnvluukho.table.catalog.QlnvDmDonvi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcdt.qlnvluukho.jwt.CustomUserDetails;
import com.tcdt.qlnvluukho.repository.UserActionRepository;
import com.tcdt.qlnvluukho.repository.UserHistoryRepository;
import com.tcdt.qlnvluukho.repository.UserInfoRepository;
import com.tcdt.qlnvluukho.table.UserAction;
import com.tcdt.qlnvluukho.table.UserHistory;
import com.tcdt.qlnvluukho.table.UserInfo;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserInfoRepository userRepository;
	@Autowired
	UserHistoryRepository userHistoryRepository;

	@Autowired
	UserActionRepository userActionRepository;

	@Autowired
	private QlnvDmDonviRepository qlnvDmDonviRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserInfo user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		QlnvDmDonvi dvi = qlnvDmDonviRepository.findByMaDvi(user.getDvql());
		user.setMaQd(dvi.getMaQd());
		user.setMaTr(dvi.getMaTr());
		user.setMaKhqlh(dvi.getMaKhqlh());
		user.setMaKtbq(dvi.getMaKtbq());
		user.setMaTckt(dvi.getMaTckt());
		user.setCapDvi(dvi.getCapDvi());
		user.setTenDvi(dvi.getTenDvi());
		return new CustomUserDetails(user);
	}

	public Iterable<UserAction> findAll() {
		return userActionRepository.findAll();
	}

	public void saveUserHistory(UserHistory userHistory) {
		userHistoryRepository.save(userHistory);
	}

}