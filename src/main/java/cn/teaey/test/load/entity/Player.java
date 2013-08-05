package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;
import cn.teaey.fenrisulfr.orm.annotation.Column;
import cn.teaey.fenrisulfr.orm.annotation.Table;

import java.util.Date;
@Table("player")
public class Player implements Blobable<Entity.PlayerBlob>
{
    public Entity.PlayerBlob toBlob()
    {
        Entity.PlayerBlob.Builder blob = Entity.PlayerBlob.newBuilder();
        blob.setSrcChannel(null == srcChannel ? "" : srcChannel);
        blob.setAccount(null == account ? "" : account);
        blob.setArenaRanking(arenaRanking);
        blob.setAvatarId(avatarId);
        blob.setBuffAtkDurationSec(buffAtkDurationSec);
        blob.setBuffAtkRate(buffAtkRate);
        blob.setBuffAtkStart(buffAtkStart.getTime());
        blob.setBuffDefDurationSec(buffAtkDurationSec);
        blob.setLogicalServerId(logicalServerId);
        blob.setNickname(null == nickname ? "" : nickname);
        blob.setLevel(level);
        blob.setExp(exp);
        blob.setVipLevel(vipLevel);
        blob.setUnlockedBag(unlockedBag);
        blob.setUnlockedBagBought(unlockedBagBought);
        blob.setUnlockedGuajiBag(unlockedGuajiBag);
        blob.setUnlockedGuajiBagBought(unlockedGuajiBagBought);
        blob.setGameLevelId(gameLevelId);
        blob.setPowerUpper(powerUpper);
        blob.setEnergyUpper(energyUpper);
        blob.setPower(power);
        blob.setEnergy(energy);
        blob.setSoul(soul);
        blob.setCoin(coin);
        blob.setYuanbao(yuanbao);
        blob.setYuanbaoRecharged(yuanbaoRecharged);
        blob.setYuanbaoConsumed(yuanbaoConsumed);
        blob.setBuffDefStart(buffDefStart.getTime());
        blob.setBuffDefDurationSec(buffDefDurationSec);
        blob.setBuffDefRate(buffDefRate);
        blob.setBuffExpStart(buffExpStart.getTime());
        blob.setBuffExpDurationSec(buffExpDurationSec);
        blob.setBuffExpRate(buffExpRate);
        blob.setBuffHpStart(buffHpStart.getTime());
        blob.setBuffHpDurationSec(buffHpDurationSec);
        blob.setBuffHpRate(buffHpRate);
        blob.setFighting(fighting);
        blob.setArenaRanking(arenaRanking);
        blob.setStatus(status);
        blob.setCreated(created.getTime());
        blob.setIsFirstSteal(isFirstSteal);
        blob.setLastBonusNpcId(lastBonusNpcId);
        blob.setVer(ver);
        blob.setTotalPoints(totalPoints);
        blob.setCurrentCredits(currentCredits);
        blob.setDailyFightingCnt(dailyFightingCnt);
        blob.setDailyStealingTimes(dailyStealingTimes);
        blob.setDailyYuanbaoFromMonster(dailyYuanbaoFromMonster);
        blob.setDailyUsedPantaoTimes(dailyUsedPantaoTimes);
        blob.setDailyUsedRenshenguoTimes(dailyUsedRenshenguoTimes);
        blob.setSrcChannel(srcChannel == null ? "" : srcChannel);
        blob.setLastLoginBonusTime(lastLoginBonusTime.getTime());
        blob.setIsFirstRobFabaoFrag(isFirstRobFabaoFrag);
        blob.setHasGeneratedFabaoFromFrag(hasGeneratedFabaoFromFrag);
        blob.setGuajiNum(guajiNum);
        blob.setDailyGuajiTimes(dailyGuajiTimes);
        return blob.build();
    }
    public void fromBlob(Entity.PlayerBlob blob)
    {
        this.srcChannel = blob.getSrcChannel();
        this.account = blob.getAccount();
        this.arenaRanking = blob.getArenaRanking();
        this.avatarId = blob.getAvatarId();
        this.buffAtkDurationSec = blob.getBuffAtkDurationSec();
        this.buffAtkRate = blob.getBuffAtkRate();
        this.buffAtkStart = new Date(blob.getBuffAtkStart());
        this.buffDefDurationSec = blob.getBuffDefDurationSec();
        this.logicalServerId = blob.getLogicalServerId();
        this.nickname = blob.getNickname();
        this.level = blob.getLevel();
        this.exp = blob.getExp();
        this.vipLevel = blob.getVipLevel();
        this.unlockedBag = blob.getUnlockedBag();
        this.unlockedBagBought = blob.getUnlockedBagBought();
        this.unlockedGuajiBag = blob.getUnlockedGuajiBag();
        this.unlockedGuajiBagBought = blob.getUnlockedGuajiBagBought();
        this.gameLevelId = blob.getGameLevelId();
        this.powerUpper = blob.getPowerUpper();
        this.energyUpper = blob.getEnergyUpper();
        this.power = blob.getPower();
        this.energy = blob.getEnergy();
        this.soul = blob.getSoul();
        this.coin = blob.getCoin();
        this.yuanbao = blob.getYuanbao();
        this.yuanbaoRecharged = blob.getYuanbaoRecharged();
        this.yuanbaoConsumed = blob.getYuanbaoConsumed();
        this.buffDefStart = new Date(blob.getBuffDefStart());
        this.buffDefDurationSec = blob.getBuffDefDurationSec();
        this.buffDefRate = blob.getBuffDefRate();
        this.buffExpStart = new Date(blob.getBuffDefStart());
        this.buffExpDurationSec = blob.getBuffExpDurationSec();
        this.buffExpRate = blob.getBuffExpRate();
        this.buffHpStart = new Date(blob.getBuffHpStart());
        this.buffHpDurationSec = blob.getBuffHpDurationSec();
        this.buffHpRate = blob.getBuffHpRate();
        this.fighting = blob.getFighting();
        this.arenaRanking = blob.getArenaRanking();
        this.status = blob.getStatus();
        this.created = new Date(blob.getCreated());
        this.isFirstSteal = blob.getIsFirstSteal();
        this.lastBonusNpcId = blob.getLastBonusNpcId();
        this.ver = blob.getVer();
        this.totalPoints = blob.getTotalPoints();
        this.currentCredits = blob.getCurrentCredits();
        this.dailyFightingCnt = blob.getDailyFightingCnt();
        this.dailyStealingTimes = blob.getDailyStealingTimes();
        this.dailyYuanbaoFromMonster = blob.getDailyYuanbaoFromMonster();
        this.dailyUsedPantaoTimes = blob.getDailyUsedPantaoTimes();
        this.dailyUsedRenshenguoTimes = blob.getDailyUsedRenshenguoTimes();
        this.srcChannel = blob.getSrcChannel();
        this.lastLoginBonusTime = new Date(blob.getLastLoginBonusTime());
        this.isFirstRobFabaoFrag = blob.getIsFirstRobFabaoFrag();
        this.hasGeneratedFabaoFromFrag = blob.getHasGeneratedFabaoFromFrag();
        this.guajiNum = blob.getGuajiNum();
        this.dailyGuajiTimes = blob.getDailyGuajiTimes();
    }
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "id", type = Column.ColumnType.KEY)
    private Integer id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.account
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "account")
    private String  account;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.logical_server_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "logical_server_id")
    private Integer logicalServerId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.nickname
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "nickname")
    private String  nickname;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.avatar_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "avatar_id")
    private Integer avatarId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "level")
    private Integer level;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.exp
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "exp")
    private Integer exp;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.vip_level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "vip_level")
    private Integer vipLevel;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.unlocked_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "unlocked_bag")
    private Integer unlockedBag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.unlocked_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "unlocked_bag_bought")
    private Integer unlockedBagBought;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.unlocked_guaji_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "unlocked_guaji_bag")
    private Integer unlockedGuajiBag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.unlocked_guaji_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "unlocked_guaji_bag_bought")
    private Integer unlockedGuajiBagBought;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.game_level_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "game_level_id_")
    private Integer gameLevelId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.power_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "power_upper")
    private Integer powerUpper;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.energy_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "energy_upper")
    private Integer energyUpper;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.power
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "power")
    private Integer power;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.energy
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "energy")
    private Integer energy;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.soul
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "soul")
    private Integer soul;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.coin
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "coin")
    private Integer coin;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.yuanbao
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "yuanbao")
    private Integer yuanbao;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.yuanbao_recharged
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "yuanbao_recharged")
    private Integer yuanbaoRecharged;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.yuanbao_consumed
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "yuanbao_consumed")
    private Integer yuanbaoConsumed;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_atk_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_atk_start")
    private Date buffAtkStart = new Date();
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_atk_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_atk_duration_sec")
    private Integer buffAtkDurationSec;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_atk_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_atk_rate")
    private Float   buffAtkRate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_def_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_def_start")
    private Date buffDefStart = new Date();
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_def_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_def_duration_sec")
    private Integer buffDefDurationSec;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_def_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_def_rate")
    private Float   buffDefRate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_exp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_exp_start")
    private Date    buffExpStart;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_exp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_exp_duration_sec")
    private Integer buffExpDurationSec;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_exp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_exp_rate")
    private Float   buffExpRate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_hp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_hp_start")
    private Date    buffHpStart;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_hp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_hp_duration_sec")
    private Integer buffHpDurationSec;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.buff_hp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "buff_hp_rate")
    private Float   buffHpRate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.fighting
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "fighting")
    private Integer fighting;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.arena_ranking
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "arena_ranking")
    private Integer arenaRanking;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.status
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "status")
    private Integer status;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.created
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "created")
    private Date    created;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.is_first_steal
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "is_first_steal")
    private Boolean isFirstSteal;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.last_bonus_npc_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "last_bonus_npc_id_")
    private Integer lastBonusNpcId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.ver
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "ver")
    private Integer ver;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.total_points
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "total_points")
    private Integer totalPoints;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.current_credits
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "current_credits")
    private Integer currentCredits;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_fighting_cnt
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_fighting_cnt")
    private Integer dailyFightingCnt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_stealing_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_stealing_times")
    private Integer dailyStealingTimes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_yuanbao_from_monster
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_yuanbao_from_monster")
    private Integer dailyYuanbaoFromMonster;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_used_pantao_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_used_pantao_times")
    private Integer dailyUsedPantaoTimes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_used_renshenguo_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_used_renshenguo_times")
    private Integer dailyUsedRenshenguoTimes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.src_channel
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "src_channel")
    private String  srcChannel;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.last_login_bonus_time
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "last_login_bonus_time")
    private Date lastLoginBonusTime = new Date();
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.is_first_rob_fabao_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "is_first_rob_fabao_frag")
    private Boolean isFirstRobFabaoFrag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.has_generated_fabao_from_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "has_generated_fabao_from_frag")
    private Boolean hasGeneratedFabaoFromFrag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.guaji_num
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "guaji_num")
    private Integer guajiNum;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column player.daily_guaji_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    @Column(name = "daily_guaji_times")
    private Integer dailyGuajiTimes;
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.id
     * @return the value of player.id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getId()
    {
        return id;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.id
     * @param id  the value for player.id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.account
     * @return the value of player.account
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public String getAccount()
    {
        return account;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.account
     * @param account  the value for player.account
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setAccount(String account)
    {
        this.account = account == null ? null : account.trim();
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.logical_server_id
     * @return the value of player.logical_server_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getLogicalServerId()
    {
        return logicalServerId;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.logical_server_id
     * @param logicalServerId  the value for player.logical_server_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setLogicalServerId(Integer logicalServerId)
    {
        this.logicalServerId = logicalServerId;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.nickname
     * @return the value of player.nickname
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public String getNickname()
    {
        return nickname;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.nickname
     * @param nickname  the value for player.nickname
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setNickname(String nickname)
    {
        this.nickname = nickname == null ? null : nickname.trim();
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.avatar_id
     * @return the value of player.avatar_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getAvatarId()
    {
        return avatarId;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.avatar_id
     * @param avatarId  the value for player.avatar_id
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setAvatarId(Integer avatarId)
    {
        this.avatarId = avatarId;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.level
     * @return the value of player.level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getLevel()
    {
        return level;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.level
     * @param level  the value for player.level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setLevel(Integer level)
    {
        this.level = level;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.exp
     * @return the value of player.exp
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getExp()
    {
        return exp;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.exp
     * @param exp  the value for player.exp
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setExp(Integer exp)
    {
        this.exp = exp;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.vip_level
     * @return the value of player.vip_level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getVipLevel()
    {
        return vipLevel;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.vip_level
     * @param vipLevel  the value for player.vip_level
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setVipLevel(Integer vipLevel)
    {
        this.vipLevel = vipLevel;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.unlocked_bag
     * @return the value of player.unlocked_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getUnlockedBag()
    {
        return unlockedBag;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.unlocked_bag
     * @param unlockedBag  the value for player.unlocked_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setUnlockedBag(Integer unlockedBag)
    {
        this.unlockedBag = unlockedBag;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.unlocked_bag_bought
     * @return the value of player.unlocked_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getUnlockedBagBought()
    {
        return unlockedBagBought;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.unlocked_bag_bought
     * @param unlockedBagBought  the value for player.unlocked_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setUnlockedBagBought(Integer unlockedBagBought)
    {
        this.unlockedBagBought = unlockedBagBought;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.unlocked_guaji_bag
     * @return the value of player.unlocked_guaji_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getUnlockedGuajiBag()
    {
        return unlockedGuajiBag;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.unlocked_guaji_bag
     * @param unlockedGuajiBag  the value for player.unlocked_guaji_bag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setUnlockedGuajiBag(Integer unlockedGuajiBag)
    {
        this.unlockedGuajiBag = unlockedGuajiBag;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.unlocked_guaji_bag_bought
     * @return the value of player.unlocked_guaji_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getUnlockedGuajiBagBought()
    {
        return unlockedGuajiBagBought;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.unlocked_guaji_bag_bought
     * @param unlockedGuajiBagBought  the value for player.unlocked_guaji_bag_bought
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setUnlockedGuajiBagBought(Integer unlockedGuajiBagBought)
    {
        this.unlockedGuajiBagBought = unlockedGuajiBagBought;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.game_level_id_
     * @return the value of player.game_level_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getGameLevelId()
    {
        return gameLevelId;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.game_level_id_
     * @param gameLevelId  the value for player.game_level_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setGameLevelId(Integer gameLevelId)
    {
        this.gameLevelId = gameLevelId;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.power_upper
     * @return the value of player.power_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getPowerUpper()
    {
        return powerUpper;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.power_upper
     * @param powerUpper  the value for player.power_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setPowerUpper(Integer powerUpper)
    {
        this.powerUpper = powerUpper;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.energy_upper
     * @return the value of player.energy_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getEnergyUpper()
    {
        return energyUpper;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.energy_upper
     * @param energyUpper  the value for player.energy_upper
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setEnergyUpper(Integer energyUpper)
    {
        this.energyUpper = energyUpper;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.power
     * @return the value of player.power
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getPower()
    {
        return power;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.power
     * @param power  the value for player.power
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setPower(Integer power)
    {
        this.power = power;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.energy
     * @return the value of player.energy
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getEnergy()
    {
        return energy;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.energy
     * @param energy  the value for player.energy
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setEnergy(Integer energy)
    {
        this.energy = energy;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.soul
     * @return the value of player.soul
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getSoul()
    {
        return soul;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.soul
     * @param soul  the value for player.soul
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setSoul(Integer soul)
    {
        this.soul = soul;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.coin
     * @return the value of player.coin
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getCoin()
    {
        return coin;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.coin
     * @param coin  the value for player.coin
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setCoin(Integer coin)
    {
        this.coin = coin;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.yuanbao
     * @return the value of player.yuanbao
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getYuanbao()
    {
        return yuanbao;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.yuanbao
     * @param yuanbao  the value for player.yuanbao
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setYuanbao(Integer yuanbao)
    {
        this.yuanbao = yuanbao;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.yuanbao_recharged
     * @return the value of player.yuanbao_recharged
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getYuanbaoRecharged()
    {
        return yuanbaoRecharged;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.yuanbao_recharged
     * @param yuanbaoRecharged  the value for player.yuanbao_recharged
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setYuanbaoRecharged(Integer yuanbaoRecharged)
    {
        this.yuanbaoRecharged = yuanbaoRecharged;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.yuanbao_consumed
     * @return the value of player.yuanbao_consumed
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getYuanbaoConsumed()
    {
        return yuanbaoConsumed;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.yuanbao_consumed
     * @param yuanbaoConsumed  the value for player.yuanbao_consumed
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setYuanbaoConsumed(Integer yuanbaoConsumed)
    {
        this.yuanbaoConsumed = yuanbaoConsumed;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_atk_start
     * @return the value of player.buff_atk_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getBuffAtkStart()
    {
        return buffAtkStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_atk_start
     * @param buffAtkStart  the value for player.buff_atk_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffAtkStart(Date buffAtkStart)
    {
        this.buffAtkStart = buffAtkStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_atk_duration_sec
     * @return the value of player.buff_atk_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getBuffAtkDurationSec()
    {
        return buffAtkDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_atk_duration_sec
     * @param buffAtkDurationSec  the value for player.buff_atk_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffAtkDurationSec(Integer buffAtkDurationSec)
    {
        this.buffAtkDurationSec = buffAtkDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_atk_rate
     * @return the value of player.buff_atk_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Float getBuffAtkRate()
    {
        return buffAtkRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_atk_rate
     * @param buffAtkRate  the value for player.buff_atk_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffAtkRate(Float buffAtkRate)
    {
        this.buffAtkRate = buffAtkRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_def_start
     * @return the value of player.buff_def_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getBuffDefStart()
    {
        return buffDefStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_def_start
     * @param buffDefStart  the value for player.buff_def_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffDefStart(Date buffDefStart)
    {
        this.buffDefStart = buffDefStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_def_duration_sec
     * @return the value of player.buff_def_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getBuffDefDurationSec()
    {
        return buffDefDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_def_duration_sec
     * @param buffDefDurationSec  the value for player.buff_def_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffDefDurationSec(Integer buffDefDurationSec)
    {
        this.buffDefDurationSec = buffDefDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_def_rate
     * @return the value of player.buff_def_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Float getBuffDefRate()
    {
        return buffDefRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_def_rate
     * @param buffDefRate  the value for player.buff_def_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffDefRate(Float buffDefRate)
    {
        this.buffDefRate = buffDefRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_exp_start
     * @return the value of player.buff_exp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getBuffExpStart()
    {
        return buffExpStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_exp_start
     * @param buffExpStart  the value for player.buff_exp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffExpStart(Date buffExpStart)
    {
        this.buffExpStart = buffExpStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_exp_duration_sec
     * @return the value of player.buff_exp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getBuffExpDurationSec()
    {
        return buffExpDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_exp_duration_sec
     * @param buffExpDurationSec  the value for player.buff_exp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffExpDurationSec(Integer buffExpDurationSec)
    {
        this.buffExpDurationSec = buffExpDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_exp_rate
     * @return the value of player.buff_exp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Float getBuffExpRate()
    {
        return buffExpRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_exp_rate
     * @param buffExpRate  the value for player.buff_exp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffExpRate(Float buffExpRate)
    {
        this.buffExpRate = buffExpRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_hp_start
     * @return the value of player.buff_hp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getBuffHpStart()
    {
        return buffHpStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_hp_start
     * @param buffHpStart  the value for player.buff_hp_start
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffHpStart(Date buffHpStart)
    {
        this.buffHpStart = buffHpStart;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_hp_duration_sec
     * @return the value of player.buff_hp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getBuffHpDurationSec()
    {
        return buffHpDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_hp_duration_sec
     * @param buffHpDurationSec  the value for player.buff_hp_duration_sec
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffHpDurationSec(Integer buffHpDurationSec)
    {
        this.buffHpDurationSec = buffHpDurationSec;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.buff_hp_rate
     * @return the value of player.buff_hp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Float getBuffHpRate()
    {
        return buffHpRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.buff_hp_rate
     * @param buffHpRate  the value for player.buff_hp_rate
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setBuffHpRate(Float buffHpRate)
    {
        this.buffHpRate = buffHpRate;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.fighting
     * @return the value of player.fighting
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getFighting()
    {
        return fighting;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.fighting
     * @param fighting  the value for player.fighting
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setFighting(Integer fighting)
    {
        this.fighting = fighting;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.arena_ranking
     * @return the value of player.arena_ranking
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getArenaRanking()
    {
        return arenaRanking;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.arena_ranking
     * @param arenaRanking  the value for player.arena_ranking
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setArenaRanking(Integer arenaRanking)
    {
        this.arenaRanking = arenaRanking;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.status
     * @return the value of player.status
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getStatus()
    {
        return status;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.status
     * @param status  the value for player.status
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.created
     * @return the value of player.created
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getCreated()
    {
        return created;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.created
     * @param created  the value for player.created
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setCreated(Date created)
    {
        this.created = created;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.is_first_steal
     * @return the value of player.is_first_steal
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Boolean getIsFirstSteal()
    {
        return isFirstSteal;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.is_first_steal
     * @param isFirstSteal  the value for player.is_first_steal
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setIsFirstSteal(Boolean isFirstSteal)
    {
        this.isFirstSteal = isFirstSteal;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.last_bonus_npc_id_
     * @return the value of player.last_bonus_npc_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getLastBonusNpcId()
    {
        return lastBonusNpcId;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.last_bonus_npc_id_
     * @param lastBonusNpcId  the value for player.last_bonus_npc_id_
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setLastBonusNpcId(Integer lastBonusNpcId)
    {
        this.lastBonusNpcId = lastBonusNpcId;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.ver
     * @return the value of player.ver
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getVer()
    {
        return ver;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.ver
     * @param ver  the value for player.ver
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setVer(Integer ver)
    {
        this.ver = ver;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.total_points
     * @return the value of player.total_points
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getTotalPoints()
    {
        return totalPoints;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.total_points
     * @param totalPoints  the value for player.total_points
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setTotalPoints(Integer totalPoints)
    {
        this.totalPoints = totalPoints;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.current_credits
     * @return the value of player.current_credits
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getCurrentCredits()
    {
        return currentCredits;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.current_credits
     * @param currentCredits  the value for player.current_credits
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setCurrentCredits(Integer currentCredits)
    {
        this.currentCredits = currentCredits;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_fighting_cnt
     * @return the value of player.daily_fighting_cnt
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyFightingCnt()
    {
        return dailyFightingCnt;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_fighting_cnt
     * @param dailyFightingCnt  the value for player.daily_fighting_cnt
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyFightingCnt(Integer dailyFightingCnt)
    {
        this.dailyFightingCnt = dailyFightingCnt;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_stealing_times
     * @return the value of player.daily_stealing_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyStealingTimes()
    {
        return dailyStealingTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_stealing_times
     * @param dailyStealingTimes  the value for player.daily_stealing_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyStealingTimes(Integer dailyStealingTimes)
    {
        this.dailyStealingTimes = dailyStealingTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_yuanbao_from_monster
     * @return the value of player.daily_yuanbao_from_monster
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyYuanbaoFromMonster()
    {
        return dailyYuanbaoFromMonster;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_yuanbao_from_monster
     * @param dailyYuanbaoFromMonster  the value for player.daily_yuanbao_from_monster
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyYuanbaoFromMonster(Integer dailyYuanbaoFromMonster)
    {
        this.dailyYuanbaoFromMonster = dailyYuanbaoFromMonster;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_used_pantao_times
     * @return the value of player.daily_used_pantao_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyUsedPantaoTimes()
    {
        return dailyUsedPantaoTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_used_pantao_times
     * @param dailyUsedPantaoTimes  the value for player.daily_used_pantao_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyUsedPantaoTimes(Integer dailyUsedPantaoTimes)
    {
        this.dailyUsedPantaoTimes = dailyUsedPantaoTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_used_renshenguo_times
     * @return the value of player.daily_used_renshenguo_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyUsedRenshenguoTimes()
    {
        return dailyUsedRenshenguoTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_used_renshenguo_times
     * @param dailyUsedRenshenguoTimes  the value for player.daily_used_renshenguo_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyUsedRenshenguoTimes(Integer dailyUsedRenshenguoTimes)
    {
        this.dailyUsedRenshenguoTimes = dailyUsedRenshenguoTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.src_channel
     * @return the value of player.src_channel
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public String getSrcChannel()
    {
        return srcChannel;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.src_channel
     * @param srcChannel  the value for player.src_channel
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setSrcChannel(String srcChannel)
    {
        this.srcChannel = srcChannel == null ? null : srcChannel.trim();
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.last_login_bonus_time
     * @return the value of player.last_login_bonus_time
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Date getLastLoginBonusTime()
    {
        return lastLoginBonusTime;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.last_login_bonus_time
     * @param lastLoginBonusTime  the value for player.last_login_bonus_time
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setLastLoginBonusTime(Date lastLoginBonusTime)
    {
        this.lastLoginBonusTime = lastLoginBonusTime;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.is_first_rob_fabao_frag
     * @return the value of player.is_first_rob_fabao_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Boolean getIsFirstRobFabaoFrag()
    {
        return isFirstRobFabaoFrag;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.is_first_rob_fabao_frag
     * @param isFirstRobFabaoFrag  the value for player.is_first_rob_fabao_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setIsFirstRobFabaoFrag(Boolean isFirstRobFabaoFrag)
    {
        this.isFirstRobFabaoFrag = isFirstRobFabaoFrag;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.has_generated_fabao_from_frag
     * @return the value of player.has_generated_fabao_from_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Boolean getHasGeneratedFabaoFromFrag()
    {
        return hasGeneratedFabaoFromFrag;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.has_generated_fabao_from_frag
     * @param hasGeneratedFabaoFromFrag  the value for player.has_generated_fabao_from_frag
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setHasGeneratedFabaoFromFrag(Boolean hasGeneratedFabaoFromFrag)
    {
        this.hasGeneratedFabaoFromFrag = hasGeneratedFabaoFromFrag;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.guaji_num
     * @return the value of player.guaji_num
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getGuajiNum()
    {
        return guajiNum;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.guaji_num
     * @param guajiNum  the value for player.guaji_num
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setGuajiNum(Integer guajiNum)
    {
        this.guajiNum = guajiNum;
    }
    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column player.daily_guaji_times
     * @return the value of player.daily_guaji_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public Integer getDailyGuajiTimes()
    {
        return dailyGuajiTimes;
    }
    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column player.daily_guaji_times
     * @param dailyGuajiTimes  the value for player.daily_guaji_times
     * @mbggenerated Mon Jul 22 01:59:12 CST 2013
     */
    public void setDailyGuajiTimes(Integer dailyGuajiTimes)
    {
        this.dailyGuajiTimes = dailyGuajiTimes;
    }
}