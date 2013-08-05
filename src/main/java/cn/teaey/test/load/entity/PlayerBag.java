package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;
import cn.teaey.fenrisulfr.orm.annotation.Column;
import cn.teaey.fenrisulfr.orm.annotation.Table;
@Table("player_bag")
public class PlayerBag implements Blobable<Entity.PlayerBagBlob>
{
    public Entity.PlayerBagBlob toBlob()
    {
        Entity.PlayerBagBlob.Builder blob = Entity.PlayerBagBlob.newBuilder();
        blob.setPlayerId(playerId);
        blob.setBagType(bagType);
        blob.setCellId(cellId);
        blob.setItemType(itemType);
        blob.setItemId(itemId);
        blob.setItemAmt(itemAmt);
        blob.setEquipEnhLevel(equipEnhLevel);
        blob.setEquipGrade(equipGrade);
        blob.setEquipCoinSelling(equipCoinSelling);
        blob.setBagSortNum(bagSortNum);
        return blob.build();
    }
    public void fromBlob(Entity.PlayerBagBlob blob)
    {
        this.playerId = blob.getPlayerId();
        this.bagType = blob.getBagType();
        this.cellId = blob.getCellId();
        this.itemType = blob.getItemType();
        this.itemId = blob.getItemId();
        this.itemAmt = blob.getItemAmt();
        this.equipEnhLevel = blob.getEquipEnhLevel();
        this.equipGrade = blob.getEquipGrade();
        this.equipCoinSelling = blob.getEquipCoinSelling();
        this.bagSortNum = blob.getBagSortNum();
    }
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "id", type = Column.ColumnType.KEY)
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.player_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "player_id_")
    private Integer playerId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.bag_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "bag_type")
    private Integer bagType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.cell_id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "cell_id")
    private Integer cellId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.item_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "item_type")
    private Integer itemType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.item_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "item_id_")
    private Integer itemId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.item_amt
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "item_amt")
    private Integer itemAmt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.equip_enh_level
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "equip_enh_level")
    private Integer equipEnhLevel;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.equip_grade
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "equip_grade")
    private Integer equipGrade;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.equip_coin_selling
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "equip_coin_selling")
    private Integer equipCoinSelling;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_bag.bag_sort_num
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    @Column(name = "bag_sort_num")
    private Integer bagSortNum;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.id
     *
     * @return the value of player_bag.id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getId()
    {
        return id;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.id
     *
     * @param id the value for player_bag.id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.player_id_
     *
     * @return the value of player_bag.player_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getPlayerId()
    {
        return playerId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.player_id_
     *
     * @param playerId the value for player_bag.player_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setPlayerId(Integer playerId)
    {
        this.playerId = playerId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.bag_type
     *
     * @return the value of player_bag.bag_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getBagType()
    {
        return bagType;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.bag_type
     *
     * @param bagType the value for player_bag.bag_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setBagType(Integer bagType)
    {
        this.bagType = bagType;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.cell_id
     *
     * @return the value of player_bag.cell_id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getCellId()
    {
        return cellId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.cell_id
     *
     * @param cellId the value for player_bag.cell_id
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setCellId(Integer cellId)
    {
        this.cellId = cellId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.item_type
     *
     * @return the value of player_bag.item_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getItemType()
    {
        return itemType;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.item_type
     *
     * @param itemType the value for player_bag.item_type
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setItemType(Integer itemType)
    {
        this.itemType = itemType;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.item_id_
     *
     * @return the value of player_bag.item_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getItemId()
    {
        return itemId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.item_id_
     *
     * @param itemId the value for player_bag.item_id_
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setItemId(Integer itemId)
    {
        this.itemId = itemId;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.item_amt
     *
     * @return the value of player_bag.item_amt
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getItemAmt()
    {
        return itemAmt;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.item_amt
     *
     * @param itemAmt the value for player_bag.item_amt
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setItemAmt(Integer itemAmt)
    {
        this.itemAmt = itemAmt;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.equip_enh_level
     *
     * @return the value of player_bag.equip_enh_level
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getEquipEnhLevel()
    {
        return equipEnhLevel;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.equip_enh_level
     *
     * @param equipEnhLevel the value for player_bag.equip_enh_level
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setEquipEnhLevel(Integer equipEnhLevel)
    {
        this.equipEnhLevel = equipEnhLevel;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.equip_grade
     *
     * @return the value of player_bag.equip_grade
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getEquipGrade()
    {
        return equipGrade;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.equip_grade
     *
     * @param equipGrade the value for player_bag.equip_grade
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setEquipGrade(Integer equipGrade)
    {
        this.equipGrade = equipGrade;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.equip_coin_selling
     *
     * @return the value of player_bag.equip_coin_selling
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getEquipCoinSelling()
    {
        return equipCoinSelling;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.equip_coin_selling
     *
     * @param equipCoinSelling the value for player_bag.equip_coin_selling
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setEquipCoinSelling(Integer equipCoinSelling)
    {
        this.equipCoinSelling = equipCoinSelling;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_bag.bag_sort_num
     *
     * @return the value of player_bag.bag_sort_num
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public Integer getBagSortNum()
    {
        return bagSortNum;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_bag.bag_sort_num
     *
     * @param bagSortNum the value for player_bag.bag_sort_num
     *
     * @mbggenerated Thu Jun 27 17:09:25 CST 2013
     */
    public void setBagSortNum(Integer bagSortNum)
    {
        this.bagSortNum = bagSortNum;
    }
}