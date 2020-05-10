package jp.co.lsstyle.y.hiruta.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MSkill {

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
