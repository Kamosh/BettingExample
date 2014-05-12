package cz.kamosh.betExample.userImplementedBets;

import cz.kamosh.betExample.WinLostBet;
import cz.kamosh.betExample.WinLostBetResult;

public final class WinLostUserNameBasedBet implements WinLostBet {

    private final String userName;
    
    public WinLostUserNameBasedBet(String userName)
    {
        this.userName = userName == null ?  "" : userName;
    }

    @Override
    public WinLostBetResult checkBet() {
        // Very secret algorithm based has code of user name
        if(userName.hashCode() % 2 == 0) {
            return WinLostBetResult.WIN;
        } else {
            return WinLostBetResult.LOST;
        }
    }
    
}
