package cn.teaey.test.load;
import cn.teaey.fenrisulfr.orm.Blobable;
import cn.teaey.fenrisulfr.orm.StandardDao;
import cn.teaey.test.load.entity.*;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-31
 */
public class PlayerTester
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
        //模拟一个30级玩家的装备
        List<Blobable> list = new ArrayList<>();
        Player p = new Player();
        FieldInit.initField0(p);
        StandardDao.getInstance().insert(p);
        playerId = p.getId();
        for (int i = 0; i < 20; i++)
        {
            //20个PlayerBag
            PlayerBag pb = new PlayerBag();
            pb.setPlayerId(playerId);
            list.add(pb);
        }
        for (int i = 0; i < 10; i++)
        {
            //10个PlayerEventSys
            PlayerEventSys pes = new PlayerEventSys();
            pes.setPlayerId(playerId);
            list.add(pes);
        }
        for (int i = 0; i < 10; i++)
        {
            //10个PlayerFriend
            PlayerFriend pf = new PlayerFriend();
            pf.setPlayerId(playerId);
            list.add(pf);
        }
        {
            //1个PlayerGuaji
            PlayerGuaji pg = new PlayerGuaji();
            pg.setPlayerId(playerId);
            list.add(pg);
        }
        {
            //1个PlayerMsg
            PlayerMsg pm = new PlayerMsg();
            pm.setPlayerId(playerId);
            list.add(pm);
        }
        {
            //1个PlayerRecharge
            PlayerRecharge pr = new PlayerRecharge();
            pr.setPlayerId(playerId);
            list.add(pr);
        }
        {
            //60个PlayerWuxingCard
            for (int i = 0; i < 60; i++)
            {
                PlayerWuxingCard pwc = new PlayerWuxingCard();
                pwc.setPlayerId(playerId);
                list.add(pwc);
            }
        }
        {
            //70个PlayerTaskLevelBattleAgain
            for (int i = 0; i < 70; i++)
            {
                PlayerTaskLevelBattleAgain ptlba = new PlayerTaskLevelBattleAgain();
                ptlba.setPlayerId(playerId);
                list.add(ptlba);
            }
        }
        {
            //1个PlayerWuxingRaffleInfo
            PlayerWuxingRaffleInfo pwri = new PlayerWuxingRaffleInfo();
            pwri.setPlayerId(playerId);
            list.add(pwri);
        }
        //init
        FieldInit.initField(list);
        //
        for (Blobable each : list)
        {
            StandardDao.getInstance().insert(each);
        }
    }
    public static Player get(int playerId, boolean debug)
    {
        Player p = StandardDao.getInstance().select(Player.class, playerId);
        List<PlayerBag> pb = StandardDao.getInstance().selectListByRelate(PlayerBag.class, "player_id_", playerId);
        List<PlayerEventSys> pes = StandardDao.getInstance().selectListByRelate(PlayerEventSys.class, "player_id_", playerId);
        List<PlayerFriend> pf = StandardDao.getInstance().selectListByRelate(PlayerFriend.class, "player_id_", playerId);
        List<PlayerGuaji> pg = StandardDao.getInstance().selectListByRelate(PlayerGuaji.class, "player_id_", playerId);
        List<PlayerMsg> pm = StandardDao.getInstance().selectListByRelate(PlayerMsg.class, "player_id_", playerId);
        List<PlayerRecharge> pr = StandardDao.getInstance().selectListByRelate(PlayerRecharge.class, "player_id_", playerId);
        List<PlayerWuxingCard> pwc = StandardDao.getInstance().selectListByRelate(PlayerWuxingCard.class, "player_id_", playerId);
        List<PlayerTaskLevelBattleAgain> ptlba = StandardDao.getInstance().selectListByRelate(PlayerTaskLevelBattleAgain.class, "player_id_", playerId);
        List<PlayerWuxingRaffleInfo> pwri = StandardDao.getInstance().selectListByRelate(PlayerWuxingRaffleInfo.class, "player_id_", playerId);
        if (debug)
        {
            System.out.println(ReflectionToStringBuilder.reflectionToString(p));
            System.out.println("PlayerBagStore size= " + pb.size());
            System.out.println("PlayerEventSysStore size= " + pes.size());
            System.out.println("PlayerFriendStore size= " + pf.size());
            System.out.println("PlayerGuajiStore size= " + pg.size());
            System.out.println("PlayerMsgStore size= " + pm.size());
            System.out.println("PlayerRechargeStore size= " + pr.size());
            System.out.println("PlayerTaskLevelBattleAgainStore size= " + ptlba.size());
            System.out.println("PlayerWuxingCardStore size= " + pwc.size());
            System.out.println("PlayerWuxingRaffleInfoStore size= " + pwri.size());
        }
        return p;
    }
}
