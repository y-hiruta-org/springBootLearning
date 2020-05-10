package jp.co.lsstyle.y.hiruta.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.co.lsstyle.y.hiruta.entity.MSkill;

@Mapper
public interface  MSkillMapper {

	MSkill findByPrimaryKey(MSkill mSkill);
	Integer findByPrimaryKey2(MSkill mSkill);

}
