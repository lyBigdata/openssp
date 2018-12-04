package ai.houyi.openssp.mapper;

import ai.houyi.openssp.model.MediaAdPosition;
import ai.houyi.openssp.model.example.MediaAdPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaAdPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    long countByExample(MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int deleteByExample(MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int insert(MediaAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int insertSelective(MediaAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MediaAdPosition selectOneByExample(MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    List<MediaAdPosition> selectByExample(MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    MediaAdPosition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") MediaAdPosition record, @Param("example") MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByExample(@Param("record") MediaAdPosition record, @Param("example") MediaAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByPrimaryKeySelective(MediaAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByPrimaryKey(MediaAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<MediaAdPosition> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_ad_position
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<MediaAdPosition> list, @Param("selective") MediaAdPosition.Column ... selective);
}