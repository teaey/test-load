package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerWuxingCardStore implements Blobable<Entity.PlayerWuxingCardStoreBlob>
{
    private List<PlayerWuxingCard> playerWuxingCardList = new ArrayList<>();
    @Override
    public Entity.PlayerWuxingCardStoreBlob toBlob()
    {
        Entity.PlayerWuxingCardStoreBlob.Builder blob = Entity.PlayerWuxingCardStoreBlob.newBuilder();
        for (PlayerWuxingCard each : playerWuxingCardList)
        {
            blob.addPlayerWuxingCardBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerWuxingCardStoreBlob playerWuxingCardStoreBlob)
    {
        for (Entity.PlayerWuxingCardBlob each : playerWuxingCardStoreBlob.getPlayerWuxingCardBlobList())
        {
            PlayerWuxingCard playerWuxingCard = new PlayerWuxingCard();
            playerWuxingCard.fromBlob(each);
            playerWuxingCardList.add(playerWuxingCard);
        }
    }
    public List<PlayerWuxingCard> getPlayerWuxingCardList()
    {
        return playerWuxingCardList;
    }
}
