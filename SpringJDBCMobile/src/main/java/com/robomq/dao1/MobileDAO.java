package com.robomq.dao1;

import java.util.List;

import com.robomq.pojo1.Mobile;

public interface MobileDAO {
	Mobile getMobileById(int i);

	List<Mobile> getAllMobiles();

	boolean deleteMobile(Mobile mobile);

	boolean updateMobile(Mobile mobile);

	boolean createMobile(Mobile mobile);

}
