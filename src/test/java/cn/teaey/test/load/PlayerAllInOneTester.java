package cn.teaey.test.load;
import cn.teaey.fenrisulfr.orm.StandardDao;
import cn.teaey.test.load.entity.*;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * User: Teaey
 * Date: 13-7-31
 */
public class PlayerAllInOneTester
{
    private static int playerId = 0;
    public static void main(String[] args)
    {
        insert();
        if (playerId != 0)
            get(playerId, true);
    }
    public static void insert()
    {
        PlayerAllInOne playerAllInOne = (PlayerAllInOne) FieldInit.initField0(new PlayerAllInOne());
        for (int i = 0; i < 20; i++)
        {
            //player bag
            PlayerBag playerBag = (PlayerBag) FieldInit.initField0(new PlayerBag());
            playerAllInOne.getPlayerBagStore().getPlayerBagList().add(playerBag);
        }
        for (int i = 0; i < 10; i++)
        {
            //player event sys
            PlayerEventSys playerEventSys = (PlayerEventSys) FieldInit.initField0(new PlayerEventSys());
            playerAllInOne.getPlayerEventSysStore().getPlayerEventSysList().add(playerEventSys);
        }
        for (int i = 0; i < 10; i++)
        {
            //player friend
            PlayerFriend playerFriend = (PlayerFriend) FieldInit.initField0(new PlayerFriend());
            playerAllInOne.getPlayerFriendStore().getPlayerFriendList().add(playerFriend);
        }
        //player guaji
        PlayerGuaji playerGuaji = (PlayerGuaji) FieldInit.initField0(new PlayerGuaji());
        playerAllInOne.getPlayerGuajiStore().getPlayerGuajiList().add(playerGuaji);
        //player msg
        PlayerMsg playerMsg = (PlayerMsg) FieldInit.initField0(new PlayerMsg());
        playerAllInOne.getPlayerMsgStore().getPlayerMsgList().add(playerMsg);
        //player recharge
        PlayerRecharge playerRecharge = (PlayerRecharge) FieldInit.initField0(new PlayerRecharge());
        playerAllInOne.getPlayerRechargeStore().getPlayerRechargeList().add(playerRecharge);
        for (int i = 0; i < 70; i++)
        {
            //player task level battle again
            PlayerTaskLevelBattleAgain playerTaskLevelBattleAgain = (PlayerTaskLevelBattleAgain) FieldInit.initField0(new PlayerTaskLevelBattleAgain());
            playerAllInOne.getPlayerTaskLevelBattleAgainStore().getPlayerTaskLevelBattleAgainList().add(playerTaskLevelBattleAgain);
        }
        for (int i = 0; i < 60; i++)
        {
            //player wuxing card
            PlayerWuxingCard playerWuxingCard = (PlayerWuxingCard) FieldInit.initField0(new PlayerWuxingCard());
            playerAllInOne.getPlayerWuxingCardStore().getPlayerWuxingCardList().add(playerWuxingCard);
        }
        //player wuxing raffle info
        PlayerWuxingRaffleInfo playerWuxingRaffleInfo = (PlayerWuxingRaffleInfo) FieldInit.initField0(new PlayerWuxingRaffleInfo());
        playerAllInOne.getPlayerWuxingRaffleInfoStore().getPlayerWuxingRaffleInfoList().add(playerWuxingRaffleInfo);
        StandardDao.getInstance().insert(playerAllInOne);
        playerId = playerAllInOne.getId();
    }
    public static PlayerAllInOne get(int playerId, boolean debug)
    {
        PlayerAllInOne playerAllInOne = StandardDao.getInstance().select(PlayerAllInOne.class, playerId);
        if (debug)
        {
            System.out.println(ReflectionToStringBuilder.reflectionToString(playerAllInOne));
            System.out.println("PlayerBagStore size= " + playerAllInOne.getPlayerBagStore().getPlayerBagList().size());
            System.out.println("PlayerEventSysStore size= " + playerAllInOne.getPlayerEventSysStore().getPlayerEventSysList().size());
            System.out.println("PlayerFriendStore size= " + playerAllInOne.getPlayerFriendStore().getPlayerFriendList().size());
            System.out.println("PlayerGuajiStore size= " + playerAllInOne.getPlayerGuajiStore().getPlayerGuajiList().size());
            System.out.println("PlayerMsgStore size= " + playerAllInOne.getPlayerMsgStore().getPlayerMsgList().size());
            System.out.println("PlayerRechargeStore size= " + playerAllInOne.getPlayerRechargeStore().getPlayerRechargeList().size());
            System.out.println("PlayerTaskLevelBattleAgainStore size= " + playerAllInOne.getPlayerTaskLevelBattleAgainStore().getPlayerTaskLevelBattleAgainList().size());
            System.out.println("PlayerWuxingCardStore size= " + playerAllInOne.getPlayerWuxingCardStore().getPlayerWuxingCardList().size());
            System.out.println("PlayerWuxingRaffleInfoStore size= " + playerAllInOne.getPlayerWuxingRaffleInfoStore().getPlayerWuxingRaffleInfoList().size());
        }
        return playerAllInOne;
    }
}
