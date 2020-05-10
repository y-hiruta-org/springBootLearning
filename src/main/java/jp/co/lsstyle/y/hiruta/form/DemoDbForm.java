package jp.co.lsstyle.y.hiruta.form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class DemoDbForm {

	private String title;
	private String skillId;
	private String tekiyoStrDay;
	private String tekiyoEndDay;
	private int sortJun;
	private String skillGpId;
	private String skillNm;
	private String skillKatiKbn;
	private Timestamp insDate;
	private String insUserId;
	private Timestamp updDate;
	private String updUserId;
}
