package ai.houyi.openssp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaFloor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer mediaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.ad_position_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer adPositionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.traffic_attrs
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String trafficAttrs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer floor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column media_floor.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.id
     *
     * @return the value of media_floor.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.id
     *
     * @param id the value for media_floor.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.media_id
     *
     * @return the value of media_floor.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getMediaId() {
        return mediaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.media_id
     *
     * @param mediaId the value for media_floor.media_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.ad_position_id
     *
     * @return the value of media_floor.ad_position_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getAdPositionId() {
        return adPositionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.ad_position_id
     *
     * @param adPositionId the value for media_floor.ad_position_id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setAdPositionId(Integer adPositionId) {
        this.adPositionId = adPositionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.traffic_attrs
     *
     * @return the value of media_floor.traffic_attrs
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getTrafficAttrs() {
        return trafficAttrs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.traffic_attrs
     *
     * @param trafficAttrs the value for media_floor.traffic_attrs
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setTrafficAttrs(String trafficAttrs) {
        this.trafficAttrs = trafficAttrs == null ? null : trafficAttrs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.floor
     *
     * @return the value of media_floor.floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.floor
     *
     * @param floor the value for media_floor.floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column media_floor.status
     *
     * @return the value of media_floor.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column media_floor.status
     *
     * @param status the value for media_floor.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static MediaFloor.Builder builder() {
        return new MediaFloor.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private MediaFloor obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new MediaFloor();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.id
         *
         * @param id the value for media_floor.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.media_id
         *
         * @param mediaId the value for media_floor.media_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mediaId(Integer mediaId) {
            obj.setMediaId(mediaId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.ad_position_id
         *
         * @param adPositionId the value for media_floor.ad_position_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder adPositionId(Integer adPositionId) {
            obj.setAdPositionId(adPositionId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.traffic_attrs
         *
         * @param trafficAttrs the value for media_floor.traffic_attrs
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder trafficAttrs(String trafficAttrs) {
            obj.setTrafficAttrs(trafficAttrs);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.floor
         *
         * @param floor the value for media_floor.floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder floor(Integer floor) {
            obj.setFloor(floor);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column media_floor.status
         *
         * @param status the value for media_floor.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public MediaFloor build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        mediaId("media_id", "mediaId", "INTEGER", false),
        adPositionId("ad_position_id", "adPositionId", "INTEGER", false),
        trafficAttrs("traffic_attrs", "trafficAttrs", "VARCHAR", false),
        floor("floor", "floor", "INTEGER", false),
        status("status", "status", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table media_floor
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}